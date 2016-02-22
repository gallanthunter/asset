package pers.zhangzhijun.amp.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pers.zhangzhijun.amp.dto.AssetDTO;
import pers.zhangzhijun.amp.exception.ServiceException;
import pers.zhangzhijun.amp.service.UrlMap;
import pers.zhangzhijun.amp.service.asset.AssetService;

import javax.validation.Valid;

/**
 * Created by Zhang Zhijun on 2015/8/22.
 */
@RestController
public class AssetResources {
    private static Logger logger = LoggerFactory.getLogger(AssetResources.class);

    @Autowired
    AssetService assetService;

    @RequestMapping(value = UrlMap.URL_ASSET_CREATE,
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public ResponseEntity<AssetDTO> create(@Valid @RequestBody AssetDTO assetDTO) throws ServiceException {
        assetService.create(assetDTO);
        return new ResponseEntity<AssetDTO>(assetDTO, HttpStatus.CREATED);
    }

    @RequestMapping(value = UrlMap.URL_ASSET_UPDATE,
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public ResponseEntity<AssetDTO> update(AssetDTO assetDTO) throws ServiceException {
        assetService.update(assetDTO);
        return new ResponseEntity<AssetDTO>(assetDTO, HttpStatus.CREATED);
    }

    //@RequestMapping(value = "/list",
    //        method = RequestMethod.GET,
    //        headers = MediaType.APPLICATION_JSON_VALUE
    //)
    //public ResponseEntity<?> getAll(){
    //    return new ResponseEntity<>(assetService.getAll(),HttpStatus.OK);
    //}


    @RequestMapping(value = UrlMap.URL_ASSET_LIST_BY_ASSETID,
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<AssetDTO> getByAssetId(@PathVariable String assetId) {
        return new ResponseEntity<AssetDTO>(assetService.getByAssetId(assetId), HttpStatus.OK);
    }

    @RequestMapping(value = UrlMap.URL_ASSET_DELETE_BY_ID,
            method = RequestMethod.DELETE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public HttpStatus delete(@PathVariable String assetId) throws ServiceException {
        assetService.delete(assetId);
        return HttpStatus.OK;
    }
}
