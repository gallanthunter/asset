package pers.zhangzhijun.amp.exception;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ClassName: pers.zhangzhijun.amp.exception
 * Function :
 * Author   : ZhangZhijun
 * Date     : 2016/2/18 8:05
 * Since    : v1.0.0
 */
public class ExceptionMsg {
    private static final Logger LOGGER = LoggerFactory.getLogger(ExceptionMsg.class);

    private String exceptionCode;
    private String exceptionDesc;

    public ExceptionMsg() {

    }

    public ExceptionMsg(String exceptionCode, String exceptionDesc) {
        this.exceptionCode = exceptionCode;
        this.exceptionDesc = exceptionDesc;
    }

    public String getExceptionCode() {
        return exceptionCode;
    }

    public void setExceptionCode(String exceptionCode) {
        this.exceptionCode = exceptionCode;
    }

    public String getExceptionDesc() {
        return exceptionDesc;
    }

    public void setExceptionDesc(String exceptionDesc) {
        this.exceptionDesc = exceptionDesc;
    }
}
