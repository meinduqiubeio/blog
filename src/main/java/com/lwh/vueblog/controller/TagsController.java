package com.lwh.vueblog.controller;

import com.lwh.vueblog.service.TagService;
import com.lwh.vueblog.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("tags")
public class TagsController {
    @Autowired
    private TagService tagService;

    @GetMapping("hot")
    public Result hot(){
        int limit = 6;
        return tagService.hots(limit);

    }
}
