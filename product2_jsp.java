package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class product2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<h1 class=\"w3-center w3-animate-top\">APPLE IPHONE XS</h1></div>\n");
      out.write("<b><p><img src=\"images/phone2.jpg\" width=\"30%\" height=\"20%\"></p>\n");
      out.write("<p>Price:Rs.19,490.00 </p>\n");
      out.write("<p>Inclusive of all taxes</p>\n");
      out.write("<p>Cash on Delivery eligible.</p>\n");
      out.write("<p>EMI starts at Rs.427 per month. </p>\n");
      out.write("</b>\n");
      out.write("<ul><li>\n");
      out.write("        <b>Operating System and Performance:</b>\n");
      out.write("        <p>iPhone XS functions on the powerful A12 processor, improved LTE chips from Intel (OLED models only) that will support a faster LTE connection. It is power-driven by Hexa Core (2.35 GHz, Dual-core, Monsoon 1.42 GHz, Quad core, Mistral) processor along with a RAM of 4 GB. This iPhone is expected to include an improvised USB-C to a lightning cable that ensures faster charging.</p></li>\n");
      out.write("\n");
      out.write(" \n");
      out.write("\n");
      out.write("    <li><b>Stunning iPhone XS Cameras - 13MP Plus 8MP Resolutions:</b><p> One of the most awaited phones of the year 2018, iPhone XS has a rear-facing camera accompanies with a triple-lens array. This time Apple has improvised the rear zoom capacity and picture quality of iPhone XS camera in dim light environments. It is equipped with a 13 MP rear camera and 8 MP front-facing camera with retina flash for wonderful selfies, portrait pictures with an image resolution of 4128 x 3096 Pixels, and HD videos. Settings include exposure compensation, ISO control, Face detection, Touch to focus. There are Continues Shooting, High Dynamic Range (HDR) Modes as well in the smartphone that ensures a picture-perfect experience.</p></li> \n");
      out.write("\n");
      out.write(" \n");
      out.write("\n");
      out.write("    <li><b> Beautiful Display & Design with Eye Care Feature:</b><p> Packed in a stunning curved design, the latest iPhone XS has a 5.8\" (14.73 cm) LCD display with a screen resolution of 1125 x 2436 pixels. Boasting a sleek and rich design, iPhone XS is water resistant and dustproof with OLED Display having an aspect ratio of 18:9, and a pixel density of 463 PPI. Its 3D Touch ensures a much smoother & efficient functioning whilst instantly respond to even a subtle touch. The smartphone will be available in two marvellous colours i.e. Gold and Silver.<p></li>\n");
      out.write("\n");
      out.write(" \n");
      out.write("\n");
      out.write("    <li><b>  Consistent Battery and Storage:</b><p> Use More, Play more minus any uncertainties of the phone running out of battery. The all new iPhone XS comes with a non-removable Li-ion powerful battery of 2915 mAh capacity, which can proficiently last up to long hours on standard usage with quick charging.\n");
      out.write("\n");
      out.write("These days, storage has become a vital specification in a smartphone. The iPhone XS provides ample space to store all your data including high-definition photos, music, HD videos, applications, etc.</p></li> \n");
      out.write("\n");
      out.write("<li>Experience world in the palm of your hand with sufficient space in your smartphone</li>\n");
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
