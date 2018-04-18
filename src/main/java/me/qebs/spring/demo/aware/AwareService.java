package me.qebs.spring.demo.aware;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * aware 翻译为意识到的，觉察到的。一般情况下，Bean对spring容器的存在是没有意识的。但某些时候我们需要利用Spring 容器本身的资源，所以
 * 这个时候需要意识到Spring容器的存在，这就是所谓的Spring Aware。
 * <p>
 * Spring Aware 目的是为了让Bean 获得Spring 容器的服务。
 */

@Service
public class AwareService implements BeanNameAware, ResourceLoaderAware {

    private String beanName;
    private ResourceLoader resourceLoader;

    @Override
    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    public void outputResult() {
        System.out.println("Bean 的名称:+" + beanName);
        Resource resource = resourceLoader.getResource("classpath:text.txt");
        try {
            System.out.println(IOUtils.toString(resource.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
