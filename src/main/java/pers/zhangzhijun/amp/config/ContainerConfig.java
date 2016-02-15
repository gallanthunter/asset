package pers.zhangzhijun.amp.config;

import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.ErrorPage;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;

import java.util.concurrent.TimeUnit;

/**
 * ClassName: pers.zhangzhijun.amp.config
 * Function :
 * Author   : ZhangZhijun
 * Date     : 2016/2/15 16:53
 * Since    : v1.0.0
 */
@Configuration
public class ContainerConfig {
    @Bean
    public EmbeddedServletContainerCustomizer containerCustomizer() {

        return container -> {
            //config container paras
            container.setSessionTimeout(24, TimeUnit.HOURS);

            // config error page
            container.addErrorPages(new ErrorPage(HttpStatus.BAD_REQUEST, "/views/400.html"));
            container.addErrorPages(new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR, "/views/500.html"));
            container.addErrorPages(new ErrorPage(HttpStatus.NOT_FOUND, "/views/400.html"));
        };
    }

    @Bean
    public EmbeddedServletContainerFactory servletContainer() {
        TomcatEmbeddedServletContainerFactory factory = new TomcatEmbeddedServletContainerFactory();
        factory.setPort(8080);
        factory.setSessionTimeout(24, TimeUnit.HOURS);

        factory.addErrorPages(new ErrorPage(HttpStatus.BAD_REQUEST, "/views/400.html"));
        factory.addErrorPages(new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR, "/views/500.html"));
        factory.addErrorPages(new ErrorPage(HttpStatus.NOT_FOUND, "/views/400.html"));
        return factory;
    }
}
