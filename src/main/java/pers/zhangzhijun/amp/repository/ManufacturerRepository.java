package pers.zhangzhijun.amp.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pers.zhangzhijun.amp.domain.Manufacturer;

import java.util.List;

/**
 * ClassName: pers.zhangzhijun.amp.repository
 * Function :
 * Author   : ZhangZhijun
 * Date     : 22:31
 * Since    : v1.0.0
 */
@Repository
public interface ManufacturerRepository extends CrudRepository<Manufacturer, Long> {
    Manufacturer findById(String id);

    @Query("select m from Manufacturer m where m.name = ?1")
    Manufacturer findByName(String name);

    List<Manufacturer> findAll();

}
