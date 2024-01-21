package com.mytests.spring;

import com.mytests.spring.beans.FooBean;
import com.mytests.spring.beans.NotScannedComponent;
import com.mytests.spring.configs.MyConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * *
 * <p>Created by irina on 1/21/2024.</p>
 * <p>Project: spring-java-and-xml-multiple-sametype-beans</p>
 * *
 */
public class RunMe {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(MyConfig.class);
        System.out.println(((FooBean) ctx.getBean("foo1")).getId());
        System.out.println(((FooBean) ctx.getBean("foo2")).getId());
        System.out.println(((FooBean) ctx.getBean("foo3")).getId());
        System.out.println(((FooBean) ctx.getBean("fooBeanX1")).getId());
        System.out.println(((FooBean) ctx.getBean("fooBeanX2")).getId());
        System.out.println(ctx.getBean(NotScannedComponent.class).getId());
    }

}