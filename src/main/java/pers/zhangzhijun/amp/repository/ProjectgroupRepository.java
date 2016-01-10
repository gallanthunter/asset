package pers.zhangzhijun.amp.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pers.zhangzhijun.amp.domain.Projectgroup;

import java.util.List;

/**
 * ClassName: pers.zhangzhijun.amp.repository
 * Function :
 * Author   : ZhangZhijun
 * Date     : 22:33
 * Since    : v1.0.0
 */
@Repository
public interface ProjectgroupRepository extends CrudRepository<Projectgroup,Long> {
    Projectgroup findById(String id);

    @Query("select p from Projectgroup p where p.name = ?1")
    Projectgroup findByName(String name);

    List<Projectgroup> findAll();

}
