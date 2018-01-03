$(document).ready(function () {
    $('#birthday').datepicker({
        changeMonth: true,
        changeYear: true,
        dateFormat: "yy-mm-dd"
    });
    var panelConn = $("#panel_conn");
    var title = $("#title");

    $("#next_1").click(function () {
        panelConn.animate({
            marginLeft : "-1180px"
        }, 500);
        title.text("基本受教育情况");
    });

    $("#next_2").click(function () {
        panelConn.animate({
            marginLeft : "-2360px"
        }, 500);
        title.text("工作经历");
    });

    $("#pre_1").click(function () {
        panelConn.animate({
            marginLeft : "0"
        }, 500);
        title.text("基本信息填写");
    });

    $("#pre_2").click(function () {
        panelConn.animate({
            marginLeft : "-1180px"
        }, 500);
        title.text("基本受教育情况");
    });
});