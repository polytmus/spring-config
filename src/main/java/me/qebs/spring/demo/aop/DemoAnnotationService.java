package me.qebs.spring.demo.aop;

import org.springframework.stereotype.Service;

/**
 * 使用注解被拦截的类
 *
 * @create 2018-04-18 12:54
 */
@Service
public class DemoAnnotationService {
    @Action(name = "注解式的拦截add操作")
    public void add() {
    }

}
