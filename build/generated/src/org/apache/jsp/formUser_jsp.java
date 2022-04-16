package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class formUser_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/navbarAdmin.jsp");
    _jspx_dependants.add("/library.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
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
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Lecturer Details Form</title>\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"internal.css\">\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\" crossorigin=\"anonymous\"></script>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("  <title>Bootstrap Example</title>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write(" ");
      out.write(" <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\n");
      out.write("  <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\" crossorigin=\"anonymous\"></script>\n");
      out.write("  <script src=\"https://use.fontawesome.com/4c09e2a022.js\"></script>\n");
      out.write("  <link href=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js\">\n");
      out.write("      ");
      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n");
      out.write("    <div class=\"container-fluid text-center\">\n");
      out.write("      <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarTogglerDemo03\" aria-controls=\"navbarTogglerDemo03\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("        <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("      </button>\n");
      out.write("      <a class=\"navbar-brand\" href=\"#\">Dashboard</a>\n");
      out.write("      <div class=\"collapse navbar-collapse\" id=\"navbarTogglerDemo03\">\n");
      out.write("        <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link active\" aria-current=\"page\" href=\"manageaccountAdmin.jsp\">Manage Account</a>\n");
      out.write("          </li>\n");
      out.write("        </ul>      \n");
      out.write("      \n");
      out.write("      <form action=\"logout.jsp\" class=\"d-flex\" method=\"post\">\n");
      out.write("          <button class=\"fa fa-sign-out\" type=\"submit\">Sign Out</button>\n");
      out.write("      </form>\n");
      out.write("          \n");
      out.write("        \n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </nav>\n");
      out.write("  </body>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>     \n");
      out.write("        <div class=\"row d-flex justify-content-center\">\n");
      out.write("            <div class=\"col-md-6\"> \n");
      out.write("          <nav aria-label=\"breadcrumb\">\n");
      out.write("            <ol class=\"breadcrumb\">\n");
      out.write("              <li class=\"breadcrumb-item\"><a href=\"#\">Dashboard</a></li>\n");
      out.write("              <li class=\"breadcrumb-item\"><a href=\"");
      out.print(request.getContextPath());
      out.write("/list\">Manage Account</a></li>\n");
      out.write("              <li class=\"breadcrumb-item\"><a href=\"#\">Lecturer Details Form</a></li>\n");
      out.write("            </ol>\n");
      out.write("          </nav>\n");
      out.write("          </div>\n");
      out.write("          </div>\n");
      out.write("        <div class=\"container-fluid text-center\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-6 offset-md-3\">\n");
      out.write("                    <div class=\"signup-form\">\n");
      out.write("                        ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            <h4 class=\"mb-5 text-secondary\">User Details Form</h4>\n");
      out.write("                            <div class=\"row\">\n");
      out.write("        \n");
      out.write("                                <div class=\"mb-3 col-md-6\">\n");
      out.write("                                    <label>Name<span class=\"text-danger\">*</span></label>\n");
      out.write("                                    <input type=\"text\" name=\"userName\" class=\"form-control\" placeholder=\"Enter Name\">\n");
      out.write("                                </div>\n");
      out.write("            \n");
      out.write("                                <div class=\"mb-3 col-md-6\">\n");
      out.write("                                    <label>Email<span class=\"text-danger\">*</span></label>\n");
      out.write("                                    <input type=\"text\" name=\"userEmail\" class=\"form-control\" placeholder=\"Enter Email\">\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"mb-3 col-md-6\">\n");
      out.write("                                    <label>Contact No<span class=\"text-danger\">*</span></label>\n");
      out.write("                                    <input type=\"text\" name=\"userContact\" class=\"form-control\" placeholder=\"Enter Contact No\">\n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                                <div class=\"mb-3 col-md-6\">\n");
      out.write("                                    <label>Role<span class=\"text-danger\">*</span></label>\n");
      out.write("                                    <select name=\"roleID\" class=\"form-control\">\n");
      out.write("                                    <option value=\"\" selected=\"selected\"> - Select Role - </option> \n");
      out.write("                                    <option value=\"2\">Coordinator</option> \n");
      out.write("                                    <option value=\"3\">Lecturer</option>\n");
      out.write("                                    <option value=\"4\">Student</option> \n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"mb-3 col-md-6\">\n");
      out.write("                                    <label>Password<span class=\"text-danger\">*</span></label>\n");
      out.write("                                    <input type=\"text\" name=\"password\" class=\"form-control\" placeholder=\"Enter Password\">\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"col-md-12\">\n");
      out.write("                                   <button class=\"btn btn-primary float-end\">Add User</button>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("       \n");
      out.write("        <br>\n");
      out.write("    </body>\n");
      out.write("    <footer>\n");
      out.write("         <div class=\"container-fluid text-center\">\n");
      out.write("             ");
      out.write("\n");
      out.write("  <footer class=\"footer mt-auto py-3 fixed-bottom text-black\" style=\"background-color: #e3f2fd;\">\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <span class=\"text-muted text-center\">© Copyright 2021: Universiti Malaysia Terengganu</span>\n");
      out.write("  </div>\n");
      out.write("</footer>");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </footer>\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                        <form action=\"update\" method=\"post\" class=\"mt-5 border p-4 bg-light shadow\">\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                <form action=\"insert\" method=\"post\">\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }
}
