package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class product_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Example</title>\n");
      out.write("<title>PRODUCT AVAIL</title>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Roboto\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Montserrat\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("  <!-- Styles -->\t\n");
      out.write("  <style type=\"text/css\">\n");
      out.write(".example1 {\n");
      out.write(" height: 50px;\t\n");
      out.write(" overflow: hidden;\n");
      out.write(" position: relative;\n");
      out.write("}\n");
      out.write(".example1 h3 {\n");
      out.write(" font-size: 3em;\n");
      out.write(" color: purple;\n");
      out.write(" position: absolute;\n");
      out.write(" width: 100%;\n");
      out.write(" height: 100%;\n");
      out.write(" margin: 0;\n");
      out.write(" line-height: 50px;\n");
      out.write(" text-align: center;\n");
      out.write(" /* Starting position */\n");
      out.write(" -moz-transform:translateX(100%);\n");
      out.write(" -webkit-transform:translateX(100%);\t\n");
      out.write(" transform:translateX(100%);\n");
      out.write(" /* Apply animation to this element */\t\n");
      out.write(" -moz-animation: example1 15s linear infinite;\n");
      out.write(" -webkit-animation: example1 15s linear infinite;\n");
      out.write(" animation: example1 15s linear infinite;\n");
      out.write("}\n");
      out.write("/* Move it (define the animation) */\n");
      out.write("@-moz-keyframes example1 {\n");
      out.write(" 0%   { -moz-transform: translateX(100%); }\n");
      out.write(" 100% { -moz-transform: translateX(-100%); }\n");
      out.write("}\n");
      out.write("@-webkit-keyframes example1 {\n");
      out.write(" 0%   { -webkit-transform: translateX(100%); }\n");
      out.write(" 100% { -webkit-transform: translateX(-100%); }\n");
      out.write("}\n");
      out.write("@keyframes example1 {\n");
      out.write(" 0%   { \n");
      out.write(" -moz-transform: translateX(100%); /* Firefox bug fix */\n");
      out.write(" -webkit-transform: translateX(100%); /* Firefox bug fix */\n");
      out.write(" transform: translateX(100%); \t\t\n");
      out.write(" }\n");
      out.write(" 100% { \n");
      out.write(" -moz-transform: translateX(-100%); /* Firefox bug fix */\n");
      out.write(" -webkit-transform: translateX(-100%); /* Firefox bug fix */\n");
      out.write(" transform: translateX(-100%); \n");
      out.write(" }\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<!-- HTML --><body bgcolor=\"#ccff99\">\n");
      out.write("    <div class=\"bgimg w3-display-container w3-animate-opacity w3-text-white\">\n");
      out.write("  <div class=\"w3-display-topleft w3-padding-large w3-xlarge\">\n");
      out.write("    <a href=\"index.jsp\">BACK</a>\n");
      out.write("  </div></div>\n");
      out.write("<br><br>\n");
      out.write("<br><h2><center><font color=\"black\" face=\"Segoe UI Black\">PRODUCTS AVAILABILITY</font></h2></center><br><br>\n");
      out.write("<div class=\"example1\">\n");
      out.write("<h3>ONLY 2 DAYS LEFT!!!! </font></h3>\n");
      out.write("</div>\n");
      out.write("<br><br><br><br><br><br>\n");
      out.write("<!-- Product grid -->\n");
      out.write("<div class=\"w3-row w3-grayscale\">\n");
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
