package com.minedeed.blog.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @RequestMapping("")
    String admin(){
        return "admin/index.html";
    }
    @RequestMapping("/admin.html")
    String admin2(){
        return "admin/admin.html";
    }
}
