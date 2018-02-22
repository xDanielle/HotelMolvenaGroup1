function postData() {
    // Get values from input texts.
    var inputLastname = $("#lastname").val();
    var inputFirstname = $("#firstname").val();

    if(inputLastname == "") {
        $("#errorMessage").val("Fill in last name.")
        return;
    }

    var newGuestObject = {
        lastname : inputLastname,
        firstname : inputFirstname
    };



    var newGuest = JSON.stringify(newGuestObject);

    $.ajax({
        url : "http://localhost:8080/api/guest/save",
        type : "post",
        data : newGuest,
        contentType : "application/json",
        success : function(data) {
            $("#lastname").val("");
            $("#firstname").val("");
            getData();
        }
    });
}
/*
$(document).ready(function() {
    getData();
});
*/