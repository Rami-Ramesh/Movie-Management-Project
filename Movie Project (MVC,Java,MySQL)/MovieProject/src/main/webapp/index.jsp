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
h2{
  margin-top: 20px;
  margin-bottom: 15px;
  margin-left: 25px;
}

form{
    display:block;
}
div{
    display: block;
    margin: auto;
border-radius: 10px;
    margin-top: 100px;
    width: 260px;
    height: 200px;
    background-color: rgb(184, 184, 210);
}

body{
    background-color: rgb(5, 137, 137);
}

button
{
  margin-left: 80px;
margin-top: 5px;
width: 100px;
height:30px ;
border-radius: 5px;
border: none;
}
button:hover
{
   color:rgb(11, 77, 7);
}
pre{
    margin-left:35px ;
}
    </style>
</head>
<body>
    
        <div>
               <h2>Movie Home Page</h2>
           
<form action="insertpage.jsp">
     <button type="submit" >SAVE Movie</button>
</form>
           
<form action="updatepage.jsp">
    <button type="submit" >Update Movie</button>
</form>
<form action="deletepage.jsp">
    <button type="submit" >Delete Movie</button>
</form>
<form action="detailspage.jsp">
    <button type="submit" >Details Movie</button>
</form>
            </div>

</body>
</html>