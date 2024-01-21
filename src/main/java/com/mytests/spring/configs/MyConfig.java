package com.mytests.spring.configs;

import com.mytests.spring.beans.BarBean;
import com.mytests.spring.beans.FooBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:spring-context.xml")
public class MyConfig {

    @Bean
    public FooBean foo1() {
        return new FooBean("foo1");
    }

    @Bean
    public FooBean foo2() {
        return new FooBean("foo2");
    }

    @Bean
    public FooBean foo3() {
        return new FooBean("foo3");
    }

    @Bean
    public BarBean bar() {
        return new BarBean("the only bar");
    }
}
