package com.example.demo.phistory.controller;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.phistory.repository.*;
import com.example.demo.phistory.service.*;

@Controller
public class AdminItemController {

    @PersistenceContext
    EntityManager entityManager;

    @Autowired
    ProductService productService;

    @GetMapping("/admin/item/list")
    public ModelAndView index(ModelAndView mav) {
        mav.setViewName("admin/item/list");
        mav.addObject("msg","This is a MyData sample.");
        Iterable list = productService.getProduct();
        mav.addObject("datalist",list);
        mav.addObject("message", "Hello Thymeleaf!!");
        return mav;
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
