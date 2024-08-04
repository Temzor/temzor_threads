package ru.yaone.impl;

import ru.yaone.model.Car;
import ru.yaone.model.enumeration.CarCondition;
import ru.yaone.services.CarService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Реализация сервиса для работы с автомобилями.
 * <p>
 * Этот класс предоставляет методы для добавления, получения,
 * обновления, удаления автомобилей, а также их поиска по различным критериям.
 * </p>
 */
public class CarServiceImpl implements CarService {

    private final List<Car> cars = new ArrayList<>();

    /**
     * Добавляет новый автомобиль в список.
     *
     * @param car автомобиль, который необходимо добавить
     */
    @Override
    public void addCar(Car car) {
        cars.add(car);
    }

    /**
     * Получает список всех автомобилей.
     *
     * @return неизменяемый список всех зарегистрированных автомобилей
     */
    @Override
    public List<Car> getAllCars() {
        return List.copyOf(cars);
    }

    /**
     * Получает автомобиль по его идентификатору.
     *
     * @param id идентификатор автомобиля
     * @return автомобиль с заданным идентификатором или null, если такой автомобиль не найден
     */
    @Override
    public Car getCarById(int id) {
        return cars.stream()
                .filter(car -> car.id() == id)
                .findFirst()
                .orElse(null);
    }

    /**
     * Обновляет информацию об автомобиле.
     *
     * @param id         идентификатор автомобиля, который необходимо обновить
     * @param updatedCar объект автомобиля с обновленной информацией
     */
    @Override
    public void updateCar(int id, Car updatedCar) {
        var car = getCarById(id);
        if (car != null) {
            cars.remove(car);
            cars.add(updatedCar);
        }
    }

    /**
     * Удаляет автомобиль из списка по его идентификатору.
     *
     * @param id идентификатор автомобиля, который необходимо удалить
     */
    @Override
    public void deleteCar(int id) {
        var car = getCarById(id);
        if (car != null) {
            cars.remove(car);
        }
    }

    /**
     * Ищет автомобили по заданным критериям.
     *
     * @param make      марка автомобиля (можно установить в null для игнорирования)
     * @param model     модель автомобиля (можно установить в null для игнорирования)
     * @param year      год выпуска автомобиля (0 для игнорирования)
     * @param price     цена автомобиля (0 для игнорирования)
     * @param condition состояние автомобиля (можно установить в null для игнорирования)
     * @return список автомобилей, соответствующих заданным критериям
     */
    @Override
    public List<Car> searchCars(String make, String model, int year, double price, CarCondition condition) {
        return cars.stream()
                .filter(car ->
                        (make == null || car.make().equalsIgnoreCase(make))
                                && (model == null || car.model().equalsIgnoreCase(model))
                                && (year == 0 || car.year() == year)
                                && (price == 0 || car.price() == price)
                                && (condition == null || car.condition() == condition))
                .collect(Collectors.toList());
    }
}