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

			var roomObject = "";
			console.log("roomObject");


				$.each(data, function(index, current) {

				 	roomObject = roomObject + "</br>" + "Roomtype: " + current.roomType + " RoomID: " + current.roomID + " Price: " + current.defaultPrice + " Availability: " + current.available;

				});



				// $.each(data, function(index, value){
    //                     var columnRow = "<tr><td>" + value.firstName + "</td><td>" +
    //                     value.lastName + "<td>" + value.address + "</td><td>" + value.country +
    //                     "</td><td>" + value.town + "</td><td>" + value.postalCode + "</td><td>" +
    //                      value.telephoneNumber + "</td><td>" + value.emailAddress + "</td></tr>";
    //                     guestList+=columnRow;
    //                 });

    //          $("#guest").append(guestList);




			$("#listOfRooms").html(roomObject);

		}

	});
}


function postData(){

	//




}







