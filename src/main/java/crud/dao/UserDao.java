package crud.dao;

import crud.models.User;

import java.util.List;

public interface UserDao {
    void add(User user);
    List<User> listUsers();
    void update(User user);
    void delete(User user);

}
