
// print out the list of guests
$(document).ready(function(){
    $.ajax({
        url:"http://localhost:8080/api/guest/index",
        type:"get",
        success : function(data){
            console.log(data);
            var guestList = '';

            $.each(data, function(index, value){
                        var columnRow = "<tr><td><input type='checkbox' id='checkbox' </td><td>" + value.firstName + "</td><td>" +
                        value.lastName + "<td>" + value.address + "</td><td>" + value.country +
                        "</td><td>" + value.town + "</td><td>" + value.postalCode + "</td><td>" +
                         value.telephoneNumber + "</td><td>" + value.emailAddress + "</td></tr>";
                        guestList+=columnRow;
                    });
             $("#guest").append(guestList);
        }
    });
});


////when click on checkbox, go to alter website
//$(document).ready(function(){
//    $("#alterBtn").click(function(){
//        $("#checkbox").trigger("select");
//        location.href="http://localhost:8080/alterguest.html";
//    });
//
//});


$(document).ready(function(){
      //iterate over the table to find the checkbox
 $("#alterBtn").click(function(){
      $("#guest tr").each(function(){

          $("input:checked").each(function(){

              console.log("found");

          });
      });

      });
});