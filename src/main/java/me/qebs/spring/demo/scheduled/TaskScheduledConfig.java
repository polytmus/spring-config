package me.qebs.spring.demo.scheduled;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@ComponentScan("me.qebs.spring.demo.scheduled")
@Configuration
@EnableScheduling//开启计划任务
public class TaskScheduledConfig {


}
