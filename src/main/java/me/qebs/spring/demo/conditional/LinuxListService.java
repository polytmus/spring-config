package me.qebs.spring.demo.conditional;

/**
 * @create 2018-04-19 14:28
 */

public class LinuxListService implements ListService {
    @Override
    public String showListCmd() {
        return "ls";
    }
}
