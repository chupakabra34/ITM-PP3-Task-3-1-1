package chupakabra.itmpp3task311.dao;

import chupakabra.itmpp3task311.entity.User;

import java.util.List;

/**
 * \* Create by Prekrasnov Sergei
 * \
 */

public interface UserDao {
    List<User> getAllUsers();

    User getUser(int id);

    void saveUser(User user);

    void updateUser(User updateUser);

    void deleteUser(User deleteUser);
}