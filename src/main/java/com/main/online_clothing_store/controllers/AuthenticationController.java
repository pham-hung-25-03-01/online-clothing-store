package com.main.online_clothing_store.controllers;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthenticationController {  
    @GetMapping("/login")
    public String login(Principal principal){
        return principal == null ?  "authentication/login" : "redirect:/"; 
        //return "authentication/login";
    }
    // @GetMapping("/logout")
    // public String logout(Principal principal){
    //     return principal == null ?  "authentication/login" : "authentication/logout"; 
    //     //return "authentication/login";
    // }
}
