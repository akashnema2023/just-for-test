package com.org;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emp")
public class MyController {
    @GetMapping("/view")
    public String home(){
        return "this is view page!!";
    }
    @GetMapping("/welcome")
    public String welcomes(){
        return "this is welcome page!!";
    }
}
