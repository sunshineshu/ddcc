package com.ddcc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mecon on 2017/3/19.
 */
@RestController
public class TestController {
    @RequestMapping("/index")
    public String index(){
        return "Spring Boot Very Nice";
    }
}
