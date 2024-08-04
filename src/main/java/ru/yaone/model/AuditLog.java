package ru.yaone.model;

import java.time.LocalDateTime;

/**
 * Запись (record), представляющая журнал аудита.
 * <p>
 * Данный класс хранит информацию о действиях пользователей в системе, включая временную метку,
 * пользователя, который совершил действие, и само действие.
 * </p>
 *
 * @param timestamp временная метка, когда было совершено действие
 * @param user      пользователь, совершивший действие
 * @param action    описание действия, выполненного пользователем
 */
public record AuditLog(LocalDateTime timestamp, User user, String action) {
}