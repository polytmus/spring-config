package me.qebs.spring.demo.annotation;

import org.springframework.stereotype.Service;

/**
 * @create 2018-04-19 14:45
 */
@Service
public class DemoService {

    public void outputResult(){
        System.out.println("使用组合注解");
    }
}
