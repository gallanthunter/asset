package pers.zhangzhijun.amp.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.zhangzhijun.amp.domain.Asset;
import pers.zhangzhijun.amp.dto.AssetDTO;
import pers.zhangzhijun.amp.repository.AssetRepository;
import pers.zhangzhijun.amp.repository.SubscriptionRepository;
import pers.zhangzhijun.amp.util.GeneratorUUID;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZhangZhijun on 2015/8/30.
 */
@Service
public class AssetService {
    private Logger logger = LoggerFactory.getLogger(AssetService.class);

    @Autowired
    AssetRepository assetRepository;

    @Autowired
    SubscriptionRepository subscriptionRepository;

    public void createAsset(AssetDTO assetDTO) {
        Asset asset = new Asset();
        if (assetRepository.findByAssetId(assetDTO.getAssetId()) != null){
            logger.debug("the assetid {} already exist!",assetDTO.getAssetId());
        }
        if(assetDTO.getAssetId() == null) {
            assetDTO.setAssetId(GeneratorUUID.getUUID());
        }
        asset = covertAssetDTOToAsset(assetDTO);
        assetRepository.save(asset);
        logger.debug("create asset: {} successful!",assetDTO.toString());
    }

    public void updateAsset(AssetDTO assetDTO) {
        Asset asset = new Asset();
        if (assetRepository.findByAssetId(assetDTO.getId()) != null) {
            logger.debug("The assetId cannot be changed!");
        }
        asset = covertAssetDTOToAsset(assetDTO);
        assetRepository.save(asset);
        logger.debug("update asset: {} successful!",assetDTO.toString());
    }

    public List<AssetDTO> getAllAsset(){
        List<Asset> assetList = assetRepository.findAll();
        List<AssetDTO> assetDTOList = new ArrayList<AssetDTO>();
        for (Asset asset: assetList){
            assetDTOList.add(convertAssetToAssetDTO(asset));
        }

        return assetDTOList;
    }

    public List<AssetDTO> getAssetByAssetId(String assetId){
        List<Asset> assetList = assetRepository.findByName(assetId);
        List<AssetDTO> assetDTOList = new ArrayList<AssetDTO>();
        for (Asset asset: assetList){
            assetDTOList.add(convertAssetToAssetDTO(asset));
        }

        return assetDTOList;
    }

    public List<AssetDTO> getAssetByName(String name){
        List<Asset> assetList = assetRepository.findByName(name);
        List<AssetDTO> assetDTOList = new ArrayList<AssetDTO>();
        for (Asset asset: assetList){
            assetDTOList.add(convertAssetToAssetDTO(asset));
        }

        return assetDTOList;
    }

    public List<AssetDTO> getAssetByModel(String Model){
        List<Asset> assetList = assetRepository.findByName(Model);
        List<AssetDTO> assetDTOList = new ArrayList<AssetDTO>();
        for (Asset asset: assetList){
            assetDTOList.add(convertAssetToAssetDTO(asset));
        }

        return assetDTOList;
    }

    public List<AssetDTO> getAssetByType(String type){
        List<Asset> assetList = assetRepository.findByName(type);
        List<AssetDTO> assetDTOList = new ArrayList<AssetDTO>();
        for (Asset asset: assetList){
            assetDTOList.add(convertAssetToAssetDTO(asset));
        }

        return assetDTOList;
    }

    public List<AssetDTO> getAssetByProtocol(String protocol){
        List<Asset> assetList = assetRepository.findByName(protocol);
        List<AssetDTO> assetDTOList = new ArrayList<AssetDTO>();
        for (Asset asset: assetList){
            assetDTOList.add(convertAssetToAssetDTO(asset));
        }

        return assetDTOList;
    }

    public List<AssetDTO> getAssetByStatus(String status){
        List<Asset> assetList = assetRepository.findByName(status);
        List<AssetDTO> assetDTOList = new ArrayList<AssetDTO>();
        for (Asset asset: assetList){
            assetDTOList.add(convertAssetToAssetDTO(asset));
        }

        return assetDTOList;
    }

    public List<AssetDTO> getAssetByManufacturer(String manufacturer){
        List<Asset> assetList = assetRepository.findByName(manufacturer);
        List<AssetDTO> assetDTOList = new ArrayList<AssetDTO>();
        for (Asset asset: assetList){
            assetDTOList.add(convertAssetToAssetDTO(asset));
        }

        return assetDTOList;
    }

    public List<AssetDTO> getAssetByNameAndModelAndTypeAndProtocolAndManufacturer(String paras){
        List<Asset> assetList = assetRepository.findByName(paras);
        List<AssetDTO> assetDTOList = new ArrayList<AssetDTO>();
        for (Asset asset: assetList){
            assetDTOList.add(convertAssetToAssetDTO(asset));
        }

        return assetDTOList;
    }

    public void deleteAsset(AssetDTO assetDTO){
        Asset asset = new Asset();

        asset = assetRepository.findByAssetId(assetDTO.getAssetId());

        if (asset == null) {
            logger.debug("Asset {} not exist!", assetDTO.toString());
        }

        if (subscriptionRepository.findByAid(assetDTO.getAssetId()) != null) {
            logger.debug("Asset {} is associated with User!",assetDTO.toString());
        }

        assetRepository.delete(asset);
        logger.debug("Delete asset {} successfully!",asset.toString());
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
