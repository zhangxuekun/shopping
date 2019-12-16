package com.luryoo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("tmpl")
public class TemplateController {

    @RequestMapping("/thymeleaf")
    public String thymeleaf(Model model) {
        model.addAttribute("name", "thymeleaf");
        return "/thymeleaf/index";
    }

    @RequestMapping("/freemarker")
    public String freemarker(Model model) {
        model.addAttribute("name", "freemarker");
        return "/freemarker/index";
    }

    @RequestMapping("/jsp")
    public String jsp(Model model) {
        model.addAttribute("name", "jsp");
        return "index";
    }

}
