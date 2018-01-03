package com.jskj.ssm.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.jskj.ssm.service.*;
import com.jskj.ssm.service.serviceImpl.ArticleServiceImpl;

@WebServlet("/FirstPageNewsController")
public class FirstPageNewsController extends HttpServlet {

    public void doGet(HttpServletRequest request,HttpServletResponse response)
    {
        String artType1="特别关注";
        String artType2="深化改革";
        String artType3="头条新闻";
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("artType1", artType1);
        map.put("artType2", artType2);
        map.put("artType3", artType3);
        Map<String,Object> tebieguanzhu =new HashMap<String,Object>();
        Map<String,Object> shenhuagaige =new HashMap<String,Object>();
        Map<String,Object> toutiaoxinwen =new HashMap<String,Object>();

        List<Map<String,Object>> listAllInfo =new ArrayList<Map<String,Object>>();
        List<Map<String,Object>> listSXyjzx =new ArrayList<Map<String,Object>>();
        List<Map<String,Object>> listtongzhigg =new ArrayList<Map<String,Object>>();
        List<Map<String,Object>> listhuodongyg =new ArrayList<Map<String,Object>>();

        ArticleService us = new ArticleServiceImpl();
        listAllInfo = us.newsShowUs();//要闻快递
        listSXyjzx = us.newsShowSXyjzx();//市县研究中心
        tebieguanzhu=us.Gettebieguanzhu(map);//特别关注
        shenhuagaige=us.Getshenhuagaige(map);//深化改革
        toutiaoxinwen=us.Gettoutiaoxinwen(map);//头条新闻
        listtongzhigg = us.GetTongzhigg();//通知公告
        listhuodongyg = us.GetHuoDongyg();//活动预告

        request.setAttribute("newsInfo", listAllInfo);
        request.setAttribute("sxyjzx", listSXyjzx);
        request.setAttribute("tebieguanzhu",tebieguanzhu);
        request.setAttribute("shenhuagaige",shenhuagaige);
        request.setAttribute("toutiaoxinwen",toutiaoxinwen);
        request.setAttribute("listtongzhigg", listtongzhigg);
        request.setAttribute("listhuodongyg", listhuodongyg);

        try
        {
            RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
            rd.forward(request, response);
        }catch(Exception e)
        {
            e.printStackTrace();
        }

    }
    public void doPost(HttpServletRequest request,HttpServletResponse response)
    {
        doGet(request,response);
    }
}
