package me.qebs.spring.demo.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * 使用JSR250
 */
public class JSR250WayService {
    @PostConstruct
    public void init() {
        System.out.println("jsr250-init-method");
    }

    public JSR250WayService() {
        super();
        System.out.println("初始化构造函数-JSR250WayService");
    }

    @PreDestroy
    public void destory() {
        System.out.println("jsr250-destory-method");
    }
}


