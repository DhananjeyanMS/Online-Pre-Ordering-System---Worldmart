<%-- 
    Document   : llogin
    Created on : 11 Oct, 2018, 8:49:57 AM
    Author     : DHANANJEYAN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway">
<style>
body,h1 {font-family: "Raleway", sans-serif}
body, html {height: 100%}
.bgimg {
    background-image: url('forestbridge1.jpg');
    min-height: 100%;
    background-position: center;
    background-size: cover;
}
</style>
</head>
<body background="<%=request.getContextPath()%>/images/forestbridge1.jpg">
<div class="bgimg w3-display-container w3-animate-opacity w3-text-white">
  <div class="w3-display-topleft w3-padding-large w3-xlarge">
    <a href="index.jsp">BACK</a>
  </div>
<br><br>
<div class="w3-center">
   <h1 class="w3-jumbo w3-animate-top">LOGIN</h1>
   <hr class="w3-border-grey" style="margin:auto;width:40%">
</div>
<div class="w3-display-middle">
<form action="login" method="post"><div> 
<table style="border-spacing:1em">
<b><tr><td class="w3-text-white">ENTER USER NAME:<br></td>
<td><input class="w3-input w3-border w3-round-large" type="text" name="username" autofocus required></tr></td><br>
<tr><td class="w3-text-white"><br>ENTER PASSWORD:</td>
<td><input class="w3-input w3-border w3-round-large" type="password" name="password" required></tr></td><br>
<td class="w3-text-white"><input class="w3-btn w3-blue" type="submit" value="SUBMIT" name="submit"></td>
</tr>
</b></table>
</div>
</body>
</html>

