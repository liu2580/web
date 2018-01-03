$(document).ready(function () {
    $("#apply_date").datepicker({
        changeMonth: true,
        changeYear: true,
        dateFormat: "yy-mm-dd"
    });

    var conn = $("#pro_conn");
    var title = $("#title");

    $("#next_1").click(function () {
        conn.animate(
            {marginLeft : "-1240px"}
        , 500);
        title.text("填表须知");
    });

    $("#pre_1").click(function () {
        conn.animate(
            {marginLeft : "0"}
        , 500);
        title.text("个人信息");
    });

    $("#next_2").click(function () {
        window.location.href="2person.html";
    });
});