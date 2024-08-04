package ru.yaone.impl;

import ru.yaone.model.AuditLog;
import ru.yaone.model.User;
import ru.yaone.services.AuditService;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Реализация сервиса аудита.
 * <p>
 * Этот класс предоставляет методы для регистрации действий пользователей
 * и получения журналов аудита.
 * </p>
 */
public class AuditServiceImpl implements AuditService {

    private final List<AuditLog> auditLogs = new ArrayList<>();

    /**
     * Регистрирует действие пользователя в журнале аудита.
     *
     * @param user   пользователь, который совершает действие
     * @param action строка, описывающая действие пользователя
     */
    @Override
    public void logAction(User user, String action) {
        auditLogs.add(new AuditLog(LocalDateTime.now(), user, action));
    }

    /**
     * Получает список всех записей журнала аудита.
     *
     * @return неизменяемый список записей журнала аудита
     */
    @Override
    public List<AuditLog> getAllLogs() {
        return List.copyOf(auditLogs);
    }
}