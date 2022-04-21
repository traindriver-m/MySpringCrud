package crud.services;

import crud.models.User;

import java.util.List;

public interface UserService {
    void add(User user);

    List<User> findAll();

    void update(User user);

    void delete(Long id);

    User findById(Long id);
}

