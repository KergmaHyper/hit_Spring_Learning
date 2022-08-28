package org.pop.Ent;

import java.lang.reflect.Field;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostComp implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName)
            throws BeansException {
        System.err.println("POST PROCESS BEFORE INIT: " + bean.getClass().getName());

        Field[] fields = bean.getClass().getDeclaredFields();
        for (Field field : fields) {
            System.err.println(field.getType());
            if (field.getType().equals(java.lang.String.class)) {
                field.setAccessible(true);
                try {
                    String str = (String) field.get(bean);
                    field.set(bean, str.replaceAll("o", "0").replaceAll("O", "0"));
                    // str = (String) field.get(bean);
                    System.err.println("!!!content: " + str);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }

        return bean;
    }

}
