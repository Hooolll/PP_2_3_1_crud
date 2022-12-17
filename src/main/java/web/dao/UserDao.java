package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    void saveUser(User user);
    List<User> getUsers();
    User getUserById(int id);
    void update(User updateUser);
    void delete(int id);
}
