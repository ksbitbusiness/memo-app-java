package com.example.demo.memo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminItemController {
    
    @GetMapping("/admin/item/list")
    public String adminitemList(Model model) {
        model.addAttribute("message", "Hello Thymeleaf!!");
        return "admin/item/list";
    }

    @GetMapping("/admin/item/regist")
    public String adminitemRegist(Model model) {
        model.addAttribute("message", "Hello Thymeleaf!!");
        return "admin/item/regist";
    }

    @GetMapping("/admin/item/remove")
    public String adminitemRemove(Model model) {
        model.addAttribute("message", "Hello Thymeleaf!!");
        return "admin/item/remove";
    }

    @GetMapping("/admin/item/edit")
    public String adminitemEdit(Model model) {
        model.addAttribute("message", "Hello Thymeleaf!!");
        return "admin/item/edit";
    }
}
