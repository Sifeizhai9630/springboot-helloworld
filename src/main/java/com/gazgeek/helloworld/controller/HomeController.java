package com.gazgeek.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/ab")
    String home() {
        return "Hello from GazGeek!";
    }

}
