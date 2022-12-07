package com.skbeton.skbeton.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PriceController {
    @GetMapping("/price")
    public String getPrice(Model model) {

        return "price";
    }
}
