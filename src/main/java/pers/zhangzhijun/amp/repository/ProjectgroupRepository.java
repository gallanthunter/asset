package pers.zhangzhijun.amp.repository;

import org.springframework.data.repository.CrudRepository;
import pers.zhangzhijun.amp.domain.Projectgroup;

import java.util.List;

/**
 * ClassName: pers.zhangzhijun.amp.repository
 * Function :
 * Author   : ZhangZhijun
 * Date     : 22:33
 * Since    : v1.0.0
 */
public interface ProjectgroupRepository extends CrudRepository<Projectgroup,Long> {
    Projectgroup findById(String id);

    Projectgroup findByName(String name);

    List<Projectgroup> findAll();

}
