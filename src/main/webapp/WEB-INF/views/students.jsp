<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.3.2/jquery.min.js"></script>
</head>
<body>

<button type="button" id="button" value="Get">Get</button>

<div id="target"></div>

<script>
    $('#button').click(function () {

        $.ajax({
            type: "GET",
            url: '/a',
            success: function (data, response) {
                if(response === 'success'){
                    $('#target').html(data);
                }
            }
        });

    })

</script>

</body>
</html>