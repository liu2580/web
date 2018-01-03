package com.jskj.ssm.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jskj.ssm.service.ArticleService;
import com.jskj.ssm.service.serviceImpl.ArticleServiceImpl;

@WebServlet("/UserNewsIndexController")
public class UserNewsIndexController extends HttpServlet {
	public void doGet(HttpServletRequest request,HttpServletResponse response)
	{
		Date date = new Date();
	    DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    String nowDate=format.format(date);
		
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("nowDate", nowDate);
		List<Map<String,Object>> listAllInfo =new ArrayList<Map<String,Object>>();
		List<Map<String,Object>> listInfo =new ArrayList<Map<String,Object>>();
		ArticleService us = new ArticleServiceImpl();
		listAllInfo = us.newsShowUs();
		request.setAttribute("newsInfo", listAllInfo);
		request.setAttribute("noticeInfo", listInfo);
		try
		{
			RequestDispatcher rd=request.getRequestDispatcher("WEB-INF/jsp/user/indexUser.jsp");
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
