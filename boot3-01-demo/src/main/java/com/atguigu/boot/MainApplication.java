package com.atguigu.boot;


import com.atguigu.boot.bean.Person;
import com.atguigu.boot.bean.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


/**
 * @Author Jack丶WeTa
 * @Date 2023/7/20 15:13
 * @Description 启动springboot项目的主入口程序
 *              默认的包扫描规则：
 *                  1. springboot只会扫描主程序包下的或者其下面的子包，自动的component-scan功能
 *                  2. 自定义扫描路径：
 *                      ①。@SpringBootApplication(scanBasePackages = "com.atguigu")
 *                      ②。@ComponentScan("com.atguigu")
 */
//@SpringBootApplication(scanBasePackages = "com.atguigu")
@SpringBootApplication()
//    @SpringBootConfiguration
//    @EnableAutoConfiguration
//    @ComponentScan("com.atguigu")
public class MainApplication {
    public static void main(String[] args) {

        // java10: 局部变量类型的自动推断
        var ioc = SpringApplication.run(MainApplication.class, args);

        // 1. 获取容器中所有组件的名字
        String[] names = ioc.getBeanDefinitionNames();
        // 2. 挨个遍历: dispatcherServlet、beanNameViewResolver、characterEncodingFilter、multipartResolver
        // springboot把以前配置的核心组件现在都给我们自动配置好了
//        for (String name : names) {
//            System.out.println(name);
//        }
//        String[] forType = ioc.getBeanNamesForType(User.class);
//        for (String s : forType) {
//            System.out.println(s);
//        }
//        Object userhaha1 = ioc.getBean("userhaha");
//        Object userhaha2 = ioc.getBean("userhaha");
//        System.out.println(userhaha1 == userhaha2);

        Person person = ioc.getBean(Person.class);
        System.out.println("person: " + person);
    }
}