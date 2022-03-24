package com.lwh.vueblog.service;

import com.lwh.vueblog.vo.Result;
import com.lwh.vueblog.vo.params.PageParams;


public interface ArticleService {
    Result listArticle(PageParams pageParams);


    Result hotArticle(int limit);
}
