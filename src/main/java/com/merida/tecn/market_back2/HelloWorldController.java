package com.merida.tecn.market_back2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/saludar")

public class HelloWorldController {
    @GetMapping ("/saludo")
    public String HelloWorld() {
        return "hello world";
    }
}

