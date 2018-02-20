// Javascript bestand
// alert("Testje"); Mag eigenlijk niet meer van Robbert


$(document).ready(function() {
    $(".container").load("index.html");
});

$("ul.navbar-nav li").each(function() {
    $(this).on("click", function{
        $(".container").load(($this).attr("rooms")+".html");
    });
});