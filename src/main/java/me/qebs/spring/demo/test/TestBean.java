package me.qebs.spring.demo.test;

/**
 * @create 2018-04-19 15:30
 */

public class TestBean {
    private String content;

    public TestBean(String content){
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
