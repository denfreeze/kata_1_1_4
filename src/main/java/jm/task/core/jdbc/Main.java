package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {

        UserService userService = new UserServiceImpl();

        userService.createUsersTable();
        userService.saveUser("Denis", "Morozov", (byte) 30);
        userService.saveUser("Ilon", "Mask", (byte) 53);
        userService.saveUser("Lev", "Tolstoy", (byte) 99);
        userService.saveUser("Fyodor", "Dostojevsiy", (byte) 99);

        System.out.println(userService.getAllUsers());

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}
