
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
