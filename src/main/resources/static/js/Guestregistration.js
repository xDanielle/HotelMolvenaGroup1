function postData() {
    var inputLastname = $("#lastname").val();
    var inputFirstname = $("#firstname").val();
    var inputAddress = $("#address").val();
    var inputPostalcode = $("#postalcode").val();
    var inputTown = $("#town").val();
    var inputCountry = $("#country").val();
    var inputTelephonenumber = $("#telephonenumber").val();
    var inputEmail = $("#email").val();

    if(inputLastname == "") {
        $("#errorMessage").val("Fill in last name.")
        return;
    }

    var newGuestObject = {
        lastname : inputLastname,
        firstname : inputFirstname,
        address : inputAddress,
        postalcode : inputPostalcode,
        town : inputTown,
        country : inputCountry,
        telephonenumber : inputTelephonenumber,
        email : inputEmail
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
            $("#address").val("");
            $("#postalcode").val("");
            $("#town").val("");
            $("#country").val("");
            $("#telephonenumber").val("");
            $("#email").val("");
            getData();
        }
    });
}
/*
$(document).ready(function() {
    getData();
});
*/