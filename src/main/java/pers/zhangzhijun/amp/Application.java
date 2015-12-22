package pers.zhangzhijun.amp;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import java.io.PrintStream;

/**
 * Created by Zhang Zhijun on 2015/8/22.
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args){
        SpringApplication application = new SpringApplication(Application.class);

        application.setBannerMode(Banner.Mode.CONSOLE);
        application.run(args);
    }

    public class CustomerBanner implements Banner {

        @Override
        public void printBanner(Environment environment, Class<?> aClass, PrintStream printStream) {

        }
    }
}
