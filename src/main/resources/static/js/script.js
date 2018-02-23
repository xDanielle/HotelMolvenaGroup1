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
				 	var columnRow = "<tr><td>" + current.roomID + "</td><td>" + current.roomType + "</td><td>" + current.defaultPrice + "</td><td>" + current.available + "</td><td>" + "<button type='button' class='btn btn-danger' onclick='deleteRoom(" + current.roomID + ")'> Delete </button>" + "</td></tr>";

				 	roomTableContent += columnRow;

				});

                console.log(roomTableContent);
                $(".roomTable").empty();
				$(".roomTable").append(roomTableContent);

				}


		});
}

function deleteRoom(roomID){
                console.log("verwijdertttttddd???")
                    $.ajax({
                        url : "http://localhost:8080/api/rooms/delete", 
                        type : "delete",
                        // contentType : "application/json",
                        success : function() {
                            console.log("Delete is initiated");
                            $("#roomTable").html("");
                            getData();
                        }
                    })
                }


function postData(){
	// The postData function is triggered by the add new room button. This function has to post the filled in data into the table.

    // First we need to put the values of the input fields into variables
    var inputRoomID = $("#roomID").val();
    var inputRoomType = $("#roomType").val();
    var inputPrice = $("#price").val();
    var inputAvailability = $("#availability").val();

    if(inputRoomID == "") {
            $("#errorMessage").val("Fill in RoomID")
            return;
        }

    // Here we make a new object
    var newRoomObject = {
    roomType : inputRoomType,
    roomID : inputRoomID,
    defaultPrice : inputPrice,
    available : inputAvailability
    };

    var newRoom = JSON.stringify(newRoomObject);
    console.log(newRoom);

    $.ajax({
        url : "http://localhost:8080/api/rooms/save",
        type : "post",
        data : newRoom,
        contentType : "application/json",
        success: function(data){
            console.log("Success post!");
            getData();

        }



    })



}


                







