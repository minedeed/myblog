package com.minedeed.blog.admin.dao;

import com.minedeed.blog.admin.enity.ArticleEnity;
import com.minedeed.blog.admin.enity.ArticleExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleMapper {
    long countByExample(ArticleExample example);

    int deleteByExample(ArticleExample example);

    int deleteByPrimaryKey(Integer cid);

    int insert(ArticleEnity record);

    int insertSelective(ArticleEnity record);

    List<ArticleEnity> selectByExampleWithBLOBs(ArticleExample example);

    List<ArticleEnity> selectByExample(ArticleExample example);

    ArticleEnity selectByPrimaryKey(Integer cid);

    int updateByExampleSelective(@Param("record") ArticleEnity record, @Param("example") ArticleExample example);

    int updateByExampleWithBLOBs(@Param("record") ArticleEnity record, @Param("example") ArticleExample example);

    int updateByExample(@Param("record") ArticleEnity record, @Param("example") ArticleExample example);

    int updateByPrimaryKeySelective(ArticleEnity record);

    int updateByPrimaryKeyWithBLOBs(ArticleEnity record);

    int updateByPrimaryKey(ArticleEnity record);
}