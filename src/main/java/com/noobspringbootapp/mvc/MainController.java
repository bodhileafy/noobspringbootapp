package com.noobspringbootapp.mvc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping("/")
    public String getIndex() {
        return "Greetings from Main";
    }

}
