package pers.zhangzhijun.amp.util;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.UUID;

/**
 * ClassName: pers.zhangzhijun.amp.util
 * Function :
 * Author   : ZhangZhijun
 * Date     : 23:22
 * Since    : v1.0.0
 */
public class GeneratorUUID {
    private final static Logger logger = LoggerFactory.getLogger(GeneratorUUID.class);

    public static String getUUID() {
        String s = UUID.randomUUID().toString();
        return s.substring(0,8)+s.substring(9,13)+s.substring(14,18)+s.substring(19,23)+s.substring(24);
    }
}
