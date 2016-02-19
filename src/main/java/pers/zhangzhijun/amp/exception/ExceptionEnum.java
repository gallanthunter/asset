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
    ASSET_NOT_EXIST("100001", "Asset not exist."),
    ASSET_ALREADY_EXIST("100002", "Asset already exist."),
    ASSET_ID_ALREADY_USED("100003","AssetId already used."),

    // User exception 200000 ~ 299999
    USER_NOT_EXIST("200000", "User not exist."),
    USER_ALREADY_EXIST("200001", "User already exist."),
    USER_HAVE_NO_RIGHTS("200002", "User have no rights."),;

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
