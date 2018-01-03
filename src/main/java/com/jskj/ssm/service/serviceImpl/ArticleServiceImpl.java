package com.jskj.ssm.service.serviceImpl;
import com.jskj.ssm.dao.Mapper;
import com.jskj.ssm.mapper.ArticleMapper;
import com.jskj.ssm.model.Article;
import com.jskj.ssm.service.ArticleService;
import com.jskj.ssm.util.ActionReturnUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("articleService")
public class ArticleServiceImpl implements ArticleService {


    @Autowired
    private ArticleMapper articleMapper;

    @Override
    public ActionReturnUtil getAllArticles(){
        List<Article> articleList = articleMapper.getAllArticles();
        List<Map<String,Object>> list = new ArrayList<>();
        for(int i=0;i<articleList.size();i++){
            Article article = articleList.get(i);
            Map<String,Object> map = new HashMap<>();
            map.put("artId",article.getArtId());
            map.put("artTitle",article.getArtTitle());
            map.put("artText",article.getArtText());
            map.put("artType",article.getArtType());
            map.put("artPicturePath",article.getArtPicturePath());
            map.put("artURL",article.getArtURL());
            map.put("artDate",article.getArtDate());
            map.put("artAuthor",article.getArtAuthor());
            map.put("artEditor",article.getArtEditor());

            list.add(map);
        }
        return ActionReturnUtil.returnSuccessWithData(list);
    }


    @Override
    public ActionReturnUtil addArticle(Article article){
        if(articleMapper.addArticle(article)!=0){
            return ActionReturnUtil.returnSuccess();
        }else{
            return ActionReturnUtil.returnError();
        }
    }


    @Override
    public ActionReturnUtil getOneArticle(int artId){


        if(articleMapper.getOneArticle(artId)!=null) {
            Article article=articleMapper.getOneArticle(artId);

            return ActionReturnUtil.returnSuccessWithData(article);
        }else {
            return ActionReturnUtil.returnError();
        }

    }

    @Override
    public ActionReturnUtil getArticlesByArtType(String artType)
    {
        List<Article> articleList = articleMapper.getArticlesByArtType(artType);
        List<Map<String,Object>> list = new ArrayList<>();
        for(int i=0;i<articleList.size();i++){
            Article article = articleList.get(i);
            Map<String,Object> map = new HashMap<>();
            map.put("artId",article.getArtId());
            map.put("artTitle",article.getArtTitle());
            map.put("artText",article.getArtText());
            map.put("artType",article.getArtType());
            map.put("artPicturePath",article.getArtPicturePath());
            map.put("artURL",article.getArtURL());
            map.put("artDate",article.getArtDate());
            map.put("artAuthor",article.getArtAuthor());
            map.put("artEditor",article.getArtEditor());

            list.add(map);
        }
        return ActionReturnUtil.returnSuccessWithData(list);

    }


    @Override
    public ActionReturnUtil getArticlesByArtTypeOnly(String artType){


        if(articleMapper.getArticlesByArtTypeOnly(artType)!=null) {
            Article article=articleMapper.getArticlesByArtTypeOnly(artType);

            return ActionReturnUtil.returnSuccessWithData(article);
        }else {
            return ActionReturnUtil.returnError();
        }

    }



//    public List<Map<String,Object>> newsShowUs(Map<String,Object> map)
//    {
//        Mapper us = new Mapper();
//        return us.newsShowUs(map);
//    }

    public List<Map<String,Object>> newsShowUs()
    {
        Mapper us = new Mapper();
        return us.newsShowUs();
    }

    public Map<String,Object> newsAdSeById(Map<String,Object> map)
    {
        Mapper us = new Mapper();
        return us.newsAdSeById(map);
    }

    public List<Map<String,Object>> newsShowSXyjzx()
    {
        Mapper us = new Mapper();
        return us.newsShowSXyjzx();
    }

    public Map<String,Object> Gettebieguanzhu(Map<String,Object> map)
    {
        Mapper us = new Mapper();
        return us.Gettebieguanzhu(map);
    }

    public Map<String,Object> Getshenhuagaige(Map<String,Object> map)
    {
        Mapper us = new Mapper();
        return us.Getshenhuagaige(map);
    }

    public Map<String,Object> Gettoutiaoxinwen(Map<String,Object> map)
    {
        Mapper us = new Mapper();
        return us.Gettoutiaoxinwen(map);
    }

    public List<Map<String,Object>> GetTongzhigg()
    {
        Mapper us = new Mapper();
        return us.GetTongzhigg();
    }

    public List<Map<String,Object>> GetHuoDongyg()
    {
        Mapper us = new Mapper();
        return us.GetHuoDongyg();
    }





}
