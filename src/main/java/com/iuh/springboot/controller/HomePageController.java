package com.iuh.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomePageController {
	@RequestMapping("/")
    public String index() {
        return "redirect:http://localhost:8080/swagger-ui.html";
    }
}
