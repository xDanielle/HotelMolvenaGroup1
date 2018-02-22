<<<<<<< HEAD

$(document).ready(function(){
    $.ajax({
        url:"http://localhost:8080/api/guest/index",
        type:"get",
        success : function(data){
            console.log(data);
            var guestList = '';

            $.each(data, function(index, value){
                        var columnRow = "<tr><td>" + value.firstName + "</td><td>" +
                        value.lastName + "</td></tr>";
                        guestList+=columnRow;
                    });

             $("#guest").append(guestList);
        }
    });
});
=======
$.get("/api/guest", function(result){
  console.log("guest:", result.newGuest.getGuestList());

});


>>>>>>> 1dd4ae977ea5ff5991f80fe79c4fc0e80ad4d21e
