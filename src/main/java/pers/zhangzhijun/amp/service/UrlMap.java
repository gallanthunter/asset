package pers.zhangzhijun.amp.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ClassName: pers.zhangzhijun.amp.service
 * Function :
 * Author   : ZhangZhijun
 * Date     : 2016/2/20 10:34
 * Since    : v1.0.0
 */
public class UrlMap {
    private static final Logger LOGGER = LoggerFactory.getLogger(UrlMap.class);

    public static final String URL_ASSET_CREATE = "/asset/create";
    public static final String URL_ASSET_UPDATE = "/asset/update";
    public static final String URL_ASSET_LIST_ALL = "/asset/list";
    public static final String URL_ASSET_LIST_BY_ASSETID = "/asset/list/{assetId}";
    public static final String URL_ASSET_LIST_BY_NAME = "/asset/list/{name}";
    public static final String URL_ASSET_LIST_BY_MODEL = "/asset/list/{model}";
    public static final String URL_ASSET_LIST_BY_TYPE = "/asset/list/{type}";
    public static final String URL_ASSET_LIST_BY_PROTOCOL = "/asset/list/{protocol}";
    public static final String URL_ASSET_LIST_BY_STATUS = "/asset/list/{status}";
    public static final String URL_ASSET_LIST_BY_MANUFACTURER = "/asset/list/{manufacturer}";
    public static final String URL_ASSET_LIST_BY_USERNAME = "/asset/list/{username}";
    public static final String URL_ASSET_LIST_BY_USERID = "/asset/list/{userid}";
    public static final String URL_ASSET_LIST_BY_PROJECTGROUP = "/asset/list/{projectgroup}";
    public static final String URL_ASSET_DELETE_BY_ID = "/asset/delete/{id}";

    public static final String URL_ASSET_TYPE_CREATE = "/assettype/create";
    public static final String URL_ASSET_TYPE_UPDATE = "/assettype/update";
    public static final String URL_ASSET_TYPE_LIST_ALL = "/assettype/list";
    public static final String ULR_ASSET_TYPE_LIST_BY_NAME = "/assettype/list/{name}";
    public static final String URL_ASSET_TYPE_DELETE_BY_ID = "/assettype/delete/{id}";

    public static final String URL_ASSET_MANUFACTURER_CREATE = "/assetmanufacturer/create";
    public static final String URL_ASSET_MANUFACTURER_UPDATE = "/assetmanufacturer/update";
    public static final String URL_ASSET_MANUFACTURER_LIST_ALL = "/assetmanufacturer/list";
    public static final String URL_ASSET_MANUFACTURER_LIST_BY_NAME = "/assetmanufacturer/list/{name}";
    public static final String URL_ASSET_MANUFACTURER_DELETE_BY_ID = "/assetmanufacturer/delete/{id}";

    public static final String URL_ASSET_PROTOCOL_CREATE = "/assetprotocol/create";
    public static final String URL_ASSET_PROTOCOL_UPDATE = "/assetprotocol/update";
    public static final String URL_ASSET_PROTOCOL_LIST_ALL = "/assetprotocol/list";
    public static final String URL_ASSET_PROTOCOL_LIST_BY_NAME = "/assetprotocol/list/{name}";
    public static final String URL_ASSET_PROTOCOL_DELETE_BY_ID = "/assetprotocol/delete/{id}";

    public static final String URL_USER_CREATE = "/user/create";
    public static final String URL_USER_UPDATE = "/user/update";
    public static final String URL_USER_LIST_ALL = "/user/list";
    public static final String URL_USER_LIST_BY_ROLE = "/user/list/{role}";
    public static final String URL_USER_DELETE_BY_USERID = "/user/delete/{userid}";

    public static final String URL_PROJECTGROUP_CREATE = "/projectgroup/create";
    public static final String URL_PROJECTGROUP_UPDATE = "/projectgroup/update";
    public static final String URL_PROJECTGROUP_LIST = "/projectgroup/list";
    public static final String URL_PROJECTGROUP_LIST_BY_NAME = "/projectgroup/list/{name}";
    public static final String URL_PROJECTGROUP_DELETE = "/projectgroup/delete/{id}";
}
