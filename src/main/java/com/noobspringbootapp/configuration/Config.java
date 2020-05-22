package com.noobspringbootapp.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Config {

    private String prop;

    //@Autowired
    public Config(@Value("${tan.chin.leong}") String prop) {
        this.prop = prop;
        System.out.println("================== " + prop + "================== ");
    }

    public String getProp() {
        return this.prop;
    }

}
