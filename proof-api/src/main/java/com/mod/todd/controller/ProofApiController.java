package com.mod.todd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProofApiController {

    @GetMapping("hello")
    public String hello() {
        return "Hello - Christ loves you";
    }

}
