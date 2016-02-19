package pers.zhangzhijun.amp.config.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * ClassName: pers.zhangzhijun.amp.config.filter
 * Function :
 * Author   : ZhangZhijun
 * Date     : 2016/2/19 20:10
 * Since    : v1.0.0
 */
public class LoginFilter implements Filter {
    private final static Logger LOGGER = LoggerFactory.getLogger(LoginFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        LOGGER.debug("Login filter init ...");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest)servletRequest;
        request.setCharacterEncoding("UTF-8");
        filterChain.doFilter(request,servletResponse);
    }

    @Override
    public void destroy() {
        LOGGER.debug("Login filter destroy ...");
    }
}
