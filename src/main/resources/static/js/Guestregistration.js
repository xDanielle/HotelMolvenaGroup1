function sayHello(name) {
   $.get("/api/sayHello?name=" + name, function(result){
   $("#title").text(result);
   });
}

$("#sayHelloBtn").click(function(){
    var name = $("#nameInput").val();
    sayHello(name);
});

$("#sayHelloBtn").click(function(){
    var name = $("#firstnameInput").val();
    sayHello(name);
});

$("#sayHelloBtn").click(function(){
    var name = $("#addressInput").val();
    sayHello(name);
});

$("#sayHelloBtn").click(function(){
    var name = $("#postalcodeInput").val();
    sayHello(name);
});

$("#sayHelloBtn").click(function(){
    var name = $("#townInput").val();
    sayHello(name);
});

$("#sayHelloBtn").click(function(){
    var name = $("#countryInput").val();
    sayHello(name);
});

$("#sayHelloBtn").click(function(){
    var name = $("#telephonenumberInput").val();
    sayHello(name);
});

$("#sayHelloBtn").click(function(){
    var name = $("#emailInput").val();
    sayHello(name);
});
