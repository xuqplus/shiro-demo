package cn.xuqplus.config;

import cn.xuqplus.domain.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2017-04-10.
 */
@Configuration
public class BeanConfig {
    @Bean(value = "bb")
    public User bb() {
        return new User(22l, "bb", "bb");
    }

    @Bean(name = "aa")
    public User aa() {
        return new User(11l, "aa", "aa");
    }
}
