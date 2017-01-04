package hz.simplejee.springframework.data.repository;

import hz.simplejee.springframework.data.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by 辉辉大侠 on 25/10/2016.
 */
public interface UserRepository extends CrudRepository<User, Long> {

    List<User> findUserByName(String name);
}
