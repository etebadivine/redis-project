package Repository;

import Model.User;

import java.util.Map;

public interface UserRepository {

    void save(User user);
    Map<String,User> findAll();
    User findById(String id);
    void update(User  id);
    void delete(String id);
}
