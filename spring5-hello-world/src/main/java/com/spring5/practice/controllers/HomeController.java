package com.spring5.practice.controllers;

import com.spring5.practice.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/")
public class HomeController {

    @Autowired
    private AccountService accountService;

    @GetMapping
    public ModelAndView helloWorld() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("name", "Sadat");
        mv.setViewName("hello");
        return mv;
    }

    @GetMapping("/say-hello")
    public String helloName(Model model, @RequestParam(name = "name", defaultValue = "") String name) {
        model.addAttribute("name", name.isBlank() ? "World" : name);
        return "hello";
    }
}
