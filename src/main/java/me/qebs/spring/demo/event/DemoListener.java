package me.qebs.spring.demo.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@Component
public class DemoListener implements ApplicationListener<DemoEvent> {

    private static Executor executor = Executors.newFixedThreadPool(1);

    @Override
    public void onApplicationEvent(final DemoEvent demoEvent) {
        executor.execute(new Runnable() {
            @Override
            public void run() {
                String msg = demoEvent.getMsg();
                try {
                    TimeUnit.SECONDS.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("我(bean-demoListener)接收到了bean-demoPublisher发布的消息:" + msg);
            }
        });

    }
}
