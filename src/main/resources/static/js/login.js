$(function () {
    $("#submit").click(function () {
        $.ajax({
            url:'/userLogin',
            type:'POST', //GET
            async:false,    //或false,是否异步
            data:{
                userCode:$("#userCode").val(),
                passWord:$("#password").val()
            },
            dataType:'json',
            success:function(data){
                if(data.code == 100||data.code == 1||data.code == 2){
                    $("#helpBlock").html(data.msg).show();
                }else{
                    window.location.href="/configPage/init";
                }
            }
        })
    });
});