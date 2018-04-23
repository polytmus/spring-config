package me.qebs.spring.demo.conditional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @create 2018-04-19 14:32
 */

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionConfig.class);
        ListService listService = context.getBean(ListService.class);
        System.out.println(context.getEnvironment().getProperty("os.name") + "系统下的列表命令为：" + listService.showListCmd());
    }
}
