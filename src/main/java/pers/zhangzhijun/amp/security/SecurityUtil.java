package pers.zhangzhijun.amp.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.context.SecurityContextHolder;
import pers.zhangzhijun.amp.domain.User;

/**
 * Created by ZhangZhijun on 2015/9/11.
 */
public class SecurityUtil {
    private final Logger logger = LoggerFactory.getLogger(SecurityUtil.class);

    public static String getCurrentUser(){

        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String userid = null;
        if (principal instanceof User){
            userid = ((User) principal).getUid();
        } else {
            userid = principal.toString();
        }
        return userid;
    }
}
