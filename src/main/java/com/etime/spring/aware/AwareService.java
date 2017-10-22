package com.etime.spring.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.context.*;
import org.springframework.core.io.ResourceLoader;

/**
 * Created by huitailang on 2017/10/22.
 * @author huitailang
 */
public class AwareService implements BeanFactoryAware,
        ApplicationContextAware, MessageSourceAware, ApplicationEventPublisherAware,
        ResourceLoaderAware{
    private BeanFactory beanFactory;

    private ApplicationContext applicationContext;

    private ApplicationEventPublisher applicationEventPublisher;

    private MessageSource messageSource;

    private ResourceLoader resourceLoader;


    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    @Override
    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }
}
