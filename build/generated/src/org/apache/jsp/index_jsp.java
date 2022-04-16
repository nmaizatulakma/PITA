package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.Model.user;

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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"UTF-8\">\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("  <!-- For google icons  -->\n");
      out.write("  <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons+Outlined\" rel=\"stylesheet\">\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"css/index.css\"/> \n");
      out.write("  <title>Final Year Student Assessment System</title>\n");
      out.write("  \n");
      out.write("  <style>\n");
      out.write("       .background {\n");
      out.write("    background: url(\"image/loginbackground.jpg\")\n");
      out.write("      rgba(0, 0, 0, 0.61);\n");
      out.write("    background-repeat: no-repeat;\n");
      out.write("    background-size: cover;\n");
      out.write("    background-blend-mode: darken;\n");
      out.write("    position: absolute;\n");
      out.write("    top: 0;\n");
      out.write("    bottom: 0;\n");
      out.write("    left: 0;\n");
      out.write("    right: 0;\n");
      out.write("    z-index: -1;\n");
      out.write("    filter: blur(5px);\n");
      out.write("    min-height: 800px;\n");
      out.write("  }\n");
      out.write("  .radio{\n");
      out.write("      display: inline-flex;\n");
      out.write("      padding: 0;\n");
      out.write("    margin: 10px auto;\n");
      out.write("    font-family: Arial, Helvetica, sans-serif;\n");
      out.write("    color: white;\n");
      out.write("      font-size: 15px;\n");
      out.write("\n");
      out.write("  \n");
      out.write("  </style>\n");
      out.write("  \n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("   \n");
      out.write("\n");
      out.write("  <!-- background -->\n");
      out.write("  <div class=\"background\"></div>\n");
      out.write("<br>\n");
      out.write("\n");
      out.write("</br>\n");
      out.write("<br>\n");
      out.write("</br>\n");
      out.write("  <!-- form container -->\n");
      out.write("  <div class=\"container\">\n");
      out.write("      <figure>\n");
      out.write("      <img src=\"image/logoUMT.png\" alt=\"logoUMT\" width=\"150\" height=\"150\">\n");
      out.write("      <figcaption>Final Year Student Asessment System</figcaption>\n");
      out.write("  </figure>\n");
      out.write("      \n");
      out.write("    <form action=\"loginJSP.jsp\" class=\"sign-in-form\" method=\"post\">\n");
      out.write("        <select name=\"role\" class=\"form-control\">\n");
      out.write("            <option value=\"\" selected=\"selected\"> - Select Role - </option>\n");
      out.write("            <option value=\"1\">Admin</option> \n");
      out.write("            <option value=\"2\">Coordinator</option> \n");
      out.write("            <option value=\"3\">Lecturer</option>\n");
      out.write("            <option value=\"4\">Student</option> \n");
      out.write("            </select>\n");
      out.write("      <div class=\"form-item\">\n");
      out.write("        <span class=\"material-icons-outlined\">\n");
      out.write("          account_circle\n");
      out.write("        </span>\n");
      out.write("        <input type=\"text\" name=\"userEmail\" id=\"user\" placeholder=\"Email Address\">\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"form-item\">\n");
      out.write("        <span class=\"material-icons-outlined\">\n");
      out.write("          lock\n");
      out.write("        </span>\n");
      out.write("        <input type=\"password\" name=\"password\" id=\"pass\" placeholder=\"Password\">\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <button type=\"submit\" name=\"btn_login\">Login</button>\n");
      out.write("    </form>\n");
      out.write("  </div>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
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
