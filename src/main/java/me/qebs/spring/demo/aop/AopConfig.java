package me.qebs.spring.demo.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @create 2018-04-18 13:09
 */
@Configuration
@ComponentScan("me.qebs.spring.demo.aop")
@EnableAspectJAutoProxy
public class AopConfig {
}
