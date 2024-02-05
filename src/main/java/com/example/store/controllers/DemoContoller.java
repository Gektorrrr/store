package com.example.store.controllers;

import org.springframework.web.bind.annotation.GetMapping;

public class DemoContoller {

    @GetMapping("/hello")
    public void Hello(){
        System.out.println("Hellowwww");
    }
}
