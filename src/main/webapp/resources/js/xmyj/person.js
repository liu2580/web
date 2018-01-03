$(document).ready(function () {
    var conn = $("#pro_conn");

    $("#pre_1").click(function () {
        window.location.href="projecthome.html";
    });

    $("#next_1").click(function () {
        conn.animate({marginLeft : "-1240px"}, 500);
    });

    $("#next_2").click(function () {
        conn.animate({marginLeft : "-2480px"}, 500);
    });

    $("#pre_2").click(function () {
        conn.animate({marginLeft : "0"}, 500);
    });

    $("#pre_3").click(function () {
        conn.animate({marginLeft : "-1240px"}, 500);
    });
    $("#next_3").click(function () {
        window.location.href="3enterprise.html";
    });
});