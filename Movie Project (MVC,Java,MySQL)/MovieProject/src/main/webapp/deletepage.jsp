<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        input{
    width: 170px;
    height: 30px;
    margin-left:34px ;
    border-radius: 5px;
    border-style: dashed;
    text-decoration: solid;
    margin-bottom:20px ;
    border: none;
    padding-left: 20px;
}
*
{
    margin: 0%;
}
h2{
  margin-top: 20px;
  margin-bottom: 15px;
  margin-left: 35px;
}
div{
    display: block;
    margin: auto;
border-radius: 10px;
    margin-top: 100px;
    width: 260px;
    height: 150px;
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
    </style>
</head>
<body>
   <form action="delete">
    <div>
        <h2> Delete Movie Page</h2>
        <input type="text" placeholder="Enter Your Movie Id" name="MovieId"><br>
        <button type="submit" >Delete Movie</button>
    </div>
    
   </form>
            

</body>
</html>



