$(document).ready(function(){
    $.ajax({
        url:"http://localhost:8080/api/guest/index",
        type:"get",
        success : function(data){
            console.log(data);
            var guestList = '';

            $.each(data, function(index, value){
                        var columnRow = "<tr><td>" + value.firstName + "</td><td>" +
                        value.lastName + "<td>" + value.address + "</td><td>" + value.country +
                        "</td><td>" + value.town + "</td><td>" + value.postalCode + "</td><td>" +
                         value.telephoneNumber + "</td><td>" + value.emailAddress + "</td></tr>";
                        guestList+=columnRow;
                    });

             $("#guest").append(guestList);
        }
    });
});

