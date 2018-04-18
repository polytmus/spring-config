package me.qebs.spring.demo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * 日志切面
 *
 * @create 2018-04-18 12:58
 */
@Component
@Aspect
public class LogAspect {
    @Pointcut("@annotation(me.qebs.spring.demo.aop.Action)")
    public void annotationPointCut() {
    }

    @Before("execution(* me.qebs.spring.demo.aop.DemoMethodService.*(..))")
    public void before(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        System.out.println("方法规则拦截式：" + method.getName());
    }

    @After("annotationPointCut()")
    public void after(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        Action action = method.getAnnotation(Action.class);
        System.out.println("注解式拦截：" + action.name());
    }

}
