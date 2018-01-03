package com.jskj.ssm.service;

import com.jskj.ssm.model.Article;
import com.jskj.ssm.util.ActionReturnUtil;
import java.util.List;
import java.util.Map;

public interface ArticleService {
    ActionReturnUtil getOneArticle(int artId);
    ActionReturnUtil  getAllArticles();
    ActionReturnUtil addArticle(Article article);
    ActionReturnUtil getArticlesByArtType(String artType);//artTitle,artText,artType,artPicturePath,artURL,artDate
    ActionReturnUtil getArticlesByArtTypeOnly(String artType);


    //非框架
    public List<Map<String,Object>> newsShowUs();//要闻快递
    public List<Map<String,Object>> newsShowSXyjzx();//市县研究中心
    public Map<String,Object> newsAdSeById(Map<String,Object> map);//一条新闻的具体信息
    public Map<String,Object> Gettebieguanzhu(Map<String,Object> map);//特别关注
    public Map<String,Object> Getshenhuagaige(Map<String,Object> map);//深化改革
    public Map<String,Object> Gettoutiaoxinwen(Map<String,Object> map);//头条新闻
    public List<Map<String,Object>> GetHuoDongyg();//活动预告
    public List<Map<String,Object>> GetTongzhigg();//通知公告

}
