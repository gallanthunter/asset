package pers.zhangzhijun.amp.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pers.zhangzhijun.amp.domain.Asset;

import java.util.List;

/**
 * Created by Zhang Zhijun on 2015/8/23.
 */
@Repository
public interface AssetRepository extends CrudRepository<Asset, Long> {
    List<Asset> findAll();
    
    @Query("select a from Asset a where a.assetId = ?1")
    Asset findByAssetId(String assetId);

    @Query("select a from Asset a where a.name = ?1")
    List<Asset> findByName(String name);

    @Query("select a from Asset a where a.model = ?1")
    List<Asset> findByModel(String model);

    @Query("select a from Asset a, AssetType t where a.typeId = t.id and t.name = ?1")
    List<Asset> findByType(String type);

    @Query("select a from Asset a, Protocol p where a.protocolId = p.id and p.name = ?1")
    List<Asset> findByProtocol(String protocol);

    @Query("select a from Asset a where a.status = ?1")
    List<Asset> findByStatus(String status);

    @Query("select a from Asset a, Manufacturer m where a.manufacturerId = m.id and m.name = ?1")
    List<Asset> findByManufacturer(String manufacturer);

    @Query("select a from Asset a, AssetType t, Protocol p, Manufacturer m where a.name = ?1 and a.model = ?2 and a.typeId = t.id" +
            " and t.name = ?3 and a.id = p.id and p.name = ?4 and a.manufacturerId = m.id and m.name = ?5")
    List<Asset> findByNameAndModelAndTypeAndProtocolAndManufacturer(String name, String model, String type, String
            protocol, String manufacturer);
}
