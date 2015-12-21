package pers.zhangzhijun.amp.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import pers.zhangzhijun.amp.login.LoginSuccessHandler;
import pers.zhangzhijun.amp.repository.TokenRepository;
import pers.zhangzhijun.amp.service.UserService;

/**
 * Created by Zhang Zhijun on 2015/8/23.
 */
@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    private Logger logger = LoggerFactory.getLogger(SecurityConfiguration.class);

    @Autowired
    TokenRepository tokenRepository;

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        //指定密码加密所使用的加密器为passwordEncoder()
        auth.userDetailsService(userDetailsService()).passwordEncoder(bCryptPasswordEncoder());//code5
        //不删除凭据，以便记住用户
        auth.eraseCredentials(false);

    }

    protected void configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.authorizeRequests()
                //允许所有用户访问”/”和”/list”
                .antMatchers("/", "/list")
                .permitAll()
                //其他地址的访问均需验证权限
                .anyRequest()
                .authenticated()
                .and()
                .formLogin()
                //指定登录页是”/login”
                .loginPage("/login")
                .permitAll()
                //登录成功后可使用loginSuccessHandler()存储用户信息，可选
                .successHandler(loginSuccessHandler())
                .and()
                .logout()
                //退出登录后的默认网址是”/”
                .logoutSuccessUrl("/")
                .permitAll()
                .invalidateHttpSession(true)
                .and()
                //登录后记住用户，下次自动登录
                .rememberMe()
                .tokenValiditySeconds(1209600)
                //数据库中必须存在名为persistent_logins的表
                .tokenRepository(tokenRepository);
    }

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder(4);
    }

    @Bean
    public LoginSuccessHandler loginSuccessHandler(){
        return new LoginSuccessHandler();//code6
    }

}

