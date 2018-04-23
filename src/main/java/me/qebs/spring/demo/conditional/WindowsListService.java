package me.qebs.spring.demo.conditional;

/**
 * @create 2018-04-19 14:26
 */

public class WindowsListService implements ListService {
    @Override
    public String showListCmd() {
        return "dir";
    }
}
