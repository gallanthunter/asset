package pers.zhangzhijun.amp.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pers.zhangzhijun.amp.domain.User;

import java.util.List;

/**
 * Created by ZhangZhijun on 2015/9/11.
 */
@Repository
public interface UserRepository extends CrudRepository<User,Long> {
    @Query("select u from User u where u.uid = ?1")
    User findByUid(String uid);

    @Query("select u from User u where u.username = ?1")
    User findByUsername(String username);

    @Query("select u from User u where u.email = ?1")
    User findByEmail(String email);

    List<User> findAll();
}
