package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        Util util = new Util();
        UserDaoJDBCImpl userDao = new UserDaoJDBCImpl();
        util.getConnection();

        userDao.createUsersTable();
        userDao.saveUser("Denis", "Morozov", (byte)30);
        userDao.saveUser("Ilon", "Mask", (byte)53);
        userDao.saveUser("Lev", "Tolstoy", (byte)99);
        userDao.saveUser("Fyodor", "Dostojevsiy", (byte)99);

        System.out.println(userDao.getAllUsers());

        userDao.cleanUsersTable();

        userDao.dropUsersTable();
    }
}
