package com.domain.belajarspringdasar.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

import com.domain.belajarspringdasar.data.Foo;

@Component
public class FooBeanFactoryPostProcessor implements BeanDefinitionRegistryPostProcessor {

    /*
     * Secara default, kita tidak akan pernah membuat applicationContext secara
     * manual. Namun kadang kita ingin memodifikasi secara internal
     * applicationContext. Spring merekomendasikan untuk menggunakan
     * BeanFactoryPostProcessor (mirip seperti BeanPostProcessor namun fokus pada
     * Bean Factorynya). salah satu turunan dari BeanFactoryPostProcessor yaitu
     * BeanDefinitionRegistryPostProcessor yang cocok untuk melakukan registrasi
     * bean secara otomatis menggunakan BeanDefinitionRegistryPostProcessor.
     */
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        // nothing
    }

    // melakukan registrasi bean secara programatic
    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        // membuat bean definition
        GenericBeanDefinition definition = new GenericBeanDefinition();
        // scope yang diinginkan singleton
        definition.setScope("singleton");
        // bean classnya yaitu Foo class
        definition.setBeanClass(Foo.class);

        // untuk melakukan registrasi
        registry.registerBeanDefinition("foo", definition);
    }

}
