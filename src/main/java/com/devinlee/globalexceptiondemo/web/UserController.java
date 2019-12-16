package com.devinlee.globalexceptiondemo.web;

import com.devinlee.globalexceptiondemo.exception.MyException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/exception")
    public String exception() throws MyException {

        throw new MyException("测试异常");
    }
}
