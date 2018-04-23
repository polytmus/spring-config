package me.qebs.spring.demo.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @create 2018-04-19 14:46
 */

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

        DemoService demoService = context.getBean(DemoService.class);

        demoService.outputResult();

        context.close();
    }
}
