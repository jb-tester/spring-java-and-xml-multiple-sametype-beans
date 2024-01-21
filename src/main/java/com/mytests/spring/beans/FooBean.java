package com.mytests.spring.beans;

// navigation to Spring view works ok: all beans selector is suggested
// navigation to declaration works incorrectly: selector doesn't show the beans from xml config
public class FooBean {
    private String id;

    public String getId() {
        return id;
    }

    public FooBean(String id) {
        this.id = id;
    }
}
