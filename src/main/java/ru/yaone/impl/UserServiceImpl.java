package ru.yaone.impl;

import ru.yaone.model.User;
import ru.yaone.model.enumeration.UserRole;
import ru.yaone.services.UserService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Реализация сервиса для работы с пользователями.
 * <p>
 * Этот класс предоставляет методы для добавления, получения,
 * обновления и удаления пользователей, а также их поиска по имени и роли.
 * </p>
 */
public class UserServiceImpl implements UserService {

    private final List<User> users = new ArrayList<>();

    /**
     * Добавляет нового пользователя в список.
     *
     * @param user пользователь, которого необходимо добавить
     */
    @Override
    public void addUser(User user) {
        users.add(user);
    }

    /**
     * Получает список всех пользователей.
     *
     * @return неизменяемый список всех зарегистрированных пользователей
     */
    @Override
    public List<User> getAllUsers() {
        return List.copyOf(users);
    }

    /**
     * Получает пользователя по его идентификатору.
     *
     * @param id идентификатор пользователя
     * @return пользователь с заданным идентификатором или null, если такой пользователь не найден
     */
    @Override
    public User getUserById(int id) {
        return users.stream()
                .filter(user -> user.id() == id)
                .findFirst()
                .orElse(null);
    }

    /**
     * Ищет пользователей по заданным критериям.
     *
     * @param name имя пользователя (можно установить в null для игнорирования)
     * @param role роль пользователя (можно установить в null для игнорирования)
     * @return список пользователей, соответствующих заданным критериям
     */
    @Override
    public List<User> searchUsers(String name, UserRole role) {
        return users.stream()
                .filter(user -> (name == null || user.username().equalsIgnoreCase(name))
                        && (role == null || user.role() == role))
                .collect(Collectors.toList());
    }

    /**
     * Обновляет информацию о пользователе.
     *
     * @param id          идентификатор пользователя, информацию о котором необходимо обновить
     * @param updatedUser объект пользователя с обновленной информацией
     */
    @Override
    public void updateUser(int id, User updatedUser) {
        var user = getUserById(id);
        if (user != null) {
            users.remove(user);
            users.add(updatedUser);
        }
    }

    /**
     * Удаляет пользователя из списка по его идентификатору.
     *
     * @param id идентификатор пользователя, которого необходимо удалить
     */
    @Override
    public void deleteUser(int id) {
        var user = getUserById(id);
        if (user != null) {
            users.remove(user);
        }
    }
}