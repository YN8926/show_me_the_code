# 概述
## 关于Spring DATA
  [官方网址](http://projects.spring.io/spring-data/)
  [官方手册](http://docs.spring.io/spring-data/jpa/docs/1.10.4.RELEASE/reference/html/#repositories.query-methods.details)

## 声明为repository
## 继承自org.springframework.data.repository.Repository
```java
import hz.simplejee.springframework.data.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {
}

```

  Repository接口是一个标志,不提供任何方法,该方法还有子接口:
* CrudRepository:继承Repository,提供一组CRUD方法;
* PagingAndSortingRepository:继承CrudRepository,实现一组分页排序的方法;
* JpaRepository:继承自PagingAndSortingRepository,实现一组JPA规范的方法

## 使用RepositoryDefinition注解
```java
import hz.simplejee.springframework.data.entity.User;
import org.springframework.data.repository.RepositoryDefinition;

@RepositoryDefinition(domainClass = User.class, idClass = Long.class)
public interface UserRepository{
}
```

# Maven依赖
```xml
<dependency>
    <groupId>org.springframework.data</groupId>
    <artifactId>spring-data-redis</artifactId>
    <version>1.6.2.RELEASE</version>
</dependency>
```

# 查询操作
## 方法命名规范
  所谓规范的方法查询就是方法的名称只要按照spring data规定的规范来命令,就可以不写SQL实现查询指令;

优点:
- 简单,实现简单查询时开发效率高;

缺点:
- 方法名高度耦合,写的时候需要参照文档进行编写;
- 不能实现复杂的查询功能;  

## @Query
- 不带参数
```java
@Query("select u from User u where u.id = (select max(u2.id) from User u2)")
User getMaxIdUser();
```

- 使用参数顺序
```java
@Query("select u from User u where u.name = ?1 and u.email = ?2")
List<User> findUserByNameAndEmail(String name, String email);
```

- 使用参数名称
```java
@Query("select u from User u where u.name = :name and u.email = :email")
List<User> findUserByNameAndEmail(@Param("name") String name, @Param("email") String email);
```

- 使用like
```java
@Query("select u from User u where u.name like %?1%")
List<User> findUserLikeName(String likeName);
```

- 使用原生SQL
```java
@Query(value = "select * from user where namek like ?1", nativeQuery = true)
List<User> findByOriginSQL(@Param("name")String name);
```

# 新增修改操作
1. 通过实现CrudRepository来实现;
2. 通过@Modifying注解来完成修改操作(不支持新增);
