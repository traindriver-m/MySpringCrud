package crud.dao;

import crud.models.User;

import java.util.List;

public interface UserDao {
    void add(User user);
    List<User> findAll();
    void update(User user);
    void delete(Long id);
    User findById(Long id);

}
