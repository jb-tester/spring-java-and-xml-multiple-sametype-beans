package com.mytests.spring.beans;


import org.springframework.beans.factory.annotation.Autowired;

// navigation to declaration and to Spring view - ok
public class BarBean {


    private String id;

    // here gutter is ok, all beans are suggested: uncomment to check
   // @Autowired
   // private FooBean foo;

    public String getId() {
        return id;
    }

    public BarBean(String id) {
        this.id = id;
    }
}
