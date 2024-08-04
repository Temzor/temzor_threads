package ru.yaone.model;

import ru.yaone.model.enumeration.UserRole;

/**
 * Запись (record), представляющая пользователя.
 * <p>
 * Данный класс хранит информацию о пользователе, включая
 * его уникальный идентификатор, имя пользователя, пароль и
 * роль пользователя в системе. Используется для аутентификации
 * и авторизации пользователей.
 * </p>
 *
 * @param id       уникальный идентификатор пользователя
 * @param username имя пользователя для входа в систему
 * @param password пароль пользователя
 * @param role     роль пользователя, представленная значением из
 *                 перечисления {@link UserRole}
 */
public record User(int id, String username, String password, UserRole role) {
}