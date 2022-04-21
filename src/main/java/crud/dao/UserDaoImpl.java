package crud.dao;

import crud.models.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void add(User user) {
        entityManager.persist(user);
    }

    @Override
    public List<User> findAll() {
        return entityManager.createQuery("from User", User.class).getResultList();
    }

    @Override
    public void update(User user) {
        entityManager.merge(user);
        entityManager.flush();
    }

    @Override
    public void delete(Long id) {
        User user = findById(id);
        entityManager.remove(user);
        entityManager.flush();
    }

    @Override
    public User findById(Long id) {
        return entityManager.find(User.class, id);
    }
}