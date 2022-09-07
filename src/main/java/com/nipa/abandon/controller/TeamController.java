package com.nipa.abandon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class TeamController {
    @GetMapping("/team")
    public String team(){
        return "/pagelist/team";
    }
}
