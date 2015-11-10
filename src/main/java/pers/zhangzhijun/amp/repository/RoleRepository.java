package pers.zhangzhijun.amp.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import pers.zhangzhijun.amp.domain.Role;

import java.util.List;

/**
 * Created by ZhangZhijun on 2015/9/11.
 */
public interface RoleRepository extends CrudRepository<Role,Long> {

    @Query("select r from Role r where r.name = ?1")
    Role findByName(String name);

    List<Role> findAll();
}
