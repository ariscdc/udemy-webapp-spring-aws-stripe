package com.ariscdc.udemy.wsas.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ariscdc
 */
@Controller
public class HelloWorldController {

    @RequestMapping("/")
    public String sayHello() {
        return "index";
    }
}
