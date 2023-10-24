package com.atguigu.boot.config;

import com.atguigu.boot.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @Author Jack丶WeTa
 * @Date 2023/7/21 10:40
 * @Description TODO
 */

@Configuration //这是一个配置类, 替代以前的配置文件。 配置类本身也是容器中的组件
public class appConfig {

    /**
     * 1. 组件默认是单实例
     * @return
     */
    @Scope("prototype")
    @Bean("userhaha") //替代以前的bean标签。 组件再容器中的名字是方法名
    public User user01() {
        var user = new User();
        user.setId(1L);
        user.setName("张三");
        return user;
    }

}
