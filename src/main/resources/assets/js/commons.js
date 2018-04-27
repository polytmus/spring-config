function req() {
    $.ajax({
        url: "convert",
        data: "1-xuyao",
        type: "post",
        contentType: "application/x-xuyao",
        success: function (data) {
            $("#resp").html(data);
        }
    });
}