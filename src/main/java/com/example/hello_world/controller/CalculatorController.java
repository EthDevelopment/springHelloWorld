package com.example.hello_world.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @GetMapping("/add")
    public String add(@RequestParam("num1") double num1, @RequestParam("num2") double num2) {
        double sum = num1 + num2;
        return "The sum of " + num1 + " and " + num2 + " is " + sum;
    }
}