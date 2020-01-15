package com.minedeed.blog.admin.controller;

import com.minedeed.blog.admin.enity.ArticleEnity;
import com.minedeed.blog.controller.Test;
import com.minedeed.blog.utils.PageUtil;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/ArticleManage")
public class ArticleManageController {
    static Logger log = Logger.getLogger(ArticleManageController.class);

    @RequestMapping("/list")
    public String list(){

        ArticleEnity en = new ArticleEnity();
        List<ArticleEnity> enityList = new ArrayList<ArticleEnity>();
        enityList.add(en);
        PageUtil<ArticleEnity> p = new PageUtil<ArticleEnity>();
        p.setData(enityList);
        return null;
    }
    @RequestMapping("/addArticle")
    public String addArticle(@RequestParam String title,@RequestParam String content)
    {

        log.info(title+content);
        return "admin/ArticleManage.html";
    }

}
