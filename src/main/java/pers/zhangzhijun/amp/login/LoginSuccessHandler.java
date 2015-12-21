package pers.zhangzhijun.amp.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
import pers.zhangzhijun.amp.domain.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * ClassName: pers.zhangzhijun.amp.login
 * Function :
 * Author   : ZhangZhijun
 * Date     : 2015/12/21 23:36
 * Since    : v1.0.0
 */
public class LoginSuccessHandler extends SavedRequestAwareAuthenticationSuccessHandler {
    private Logger logger = LoggerFactory.getLogger(LoginSuccessHandler.class);

    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication
            authentication) throws IOException,
            ServletException {
        //获得授权后可得到用户信息   可使用SUserService进行数据库操作
        User userDetails = (User) authentication.getPrincipal();

        //输出登录提示信息
        logger.debug("欢迎 " + userDetails.getEmail() + " 登录！");
        super.onAuthenticationSuccess(request, response, authentication);
    }

}
