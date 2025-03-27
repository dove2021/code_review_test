package org.dove.code.review.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MonitorWeb {

    @GetMapping("/web")
    public String web(){
        return "WEB_OK";
    }
}
