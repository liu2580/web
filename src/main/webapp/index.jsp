<%--
  Created by IntelliJ IDEA.
  User: liu
  Date: 2017/12/28
  Time: 15:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">


<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="./resources/css/index.css">

    <script src="./resources/js/jquery-3.2.1.min.js"></script>
    <script src="./resources/js/utils.js"></script>
    <script src="./resources/js/index.js"></script>

    <title>江苏科技发展研究中心</title>
</head>


<body>
<script>
    $(document).ready(function () {
        sliderPicture("#idx_img_conn", ".idx-img-item", "index-on", "#idx_img_index", 446);

        changePage("#notice_title_1", "#notice_content_1", "n__title-show", "n__title-hide");
        changePage("#notice_title_2", "#notice_content_2", "n__title-show", "n__title-hide");
    });
</script>

<script>

function log() {
window.location.href="managerlog/log.html";
}
function rcyj() {
window.location.href="rcyjinfo/talent.html";
}

</script>


<div class="wrapper">
    <!-- Top section -->
    <div class="container-fluid">
        <div class="header-outer">
            <div class="header">
                <div class="header__logo_box">
                    <img src="./resources/picture/0/1604261825543086189.png" class="header__logo">
                </div>
                <div class="header__right">
                    <div class="header__option">
                        <a href="javascript:void(0)">设为首页</a> |
                        <a href="javascript:void(0)">加入收藏</a> |
                        <a href="javascript:void(0)">联系我们</a> |
                        <a href="javascript:void(0)"onclick="log()">管理员</a>
                        <a href="javascript:void(0)"onclick="rcyj()">人才引进</a>
                    </div>
                    <form name="qForm" onsubmit="" action="" method="get" target="_blank">
                        <div class="header__search">
                            <input type="text" class="search_box" placeholder="请输入检索的关键字">

                            <input id="pos" name="pos" value="title,content" type="hidden">
                            <input name="page_mode" value="result" type="hidden">
                            <input name="app_id" value="1" type="hidden">
                            <input name="style" value="1" type="hidden">
                            <input name="ck" value="0" type="hidden">

                            <input type="image" class="search_button" src="./resources/picture/0/1604261835173931296.png">
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
                        <span class="menu-cur">首页</span>
                    </div>
                </div>
                <div class="menu-item-text">
                    <a href="pages/kjrc.html">科技人才</a>
                </div>
                <div class="menu-item-text">
                    <a href="pages/kjzk.html">科技智库</a>
                </div>
                <div class="menu-item-text">
                    <a href="pages/xhxs.html">学术学会</a>
                </div>
                <div class="menu-item-text">
                    <a href="pages/kxpj.html">科学普及</a>
                </div>
                <div class="menu-item-text">
                    <a href="pages/dwjl.html">对外交流</a>
                </div>
                <div class="menu-item-text">
                    <a href="pages/ddjs.html">党的建设</a>
                </div>
                <div class="menu-item-text">
                    <a href="pages/zlzx.html">资料中心</a>
                </div>
                <div class="menu-item-text">
                    <a href="pages/xxgk.html">信息公开</a>
                </div>
                <div class="menu-item-text">
                    <a href="xmyjinfo/projecthome.html">项目引进</a>
                </div>
            </div>
        </div>
    </div>
    <!-- top section end -->
    <!-- content section -->
    <div class="container">
        <div class="ad">
            <div class="ad__img-box">
                <img src="./resources/images/281/kx2017_03.png" width="67" height="67">
            </div>

            <%--<div class="ad__text-box">--%>
                <%--<a>2017中国（连云港）国际医药技术大会打响连云港</a>--%>
            <%--</div>--%>
            <div class="ad__text-box" style="white-space: nowrap;text-overflow:ellipsis;overflow:hidden"><a href="UsNewsAllController?id=${toutiaoxinwen.id }"> ${toutiaoxinwen.title}</a></div>
            <!---->
        </div>

        <div class="news_row">
            <div class="news_bar">
                <div class="idx-slider">
                    <div class="idx-img-conn" id="idx_img_conn">
                        <div class="idx-img-item">
                            <a href="#">
                                <img src="./resources/picture/1/s1706290833327609753.jpg">
                            </a>
                            <div class="idx-img-sub">
                                <a href="#">苏州市科学技术协会大会</a>
                            </div>
                        </div>
                        <div class="idx-img-item">
                            <a href="#">
                                <img src="./resources/picture/1/s1711011805030276730.jpg">
                            </a>
                            <div class="idx-img-sub">
                                <a href="#">省科协组织党员干部赴上海</a>
                            </div>
                        </div>
                        <div class="idx-img-item">
                            <a href="#">
                                <img src="./resources/picture/1/s1703081450363167882.jpg" alt="党员建设">
                            </a>
                            <div class="idx-img-sub">
                                <a href="#">第29届全国中小学</a>
                            </div>
                        </div>
                        <div class="idx-img-item">
                            <a href="#">
                                <img src="./resources/picture/1/s1706290833327609753.jpg">
                            </a>
                            <div class="idx-img-sub">
                                <a href="#">苏州市科学技术协会大会</a>
                            </div>
                        </div>
                    </div>
                    <div class="idx-img-index" id="idx_img_index">
                        <span class="index-on"></span>
                        <span></span>
                        <span></span>
                    </div>
                </div>
            </div>
            <div class="news_bar">
                <div class="news">
                    <div class="news__title">
                        <div class="news__title-left">
                            要闻快递
                        </div>
                        <div class="news__title-right">
                            <a href="#">更多>></a>
                        </div>
                    </div>
                    <div class="news__content">
                        <c:forEach var="newsInfo" items="${newsInfo }">
                            <div style="float:left; width:320px;white-space: nowrap;text-overflow:ellipsis;overflow:hidden"><a href="UsNewsAllController?id=${newsInfo.id }"> <span class="arrow">></span> ${newsInfo.title}</a></div>
                            <div style="float:right;">${newsInfo.date}</div></br></br>
                        </c:forEach>
                    </div>
                </div>
            </div>
            <div class="sidebar">
                <div class="sidenav">
                    <div class="nav__title">
                        ———— 走进科技发展中心 ————
                    </div>
                    <div class="nav__content" id="nav_content">
                        <div class="nav-item">
                            <a href="#">科中简介</a>
                        </div>
                        <div class="nav-item">
                            <a href="#">历史沿革</a>
                        </div>
                        <div class="nav-item">
                            <a href="#">奋斗史话</a>
                        </div>
                        <div class="nav-item">
                            <a href="#">代表大会</a>
                        </div>
                        <div class="nav-item">
                            <a href="#">历届主席</a>
                        </div>
                        <div class="nav-item">
                            <a href="#">组织结构</a>
                        </div>
                    </div>
                    <div class="nav__content">
                        <div class="nav-item">
                            <a href="#">驻会领导</a>
                        </div>
                        <div class="nav-item">
                            <a href="#">机关部门</a>
                        </div>
                        <div class="nav-item">
                            <a href="#">直属单位</a>
                        </div>
                        <div class="nav-item">
                            <a href="#">省级学会</a>
                        </div>
                    </div>

                    <img src="./resources/picture/0/1703141010105322615.png">
<%--特别关注--%>
                </div>
            </div>
        </div>
        <div class="panel_row">
            <div class="news_bar">
                <div class="panel">
                    <div class="panel__title" style="text-overflow:ellipsis;overflow:hidden" >
                        <%--习近平--%>
                            <a href="UsNewsAllController?id=${tebieguanzhu.id }"> ${tebieguanzhu.title}</a>
                    </div>
                    <div class="panel__content">
                        <div class="panel-left">
                            <img src="./resources/picture/0/1703171427483672445.png" width="195" height="157">
                        </div>
                        <div class="panel-right" style="height:150px;text-overflow:ellipsis;overflow:hidden" >

                                ${tebieguanzhu.content}
                        </div>
                    </div>
                </div>
            </div>
            <div class="news_bar">
                <div class="panel">
                    <div class="panel__title" style="text-overflow:ellipsis;overflow:hidden" >
                        <a href="UsNewsAllController?id=${shenhuagaige.id }"> ${shenhuagaige.title}</a>
                    </div>
                    <div class="panel__content">
                        <div class="panel-left">
                            <img src="./resources/picture/0/1703171429248926926.png" width="195" height="157">
                        </div>

                        <div class="panel-right" style="height:150px;text-overflow:ellipsis;overflow:hidden" >

                            ${shenhuagaige.content}
                        </div>
                    </div>
                </div>
            </div>
            <div class="sidebar">
                <div class="notice">
                    <div class="n-title">
                        <div class="n-title-left">
                            <div class="n__title-show" id="notice_title_1">
                                <a href="javascript: void(0)">通知公告</a>
                            </div>
                            <div class="n__title-hide" id="notice_title_2">
                                <a href="javascript: void(0)">活动预告</a>
                            </div>
                        </div>
                        <div class="n__title-right">
                            <a href="#">更多>>></a>
                        </div>
                    </div>
                    <%--通知公告 活动预告--%>
                    <div class="n-content">
                        <div class="n-ct-s" id="notice_content_1">
                                <c:forEach var="listtongzhigg" items="${listtongzhigg }">
                                    <div style="float:left; width:320px;white-space: nowrap;text-overflow:ellipsis;overflow:hidden"><a href="UsNewsAllController?id=${listtongzhigg.id }"> <span class="arrow">></span> ${listtongzhigg.title}</a></div></br></br>
                                </c:forEach>
                        </div>
                        <div class="n-ct-n" id="notice_content_2">
                                <c:forEach var="listhuodongyg" items="${listhuodongyg }">
                                    <div style="float:left; width:320px;white-space: nowrap;text-overflow:ellipsis;overflow:hidden"><a href="UsNewsAllController?id=${listhuodongyg.id }"> <span class="arrow">></span> ${listhuodongyg.title}</a></div></br></br>
                                </c:forEach>
                        </div>
                    </div>

                </div>
            </div>
        </div>
        <div class="img-row">
            <div class="img-r-l">
                <a href="#">
                    <img src="./resources/picture/0/1703141020083609797.png">
                </a>
            </div>
            <div class="img-r-r">
                <a href="#">
                    <img src="./resources/picture/0/1703311126015261835.png">
                </a>
            </div>
            <div class="img-r-r">
                <a href="#">
                    <img src="./resources/picture/0/1703311126015261835.png">
                </a>
            </div>
        </div>
        <div class="news-row-2">
            <div class="grid-left">
                <div class="grid-left-1">
                    <div class="news-l">
                        <div class="news__title">
                            <div class="news__title-left">
                                省级学会
                            </div>
                            <div class="news__title-right">
                                <a href="#">更多>></a>
                            </div>
                        </div>
                        <div class="news__content">
                            <div class="news__content-left">
                                <ul>
                                    <li>
                                        <span class="arrow">></span>
                                        <a href="#">南京市植物园科普馆开馆</a>
                                    </li>
                                    <li></li>
                                    <li></li>
                                    <li></li>
                                </ul>
                            </div>
                            <div class="news__content-right">
                                <ul>
                                    <li>11-15</li>
                                    <li></li>
                                    <li></li>
                                    <li></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                    <div class="news-r">
                        <div class="news__title">
                            <div class="news__title-left">
                                市县科研
                            </div>
                            <div class="news__title-right">
                                <a href="#">更多>></a>
                            </div>
                        </div>
                        <div class="news__content">
                            <c:forEach var="sxyjzx" items="${sxyjzx }">
                                <div style="float:left; width:350px;white-space: nowrap;text-overflow:ellipsis;overflow:hidden"><a href="UsNewsAllController?id=${sxyjzx.id }"> <span class="arrow">></span> ${sxyjzx.title}</a></div>
                                <div style="float:right;">${sxyjzx.date}</div></br></br>
                            </c:forEach>
                        </div>
                    </div>
                </div>
                <div class="grid-left-2">
                    <div class="img-box-l">
                        <div class="img-title">
                            <div class="img-t-l">
                                专题·品牌
                            </div>
                            <div class="img-t-r">
                                <a href="#">更多>></a>
                            </div>
                        </div>
                        <div class="img-ctn" id="img-twk">
                            <ul>
                                <li></li>
                                <li></li>
                                <li></li>
                                <li></li>
                            </ul>
                        </div>
                    </div>
                    <div class="img-box-r">
                        <div class="img-title">
                            <div class="img-t-l">
                                微信·秀
                            </div>
                            <div class="img-t-r">
                                <a href="#">更多>></a>
                            </div>
                        </div>
                        <div class="img-ctn">
                            <img src="./resources/picture/0/1703141042221631698.png">
                        </div>
                    </div>
                </div>
            </div>
            <div class="grid-right">
                <div class="grid-right-imgs">
                    <div class="img-item">
                        <a href="#">
                            <img src="./resources/picture/0/1703311345123943563.png">
                        </a>
                    </div>
                    <div class="img-item">
                        <a href="#">
                            <img src="./resources/picture/0/1703311345123943563.png">
                        </a>
                    </div>
                    <div class="img-item">
                        <a href="#">
                            <img src="./resources/picture/0/1703311345123943563.png">
                        </a>
                    </div>
                    <div class="img-item"></div>
                </div>
                <div class="grid-right-txt">
                    <div class="side-txt">
                        <p class="side-txt-title">江苏省纪委驻省科技厅纪检组</p>
                        <p class="side-txt-ctn">邮箱：
                            <span class="txt-black">zwgk@jstd.gov.cn</span>　　 电话：
                            <span class="txt-black">025－83350162</span>
                        </p>
                    </div>
                </div>
            </div>

        </div>
        <div class="row-btm">
            <div class="btm-left">
                各地科技发展中心
            </div>
            <div class="btm-right">
                <div class="btm-r-item">>
                    <a href="#">成都</a>
                </div>
                <div class="btm-r-item">>
                    <a href="#">南京</a>
                </div>
                <div class="btm-r-item">>
                    <a href="#">上海</a>
                </div>
                <div class="btm-r-item">>
                    <a href="#">广州</a>
                </div>
                <div class="btm-r-item">>
                    <a href="#">北京</a>
                </div>
                <div class="btm-r-item">>
                    <a href="#">天津</a>
                </div>
                <div class="btm-r-item">>
                    <a href="#">重庆</a>
                </div>
            </div>
        </div>
    </div>
    <!-- content section end-->
    <!-- footer start -->
    <div class="i-footer">
        <div class="i-ftr-ctn">
            版权所有：江苏省科学技术协会
            <br> 网站维护：江苏省科协信息中心 联系电话：025 83313187
            <br> 苏ICP备05080394号
        </div>
    </div>
    <!-- footer end -->
</div>
</body>

</html>