package com.mytests.spring.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// navigation to Spring view is ok;
// navigation to bean declaration doesn't work until you comment-out the @Component annotation
@Component
public class NotScannedComponent {

    @Value("someComponentJava")
    String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
