package pers.zhangzhijun.amp.exception;

/**
 * ClassName: pers.zhangzhijun.amp.exception
 * Function :
 * Author   : ZhangZhijun
 * Date     : 2015/12/26 20:59
 * Since    : v1.0.0
 */
public enum ExceptionEnum implements IException {

    // Asset exception 100001 ~ 199999
    ASSET_TYPE_NOT_EXIST("100001", "Asset type not exist."),
    ASSET_TYPE_ALREADY_EXIST("100002", "Asset type already exist."),
    ASSET_PROTOCOL_NOT_EXIST("100003", "Asset protocol not exist."),
    ASSET_PROTOCOL_ALREADY_EXIST("100004", "Asset protocol already exist."),
    ASSET_MANUFACTURER_NOT_EXIST("100005", "Asset manufacturer not exist."),
    ASSET_MANUFACTURER_ALREADY_EXIST("100006", "Asset manufacturer already exist."),
    ASSET_NOT_EXIST("100007", "Asset not exist."),
    ASSET_ALREADY_EXIST("100008", "Asset already exist."),
    ASSET_ASSETID_ALREADY_USED("100009", "Asset assetid already used."),
    ASSET_STATUS_IS_ABNORMAL("100010", "Asset status is abnormal."),
    ASSET_ALREADY_SUBSCRIBER("100011", "asset already subscriber."),
    ASSET_SUBSCRIBED_BY_USER("100012", "Asset subscribed by user."),

    // User exception 200000 ~ 299999
    USER_NOT_EXIST("200001", "User not exist."),
    USER_ALREADY_EXIST("200002", "User already exist."),
    USER_HAS_NO_RIGHT("200003", "User has no right."),
    USER_HAS_ASSETS_UNSUBSCRIBE("200004", "User has assets un subscribe."),;

    private String errorCode;
    private String errorDesc;


    ExceptionEnum(String errorCode, String errorDesc) {
        this.errorCode = errorCode;
        this.errorDesc = errorDesc;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public void setErrorDesc(String errorDesc) {
        this.errorDesc = errorDesc;
    }


    public String getErrorCode() {
        return this.errorCode;
    }

    public String getErrorDesc() {
        return this.errorDesc;
    }

    @Override
    public String toString() {
        return "ExceptionEnum{" +
                "errorCode='" + errorCode + '\'' +
                ", errorDesc='" + errorDesc + '\'' +
                '}';
    }
}
