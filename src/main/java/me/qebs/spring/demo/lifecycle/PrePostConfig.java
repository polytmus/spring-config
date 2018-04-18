package me.qebs.spring.demo.lifecycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("me.qebs.spring.demo.lifecycle")
public class PrePostConfig {
    @Bean(initMethod = "init", destroyMethod = "destory")
    BeanWayService beanWayService() {
        return new BeanWayService();
    }

    @Bean
    JSR250WayService jsr250WayService() {
        return new JSR250WayService();
    }
}
