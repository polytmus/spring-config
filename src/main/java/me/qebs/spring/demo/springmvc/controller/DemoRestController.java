package me.qebs.spring.demo.springmvc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class DemoRestController {

    @RequestMapping(value = "/getJson", produces = {"application/json;charset=UTF-8"})
    public DemoObj getJson(DemoObj obj) {
        return new DemoObj(obj.getId() + 1, obj.getName() + "yy");
    }

    @RequestMapping(value = "/getxml", produces = {"application/xml;charset=UTF-8"})
    public DemoObj getxml(DemoObj obj) {
        return new DemoObj(obj.getId() + 1, obj.getName() + "yy");
    }
}
