package me.qebs.spring.demo.test;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @create 2018-04-19 15:31
 */
@Configuration
public class TestConfig {

    @Bean
    public TestBean testBean() {
        return new TestBean("test");
    }
}
