package com.nipa.abandon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CausesController{
        @GetMapping("/causes")
        public String cause(){
            return "/pagelist/causes";
        }
}
