package pers.zhangzhijun.amp.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ClassName: pers.zhangzhijun.amp.exception
 * Function :
 * Author   : ZhangZhijun
 * Date     : 2016/2/18 8:03
 * Since    : v1.0.0
 */
public class BaseException extends Exception {
    private static final long serialVersionUID = -9190832341862457623L;
    private static final Logger logger = LoggerFactory.getLogger(BaseException.class);

    private ExceptionMsg exceptionMsg;

    public BaseException(String exceptionType, String exceptionDesc){
        this.exceptionMsg = new ExceptionMsg(exceptionType,exceptionDesc);
    }

    public BaseException(ExceptionMsg exceptionMsg) {
        this.exceptionMsg = exceptionMsg;
    }

    public BaseException(IException iexception) {
        this.exceptionMsg = new ExceptionMsg(iexception.getErrorCode(),iexception.getErrorDesc());
    }
}
