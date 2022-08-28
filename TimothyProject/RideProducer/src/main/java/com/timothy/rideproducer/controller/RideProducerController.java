package com.timothy.rideproducer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rideproducer")
public class RideProducerController {

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World";
    }
}
