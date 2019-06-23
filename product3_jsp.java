package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class product3_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("<style>\n");
      out.write("img {\n");
      out.write("    float: right;\n");
      out.write("}\n");
      out.write("h1 {\n");
      out.write("  font-size: 72px;\n");
      out.write("  background: -webkit-linear-gradient(#ffe6f0,#ff0066 );\n");
      out.write("  -webkit-background-clip: text;\n");
      out.write("  -webkit-text-fill-color: transparent;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body bgcolor=\"#ffccdd\">\n");
      out.write("<br><br>\n");
      out.write("<div class=\"w3-container w3-center w3-animate-left\">\n");
      out.write("<h1 class=\"w3-center w3-animate-top\">Oneplus 6</h1></div>\n");
      out.write("<b><p><img src=\"images/phone3.jpg\" width=\"30%\" height=\"20%\"></p>\n");
      out.write("<p>M.R.P.:Rs.29,999.00</p>\n");
      out.write("<p>Price:Rs.29,000.00  </p>\n");
      out.write("<p>You Save:Rs.999.00 (5%)</p>\n");
      out.write("<p>Inclusive of all taxes</p>\n");
      out.write("<p>Cash on Delivery eligible.</p>\n");
      out.write("<p>EMI starts at Rs.1500 per month. </p>\n");
      out.write("</b>\n");
      out.write("<ul><li>OnePlus 6 smartphone was launched in May 2018. The phone comes with a 6.28-inch touchscreen display with a resolution of 1080 pixels by 2280 pixels. OnePlus 6 price in India starts from Rs. 34,999.<li>\n");
      out.write("\n");
      out.write("    <li>The OnePlus 6 is powered by 2.8GHz octa-core processor and it comes with 8GB of RAM. The phone packs 128GB of internal storage that cannot be expanded. As far as the cameras are concerned, the OnePlus 6 packs a 16-megapixel primary camera on the rear and a 16-megapixel front shooter for selfies.</li>\n");
      out.write("\n");
      out.write("    <li>The OnePlus 6 is powered by a 3300mAh non removable battery. It measures 155.70 x 75.40 x 7.75 (height x width x thickness) and weighs 177.00 grams.<li>\n");
      out.write("\n");
      out.write("<li>The OnePlus 6 is a dual SIM (GSM and GSM) smartphone that accepts Nano-SIM and Nano-SIM. Connectivity options include Wi-Fi, GPS, Bluetooth, NFC, USB OTG, 3G and 4G (with support for Band 40 used by some LTE networks in India). Sensors on the phone include Compass/ Magnetometer, Proximity sensor, Accelerometer, Ambient light sensor and Gyroscope.</li>\n");
      out.write("</ul>\n");
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
