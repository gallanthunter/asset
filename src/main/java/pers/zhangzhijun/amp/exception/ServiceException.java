package pers.zhangzhijun.amp.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by ZhangZhijun on 2015/9/11.
 */
public class ServiceException extends BaseException {

    private static final long serialVersionUID = 5265492358802512550L;
    private static final Logger LOGGER = LoggerFactory.getLogger(ServiceException.class);

    public ServiceException(ExceptionEnum exceptionEnum) {
        super(exceptionEnum);
    }
}
