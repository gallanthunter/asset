package pers.zhangzhijun.amp.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.embedded.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pers.zhangzhijun.amp.config.filter.LoginFilter;

/**
 * ClassName: pers.zhangzhijun.amp.config
 * Function :
 * Author   : ZhangZhijun
 * Date     : 2016/2/15 20:14
 * Since    : v1.0.0
 */
@Configuration
public class FilterConfig {
    private static Logger logger = LoggerFactory.getLogger(FilterConfig.class);

    @Bean
    public FilterRegistrationBean filterRegistrationBean(){
        FilterRegistrationBean registration = new FilterRegistrationBean();
        LoginFilter loginFilter = new LoginFilter();
        registration.setFilter(loginFilter);
        registration.addUrlPatterns("/login/*");
        return registration;
    }

}

