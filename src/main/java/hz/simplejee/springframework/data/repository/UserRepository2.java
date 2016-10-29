package hz.simplejee.springframework.data.repository;

import hz.simplejee.springframework.data.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * 继承Repository接口或者使用注解声明
 * Created by 辉辉大侠 on 25/10/2016.
 */
@RepositoryDefinition(domainClass = User.class, idClass = Long.class)
public interface UserRepository2 {
    List<User> findUserByName(String name);

    @Query("select u from User u where u.id = (select max(u2.id) from User u2)")
    User getMaxIdUser();

    @Query(value = "select * from user where namek like ?1", nativeQuery = true)
    List<User> findByOriginSQL(@Param("name")String name);
}
