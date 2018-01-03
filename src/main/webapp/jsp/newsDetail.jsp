<%--
  Created by IntelliJ IDEA.
  User: liu
  Date: 2017/12/26
  Time: 16:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>
    <meta charset="UTF-8">

    <link rel="stylesheet" type="text/css" href="../resources/css/page.css">

    <title>新闻页面</title>
    <script language=JavaScript>

    </script>
</head>

<body>
<div class="container-fluid">
    <div class="header-outer">
        <div class="header">
            <div class="header__logo_box">
                <img src="../resources/picture/0/1604261825543086189.png" class="header__logo">
            </div>
            <div class="header__right">
                <div class="header__option">
                    <a href="javascript:void(0)">设为首页</a> |
                    <a href="javascript:void(0)">加入收藏</a> |
                    <a href="javascript:void(0)">联系我们</a>
                </div>
                <form name="qForm" onsubmit="" action="" method="get" target="_blank">
                    <div class="header__search">
                        <input type="text" class="search_box" placeholder="请输入检索的关键字">

                        <input id="pos" name="pos" value="title,content" type="hidden">
                        <input name="page_mode" value="result" type="hidden">
                        <input name="app_id" value="1" type="hidden">
                        <input name="style" value="1" type="hidden">
                        <input name="ck" value="0" type="hidden">

                        <input type="image" class="search_button" src="../resources/picture/0/1604261835173931296.png">
                    </div>
                </form>
            </div>
        </div>
    </div>
    <div class="blue-line"></div>
    <div class="menu-outer">
        <div class="menu">
            <div class="menu-item-text">
                <div class="menu-first">
                    <a href="../welcome.jsp">首页</a>
                </div>
            </div>
            <div class="menu-item-text">
                <a href="../pages/kjrc.html">科技人才</a>
            </div>
            <div class="menu-item-text">
                <a href="../pages/kjzk.html">科技智库</a>
            </div>
            <div class="menu-item-text">
                <a href="../pages/xhxs.html">学术学会</a>
            </div>
            <div class="menu-item-text">
                <a href="../pages/kxpj.html">科学普及</a>
            </div>
            <div class="menu-item-text">
                <a href="../pages/dwjl.html">对外交流</a>
            </div>
            <div class="menu-item-text">
                <a href="../pages/ddjs.html">党的建设</a>
            </div>
            <div class="menu-item-text">
                <a href="../pages/zlzx.html">资料中心</a>
            </div>
            <div class="menu-item-text">
                <a href="../pages/xxgk.html">信息公开</a>
            </div>
        </div>
    </div>
</div>
<div class="pg-container">
    <div class="pg-grid-left">
        <div class="pg-path">
            <img src="../resources/images/261/jskx_lmy_06.jpg">&nbsp;
            您当前位置>>
            <a href="#">首页</a>>>
            <a href="#">新闻中心</a>>>
            <a href="#">${newsAllInfo.type }</a>
        </div>
        <div class="pg-news">
            <div class="pg-paper">
                <div class="pg-append">
                    【字体 <a href="javascript:doZoom(16)">大</a> <a href="javascript:doZoom(14)">中</a> <a href="javascript:doZoom(12)">小</a>】
                    阅读次数 <span id="read_num"> ${newsAllInfo.readNum }</span>
                </div>
                <div class="pg-title">
                    ${newsAllInfo.title }
                </div>
                <div class="pg-time">
                    ${newsAllInfo.date }
                </div>
                <div class="pg-ctn">
                    <p> ${newsAllInfo.content }</p>
                </div>
                <div class="pg-footer">
                    作者： ${newsAllInfo.author }<br>
                    责任编辑： ${newsAllInfo.editor}
                </div>
            </div>
        </div>
    </div>
    <div class="pg-grid-right">
        <div class="pg-box">
            <div class="pg-title">
                <div class="pg-ttl-left">
                    要闻快递
                </div>
                <div class="pg-more">
                    <a href="#">更多>></a>
                </div>
            </div>
            <div class="pg-content">
                <ul>
                    <li><a href="#">南京市溧水区科协召开第六次代表大</a></li>
                    <li></li>
                    <li></li>
                    <li></li>
                </ul>
            </div>
        </div>
        <div class="pg-box">
            <div class="pg-title">
                <div class="pg-ttl-left">
                    热点话题
                </div>
                <div class="pg-more">
                    <a href="#">更多>></a>
                </div>
            </div>
            <div class="pg-content">
                <ul>
                    <li><a href="#">南京市溧水区科协召开第六次代表大</a></li>
                    <li></li>
                    <li></li>
                    <li></li>
                </ul>
            </div>
        </div>
        <div class="pg-box">
            <div class="pg-title">
                <div class="pg-ttl-left">
                    相关报道
                </div>
                <div class="pg-more">
                    <a href="#">更多>></a>
                </div>
            </div>
            <div class="pg-content">
                <ul>
                    <li><a href="#">南京市溧水区科协召开第六次代表大</a></li>
                    <li></li>
                    <li></li>
                    <li></li>
                </ul>
            </div>
        </div>
    </div>
    <!-- footer start -->
    <div class="i-footer float-left">
        <div class="i-ftr-ctn">
            版权所有：江苏省科学技术协会<br>
            网站维护：江苏省科协信息中心 联系电话：025 83313187<br>
            苏ICP备05080394号
        </div>
    </div>
    <!-- footer end -->
</div>
</body>
</html>
