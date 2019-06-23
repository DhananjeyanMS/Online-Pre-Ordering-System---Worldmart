<%-- 
    Document   : regsuccess
    Created on : 11 Oct, 2018, 8:56:58 AM
    Author     : DHANANJEYAN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<title>Example</title>
<title>REGISTRATION SUCCESSFULL</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Montserrat">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  <!-- Styles -->	
  <style type="text/css">
.example1 {
 height: 50px;	
 overflow: hidden;
 position: relative;
}
.example1 h3 {
 font-size: 3em;
 color: purple;
 position: absolute;
 width: 100%;
 height: 100%;
 margin: 0;
 line-height: 50px;
 text-align: center;
 /* Starting position */
 -moz-transform:translateX(100%);
 -webkit-transform:translateX(100%);	
 transform:translateX(100%);
 /* Apply animation to this element */	
 -moz-animation: example1 15s linear infinite;
 -webkit-animation: example1 15s linear infinite;
 animation: example1 15s linear infinite;
}
/* Move it (define the animation) */
@-moz-keyframes example1 {
 0%   { -moz-transform: translateX(100%); }
 100% { -moz-transform: translateX(-100%); }
}
@-webkit-keyframes example1 {
 0%   { -webkit-transform: translateX(100%); }
 100% { -webkit-transform: translateX(-100%); }
}
@keyframes example1 {
 0%   { 
 -moz-transform: translateX(100%); /* Firefox bug fix */
 -webkit-transform: translateX(100%); /* Firefox bug fix */
 transform: translateX(100%); 		
 }
 100% { 
 -moz-transform: translateX(-100%); /* Firefox bug fix */
 -webkit-transform: translateX(-100%); /* Firefox bug fix */
 transform: translateX(-100%); 
 }
}
</style>

<!-- HTML --><body bgcolor="#ffccdd">
<br><h2><center><font color="black" face="Segoe UI Black">REGISTRATION SUCCESSFULL</font></h2></center><br><br>
<div class="example1">
<h3>ONLY 2 DAYS LEFT FOR LAUNCH!!!! </font></h3>
</div>
<br><br><br><br><br><br>
<!-- Product grid -->
<div class="w3-row w3-grayscale">
    <div class="w3-col l3 s6">
      <div class="w3-container"><div class="w3-display-container">
        <img src="images/phone1.jpg" style="width:100%">
        <span class="w3-tag w3-display-topleft">New</span>
          <div class="w3-display-middle w3-display-hover">
            <a href="product1.jsp"><button class="w3-button w3-black">Buy now <i class="fa fa-shopping-cart"></i></button></a>
          </div></div>
        <p>VIVO v11 pro<br><b>Rs.23,020.00</b></p>
      </div>
    </div>

    <div class="w3-col l3 s6">
      <div class="w3-container">
        <div class="w3-display-container">
          <img src="images/phone2.jpg" style="width:100%">
          <span class="w3-tag w3-display-topleft">New</span>
          <div class="w3-display-middle w3-display-hover">
            <a href="product2.jsp"><button class="w3-button w3-black">Buy now <i class="fa fa-shopping-cart"></i></button></a>
          </div>
        </div>
        <p>Apple IPHONE XS<br><b>Rs.99,900.00</b></p>
      </div>
    </div>

    <div class="w3-col l3 s6">
      <div class="w3-container"><div class="w3-display-container">
        <img src="images/phone3.jpg" style="width:100%">
       <span class="w3-tag w3-display-topleft">New</span>
          <div class="w3-display-middle w3-display-hover">
            <a href="product3.jsp"><button class="w3-button w3-black">Buy now <i class="fa fa-shopping-cart"></i></button></a>
          </div></div>
        <p>Oneplus 6<br><b>Rs.29,999.00</b></p>
      </div>
    </div>

    <div class="w3-col l3 s6">
      <div class="w3-container"><div class="w3-display-container">
        <img src="images/phone4.jpg" style="width:100%">
        <span class="w3-tag w3-display-topleft">New</span>
          <div class="w3-display-middle w3-display-hover">
            <a href="product4.jsp"><button class="w3-button w3-black">Buy now <i class="fa fa-shopping-cart"></i></button></a>
          </div></div>
        <p>Samsung Galaxy S9 Plus<br><b>Rs.58,350.00</b></p>
      </div>
    </div>
  </div>

