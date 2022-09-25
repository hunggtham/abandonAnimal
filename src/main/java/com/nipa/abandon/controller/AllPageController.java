package com.nipa.abandon.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class AllPageController {
    @GetMapping("/about")
    public String about(){
        return "/pagelist/about";
    }

    @GetMapping("/causes")
    public String cause(){
        return "/pagelist/causes";
    }

    @GetMapping("/contact")
    public String contact(){
        return "/pagelist/contact";
    }

    @GetMapping("/donate")
    public String donate(){ return "/pagelist/donate"; }
    @GetMapping("/error")
    public String error(){
        return "/pagelist/error";
    }

    @GetMapping("/service")
    public String service(){
        return "/pagelist/service";
    }
    @GetMapping("/team")
    public String team(){ return "/pagelist/team"; }

    @GetMapping("/testimonial")
    public String testimonial(){
        return "/pagelist/testimonial";
    }
}

