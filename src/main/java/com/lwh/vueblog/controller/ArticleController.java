package com.lwh.vueblog.controller;

import com.lwh.vueblog.service.ArticleService;
import com.lwh.vueblog.vo.Result;
import com.lwh.vueblog.vo.params.PageParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("articles")
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    @PostMapping
    public Result listArticle(@RequestBody PageParams pageParams) {
        return articleService.listArticle(pageParams);
    }

    @PostMapping("hot")
    public Result listArticle() {
        int limit = 5;
        return articleService.hotArticle(limit);
    }
}
