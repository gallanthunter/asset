package pers.zhangzhijun.amp.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pers.zhangzhijun.amp.domain.AssetType;

import java.util.List;

/**
 * ClassName: pers.zhangzhijun.amp.repository
 * Function :
 * Author   : ZhangZhijun
 * Date     : 22:37
 * Since    : v1.0.0
 */
@Repository
public interface AssetTypeRepository extends CrudRepository<AssetType, Long>{

    @Query("SELECT t from AssetType t where t.name = ?1")
    AssetType findByName(String name);

    List<AssetType> findAll();
}
