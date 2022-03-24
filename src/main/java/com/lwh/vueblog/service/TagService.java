package com.lwh.vueblog.service;

import com.lwh.vueblog.vo.Result;
import com.lwh.vueblog.vo.TagVo;

import java.util.List;

public interface TagService {
    List<TagVo> findTagsByArticleId(Long articleId);

    Result hots(int limit);
}
