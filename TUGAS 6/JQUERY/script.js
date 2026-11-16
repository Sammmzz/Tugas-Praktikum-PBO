$(document).ready(function(){


    $("#btnShow").click(function(){
        $("#pw").show();
        $("#hide").hide();
    });

    $("#btnHidden").click(function(){
       $("#pw").hide();
        $("#hide").show();
    });

    $("#toggle").click(function(){
        $("#cek").toggle();
        $("#cek2").toggle();
    });
    
    

});