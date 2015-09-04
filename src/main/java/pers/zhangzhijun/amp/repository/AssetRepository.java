package pers.zhangzhijun.amp.repository;

import org.springframework.data.repository.CrudRepository;
import pers.zhangzhijun.amp.domain.Asset;

import java.util.List;

/**
 * Created by Zhang Zhijun on 2015/8/23.
 */
public interface AssetRepository extends CrudRepository<Asset, Long> {
    List<Asset> findAll();

    Asset findByAssetId(String assetId);

    List<Asset> findByName(String name);

    List<Asset> findByModel(String model);

    List<Asset> findByType(String type);

    List<Asset> findByStatus(String status);

    List<Asset> findByManufacturer(String manufacturer);

    List<Asset> findByNameAndModelAndTypeAndManufacturer(String name, String model, String type, String manufacturer);
}
