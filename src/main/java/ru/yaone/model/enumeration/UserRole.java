package ru.yaone.model.enumeration;

import lombok.Getter;

/**
 * Перечисление, представляющее роли пользователей в системе.
 * <p>
 * Данное перечисление определяет различные роли пользователей:
 * <ul>
 *     <li><b>ADMIN</b>: Администратор системы.</li>
 *     <li><b>MANAGER</b>: Менеджер.</li>
 *     <li><b>CLIENT</b>: Клиент.</li>
 * </ul>
 * Каждая роль имеет соответствующее числовое значение.
 * </p>
 */
@Getter
public enum UserRole {
    /**
     * Администратор системы.
     */
    ADMIN(1),

    /**
     * Менеджер.
     */
    MANAGER(2),

    /**
     * Клиент.
     */
    CLIENT(3);

    private final int value;

    /**
     * Конструктор для инициализации роли с заданным значением.
     *
     * @param value числовое значение роли
     */
    UserRole(int value) {
        this.value = value;
    }

    /**
     * Получает роль пользователя по указанному числовому значению.
     *
     * @param value числовое значение роли
     * @return соответствующая роль {@link UserRole}
     * @throws IllegalArgumentException если значение не соответствует ни одной роли
     */
    public static UserRole fromValue(int value) {
        for (UserRole role : UserRole.values()) {
            if (role.getValue() == value) {
                return role;
            }
        }
        throw new IllegalArgumentException("Некорректное значение роли: " + value);
    }
}