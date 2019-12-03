package com.luryoo.controller;

import com.luryoo.bean.BlogProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("blog")
public class BlogController {
    @Autowired
    private BlogProperties blogProperties;

    @RequestMapping("/index")
    @ResponseBody
    public String Index() {
        return blogProperties.getName()+"——"+blogProperties.getTitle();
    }
}
