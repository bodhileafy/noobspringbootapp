package com.noobspringbootapp.mvc;

import com.noobspringbootapp.configuration.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    private Config c;


    @RequestMapping("/")
    public String getIndex() {
        return "Greetings from Main-"+c.getProp();
    }

    public void setConfig(Config c) {
        this.c = c;
    }

}
