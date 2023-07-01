package chupakabra.itmpp3task311.service;


import chupakabra.itmpp3task311.entity.User;

import java.util.List;

/**
 * \* Create by Prekrasnov Sergei
 * \
 */

public interface UserService {
    List<User> getAllUsers();

    User getUser(int id);

    void saveUser(User user);

    void updateUser(int id, User updatedUser);

    void deleteUser(User deleteUser);
}