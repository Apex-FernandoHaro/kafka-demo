package com.apexsystems.curso_kafka_springboot_demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerDemo {
    //PRACTICE 3
    @GetMapping("/ctrl1")
    public String ctrl1(){
        return "pagina1";
    }
}