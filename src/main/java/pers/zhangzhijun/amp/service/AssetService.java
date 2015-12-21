package pers.zhangzhijun.amp.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.zhangzhijun.amp.domain.Asset;
import pers.zhangzhijun.amp.dto.AssetDTO;
import pers.zhangzhijun.amp.repository.AssetRepository;
import pers.zhangzhijun.amp.util.GeneratorUUID;

/**
 * Created by ZhangZhijun on 2015/8/30.
 */
@Service
public class AssetService {
    private Logger logger = LoggerFactory.getLogger(AssetService.class);

    @Autowired
    AssetRepository assetRepository;

    public AssetDTO createAsset(AssetDTO assetDTO) {
        Asset asset = new Asset();
        if (assetRepository.findByAssetId(assetDTO.getAssetId()) != null){
            logger.debug("the assetid {} already exist!",assetDTO.getAssetId());
            return null;
        }
        if(assetDTO.getAssetId() == null) {
            assetDTO.setAssetId(GeneratorUUID.getUUID());
        }
        asset = covertAssetDTOToAsset(assetDTO);
        assetRepository.save(asset);
        logger.debug("create asset: {} successful!",assetDTO.toString());
        return assetDTO;
    }

//    update asset info
    public AssetDTO updateAsset(AssetDTO assetDTO) {
        Asset asset = new Asset();
        if (assetRepository.findByAssetId(assetDTO.getId()) != null) {
            logger.debug("The assetId cannot be changed!");
            return null;
        }
        asset = covertAssetDTOToAsset(assetDTO);
        assetRepository.save(asset);
        return assetDTO;
    }

    public Asset covertAssetDTOToAsset(AssetDTO assetDTO) {
        Asset asset = new Asset();
        asset.setAssetId(assetDTO.getAssetId());
        asset.setName(assetDTO.getName());
        asset.setModel(assetDTO.getModel());
        asset.setTypeId(assetDTO.getTypeId());
        asset.setStatus(assetDTO.getStatus());
        asset.setManufacturerId(assetDTO.getManufacturerId());
        asset.setDescription(assetDTO.getDescription());
        return asset;
    }

    public AssetDTO convertAssetToAssetDTO(Asset asset) {
        AssetDTO assetDTO = new AssetDTO();
        assetDTO.setAssetId(asset.getAssetId());
        assetDTO.setName(asset.getName());
        assetDTO.setModel(asset.getModel());
        assetDTO.setTypeId(asset.getTypeId());
        assetDTO.setStatus(asset.getStatus());
        assetDTO.setManufacturerId(asset.getManufacturerId());
        assetDTO.setDescription(asset.getDescription());

        return assetDTO;
    }
}
