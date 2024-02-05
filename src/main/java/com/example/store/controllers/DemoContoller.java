package com.example.store.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user/hello")
public class DemoContoller {

    @GetMapping
    public void Hello(){
        System.out.println("Hellowwww");
    }
}
