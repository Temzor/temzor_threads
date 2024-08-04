package ru.yaone.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.yaone.model.User;
import ru.yaone.model.enumeration.UserRole;
import ru.yaone.services.UserService;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class UserServiceImplTest {

    private UserService userService;

    @BeforeEach
    void setUp() {
        userService = new UserServiceImpl();
    }

    @Test
    void testAddUser() {
        User user = new User(1, "John Doe", "password123", UserRole.CLIENT);
        userService.addUser(user);

        List<User> users = userService.getAllUsers();

        assertThat(users).hasSize(1);
        assertThat(users).contains(user);
    }

    @Test
    void testGetAllUsers() {
        User user1 = new User(1, "John Doe", "password123", UserRole.CLIENT);
        User user2 = new User(2, "Jane Doe", "password456", UserRole.ADMIN);

        userService.addUser(user1);
        userService.addUser(user2);

        List<User> users = userService.getAllUsers();

        assertThat(users).hasSize(2);
        assertThat(users).contains(user1, user2);
    }

    @Test
    void testGetUserById() {
        User user1 = new User(1, "John Doe", "password123", UserRole.CLIENT);
        User user2 = new User(2, "Jane Doe", "password456", UserRole.ADMIN);
        userService.addUser(user1);
        userService.addUser(user2);

        User fetchedUser = userService.getUserById(1);

        assertThat(fetchedUser).isEqualTo(user1);
    }

    @Test
    void testUpdateUser() {
        User user1 = new User(1, "John Doe", "password123", UserRole.CLIENT);
        userService.addUser(user1);

        User updatedUser = new User(1, "Johnny Doe", "newpassword", UserRole.CLIENT);
        userService.updateUser(1, updatedUser);

        User fetchedUser = userService.getUserById(1);
        assertThat(fetchedUser.username()).isEqualTo("Johnny Doe");
    }

    @Test
    void testDeleteUser() {
        User user1 = new User(1, "John Doe", "password123", UserRole.CLIENT);
        userService.addUser(user1);

        userService.deleteUser(1);

        List<User> users = userService.getAllUsers();

        assertThat(users).isEmpty();
    }

    @Test
    void testSearchUsers() {
        User user1 = new User(1, "John Doe", "password123", UserRole.CLIENT);
        User user2 = new User(2, "Jane Doe", "password456", UserRole.ADMIN);
        userService.addUser(user1);
        userService.addUser(user2);

        List<User> searchedUsers = userService.searchUsers("John Doe", UserRole.CLIENT);

        assertThat(searchedUsers).hasSize(1);
        assertThat(searchedUsers).contains(user1);
    }
}