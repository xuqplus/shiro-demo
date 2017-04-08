package cn.xuqplus.config;

import cn.xuqplus.shiro.MyAuthorizingRealm;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2017-04-08.
 */
//@Configuration
public class ShiroConfig {
    @Bean
    public ShiroFilterFactoryBean shiroFilterFactoryBean() {
        ShiroFilterFactoryBean factoryBean = new ShiroFilterFactoryBean();
        return factoryBean;
    }

    @Bean//(name = "securityManager")
    public SecurityManager securityManager() {
        DefaultSecurityManager securityManager = new DefaultSecurityManager();
        securityManager.setRealm(realm());
        return securityManager;
    }

    @Bean//(name = "realm")
    public Realm realm() {
        return new MyAuthorizingRealm();
    }
}
