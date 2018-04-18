package me.qebs.spring.demo.scheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 计划任务执行类
 */
@Service
public class ScheduledTaskService {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        System.out.println("每隔5s执行一次 " + sdf.format(new Date()));
    }

    @Scheduled(cron = "48 49 23 ?  * * ")
    public void fixTimeExecution() {
        System.out.println("在指定时间 " + sdf.format(new Date()) + "执行");
    }
}
