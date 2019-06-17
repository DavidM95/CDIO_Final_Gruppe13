function opretBruger() {
    alert("jeg er her");
    event.preventDefault();
    var data = $('#opretbruger').serializeJSON();
    var role = []
    role[0] = data.userRole1;
    role[1] = data.userRole2;
    data.add(role);
    data.remove(brugerRolle1)
    data.remove(brugerRolle2)
    alert(data);
    $.ajax({
        url: 'rest/createUser',
        method: 'POST',

        contentType: "application/json", // det visender er json
        data: data,
        success: function (data) {
            alert(JSON.stringify(data));
        },
        error: function (jqXHR, textStatus, errorThrown) {
            alert(jqXHR.responseText);
            alert(textStatus);
            alert(errorThrown);

        }
    });
}

function sebruger() {
    $.get("rest/createUser", function (data, status) {
        $("#ingredienttablebody").html(data);
        alert(status);
    })
}