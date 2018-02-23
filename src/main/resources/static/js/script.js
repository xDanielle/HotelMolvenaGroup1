// Javascript bestand HOTELPROJECT
//

// AJAX gebruiken om backend data in te laden naar jquery
$(document).ready(function(){
   getData();

});


function getData() {

	$.ajax({

		url : "http://localhost:8080/api/rooms/get",
		type : "get",
		success: function(data){
			console.log("this is the data:" + data);

			var roomTable = "";
			console.log("roomObject");


				$.each(data, function(index, current) {

				 	
				 	var columnRow = "<tr><td>" + current.roomID + "</td><td>" + current.roomType + "</td><td>" + current.defaultPrice + "</td><td>" + current.available "</td></tr>";

				 	roomTable += columnRow;

				});



				// $.each(data, function(index, value){
    //                     var columnRow = "<tr><td>" + value.firstName + "</td><td>" +
    //                     value.lastName + "<td>" + value.address + "</td><td>" + value.country +
    //                     "</td><td>" + value.town + "</td><td>" + value.postalCode + "</td><td>" +
    //                      value.telephoneNumber + "</td><td>" + value.emailAddress + "</td></tr>";
    //                     guestList+=columnRow;
    //                 });

    //          $("#guest").append(guestList);




			$("#roomTable").append(roomTable);

		}

	});
}


function postData(){

	//




}







