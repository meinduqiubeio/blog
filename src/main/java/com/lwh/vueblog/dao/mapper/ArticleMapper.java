package com.lwh.vueblog.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lwh.vueblog.dao.pojo.Article;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ArticleMapper extends BaseMapper<Article> {
}
