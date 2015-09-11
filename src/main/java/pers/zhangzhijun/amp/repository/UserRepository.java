package pers.zhangzhijun.amp.repository;

import org.springframework.data.repository.CrudRepository;
import pers.zhangzhijun.amp.domain.User;

import java.util.List;

/**
 * Created by ZhangZhijun on 2015/9/11.
 */
public interface UserRepository extends CrudRepository<User,Long> {
    User findByUid(String uid);
    User findByUsername(String username);
    User findByEmail(String email);

    List<User> findAll();
}
