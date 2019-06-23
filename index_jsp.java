package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<title>HOME</title>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Roboto\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Montserrat\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("<style>\n");
      out.write(".w3-sidebar a {font-family: \"Roboto\", sans-serif}\n");
      out.write("body,h1,h2,h3,h4,h5,h6,.w3-wide {font-family: \"Montserrat\", sans-serif;}\n");
      out.write("</style>\n");
      out.write("<body class=\"w3-content\" style=\"max-width:1200px\">\n");
      out.write("\n");
      out.write("<!-- Sidebar/menu -->\n");
      out.write("<nav class=\"w3-sidebar w3-bar-block w3-white w3-collapse w3-top\" style=\"z-index:3;width:250px\" id=\"mySidebar\">\n");
      out.write("  <div class=\"w3-container w3-display-container w3-padding-16\">\n");
      out.write("    <i onclick=\"w3_close()\" class=\"fa fa-remove w3-hide-large w3-button w3-display-topright\"></i>\n");
      out.write("    <h3 class=\"w3-wide\"><b><b>WORLDMART</b></b></h3>\n");
      out.write("    <b>Beyond everything . . . . .</b>\n");
      out.write("  </div>\n");
      out.write("  <a href=\"#footer\" class=\"w3-bar-item w3-button w3-padding\">Contact</a> \n");
      out.write("  <a href=\"javascript:void(0)\" class=\"w3-bar-item w3-button w3-padding\" onclick=\"document.getElementById('newsletter').style.display='block'\">Newsletter</a> \n");
      out.write("  <a href=\"#header\"  class=\"w3-bar-item w3-button w3-padding\">Products</a>\n");
      out.write("  <a href=\"llogin.jsp\"  class=\"w3-bar-item w3-button w3-padding\">Login</a>\n");
      out.write("  <a href=\"rregister.jsp\"  class=\"w3-bar-item w3-button w3-padding\">Registration</a>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("<!-- Top menu on small screens -->\n");
      out.write("<header class=\"w3-bar w3-top w3-hide-large w3-black w3-xlarge\">\n");
      out.write("  <div class=\"w3-bar-item w3-padding-24 w3-wide\">LOGO</div>\n");
      out.write("  <a href=\"javascript:void(0)\" class=\"w3-bar-item w3-button w3-padding-24 w3-right\" onclick=\"w3_open()\"><i class=\"fa fa-bars\"></i></a>\n");
      out.write("</header>\n");
      out.write("\n");
      out.write("<!-- Overlay effect when opening sidebar on small screens -->\n");
      out.write("<div class=\"w3-overlay w3-hide-large\" onclick=\"w3_close()\" style=\"cursor:pointer\" title=\"close side menu\" id=\"myOverlay\"></div>\n");
      out.write("\n");
      out.write("<!-- !PAGE CONTENT! -->\n");
      out.write("<div class=\"w3-main\" style=\"margin-left:250px\">\n");
      out.write("\n");
      out.write("  <!-- Push down content on small screens -->\n");
      out.write("  <div class=\"w3-hide-large\" style=\"margin-top:83px\"></div>\n");
      out.write("  \n");
      out.write("    <!-- Image header -->\n");
      out.write("  <div class=\"w3-display-container w3-container\">\n");
      out.write("    <img src=\"images/phonewall.jpg\" alt=\"Jeans\" style=\"width:100%\">\n");
      out.write("    <div class=\"w3-display-topleft w3-text-white\" style=\"padding:24px 48px\">\n");
      out.write("      <h1 class=\"w3-jumbo w3-hide-small\">New arrivals</h1>\n");
      out.write("      <h1 class=\"w3-hide-large w3-hide-medium\">New arrivals</h1>\n");
      out.write("      <h1 class=\"w3-hide-small\">COLLECTION 2018</h1>\n");
      out.write("      <p><a href=\"#jeans\" class=\"w3-button w3-black w3-padding-large w3-large\">SHOP NOW</a></p>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <!-- Product grid -->\n");
      out.write("  <div class=\"w3-row w3-grayscale\">\n");
      out.write("    <div class=\"w3-col l3 s6\">\n");
      out.write("      <div class=\"w3-container\"><div class=\"w3-display-container\">\n");
      out.write("        <img src=\"images/phone1.jpg\" style=\"width:100%\">\n");
      out.write("        <span class=\"w3-tag w3-display-topleft\">New</span>\n");
      out.write("          <div class=\"w3-display-middle w3-display-hover\">\n");
      out.write("            <a href=\"product1.jsp\"><button class=\"w3-button w3-black\">Buy now <i class=\"fa fa-shopping-cart\"></i></button></a>\n");
      out.write("          </div></div>\n");
      out.write("        <p>VIVO v11 pro<br><b>Rs.23,020.00</b></p>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"w3-col l3 s6\">\n");
      out.write("      <div class=\"w3-container\">\n");
      out.write("        <div class=\"w3-display-container\">\n");
      out.write("          <img src=\"images/phone2.jpg\" style=\"width:100%\">\n");
      out.write("          <span class=\"w3-tag w3-display-topleft\">New</span>\n");
      out.write("          <div class=\"w3-display-middle w3-display-hover\">\n");
      out.write("            <a href=\"product2.jsp\"><button class=\"w3-button w3-black\">Buy now <i class=\"fa fa-shopping-cart\"></i></button></a>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <p>Apple IPHONE XS<br><b>Rs.99,900.00</b></p>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"w3-col l3 s6\">\n");
      out.write("      <div class=\"w3-container\"><div class=\"w3-display-container\">\n");
      out.write("        <img src=\"images/phone3.jpg\" style=\"width:100%\">\n");
      out.write("       <span class=\"w3-tag w3-display-topleft\">New</span>\n");
      out.write("          <div class=\"w3-display-middle w3-display-hover\">\n");
      out.write("            <a href=\"product3.jsp\"><button class=\"w3-button w3-black\">Buy now <i class=\"fa fa-shopping-cart\"></i></button></a>\n");
      out.write("          </div></div>\n");
      out.write("        <p>Oneplus 6<br><b>Rs.29,999.00</b></p>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"w3-col l3 s6\">\n");
      out.write("      <div class=\"w3-container\"><div class=\"w3-display-container\">\n");
      out.write("        <img src=\"images/phone4.jpg\" style=\"width:100%\">\n");
      out.write("        <span class=\"w3-tag w3-display-topleft\">New</span>\n");
      out.write("          <div class=\"w3-display-middle w3-display-hover\">\n");
      out.write("            <a href=\"product4.jsp\"><button class=\"w3-button w3-black\">Buy now <i class=\"fa fa-shopping-cart\"></i></button></a>\n");
      out.write("          </div></div>\n");
      out.write("        <p>Samsung Galaxy S9 Plus<br><b>Rs.58,350.00</b></p>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <!-- Subscribe section -->\n");
      out.write("  <div class=\"w3-container w3-black w3-padding-32\">\n");
      out.write("    <h1>Subscribe</h1>\n");
      out.write("    <p>To get special offers and VIP treatment:</p>\n");
      out.write("    <p>COMING SOON!!!</p>\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("  <!-- Footer -->\n");
      out.write("  <footer class=\"w3-padding-64 w3-light-grey w3-small w3-center\" id=\"footer\">\n");
      out.write("    <div class=\"w3-row-padding\">\n");
      out.write("      <div class=\"w3-col s4\">\n");
      out.write("        <h4>Contact</h4>\n");
      out.write("        <p>Questions? Go ahead.</p>\n");
      out.write("        <form action=\"contact\" method=\"post\" target=\"_blank\">\n");
      out.write("          <p><input class=\"w3-input w3-border\" type=\"text\" placeholder=\"Name\" name=\"custoname\" required></p>\n");
      out.write("          <p><input class=\"w3-input w3-border\" type=\"text\" placeholder=\"Email\" name=\"email\" required></p>\n");
      out.write("          <p><input class=\"w3-input w3-border\" type=\"text\" placeholder=\"Subject\" name=\"subject\" required></p>\n");
      out.write("          <p><input class=\"w3-input w3-border\" type=\"text\" placeholder=\"Message\" name=\"message\" required></p>\n");
      out.write("          <button type=\"submit\" class=\"w3-button w3-block w3-black\">Send</button>\n");
      out.write("        </form>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"w3-col s4 w3-justify\">\n");
      out.write("        <h4>Store</h4>\n");
      out.write("        <p><i class=\"fa fa-fw fa-map-marker\"></i>World Mart</p>\n");
      out.write("        <p><i class=\"fa fa-fw fa-phone\"></i>9500050650</p>\n");
      out.write("        <p><i class=\"fa fa-fw fa-envelope\"></i>worldmart@world.com</p>\n");
      out.write("        <h4>We accept</h4>\n");
      out.write("        <p><i class=\"fa fa-fw fa-cc-amex\"></i> Cash</p>\n");
      out.write("        <p><i class=\"fa fa-fw fa-credit-card\"></i> Credit Card</p>\n");
      out.write("        \n");
      out.write("        <h4>Partners</h4>\n");
      out.write("        <p>P.Sripathi</p>\n");
      out.write("        <p><i class=\"fa fa-fw fa-phone\"></i>9787953986</p>\n");
      out.write("        <p>M.S.Dhananjeyan</p>\n");
      out.write("        <p><i class=\"fa fa-fw fa-phone\"></i>9500050650</p>\n");
      out.write("        <p>R.Gokul</p>\n");
      out.write("        <p><i class=\"fa fa-fw fa-phone\"></i>9941856218</p>\n");
      out.write("        <br>\n");
      out.write("        <i class=\"fa fa-facebook-official w3-hover-opacity w3-large\"></i>\n");
      out.write("        <i class=\"fa fa-instagram w3-hover-opacity w3-large\"></i>\n");
      out.write("        <i class=\"fa fa-snapchat w3-hover-opacity w3-large\"></i>\n");
      out.write("        <i class=\"fa fa-pinterest-p w3-hover-opacity w3-large\"></i>\n");
      out.write("        <i class=\"fa fa-twitter w3-hover-opacity w3-large\"></i>\n");
      out.write("        <i class=\"fa fa-linkedin w3-hover-opacity w3-large\"></i>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </footer>\n");
      out.write("  <!-- End page content -->\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- Newsletter Modal -->\n");
      out.write("<div id=\"newsletter\" class=\"w3-modal\">\n");
      out.write("  <div class=\"w3-modal-content w3-animate-zoom\" style=\"padding:32px\">\n");
      out.write("    <div class=\"w3-container w3-white w3-center\">\n");
      out.write("      <i onclick=\"document.getElementById('newsletter').style.display='none'\" class=\"fa fa-remove w3-right w3-button w3-transparent w3-xxlarge\"></i>\n");
      out.write("      <h2 class=\"w3-wide\">NEWSLETTER</h2>\n");
      out.write("      <p>Join our mailing list to receive updates on new arrivals and special offers.</p>\n");
      out.write("      <p>COMING SOON!!!!!</p>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("// Accordion \n");
      out.write("function myAccFunc() {\n");
      out.write("    var x = document.getElementById(\"demoAcc\");\n");
      out.write("    if (x.className.indexOf(\"w3-show\") == -1) {\n");
      out.write("        x.className += \" w3-show\";\n");
      out.write("    } else {\n");
      out.write("        x.className = x.className.replace(\" w3-show\", \"\");\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("\n");
      out.write("// Click on the \"Jeans\" link on page load to open the accordion for demo purposes\n");
      out.write("document.getElementById(\"myBtn\").click();\n");
      out.write("\n");
      out.write("\n");
      out.write("// Script to open and close sidebar\n");
      out.write("function w3_open() {\n");
      out.write("    document.getElementById(\"mySidebar\").style.display = \"block\";\n");
      out.write("    document.getElementById(\"myOverlay\").style.display = \"block\";\n");
      out.write("}\n");
      out.write(" \n");
      out.write("function w3_close() {\n");
      out.write("    document.getElementById(\"mySidebar\").style.display = \"none\";\n");
      out.write("    document.getElementById(\"myOverlay\").style.display = \"none\";\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
