package com.example.carros.api;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class IndexController {

    @GetMapping
    public String get(){
        return "API dos Carros";
    }

    @GetMapping("/userInfo")
    public UserDetails useInfo(@AuthenticationPrincipal UserDetails user){
        return user;
    }

}