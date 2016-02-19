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
import pers.zhangzhijun.amp.service.login.LoginSuccessHandler;

/**
 * Created by Zhang Zhijun on 2015/8/23.
 */
@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    private Logger logger = LoggerFactory.getLogger(SecurityConfiguration.class);

    //@Autowired
    //TokenRepository tokenRepository;

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        //指定密码加密所使用的加密器为passwordEncoder()
        auth.userDetailsService(userDetailsService()).passwordEncoder(bCryptPasswordEncoder());//code5
        //不删除凭据，以便记住用户
        auth.eraseCredentials(false);

    }

    protected void configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.authorizeRequests()
                .anyRequest()
                //.antMatchers("/", "/list")
                .permitAll()
                //.anyRequest()
                //.authenticated()
                //.and()
                //.formLogin()
                //.loginPage("/login")
                //.permitAll()
                //.successHandler(loginSuccessHandler())
                //.and()
                //.logout()
                //.logoutSuccessUrl("/")
                //.permitAll()
                //.invalidateHttpSession(true)
                //.and()
                //.rememberMe()
                //.tokenValiditySeconds(1209600)
                //.tokenRepository(tokenRepository)
        ;
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

