package com.delivery.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class ApiVersionController {
    @GetMapping("version")
    public String ApiVersion(){
        return "version 1.0";
    }
}
