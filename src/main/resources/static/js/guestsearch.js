function postData() {
    var inputsearchTerm = $("#searchTerm").val();

    if(inputsearchTerm == "") {
        $("#errorMessage").val("Fill in search term.")
        return;
    }

    var newsearchObject = {
        searchTerm : inputsearchTerm,
    };

    var newSearch = JSON.stringify(newsearchObject);
    console.log(newSearch);

    $.ajax({
        url : "http://localhost:8080/api/search/{0}",
        type : "post",
        data : newSearch,
        contentType : "application/json",
        success : function(data) {

            console.log(data);
            $("#searchTerm").val("");
            $.each(data, function(index, value){
                        var columnRow = "<tr><td><input type='checkbox' id='checkbox' </td><td>" + value.firstName + "</td><td>" +
                        value.lastName + "<td>" + value.address + "</td><td>" + value.country +
                        "</td><td>" + value.town + "</td><td>" + value.postalCode + "</td><td>" +
                         value.telephoneNumber + "</td><td>" + value.emailAddress + "</td></tr>";
                        guestList+=columnRow;
                    });
             $("#guest").append(searchResults);

        }
    });
}