package pers.zhangzhijun.amp.service.asset;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pers.zhangzhijun.amp.domain.Asset;
import pers.zhangzhijun.amp.dto.AssetDTO;
import pers.zhangzhijun.amp.exception.ExceptionEnum;
import pers.zhangzhijun.amp.exception.ServiceException;
import pers.zhangzhijun.amp.repository.AssetRepository;
import pers.zhangzhijun.amp.repository.SubscriptionRepository;
import pers.zhangzhijun.amp.util.GeneratorUUID;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZhangZhijun on 2015/8/30.
 */
@Service
@Transactional
public class AssetService {
    private static final Logger LOGGER = LoggerFactory.getLogger(AssetService.class);

    @Autowired
    AssetRepository assetRepository;

    @Autowired
    SubscriptionRepository subscriptionRepository;

    public void create(AssetDTO assetDTO) throws ServiceException {
        Asset asset = new Asset();
        if (assetRepository.findById(assetDTO.getId()) != null) {
            LOGGER.error("the asset {} already exist!", assetDTO.getId());
            throw new ServiceException(ExceptionEnum.ASSET_ALREADY_EXIST);
        }

        if (assetRepository.findByAssetId(assetDTO.getAssetId()) != null) {
            LOGGER.error("The assetid {} already used!", assetDTO.getAssetId());
            throw new ServiceException(ExceptionEnum.ASSET_ASSETID_ALREADY_USED);
        }
        assetDTO.setAssetId(GeneratorUUID.getUUID());

        asset = covertAssetDTOToAsset(assetDTO);
        assetRepository.save(asset);
        LOGGER.debug("create asset: {} successful!", assetDTO.toString());
    }

    public void update(AssetDTO assetDTO) throws ServiceException {
        Asset asset = new Asset();
        if (assetRepository.findById(assetDTO.getId()) == null) {
            LOGGER.debug("The asset not exist.");
            throw new ServiceException(ExceptionEnum.ASSET_NOT_EXIST);
        }
        asset = covertAssetDTOToAsset(assetDTO);
        assetRepository.save(asset);
        LOGGER.debug("update asset: {} successful!", assetDTO.toString());
    }

    public List<AssetDTO> getAll() {
        List<Asset> assetList = assetRepository.findAll();
        List<AssetDTO> assetDTOList = new ArrayList<AssetDTO>();
        for (Asset asset : assetList) {
            assetDTOList.add(convertAssetToAssetDTO(asset));
        }

        return assetDTOList;
    }

    public AssetDTO getByAssetId(String assetId) {
        Asset asset = assetRepository.findByAssetId(assetId);
        AssetDTO assetDTO = convertAssetToAssetDTO(asset);

        return assetDTO;
    }

    public List<AssetDTO> getByName(String name) {
        List<Asset> assetList = assetRepository.findByName(name);
        List<AssetDTO> assetDTOList = new ArrayList<AssetDTO>();
        for (Asset asset : assetList) {
            assetDTOList.add(convertAssetToAssetDTO(asset));
        }

        return assetDTOList;
    }

    public List<AssetDTO> getByModel(String Model) {
        List<Asset> assetList = assetRepository.findByName(Model);
        List<AssetDTO> assetDTOList = new ArrayList<AssetDTO>();
        for (Asset asset : assetList) {
            assetDTOList.add(convertAssetToAssetDTO(asset));
        }

        return assetDTOList;
    }

    public List<AssetDTO> getByType(String type) {
        List<Asset> assetList = assetRepository.findByName(type);
        List<AssetDTO> assetDTOList = new ArrayList<AssetDTO>();
        for (Asset asset : assetList) {
            assetDTOList.add(convertAssetToAssetDTO(asset));
        }

        return assetDTOList;
    }

    public List<AssetDTO> getByProtocol(String protocol) {
        List<Asset> assetList = assetRepository.findByName(protocol);
        List<AssetDTO> assetDTOList = new ArrayList<AssetDTO>();
        for (Asset asset : assetList) {
            assetDTOList.add(convertAssetToAssetDTO(asset));
        }

        return assetDTOList;
    }

    public List<AssetDTO> getByStatus(String status) {
        List<Asset> assetList = assetRepository.findByName(status);
        List<AssetDTO> assetDTOList = new ArrayList<AssetDTO>();
        for (Asset asset : assetList) {
            assetDTOList.add(convertAssetToAssetDTO(asset));
        }

        return assetDTOList;
    }

    public List<AssetDTO> getByManufacturer(String manufacturer) {
        List<Asset> assetList = assetRepository.findByName(manufacturer);
        List<AssetDTO> assetDTOList = new ArrayList<AssetDTO>();
        for (Asset asset : assetList) {
            assetDTOList.add(convertAssetToAssetDTO(asset));
        }

        return assetDTOList;
    }

    public List<AssetDTO> getByNameAndModelAndTypeAndProtocolAndManufacturer(String paras) {
        List<Asset> assetList = assetRepository.findByName(paras);
        List<AssetDTO> assetDTOList = new ArrayList<AssetDTO>();
        for (Asset asset : assetList) {
            assetDTOList.add(convertAssetToAssetDTO(asset));
        }

        return assetDTOList;
    }

    public void delete(String assetID) throws ServiceException {
        Asset asset = new Asset();

        asset = assetRepository.findByAssetId(assetID);

        if (asset == null) {
            LOGGER.debug("Asset not exist!");
            throw new ServiceException(ExceptionEnum.ASSET_NOT_EXIST);
        }

        if (subscriptionRepository.findByAid(assetID) != null) {
            LOGGER.debug("Asset {} is associated with User!", asset.toString());
            throw new ServiceException(ExceptionEnum.ASSET_SUBSCRIBED_BY_USER);
        }

        assetRepository.delete(asset);
        LOGGER.debug("Delete asset {} successfully!", asset.toString());
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
