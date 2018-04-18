package me.qebs.spring.demo.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @create 2018-04-18 13:11
 */

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
        DemoAnnotationService demoAnnotationService = context.getBean(DemoAnnotationService.class);
        DemoMethodService demoMethodService = context.getBean(DemoMethodService.class);

        demoAnnotationService.add();
        demoMethodService.add();

    }
}
