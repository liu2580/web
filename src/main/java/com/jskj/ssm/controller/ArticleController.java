package com.jskj.ssm.controller;

import com.jskj.ssm.model.Article;
import com.jskj.ssm.service.ArticleService;
import com.jskj.ssm.util.ActionReturnUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/article")
public class ArticleController {

    @Resource
    private ArticleService articleService;

    @RequestMapping(value = "/getOneArticle",method = RequestMethod.GET)
    public ActionReturnUtil getOneArticle(@RequestParam(value = "artId") final int artId){
        return articleService.getOneArticle(artId);
    }

    @RequestMapping(value = "/getAllArticles",method = RequestMethod.GET)
    public ActionReturnUtil showArticle()throws Exception{
        return articleService.getAllArticles();
    }

    @RequestMapping(value="/addArticle",method = RequestMethod.GET)
    public ActionReturnUtil addArticle(Article article)throws Exception{
        return articleService.addArticle(article);
    }


    @RequestMapping(value = "/getArticlesByArtType",method = RequestMethod.GET)
    public ActionReturnUtil getArticlesByArtTYpepe(@RequestParam(value = "artType") final String artType){
        return articleService.getArticlesByArtType(artType);
    }

//    @RequestMapping(value = "/getArticlesByArtTypeOnly",method = RequestMethod.GET)
//    public ActionReturnUtil getArticlesByArtTYpepeOnly(@RequestParam(value = "artType") final String artType){
//        return articleService.getArticlesByArtType(artType);
//    }


    @RequestMapping(value = "/getArticlesByArtTypeOnly",method = RequestMethod.GET)
    public ActionReturnUtil getArticlesByArtTypeOnly(@RequestParam(value = "artType") final String artType){
        return articleService.getArticlesByArtTypeOnly(artType);
    }




//    @RequestMapping(value = "/deleteArticle",method = RequestMethod.DELETE)
//    public ActionReturnUtil deleteArticle(@RequestParam(value = "artTitle") final String artTitle) throws Exception{
//        return articleService.deleteArticle(artTitle);
//    }
}
