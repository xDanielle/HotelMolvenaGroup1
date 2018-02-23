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

			var roomTableContent = "";
			console.log("roomObject");

				$.each(data, function(index, current) {
                    console.log("each function");
				 	var columnRow = "<tr><td>" + current.roomID + "</td><td>" + current.roomType + "</td><td>" + current.defaultPrice + "</td><td>" + current.available + "</td></tr>";

				 	roomTableContent += columnRow;

				});
                console.log(roomTableContent);
				$(".roomTable").append(roomTableContent);

				}

		});
}


function postData(){
	// The postData function is triggered by the add new room button. This function has to post the filled in data into the table.

    // First we need to put the values of the input fields into variables
    var



}







