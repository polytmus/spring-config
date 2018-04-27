package me.qebs.spring.demo.springmvc;

import org.springframework.stereotype.Service;

@Service
public class TestDemoService {

    public String doSomething() {
        return "hello";
    }
}
