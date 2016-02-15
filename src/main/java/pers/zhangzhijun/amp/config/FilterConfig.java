package pers.zhangzhijun.amp.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.embedded.FilterRegistrationBean;
import org.springframework.context.annotation.Configuration;

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
    /*
    Annotate your filter with one of the Spring stereotypes such as @Component
    Register a @Bean with Filter type in Spring config
    Register a @Bean with FilterRegistrationBean type in Spring config
    */
    //@Bean

    public FilterRegistrationBean filterRegistrationBean(){
        FilterRegistrationBean registration = new FilterRegistrationBean();
        /*
        Filter myFilter = new MyFilter();
        beanFactory.autowireBean(myFilter);
        registration.setFilter(myFilter);
        registration.addUrlPatterns("/myfitlerpath/*");
        */
        return registration;
    }




}

