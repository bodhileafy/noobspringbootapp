package com.noobspringbootapp.mvc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Value("${tan.chin.leong}")
    String externalname;

    @RequestMapping("/")
    public String getIndex() {
        return "Greetings from Main-"+externalname;
    }

}
