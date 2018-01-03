//轮播图通用函数
function sliderPicture(imageConn, imageItemClass, indexActive, indexGroupsId, imgWidth) {

    var imgConn = $(imageConn);
    var imgGroup = $(imageConn + " " + imageItemClass);
    var indexGroup = $(indexGroupsId + " span");
    var len = indexGroup.length;
    var curIndex = 0;
    var timer = null;
    var flag = true;

    indexGroup.on("click", function () {
        //导航切换
        console.log("clicked");
        curIndex = indexGroup.index($(this));
        selectPicture(curIndex);
    });

    imgGroup.hover(function () {
        //鼠标移入
        clearInterval(timer);
        flag = false;
    }, function () {
        flag = true;
        timer = setInterval(go, 3000);
    });

    function autoGo(bol) {
        //自动行走
        if (bol) {
            timer = setInterval(go, 3000);
        }
    }
    autoGo(flag);

    function go() {
        //计时器的函数
        curIndex++;
        selectPicture(curIndex);
    }

    //移动图片到选中的位置
    function selectPicture(num) {
        if (num === len) {
            indexGroup.eq(0).addClass(indexActive).siblings().removeClass(indexActive);
        } else {
            indexGroup.eq(num).addClass(indexActive).siblings().removeClass(indexActive);
        }

        imgConn.animate({marginLeft : String(-num * imgWidth) + "px"
            }, 1000, function () {
                //检查是否是最后一张图片
                if (curIndex === len) {
                    // console.log(curIndex);
                    curIndex %= len;
                    $(imageConn).css("marginLeft", "0px");
                    indexGroup.eq(curIndex).addClass(indexActive).siblings().removeClass(indexActive);
                }
            }
        );
    }
}

/**
 * 转换页面的通用函数
 * @param tId 标题id号码前缀
 * @param cId 内容id号码前缀
 * @param showClass 显示的class属性
 * @param hideClass 隐藏的class属性
 */
function changePage(tId, cId, showClass, hideClass) {

    console.log(tId);

    var title = $(tId);
    var content = $(cId);

    title.click(function () {
        if (title.hasClass(hideClass)){
            content.siblings().css("display", "none");
            content.css("display", "block");

            title.siblings().removeClass(showClass).addClass(hideClass);
            title.removeClass(hideClass).addClass(showClass);
        }
    })
}