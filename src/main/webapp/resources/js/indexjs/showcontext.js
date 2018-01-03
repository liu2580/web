function getyaowenkuaidi() {
    var artType = "要闻快递";
    var host = window.location.host;
    var result;
    //获取主机
    var url = "http://" + host + "/article/getArticlesByArtType";
    obj=document.getElementById("yaowen").getElementsByTagName("li");
    objtime=document.getElementById("yaowentime").getElementsByTagName("li");
    $.ajax({
        type: "get",
        url: url,
        data:{artType:artType},
        dataType: "json",
        success: function (returnMap) {
            if (returnMap.success) {
                var data = returnMap.data;
                var  tit;
                for(i in obj){
                    var curr=obj[i];
                    var currtime=objtime[i];
                    //curr.innerHTML="<span class=\"arrow\"></span></span><a href='"+data[i].artURL+"'>"+data[i].artTitle+"</a>";
                    curr.innerHTML="<span class=\"arrow\"></span>  <a href='page.html'>"+data[i].artTitle+"</a>";
                    currtime.innerHTML=data[i].artDate;

                }
            } else {
                alert("服务器忙，请稍后重试！");
                window.location.reload();
            }
        }
    })

}

function gettebieguanzhu() {
    var artType = "特别关注";
    var host = window.location.host;
    var result;
    //获取主机
    var url = "http://" + host + "/article/getArticlesByArtTypeOnly";

    $.ajax({
        type: "get",
        url: url,
        data:{artType:artType},
        dataType: "json",
        success: function (returnMap) {
            if (returnMap.success) {
                var data = returnMap.data;///"<span class=\"arrow\"></span>  <a href='page.html'>"+data[i].artTitle+"</a>";
                document.getElementById("tebieguanzhuTitle").innerHTML='<a href="page.html">'+data.artTitle+'</a>';
                document.getElementById("tebieguanzhuText").innerHTML=data.artText+'<a href="page.html">'+"（详细）"+'</a>';
            } else {
                alert("服务器忙，请稍后重试！");
                window.location.reload();
            }
        }
    })

}

function getshenhuagaige() {
    var artType = "深化改革";
    var host = window.location.host;
    var result;
    //获取主机
    var url = "http://" + host + "/article/getArticlesByArtTypeOnly";

    $.ajax({
        type: "get",
        url: url,
        data:{artType:artType},
        dataType: "json",
        success: function (returnMap) {
            if (returnMap.success) {
                var data = returnMap.data;///"<span class=\"arrow\"></span>  <a href='page.html'>"+data[i].artTitle+"</a>";
                document.getElementById("shenhuagaigeTitle").innerHTML='<a href="page.html">'+data.artTitle+'</a>';
                document.getElementById("shenhuagaigeText").innerHTML=data.artText+'<a href="page.html">'+"（详细）"+'</a>';
            } else {
                alert("服务器忙，请稍后重试！");
                window.location.reload();
            }
        }
    })

}

function gettoutiaoxinwen() {
    var artType = "头条新闻";
    var host = window.location.host;
    var result;
    //获取主机
    var url = "http://" + host + "/article/getArticlesByArtTypeOnly";
     toutiaoobj = document.getElementById("toutiaoxinwen");
   // element.innerHTML = unescape(content);

    $.ajax({
        type: "get",
        url: url,
        data:{artType:artType},
        dataType: "json",
        success: function (returnMap) {
            if (returnMap.success) {
                var data = returnMap.data;
                toutiaoobj.href="page.html";
                toutiaoobj.text=data.artTitle;

            } else {
                alert("服务器忙，请稍后重试！");
                window.location.reload();
            }
        }
    })

}
