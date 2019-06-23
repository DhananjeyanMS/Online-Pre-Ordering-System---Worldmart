

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<title>HOME</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Montserrat">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
.w3-sidebar a {font-family: "Roboto", sans-serif}
body,h1,h2,h3,h4,h5,h6,.w3-wide {font-family: "Montserrat", sans-serif;}
</style>
<body class="w3-content" style="max-width:1200px">

<!-- Sidebar/menu -->
<nav class="w3-sidebar w3-bar-block w3-white w3-collapse w3-top" style="z-index:3;width:250px" id="mySidebar">
  <div class="w3-container w3-display-container w3-padding-16">
    <i onclick="w3_close()" class="fa fa-remove w3-hide-large w3-button w3-display-topright"></i>
    <h3 class="w3-wide"><b><b>WORLDMART</b></b></h3>
    <b>Beyond everything . . . . .</b>
  </div>
  <a href="#footer" class="w3-bar-item w3-button w3-padding">Contact</a> 
  <a href="javascript:void(0)" class="w3-bar-item w3-button w3-padding" onclick="document.getElementById('newsletter').style.display='block'">Newsletter</a> 
  <a href="#header"  class="w3-bar-item w3-button w3-padding">Products</a>
  <a href="llogin.jsp"  class="w3-bar-item w3-button w3-padding">Login</a>
  <a href="rregister.jsp"  class="w3-bar-item w3-button w3-padding">Registration</a>
</nav>

<!-- Top menu on small screens -->
<header class="w3-bar w3-top w3-hide-large w3-black w3-xlarge">
  <div class="w3-bar-item w3-padding-24 w3-wide">LOGO</div>
  <a href="javascript:void(0)" class="w3-bar-item w3-button w3-padding-24 w3-right" onclick="w3_open()"><i class="fa fa-bars"></i></a>
</header>

<!-- Overlay effect when opening sidebar on small screens -->
<div class="w3-overlay w3-hide-large" onclick="w3_close()" style="cursor:pointer" title="close side menu" id="myOverlay"></div>

<!-- !PAGE CONTENT! -->
<div class="w3-main" style="margin-left:250px">

  <!-- Push down content on small screens -->
  <div class="w3-hide-large" style="margin-top:83px"></div>
  
    <!-- Image header -->
  <div class="w3-display-container w3-container">
    <img src="images/phonewall.jpg" alt="Jeans" style="width:100%">
    <div class="w3-display-topleft w3-text-white" style="padding:24px 48px">
      <h1 class="w3-jumbo w3-hide-small">New arrivals</h1>
      <h1 class="w3-hide-large w3-hide-medium">New arrivals</h1>
      <h1 class="w3-hide-small">COLLECTION 2018</h1>
      <p><a href="#jeans" class="w3-button w3-black w3-padding-large w3-large">SHOP NOW</a></p>
    </div>
  </div>

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

  <!-- Subscribe section -->
  <div class="w3-container w3-black w3-padding-32">
    <h1>Subscribe</h1>
    <p>To get special offers and VIP treatment:</p>
    <p>COMING SOON!!!</p>
  </div>
  
  <!-- Footer -->
  <footer class="w3-padding-64 w3-light-grey w3-small w3-center" id="footer">
    <div class="w3-row-padding">
      <div class="w3-col s4">
        <h4>Contact</h4>
        <p>Questions? Go ahead.</p>
        <form action="contact" method="post" target="_blank">
          <p><input class="w3-input w3-border" type="text" placeholder="Name" name="custoname" required></p>
          <p><input class="w3-input w3-border" type="text" placeholder="Email" name="email" required></p>
          <p><input class="w3-input w3-border" type="text" placeholder="Subject" name="subject" required></p>
          <p><input class="w3-input w3-border" type="text" placeholder="Message" name="message" required></p>
          <button type="submit" class="w3-button w3-block w3-black">Send</button>
        </form>
      </div>
      <div class="w3-col s4 w3-justify">
        <h4>Store</h4>
        <p><i class="fa fa-fw fa-map-marker"></i>World Mart</p>
        <p><i class="fa fa-fw fa-phone"></i>9500050650</p>
        <p><i class="fa fa-fw fa-envelope"></i>worldmart@world.com</p>
        <h4>We accept</h4>
        <p><i class="fa fa-fw fa-cc-amex"></i> Cash</p>
        <p><i class="fa fa-fw fa-credit-card"></i> Credit Card</p>
        
        <h4>Partners</h4>
        <p>P.Sripathi</p>
        <p><i class="fa fa-fw fa-phone"></i>9787953986</p>
        <p>M.S.Dhananjeyan</p>
        <p><i class="fa fa-fw fa-phone"></i>9500050650</p>
        <p>R.Gokul</p>
        <p><i class="fa fa-fw fa-phone"></i>9941856218</p>
        <br>
        <i class="fa fa-facebook-official w3-hover-opacity w3-large"></i>
        <i class="fa fa-instagram w3-hover-opacity w3-large"></i>
        <i class="fa fa-snapchat w3-hover-opacity w3-large"></i>
        <i class="fa fa-pinterest-p w3-hover-opacity w3-large"></i>
        <i class="fa fa-twitter w3-hover-opacity w3-large"></i>
        <i class="fa fa-linkedin w3-hover-opacity w3-large"></i>
      </div>
    </div>
  </footer>
  <!-- End page content -->
</div>

<!-- Newsletter Modal -->
<div id="newsletter" class="w3-modal">
  <div class="w3-modal-content w3-animate-zoom" style="padding:32px">
    <div class="w3-container w3-white w3-center">
      <i onclick="document.getElementById('newsletter').style.display='none'" class="fa fa-remove w3-right w3-button w3-transparent w3-xxlarge"></i>
      <h2 class="w3-wide">NEWSLETTER</h2>
      <p>Join our mailing list to receive updates on new arrivals and special offers.</p>
      <p>COMING SOON!!!!!</p>
    </div>
  </div>
</div>

<script>
// Accordion 
function myAccFunc() {
    var x = document.getElementById("demoAcc");
    if (x.className.indexOf("w3-show") == -1) {
        x.className += " w3-show";
    } else {
        x.className = x.className.replace(" w3-show", "");
    }
}

// Click on the "Jeans" link on page load to open the accordion for demo purposes
document.getElementById("myBtn").click();


// Script to open and close sidebar
function w3_open() {
    document.getElementById("mySidebar").style.display = "block";
    document.getElementById("myOverlay").style.display = "block";
}
 
function w3_close() {
    document.getElementById("mySidebar").style.display = "none";
    document.getElementById("myOverlay").style.display = "none";
}
</script>

</body>
</html>

