package me.qebs.spring.demo.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @create 2018-04-19 14:29
 */
@Configuration
public class ConditionConfig {

    @Conditional(WindowsCondition.class)
    @Bean
    public ListService windowsListService() {
        return new WindowsListService();
    }

    @Conditional(LinuxCondition.class)
    @Bean
    public ListService linuxListService() {
        return new LinuxListService();
    }
}
