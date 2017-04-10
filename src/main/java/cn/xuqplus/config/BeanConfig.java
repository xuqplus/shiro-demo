package cn.xuqplus.config;

import cn.xuqplus.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2017-04-10.
 */
@Configuration
public class BeanConfig {
    @Bean(value = "bb")
    public User user() {
        return new User(11l, "aa", "aa");
    }
}
