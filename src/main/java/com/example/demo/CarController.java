package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/car")
public class CarController {

    @GetMapping("/brand")
    private String carBrand(){
        return "audi";
    }

    @GetMapping("/model")
    private String carModel(){
        return "rs 6";
    }
}
