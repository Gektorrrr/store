package com.example.store.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoContoller {

    @GetMapping("/user/hello")
    public void Hello(){
        System.out.println("Hellowwww");
    }
}
