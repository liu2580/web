package com.jskj.ssm.controller;

import com.jskj.ssm.service.ArticleService;
import com.jskj.ssm.service.serviceImpl.ArticleServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;


    //通过id查询文章具体内容
    @WebServlet("/DetailNewsController")
    public class DetailNewsController extends HttpServlet {
        public void doGet(HttpServletRequest request, HttpServletResponse response)
        {
            String id = request.getParameter("id");
            Map<String,Object> map = new HashMap<String,Object>();
            map.put("id", id);
            Map<String,Object> listAllInfo =new HashMap<String,Object>();
            ArticleService us = new ArticleServiceImpl();
            listAllInfo = us.newsAdSeById(map);
            request.setAttribute("newsAllInfo", listAllInfo);
            try
            {
                //  RequestDispatcher rd=request.getRequestDispatcher("newsShowAllUs.jsp");
                RequestDispatcher rd=request.getRequestDispatcher("WEB-INF/jsp/newsDetail.jsp");
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
