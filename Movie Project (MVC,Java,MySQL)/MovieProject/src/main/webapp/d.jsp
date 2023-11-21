
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        *
{
margin: 0%;
}
body
{
    background-color: rgb(145, 133, 133);
}
pre{
    margin-top:100px ;
    text-align: center;
    font-size: larger;
}
    </style>
</head>
<body>
    <pre>
        <%=request.getAttribute("output") %>
    </pre>
</body>
</html>