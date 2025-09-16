package com.klu;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcController {

    public CalcController() {
        System.out.println("✅ CalcController Loaded");
    }

    @GetMapping("/api/test")
    public String testApi() {
        return "API is working!";
    }

    @GetMapping("/api/add/{a}/{b}")
    public String add(@PathVariable int a, @PathVariable int b) {
        int sum = a + b;
        return "Addition: " + sum;
    }
}
