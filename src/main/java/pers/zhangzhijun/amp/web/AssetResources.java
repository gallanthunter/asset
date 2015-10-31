package pers.zhangzhijun.amp.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pers.zhangzhijun.amp.dto.AssetDTO;

/**
 * Created by Zhang Zhijun on 2015/8/22.
 */
@RestController
@RequestMapping("/asset")
public class AssetResources {

    @RequestMapping(value = "/create",
                    method = RequestMethod.POST,
                    headers = MediaType.APPLICATION_JSON_VALUE
                    )
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public ResponseEntity<AssetDTO> createAsset(AssetDTO assetDTO) {
        createAsset(assetDTO);
        return new ResponseEntity(assetDTO,HttpStatus.OK);
    }
}
