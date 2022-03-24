package com.lwh.vueblog.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lwh.vueblog.dao.pojo.Tag;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TagMapper extends BaseMapper<TagMapper> {
    List<Tag> findTagsByArticleId(Long articleId);

    List<Long> findHotsTagId(int limit);

    List<Tag> findTagsByTagId(List<Long> tagIds);
}
