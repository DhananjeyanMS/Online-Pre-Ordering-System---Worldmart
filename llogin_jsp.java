package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class llogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Raleway\">\n");
      out.write("<style>\n");
      out.write("body,h1 {font-family: \"Raleway\", sans-serif}\n");
      out.write("body, html {height: 100%}\n");
      out.write(".bgimg {\n");
      out.write("    background-image: url('forestbridge1.png');\n");
      out.write("    min-height: 100%;\n");
      out.write("    background-position: center;\n");
      out.write("    background-size: cover;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body background=\"");
      out.print(request.getContextPath());
      out.write("/images/forestbridge1.png\">\n");
      out.write("<div class=\"bgimg w3-display-container w3-animate-opacity w3-text-white\">\n");
      out.write("  <div class=\"w3-display-topleft w3-padding-large w3-xlarge\">\n");
      out.write("    <a href=\"index.jsp\">BACK</a>\n");
      out.write("  </div>\n");
      out.write("<br><br>\n");
      out.write("<div class=\"w3-center\">\n");
      out.write("   <h1 class=\"w3-jumbo w3-animate-top\">LOGIN</h1>\n");
      out.write("   <hr class=\"w3-border-grey\" style=\"margin:auto;width:40%\">\n");
      out.write("</div>\n");
      out.write("<div class=\"w3-display-middle\">\n");
      out.write("<form action=\"login\" method=\"post\"><div> \n");
      out.write("<table style=\"border-spacing:1em\">\n");
      out.write("<b><tr><td class=\"w3-text-white\">ENTER USER NAME:<br></td>\n");
      out.write("<td><input class=\"w3-input w3-border w3-round-large\" type=\"text\" name=\"username\" autofocus required></tr></td><br>\n");
      out.write("<tr><td class=\"w3-text-white\"><br>ENTER PASSWORD:</td>\n");
      out.write("<td><input class=\"w3-input w3-border w3-round-large\" type=\"password\" name=\"password\" required></tr></td><br>\n");
      out.write("<td class=\"w3-text-white\"><input class=\"w3-btn w3-blue\" type=\"submit\" value=\"SUBMIT\" name=\"submit\"></td>\n");
      out.write("</tr>\n");
      out.write("</b></table>\n");
      out.write("</div>\n");
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
