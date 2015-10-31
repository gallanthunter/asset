package pers.zhangzhijun.amp.repository;

import org.springframework.data.repository.CrudRepository;
import pers.zhangzhijun.amp.domain.Manufacture;

import java.util.List;

/**
 * ClassName: pers.zhangzhijun.amp.repository
 * Function :
 * Author   : ZhangZhijun
 * Date     : 22:31
 * Since    : v1.0.0
 */
public interface ManufactureRepository extends CrudRepository<Manufacture, Long> {
    Manufacture findById(String id);

    Manufacture findByName(String name);

    List<Manufacture> findAll();

}