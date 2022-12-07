package com.skbeton.skbeton.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContactsController {
    /*Meta*/
    private String title = "Контакты";
    private String description = "Бетон от производителя в Москве и Московской области";
    private String image = "";
    private String keywords = "бетон, бетонный завод, цемент, бетон от производителя," +
            "завод бетонный, доставка бетона, производитель бетона";

    @GetMapping("/contacts")
    public String getContacts(Model model) {
        model.addAttribute("title",title);
        model.addAttribute("description",description);
        model.addAttribute("image",image);
        model.addAttribute("keywords",keywords);
        return "contact";
    }
}
