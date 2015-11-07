package pers.zhangzhijun.amp.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import pers.zhangzhijun.amp.domain.Type;

import java.util.List;

/**
 * ClassName: pers.zhangzhijun.amp.repository
 * Function :
 * Author   : ZhangZhijun
 * Date     : 22:37
 * Since    : v1.0.0
 */
public interface TypeRepository extends CrudRepository<Type, Long>{

    @Query("SELECT a from Asset a, Type t where a.asset_type_id = t.id and t.name = ?1")
    Type findByName(String name);

    List<Type> findAll();
}
