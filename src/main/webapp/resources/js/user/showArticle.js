function getallarticles() {
    var host = window.location.host;
    //获取主机
    var url = "http://"+host+"/article/getAllArticles";
    console.log(url);
    $.ajax({
        type: "GET",
        url: url,
        dataType:"json",//自动转换json对象
        success:function (returnMap) {
            if(returnMap.success){
                var div = document.getElementById("divTable");
                var data = returnMap.data;
                var table = document.createElement("table");//创建table
                table.border="2";
                table.width = "50%";
                table.id = "ArticleTable";
                var tr,td1,td2,td3,td4,td5,td6,td7,td8,td9,td10,td11;
                //创建表头
                tr = table.insertRow(table.rows.length);//指定位置插入新行，目前table,rows.length=0
                td1=tr.insertCell(tr.cells.length);
                td2=tr.insertCell(tr.cells.length);
                td3=tr.insertCell(tr.cells.length);
                td4=tr.insertCell(tr.cells.length);
                td5=tr.insertCell(tr.cells.length);
                td6=tr.insertCell(tr.cells.length);
                td7=tr.insertCell(tr.cells.length);
                td8=tr.insertCell(tr.cells.length);
                td9=tr.insertCell(tr.cells.length);
                td10=tr.insertCell(tr.cells.length);
                td11=tr.insertCell(tr.cells.length);
                td1.innerHTML="ID";
                td2.innerHTML="artTitle";
                td3.innerHTML="artText";
                td4.innerHTML="artType";
                td5.innerHTML="artPicturePath";
                td6.innerHTML="artURL ";
                td7.innerHTML="artDate ";
                td8.innerHTML="artAuthor";
                td9.innerHTML="artEditor";
                td10.innerHTML="修改";
                td11.innerHTML="删除";
                //填充数据
                for(var i=0;i<data.length;i++){
                    var button1 = document.createElement("button");
                    var button2 = document.createElement("button");
                    tr=table.insertRow(table.rows.length);
                    td1 = tr.insertCell(tr.cells.length);
                    td2 = tr.insertCell(tr.cells.length);
                    td3 = tr.insertCell(tr.cells.length);
                    td4 = tr.insertCell(tr.cells.length);
                    td5 = tr.insertCell(tr.cells.length);
                    td6 = tr.insertCell(tr.cells.length);
                    td7 = tr.insertCell(tr.cells.length);
                    td8 = tr.insertCell(tr.cells.length);
                    td9 = tr.insertCell(tr.cells.length);
                    td10= tr.insertCell(tr.cells.length);
                    td11 = tr.insertCell(tr.cells.length);

                    button1.innerHTML = "修改";
                    button2.innerHTML = "删除";
                    button1.setAttribute("onclick","updateUser("+(i+1)+")");//第几行数据
                    button2.setAttribute("onclick","deleteUser("+(i+1)+")");//第几行数据
                    td1.innerHTML=i+1;
                    td2.innerHTML=data[i].artTitle;
                    td3.innerHTML=data[i].artText;
                    td4.innerHTML=data[i].artType;
                    td5.innerHTML=data[i].artPicturePath;
                    td6.innerHTML=data[i].artURL;
                    td7.innerHTML=data[i].artDate;
                    td8.innerHTML=data[i].artAuthor;
                    td9.innerHTML=data[i].artEditor;
                    td10.appendChild(button1);
                    td11.appendChild(button2);
                }
                div.appendChild(table);
                //document.querySelector("divTable").appendChild(table);
            }else{
                alert("服务器忙，请稍后重试！");
            }
        }
    })
}


///////添加文章
$('#addArticle').click(
    function () {

        var artTitle = document.getElementById("artTitle").value;
        var artText = document.getElementById("artText").value;
       // var artType = document.getElementById("artType").value;
        var artPicturePath = document.getElementById("artPicturePath").value;
        var artURL = document.getElementById("artURL").value;
        var artDate = document.getElementById("artDate").value;
        var artAuthor = document.getElementById("artAuthor").value;
        var artEditor = document.getElementById("artEditor").value;

        var select=document.getElementById("artType");
        var options = select.options;
        var index = select.selectedIndex;
        var artType = options[index].text;
        var artReadNum=1;
        var host = window.location.host;

        //获取主机
        var url = "http://" + host + "/article/addArticle";
        $.ajax({
            type: "get",
            url: url,
            data:{artTitle:artTitle,artType:artType,artText:artText,artPicturePath:artPicturePath,artURL:artURL,artDate:artDate,artAuthor:artAuthor,artEditor:artEditor,artReadNum:artReadNum},
            dataType: "json",
            success: function (returnMap) {
                if (returnMap.success) {
                    alert("添加成功");
                    window.location.reload();
                } else {
                    alert("服务器忙，请稍后重试！");
                    window.location.reload();
                }
            }
        })
    }
)

///查询文章BY artId
$('#SelectById').click(
    function () {
        var artId = document.getElementById("selectartId").value;
        var host = window.location.host;

        //获取主机
        var url = "http://" + host + "/article/getOneArticle";

        $.ajax({
            type: "get",
            url: url,
            data:{artId:artId},
            dataType: "json",
            success: function (returnMap) {
                if (returnMap.success) {
                    var data = returnMap.data;
                    alert(data.artTitle);
                    window.location.reload();
                } else {
                    alert("服务器忙，请稍后重试！");
                    window.location.reload();
                }
            }
        })
    }

)


///查询文章BY artType
$('#SelectByType').click(
    function () {
        var artType = document.getElementById("selectartType").value;
        var host = window.location.host;
        var result;
        //获取主机
        var url = "http://" + host + "/article/getArticlesByArtType";

        $.ajax({
            type: "get",
            url: url,
            data:{artType:artType},
            dataType: "json",
            success: function (returnMap) {
                if (returnMap.success) {
                    var data = returnMap.data;
                    for(var i=0;i<data.length;i++){
                       result=result+data[i].artTitle ;
                    }
                    alert(result);
                    window.location.reload();
                } else {
                    alert("服务器忙，请稍后重试！");
                    window.location.reload();
                }
            }
        })
    }

)







