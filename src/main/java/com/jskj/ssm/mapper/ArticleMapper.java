package com.jskj.ssm.mapper;

import com.jskj.ssm.model.Article;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleMapper {
    List<Article> getAllArticles();
    Article getOneArticle(int artId);
    int addArticle(Article article);
    int deleteArticle(String ArtTitle);
    List<Article> getArticlesByArtType(String artType);
    Article getArticlesByArtTypeOnly(String artType);



}
