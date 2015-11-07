package pers.zhangzhijun.amp.repository;

import org.springframework.data.repository.CrudRepository;
import pers.zhangzhijun.amp.domain.Protocol;

import java.util.List;

/**
 * ClassName: pers.zhangzhijun.amp.repository
 * Function :
 * Author   : ZhangZhijun
 * Date     : 20:56
 * Since    : v1.0.0
 */
public interface ProtocolRepository extends CrudRepository<Protocol, Long> {

    Protocol findById();

    List<Protocol> findByName();

    List<Protocol> findAll();
}
