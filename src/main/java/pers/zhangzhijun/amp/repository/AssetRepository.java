package pers.zhangzhijun.amp.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import pers.zhangzhijun.amp.domain.Asset;

import java.util.List;

/**
 * Created by Zhang Zhijun on 2015/8/23.
 */
public interface AssetRepository extends CrudRepository<Asset, Long> {
    List<Asset> findAll();
    
    @Query("select * from t_asset a where a.asset_id = ?1")
    Asset findByAssetId(String assetId);

    @Query("select * from t_asset a where a.name = ?1")
    List<Asset> findByName(String name);

    @Query("select * from t_asset a where a.model = ?1")
    List<Asset> findByModel(String model);

    @Query("select * from t_asset a, t_type t where a.typeId = t.id and t.type_name = ?1")
    List<Asset> findByType(String type);

    @Query("select * from t_asset a, t_protocol p where a.protocolId = p.id and p.protocol_name = ?1")
    List<Asset> findByProtocol(String protocol);

    @Query("select * from t_asset a where a.status = ?1")
    List<Asset> findByStatus(String status);

    @Query("select * from t_asset a, t_manufacture m where a.manufacturerId = m.id and m.manufacture_name = ?1")
    List<Asset> findByManufacturer(String manufacturer);

    @Query("select * from t_asset a, t_type t, t_protocol p, t_manufacture m where a.name = ?1 and a.model = ?2 and a.typeId = t.id" +
            " and t.name = ?3 and a.protocol_id = p.id and p.protocol_name = ?4 and a.manufactureId = m.id and m.manufacture_name = ?5")
    List<Asset> findByNameAndModelAndTypeAndProtocolAndManufacture(String name, String model, String type, String
            protocol, String manufacturer);
}
