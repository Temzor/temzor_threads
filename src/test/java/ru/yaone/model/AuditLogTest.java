package ru.yaone.model;

import org.junit.jupiter.api.Test;
import ru.yaone.model.enumeration.UserRole;

import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;

class AuditLogTest {

    @Test
    void testAuditLogCreation() {
        LocalDateTime now = LocalDateTime.now();
        User user = new User(2, "name", "password", UserRole.ADMIN);
        String action = "Logged In";

        AuditLog log = new AuditLog(now, user, action);

        assertThat(log.timestamp()).isEqualTo(now);
        assertThat(log.user()).isEqualTo(user);
        assertThat(log.action()).isEqualTo(action);
    }

    @Test
    void testAuditLogEquality() {
        LocalDateTime now = LocalDateTime.now();
        User user = new User(2, "name", "password", UserRole.ADMIN);
        String action = "Logged In";

        AuditLog log1 = new AuditLog(now, user, action);
        AuditLog log2 = new AuditLog(now, user, action);

        assertThat(log1).isEqualTo(log2);
    }

    @Test
    void testAuditLogInequality() {
        LocalDateTime now1 = LocalDateTime.now();
        LocalDateTime now2 = now1.plusMinutes(1);
        User user1 = new User(2, "name", "password", UserRole.ADMIN);
        User user2 = new User(3, "name1", "password1", UserRole.CLIENT);
        String action1 = "Logged In";
        String action2 = "Logged Out";

        AuditLog log1 = new AuditLog(now1, user1, action1);
        AuditLog log2 = new AuditLog(now2, user2, action2);

        assertThat(log1).isNotEqualTo(log2);
    }
}