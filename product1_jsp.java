package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class product1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<h1 class=\"w3-center w3-animate-top\">VIVO V11 pro</h1></div>\n");
      out.write("<b><p><img src=\"images/phone1.jpg\" width=\"30%\" height=\"20%\"></p>\n");
      out.write("<p>M.R.P.:Rs.23,020.00</p>\n");
      out.write("<p>Price:Rs.23,000.00  </p>\n");
      out.write("<p>You Save:Rs.20.00 (0.5%)</p>\n");
      out.write("<p>Inclusive of all taxes</p>\n");
      out.write("<p>Cash on Delivery eligible.</p>\n");
      out.write("<p>EMI starts at Rs.1000 per month. </p>\n");
      out.write("<ul><li>Vivo V11 Pro smartphone was launched in September 2018. The phone comes with a 6.41-inch touchscreen display with a resolution of 1080 pixels by 2340 pixels at a PPI of 401 pixels per inch.</li>\n");
      out.write("    <li>Vivo V11 Pro price in India starts from Rs. 23,020.</li>\n");
      out.write("\n");
      out.write("    <li>The Vivo V11 Pro is powered by octa-core processor and it comes with 6GB of RAM.</li>\n");
      out.write("    <li>The phone packs 64GB of internal storage that can be expanded up to 256GB via a microSD card.</li>\n");
      out.write("    <li>As far as the cameras are concerned, the Vivo V11 Pro packs a 12-megapixel (f/1.8) + 5-megapixel (f/2.4) primary camera on the rear and a 25-megapixel front shooter for selfies.</li>\n");
      out.write("\n");
      out.write("    <li>The Vivo V11 Pro is powered by a 3400mAh non removable battery. It measures 157.91 x 75.08 x 7.90 (height x width x thickness) and weighs 156.00 grams.</li>\n");
      out.write("\n");
      out.write("    <li>The Vivo V11 Pro is a dual SIM (GSM and GSM) smartphone that accepts Nano-SIM and Nano-SIM.<li> \n");
      out.write("    <li>Connectivity options include Wi-Fi, GPS, Bluetooth, USB OTG, Micro-USB, FM, Active 4G on both SIM cards, 3G and 4G (with support for Band 40 used by some LTE networks in India).</li>\n");
      out.write("    <li>Sensors on the phone include Face unlock, Fingerprint sensor, Compass/ Magnetometer, Proximity sensor, Accelerometer, Ambient light sensor and Gyroscope.</li></ul>\n");
      out.write("<center><b>ENTER YOUR DETAILS TO PRE-BOOK</b></center>\n");
      out.write("<form name=\"reg\" action=\"pproduct1\" method=\"post\"><center><table>\n");
      out.write("    <b><tr><td class=\"w3-text-red\">ENTER USER NAME:<br></td>\n");
      out.write("   <td><input class=\"w3-input w3-border w3-round-large\" type=\"text\" name=\"username\" autofocus required></tr></td><br>\n");
      out.write("   <tr><td class=\"w3-text-red\"><br>ENTER PASSWORD:</td>\n");
      out.write("   <td><input class=\"w3-input w3-border w3-round-large\" type=\"password\" name=\"password\" autofocus required></tr></td><br>\n");
      out.write("<tr><td><input class=\"w3-btn w3-black\" type=\"submit\" value=\"Pre-Book\"></td></tr>\n");
      out.write("        </table></center></form>\n");
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
