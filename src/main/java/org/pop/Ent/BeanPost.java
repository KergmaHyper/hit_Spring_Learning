package org.pop.Ent;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class BeanPost implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("Definition count: " + beanFactory.getBeanDefinitionCount());

        for (String name : beanFactory.getBeanDefinitionNames())
            System.out.println(name);
    }

}
