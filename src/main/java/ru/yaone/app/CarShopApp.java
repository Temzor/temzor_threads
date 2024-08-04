package ru.yaone.app;

import ru.yaone.impl.AuditServiceImpl;
import ru.yaone.impl.CarServiceImpl;
import ru.yaone.impl.OrderServiceImpl;
import ru.yaone.impl.UserServiceImpl;
import ru.yaone.model.Car;
import ru.yaone.model.Client;
import ru.yaone.model.Order;
import ru.yaone.model.User;
import ru.yaone.model.enumeration.CarCondition;
import ru.yaone.model.enumeration.OrderStatus;
import ru.yaone.model.enumeration.UserRole;
import ru.yaone.services.AuditService;
import ru.yaone.services.CarService;
import ru.yaone.services.OrderService;
import ru.yaone.services.UserService;

import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * **Класс CarShopApp представляет собой приложение для управления магазином автомобилей.**
 * <p>
 * Этот класс отвечает за взаимодействие с пользователем, позволяя ему входить в систему,
 * регистрироваться и управлять различными функциями магазина.
 * Внутри класса используются службы для работы с автомобилями, заказами, пользователями и аудиторией.
 * </p>
 */
public class CarShopApp {
    private final Scanner scanner = new Scanner(System.in);
    private final CarService carService = new CarServiceImpl();
    private final OrderService orderService = new OrderServiceImpl();
    private final UserService userService = new UserServiceImpl();
    private final AuditService auditService = new AuditServiceImpl();
    User loggedInUser;

    /**
     * **Запускает приложение.**
     * <p>
     * Метод отображает основное меню и, если пользователь вошел в систему,
     * предоставляет доступ к соответствующему меню на основе его роли.
     * </p>
     */
    public void run() {
        showMainMenu();
        if (loggedInUser != null) {
            showRoleBasedMenu();
        }
    }

    /**
     * **Отображает основное меню приложения.**
     * <p>
     * Метод предоставляет пользователю возможность войти в систему, зарегистрироваться
     * или выйти из приложения. В случае неверного выбора или ошибки ввода выводится соответствующее сообщение.
     * </p>
     */
    public void showMainMenu() {
        while (true) {
            try {
                System.out.println("1. Вход");
                System.out.println("2. Регистрация");
                System.out.println("3. Выход");
                System.out.print("Выберите действие: ");
                int choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {
                    case 1 -> login();
                    case 2 -> register();
                    case 3 -> System.exit(0);
                    default -> System.out.println("Не верный выбор, попробуйте еще раз.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Ошибка ввода. Пожалуйста, попробуйте снова.");
                scanner.nextLine(); // Очистка некорректного ввода
            } catch (Exception e) {
                System.out.println("Произошла ошибка: " + e.getMessage());
            }
        }
    }

    /**
     * **Метод для входа пользователя в систему.**
     * <p>
     * Запрашивает у пользователя имя и пароль. Если учетные данные верны,
     * пользователю предоставляется доступ, и ведется аудит действия.
     * В противном случае выводится сообщение о неверных данных.
     * </p>
     */
    private void login() {
        try {
            System.out.print("Введите имя пользователя: ");
            String username = scanner.nextLine();
            System.out.print("Введите пароль пользователя: ");
            String password = scanner.nextLine();
            loggedInUser = userService.getAllUsers().stream()
                    .filter(user -> user.username().equals(username) && user.password().equals(password))
                    .findFirst()
                    .orElse(null);
            if (loggedInUser != null) {
                System.out.println("Доступ предоставлен!");
                auditService.logAction(loggedInUser, "Вы вошли в систему");
                showRoleBasedMenu();
            } else {
                System.out.println("Неверные учетные данные. Попробуйте снова.");
            }
        } catch (Exception e) {
            System.out.println("Ошибка при входе: " + e.getMessage());
        }
    }

    /**
     * **Метод для регистрации нового пользователя.**
     * <p>
     * Запрашивает имя пользователя, пароль и роль для нового пользователя,
     * затем добавляет его в систему. Если регистрация проходит успешно, ведется аудит действия.
     * В случае ошибок ввода пользователю выводится соответствующее сообщение.
     * </p>
     */
    private void register() {
        try {
            System.out.print("Имя пользователя: ");
            String username = scanner.nextLine();
            System.out.print("Пароль пользователя: ");
            String password = scanner.nextLine();
            System.out.println("Выберите роль: ");
            System.out.println("1. ADMIN");
            System.out.println("2. MANAGER");
            System.out.println("3. CLIENT");
            int roleChoice = scanner.nextInt();
            scanner.nextLine();
            UserRole role = UserRole.fromValue(roleChoice);
            User user = new User(0, username, password, role);
            userService.addUser(user);
            auditService.logAction(user, "Зарегистрирован новый пользователь.");
            System.out.println("Пользователь успешно зарегистрирован.");
        } catch (InputMismatchException e) {
            System.out.println("Ошибка ввода. Пожалуйста, попробуйте снова.");
            scanner.nextLine();
        } catch (Exception e) {
            System.out.println("Ошибка при регистрации: " + e.getMessage());
        }
    }

    /**
     * **Отображает меню на основе роли вошедшего пользователя.**
     * <p>
     * Метод определяет, какая роль у вошедшего пользователя (ADMIN, MANAGER, CLIENT) и
     * вызывает соответствующее меню. Если возникает ошибка, выводится сообщение об ошибке.
     * </p>
     */
    private void showRoleBasedMenu() {
        try {
            switch (loggedInUser.role()) {
                case ADMIN -> showAdminMenu();
                case MANAGER -> showManagerMenu();
                case CLIENT -> showClientMenu();
                default -> showMainMenu();
            }
        } catch (Exception e) {
            System.out.println("Ошибка в меню: " + e.getMessage());
        }
    }

    /**
     * **Отображает меню администратора.**
     * <p>
     * Метод предоставляет администратору возможность управлять пользователями,
     * просматривать журналы аудита или выйти из меню.
     * </p>
     * <p>
     * При каждом выборе пользователю предлагается выполнить одно из следующих действий:
     * <ol>
     *     <li>Управление пользователями</li>
     *     <li>Просмотр журналов аудита</li>
     *     <li>Выход</li>
     * </ol>
     * </p>
     */
    private void showAdminMenu() {
        while (true) {
            System.out.println("1. Управление пользователями");
            System.out.println("2. Просмотр журналов аудита");
            System.out.println("3. Выход");
            System.out.print("Выберите действие: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1 -> manageUsers();
                case 2 -> viewAuditLog();
                case 3 -> {
                    loggedInUser = null;
                    return;
                }
                default -> System.out.println("Выбор не верен. Попробуйте еще раз");
            }
        }
    }

    /**
     * **Отображает меню менеджера.**
     * <p>
     * Метод предоставляет менеджеру возможности управления автомобилями, просмотра
     * заказов или выхода из меню.
     * </p>
     * <p>
     * Пользователю предлагается выполнить одно из следующих действий:
     * <ol>
     *     <li>Управление автомобилями</li>
     *     <li>Посмотреть заказы</li>
     *     <li>Поиск заказов</li>
     *     <li>Выход</li>
     * </ol>
     * </p>
     */
    private void showManagerMenu() {
        while (true) {
            System.out.println("1. Управление автомобилями");
            System.out.println("2. Посмотреть заказы");
            System.out.println("3. Поиск заказов");
            System.out.println("4. Выход");
            System.out.print("Выберите действие: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1 -> manageCars();
                case 2 -> viewOrders();
                case 3 -> searchOrders();
                case 4 -> {
                    loggedInUser = null;
                    return;
                }
                default -> System.out.println("Выбор не верен. Попробуйте еще раз.");
            }
        }
    }

    /**
     * **Отображает меню клиента.**
     * <p>
     * Метод предоставляет клиенту возможность просматривать автомобили, создавать заказы
     * или выходить из меню.
     * </p>
     * <p>
     * Клиенту предлагается выполнить одно из следующих действий:
     * <ol>
     *     <li>Просмотр автомобилей</li>
     *     <li>Создать заказ</li>
     *     <li>Выход</li>
     * </ol>
     * </p>
     */
    private void showClientMenu() {
        while (true) {
            System.out.println("1. Просмотр автомобилей");
            System.out.println("2. Создать заказ");
            System.out.println("3. Выход");
            System.out.print("Выберите действие: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1 -> viewCars();
                case 2 -> makeOrder();
                case 3 -> {
                    loggedInUser = null;
                    return;
                }
                default -> System.out.println("Выбор не верен. Попробуйте еще раз.");
            }
        }
    }

    /**
     * **Управление пользователями.**
     * <p>
     * Метод предоставляет интерфейс для управления пользователями в системе,
     * позволяя администратору выполнять следующие действия:
     * <ol>
     *     <li>Просмотр всех пользователей</li>
     *     <li>Добавление нового пользователя</li>
     *     <li>Редактирование существующего пользователя</li>
     *     <li>Удаление пользователя</li>
     *     <li>Возврат в главное меню</li>
     * </ol>
     * </p>
     * <p>
     * Метод работает в бесконечном цикле, запрашивая у пользователя выбор действия
     * и выполняя соответствующее действие, пока не будет выбрано действие "Вернуться в главное меню".
     * </p>
     */
    private void manageUsers() {
        while (true) {
            System.out.println("1. Просмотр пользователей");
            System.out.println("2. Добавить пользователя");
            System.out.println("3. Редактировать пользователя");
            System.out.println("4. Удалить пользователя");
            System.out.println("5. Вернуться в главное меню");
            System.out.print("Выберите действие: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1 -> viewUsers();
                case 2 -> addUser();
                case 3 -> editUser();
                case 4 -> deleteUser();
                case 5 -> {
                    return;
                }
                default -> System.out.println("Выбор не верен. Попробуйте еще раз.");
            }
        }
    }

    /**
     * **Просмотр пользователей.**
     * <p>
     * Метод выводит список всех пользователей в системе в формате "ID: [id], Имя пользователя: [username], Роль пользователя: [role]".
     * </p>
     */
    private void viewUsers() {
        userService.getAllUsers().forEach(user -> System.out.println("ID: " + user.id()
                + ", Имя пользователя: " + user.username()
                + ", Роль пользователя: " + user.role()));
    }

    /**
     * **Добавление нового пользователя.**
     * <p>
     * Метод запрашивает у администратора имя пользователя, пароль и роль,
     * создает нового пользователя и добавляет его в систему.
     * Также записывается действие в журнал аудита.
     * </p>
     */
    private void addUser() {
        System.out.print("Имя пользователя: ");
        String username = scanner.nextLine();
        System.out.print("Пароль пользователя: ");
        String password = scanner.nextLine();
        System.out.println("Выберите роль: ");
        System.out.println("1. ADMIN");
        System.out.println("2. MANAGER");
        System.out.println("3. CLIENT");
        int roleChoice = scanner.nextInt();
        scanner.nextLine();

        UserRole role = UserRole.fromValue(roleChoice);
        User user = new User(0, username, password, role);
        userService.addUser(user);
        auditService.logAction(user, "Новый пользователь добавлен");
        System.out.println("Пользователь успешно добавлен.");
    }

    /**
     * **Редактирование пользователя.**
     * <p>
     * Метод позволяет администратору редактировать существующего пользователя,
     * изменяя его имя, пароль и роль в соответствии с введенными данными.
     * Если пользователь не найден, выводится сообщение об ошибке.
     * Также записывается действие в журнал аудита.
     * </p>
     */
    private void editUser() {
        System.out.print("Введите ID пользователя для редактирования: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        User user = userService.getUserById(id);
        if (user != null) {
            System.out.print("Новое имя пользователя (Текущее имя пользователя: " + user.username() + "): ");
            String username = scanner.nextLine();
            System.out.print("Новый пароль пользователя (Текущий пароль пользователя: " + user.password() + "): ");
            String password = scanner.nextLine();
            System.out.println("Выберите роль: ");
            System.out.println("1. ADMIN");
            System.out.println("2. MANAGER");
            System.out.println("3. CLIENT");
            int roleChoice = scanner.nextInt();
            scanner.nextLine();

            UserRole role = UserRole.fromValue(roleChoice);
            User updatedUser = new User(id, username, password, role);

            userService.updateUser(id, updatedUser);
            auditService.logAction(updatedUser, "Отредактированный пользователь");
            System.out.println("Пользователь успешно обновлен.");
        } else {
            System.out.println("Пользователь не найден");
        }
    }

    /**
     * **Удаление пользователя.**
     * <p>
     * Метод запрашивает у администратора ID пользователя, которого необходимо удалить,
     * и выполняет удаление этого пользователя из системы.
     * Также записывается действие в журнал аудита.
     * </p>
     */
    private void deleteUser() {
        System.out.print("Введите ID пользователя для удаления: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        userService.deleteUser(id);
        auditService.logAction(new User(id, "", "", null), "Пользователь удален");
        System.out.println("Пользователь успешно удален.");
    }

    /**
     * **Управление автомобилями.**
     * <p>
     * Метод предоставляет интерфейс для управления автомобилями в системе,
     * позволяя администратору выполнять следующие действия:
     * <ol>
     *     <li>Просмотр всех автомобилей</li>
     *     <li>Добавление нового автомобиля</li>
     *     <li>Редактирование существующего автомобиля</li>
     *     <li>Удаление автомобиля</li>
     *     <li>Поиск автомобилей</li>
     *     <li>Возврат в главное меню</li>
     * </ol>
     * </p>
     * <p>
     * Метод работает в бесконечном цикле, запрашивая у пользователя выбор действия
     * и выполняя соответствующее действие, пока не будет выбрано действие "Вернуться в главное меню".
     * </p>
     */
    private void manageCars() {
        while (true) {
            System.out.println("1. Просмотр автомобилей");
            System.out.println("2. Добавить автомобиль");
            System.out.println("3. Редактировать автомобиль");
            System.out.println("4. Удалить автомобиль");
            System.out.println("5. Поиск автомобилей");
            System.out.println("6. Вернуться в главное меню");
            System.out.print("Выберите действие: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1 -> viewCars();
                case 2 -> addCar();
                case 3 -> editCar();
                case 4 -> deleteCar();
                case 5 -> searchCars();
                case 6 -> {
                    return;
                }
                default -> System.out.println("Выбор не верен. Попробуйте еще раз.");
            }
        }
    }

    /**
     * **Просмотр автомобилей.**
     * <p>
     * Метод выводит список всех автомобилей в системе в формате "ID: [id], Марка: [make], Модель: [model],
     * Год производства: [year], Цена: [price], Состояние: [condition]".
     * </p>
     */
    void viewCars() {
        carService.getAllCars().forEach(car -> System.out.println("ID: " + car.id()
                + ", Марка: " + car.make()
                + ", Модель: " + car.model()
                + ", Год производства: " + car.year()
                + ", Цена: " + car.price()
                + ", Состояние: " + car.condition()));
    }

    /**
     * **Добавление нового автомобиля.**
     * <p>
     * Метод запрашивает у администратора информацию о новом автомобиле,
     * включая марку, модель, год производства, цену и состояние,
     * создает новый объект автомобиля и добавляет его в систему.
     * Также записывается действие в журнал аудита.
     * </p>
     */
    void addCar() {
        System.out.print("Марка: ");
        String make = scanner.nextLine();
        System.out.print("Модель: ");
        String model = scanner.nextLine();
        System.out.print("Год производства: ");
        int year = scanner.nextInt();
        System.out.print("Цена: ");
        double price = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Состояние (NEW, USED, DAMAGED): ");
        CarCondition condition = CarCondition.valueOf(scanner.nextLine().toUpperCase());

        Car car = new Car(0, make, model, year, price, condition);
        carService.addCar(car);
        auditService.logAction(loggedInUser, "Новый автомобиль добавлен");
        System.out.println("Автомобиль добавлен успешно.");
    }

    /**
     * **Редактирование автомобиля.**
     * <p>
     * Метод запрашивает у пользователя ID автомобиля, который необходимо редактировать.
     * Если автомобиль с таким ID найден, пользователю предлагают ввести новые значения для марок, моделей,
     * года производства, цены и состояния автомобиля. После успешного обновления данных,
     * изменения сохраняются в системе, и запись о действии фиксируется в журнале аудита.
     * </p>
     *
     * <p>
     * Входные данные:
     * <ul>
     *     <li>ID автомобиля (целое число)</li>
     *     <li>Новая марка (строка)</li>
     *     <li>Новая модель (строка)</li>
     *     <li>Новый год производства (целое число)</li>
     *     <li>Новая цена (число с плавающей запятой)</li>
     *     <li>Новое состояние (CarCondition, строка, преобразуется в верхний регистр)</li>
     * </ul>
     * </p>
     *
     * <p>
     * Выводит сообщения о результате редактирования и возможных ошибках.
     * </p>
     */
    void editCar() {
        System.out.print("Введите ID автомобиля для редактирования: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        Car car = carService.getCarById(id);

        if (car != null) {
            System.out.print("Новая марка (Текущая марка автомобиля: " + car.make() + "): ");
            String make = scanner.nextLine();
            System.out.print("Новая модель (Текущая модель автомобиля: " + car.model() + "): ");
            String model = scanner.nextLine();
            System.out.print("Новый год производства (Текущий год производства автомобиля: " + car.year() + "): ");
            int year = scanner.nextInt();
            System.out.print("Новая цена (Текущая цена автомобиля: " + car.price() + "): ");
            double price = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Новое состояние автомобиля (Текущее состояние автомобиля: " + car.condition() + "): ");
            CarCondition condition = CarCondition.valueOf(scanner.nextLine().toUpperCase());

            Car updatedCar = new Car(id, make, model, year, price, condition);
            carService.updateCar(id, updatedCar);
            auditService.logAction(loggedInUser, "Автомобиль отредактирован");
            System.out.println("Редактирование автомобиля прошло успешно.");
        } else {
            System.out.println("Автомобиль не найден.");
        }
    }

    /**
     * **Удаление автомобиля.**
     * <p>
     * Метод запрашивает у пользователя ID автомобиля, который необходимо удалить.
     * После получения ID автомобиль удаляется из системы.
     * Это действие также фиксируется в журнале аудита.
     * </p>
     *
     * <p>
     * Входные данные:
     * <ul>
     *     <li>ID автомобиля (целое число)</li>
     * </ul>
     * </p>
     *
     * <p>
     * Выводит сообщение о результате удаления.
     * </p>
     */
    void deleteCar() {
        System.out.print("Введите ID автомобиля для удаления: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        carService.deleteCar(id);
        auditService.logAction(loggedInUser, "Автомобиль удален");
        System.out.println("Автомобиль удален успешно.");
    }

    /**
     * **Поиск автомобилей.**
     * <p>
     * Метод запрашивает у пользователя параметры для поиска автомобилей, включая марку, модель,
     * год производства, цену и состояние. После получения всех необходимых данных
     * осуществляется поиск автомобилей в системе с использованием указанных критериев.
     * Найденные автомобили выводятся на экран с указанием их характеристик.
     * </p>
     *
     * <p>
     * Входные данные:
     * <ul>
     *     <li>Марка (строка)</li>
     *     <li>Модель (строка)</li>
     *     <li>Год производства (целое число)</li>
     *     <li>Цена (число с плавающей запятой)</li>
     *     <li>Состояние (CarCondition, строка, преобразуется в верхний регистр)</li>
     * </ul>
     * </p>
     *
     * <p>
     * Выводит список найденных автомобилей на экран, включая их ID, марку, модель, год
     * производства, цену и состояние.
     * </p>
     */
    private void searchCars() {
        System.out.print("Марка: ");
        String make = scanner.nextLine();
        System.out.print("Модель: ");
        String model = scanner.nextLine();
        System.out.print("Год производства: ");
        int year = scanner.nextInt();
        System.out.print("Цена: ");

        double price = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Состояние (NEW, USED, DAMAGED): ");
        CarCondition condition = CarCondition.valueOf(scanner.nextLine().toUpperCase());

        List<Car> cars = carService.searchCars(make, model, year, price, condition);
        cars.forEach(car -> System.out.println("ID: " + car.id()
                + ", Марка: " + car.make()
                + ", Модель: " + car.model()
                + ", Год производства: " + car.year()
                + ", Цена: " + car.price()
                + ", Состояние: " + car.condition()));
    }

    /**
     * **Просмотр всех заказов.**
     * <p>
     * Метод получает список всех заказов из сервиса заказов и выводит информацию по каждому из них на экран.
     * Для каждого заказа отображается его ID, имя клиента, информация об автомобиле (марка и модель),
     * дата создания заказа и статус.
     * </p>
     *
     * <p>
     * Выводит следующую информацию для каждого заказа:
     * <ul>
     *     <li>ID заказа</li>
     *     <li>Клиент (имя пользователя)</li>
     *     <li>Автомобиль (марка и модель)</li>
     *     <li>Дата создания заказа</li>
     *     <li>Статус заказа</li>
     * </ul>
     * </p>
     */
    private void viewOrders() {
        orderService.getAllOrders().forEach(order -> System.out.println("ID: " + order.id()
                + ", Клиент: " + order.client().user().username()
                + ", Автомобиль: " + order.car().make() + " " + order.car().model()
                + ", Дата: " + order.creationDate()
                + ", Статус: " + order.status()));
    }

    /**
     * **Создание нового заказа.**
     * <p>
     * Метод позволяет пользователю создать новый заказ на автомобиль.
     * Пользователь вводит ID автомобиля, который он хочет заказать.
     * Если автомобиль с указанным ID существует, создаётся новый заказ с данными клиента
     * и автомобилем, а также присваивается статус "ОЖИДАЕТ".
     * После успешного создания заказ фиксируется в журнале аудита.
     * </p>
     *
     * <p>
     * Входные данные:
     * <ul>
     *     <li>ID автомобиля (целое число)</li>
     * </ul>
     * </p>
     *
     * <p>
     * Выводит сообщение о результате создания заказа и возможных ошибках.
     * </p>
     */
    private void makeOrder() {
        System.out.print("Введите ID автомобиля для заказа: ");
        int carId = scanner.nextInt();
        scanner.nextLine();

        Car car = carService.getCarById(carId);
        if (car != null) {
            Client client = new Client(loggedInUser, "контактная информация");
            Order order = new Order(0, client, car, LocalDateTime.now(), OrderStatus.PENDING);
            orderService.addOrder(order);
            auditService.logAction(loggedInUser, "Заказ создан");
            System.out.println("Заказ создан успешно");
        } else {
            System.out.println("Автомобиль не найден.");
        }
    }

    /**
     * **Поиск заказов по дате.**
     * <p>
     * Метод позволяет пользователю искать заказы в заданном диапазоне дат.
     * Пользователь вводит начальную и конечную даты, после чего производится поиск
     * заказов, соответствующих этим датам. Найденные заказы выводятся на экран
     * с указанием их характеристик.
     * </p>
     *
     * <p>
     * Входные данные:
     * <ul>
     *     <li>Начальная дата (формат: yyyy-MM-dd)</li>
     *     <li>Конечная дата (формат: yyyy-MM-dd)</li>
     * </ul>
     * </p>
     *
     * <p>
     * Выводит список найденных заказов на экран, включая информацию о каждом заказе.
     * Обрабатывает возможные ошибки парсинга дат.
     * </p>
     */
    private void searchOrders() {
        try {
            System.out.print("Начиная с даты (yyyy-MM-dd): ");
            LocalDateTime from = LocalDateTime.parse(scanner.nextLine() + "T00:00:00");
            System.out.print("по дату (yyyy-MM-dd): ");
            LocalDateTime to = LocalDateTime.parse(scanner.nextLine() + "T23:59:59");

            List<Order> orders = orderService.searchOrders(from, to, null, null, null);
            orders.forEach(order -> System.out.println("ID: " + order.id()
                    + ", Клиент: " + order.client().user().username()
                    + ", Автомобиль: " + order.car().make() + " " + order.car().model()
                    + ", Дата: " + order.creationDate()
                    + ", Статус: " + order.status()));
        } catch (DateTimeParseException e) {
            System.out.println("Ошибка парсинга даты: " + e.getMessage());
        }
    }

    /**
     * **Просмотр журнала аудита.**
     * <p>
     * Метод получает все записи из журнала аудита и выводит их на экран.
     * Каждая запись включает временную метку, информацию о пользователе,
     * который выполнил действие, и само действие.
     * </p>
     *
     * <p>
     * Выводит следующую информацию для каждой записи:
     * <ul>
     *
     *     <li>Временная метка</li>
     *     <li>Пользователь (имя пользователя)</li>
     *     <li>Действие</li>
     * </ul>
     * </p>
     */
    private void viewAuditLog() {
        auditService.getAllLogs().forEach(log -> System.out.println("Timestamp: " + log.timestamp()
                + ", Пользователь: " + log.user().username()
                + ", Действие: " + log.action()));
    }
}