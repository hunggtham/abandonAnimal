package com.nipa.abandon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestimonialController {
    @GetMapping("/testimonial")
    public String testimonial(){
        return "/pagelist/testimonial";
    }
}
