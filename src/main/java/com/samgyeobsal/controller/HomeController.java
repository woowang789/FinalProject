package com.samgyeobsal.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/web/")
@RequiredArgsConstructor
@Slf4j
public class HomeController {
    @GetMapping
    public String introPage(){
        return "intro/intro_main";
    }


}
