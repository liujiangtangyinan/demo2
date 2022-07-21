package com.atguigu.boot.config;

import com.atguigu.boot.bean.Pet;
import com.atguigu.boot.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//配置类里面使用@bean标注在方法上给容器注册组件，默认也是单实例的。
//配置类本身也是组件
//proxyBeanMethods:代理bean的方法
@Configuration(proxyBeanMethods = true) //告诉这是一个配置类
public class MyConfig {
    @Bean //给容器中添加组件，  以方法名作为组件的id，返回对象就是组件类型。返回的值就是容器中的实例。
    public User user01(){
        return new User("zhangsan",18);
    }
    @Bean
    public Pet tomcatPet(){
        return new Pet("tomcat");
    }
}
