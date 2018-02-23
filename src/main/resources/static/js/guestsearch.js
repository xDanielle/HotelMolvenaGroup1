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
            $("#searchTerm").val("");
            getData();
        }
    });
}
}