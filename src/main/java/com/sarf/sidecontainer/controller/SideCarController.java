package com.sarf.sidecontainer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/side")
public class SideCarController {

    @GetMapping
    public String sayHello() {
        return "Hello! I am a Side car app";
    }

}
