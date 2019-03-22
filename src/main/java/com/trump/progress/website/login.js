function login(username) {
    var username = document.getElementById("username").value;
    var password = document.getElementById("password").value;
    var email = document.getElementById("email").value;

    fetch('http://localhost:8080/users/' + username+',' + password + ','+ email)
        .then(
            function (response) {
                if (response.status !== 200) {
                    console.log('Looks like there was a problem. Status Code: ' +
                        response.status);
                    return;
                }

                // Examine the text in the response
                var json = response.json().then(function (data) {
                    console.log(data);
                    document.getElementById("test").innerText = JSON.stringify(data);
                });
            }
        )
        .catch(function (err) {
            console.log('Fetch Error :-S', err);
        });
}