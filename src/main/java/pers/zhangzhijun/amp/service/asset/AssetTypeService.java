package pers.zhangzhijun.amp.service.asset;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.zhangzhijun.amp.domain.AssetType;
import pers.zhangzhijun.amp.dto.AssetTypeDTO;
import pers.zhangzhijun.amp.repository.AssetTypeRepository;

/**
 * ClassName: pers.zhangzhijun.amp.service
 * Function :
 * Author   : ZhangZhijun
 * Date     : 11:34
 * Since    : v1.0.0
 */
@Service
public class AssetTypeService {
    private Logger logger = LoggerFactory.getLogger(AssetTypeService.class);

    @Autowired
    AssetTypeRepository assetTypeRepository;

    public void createAssetType(AssetTypeDTO assetTypeDTO) {
        AssetType assetType = new AssetType();
        if (assetTypeRepository.findByName(assetTypeDTO.getName()) != null) {
            logger.error("Asset type already exist!");
        }

        if (assetTypeDTO.getName() == null) {
            logger.error("Assset type name cannot be null!");
        }

        assetType = convertAssetTypeDTOToAssetType(assetTypeDTO);
        assetTypeRepository.save(assetType);
    }

    public AssetType convertAssetTypeDTOToAssetType(AssetTypeDTO assetTypeDTO) {
        AssetType assetType = new AssetType();
        assetType.setId(assetTypeDTO.getId());
        assetType.setName(assetTypeDTO.getName());
        assetType.setDescription(assetTypeDTO.getDescription());

        return assetType;
    }

    public AssetTypeDTO convertAssetTypeToAssetTypeDTO(AssetType assetType) {
        AssetTypeDTO assetTypeDTO = new AssetTypeDTO();
        assetTypeDTO.setId(assetType.getId());
        assetTypeDTO.setName(assetType.getName());
        assetTypeDTO.setDescription(assetType.getDescription());

        return assetTypeDTO;
    }

}
