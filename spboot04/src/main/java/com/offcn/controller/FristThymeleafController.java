package com.offcn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FristThymeleafController {

    @GetMapping("/first")
    public String indexPage(Model model) {
        String message = "Hello, Thymeleaf!";
        model.addAttribute("message", message);
        return "index";
    }
}
