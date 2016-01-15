package pers.zhangzhijun.amp.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;
import pers.zhangzhijun.amp.domain.Protocol;

import java.util.List;

/**
 * ClassName: pers.zhangzhijun.amp.repository
 * Function :
 * Author   : ZhangZhijun
 * Date     : 20:56
 * Since    : v1.0.0
 */
@Transactional
public interface ProtocolRepository extends CrudRepository<Protocol, Long> {

    Protocol findById(String id);

    @Query("select p from Protocol p where p.name = ?1")
    Protocol findByName(String name);

    List<Protocol> findAll();
}
