package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class loginJSP_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    //check condition admin login not back index.jsp(login) page
    if(session.getAttribute("admin_login")!=null){
        response.sendRedirect("dashboardAdmin.jsp");
    }
    
    //check condition coordinator login not back index.jsp(login) page
    else if(session.getAttribute("coordinator_login")!=null){
        response.sendRedirect("dashboardCoordinator.jsp");
    }
    
    //check condition lecturer login not back index.jsp(login) page
    if(session.getAttribute("lecturer_login")!=null){
        response.sendRedirect("dashboardLecturer.jsp");
    }
    
    //check condition student login not back index.jsp(login)page
    if(session.getAttribute("student_login")!=null){
        response.sendRedirect("dashboardStudent.jsp");
    }
    
if(request.getParameter("btn_login")!=null){
    String role, email, password;
    
    role = request.getParameter("role");
    email = request.getParameter("userEmail");
    password = request.getParameter("password");
    
    String jdbcURL = "jdbc:mysql://localhost:3306/testfyp"; 
    String jdbcUsername = "root";
    String jdbcPassword = "admin";
    
    try{
        Class.forName("com.mysql.jdbc.Driver"); //load jdbc driver
        Connection con = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        
        PreparedStatement pstmt = null;
        
        pstmt = con.prepareStatement("select * from user where roleID=? and userEmail=? and password=? ");
        pstmt.setString(1, role);
        pstmt.setString(2, email);
        pstmt.setString(3, password);
        ResultSet rs = pstmt.executeQuery();
        
        if(rs.next()){
            String dbrole = rs.getString("roleID");
            String dbemail = rs.getString("userEmail");
            String dbpassword = rs.getString("password");
            
            if(role.equals(dbrole) && email.equals(dbemail) && password.equals(dbpassword)){
                if(role.equals("1")){
                    session.setAttribute("admin_login", email);
                    response.sendRedirect("dashboardAdmin.jsp");
                }
                else if(role.equals("2")){
                    session.setAttribute("coordinator_login", email);
                    response.sendRedirect("coordinator/dashboardCoordinator.jsp");
                }
                else if(role.equals("3")){
                    session.setAttribute("lecturer_login", email);
                    response.sendRedirect("lecturer/dashboardLecturer.jsp");
                }
                else if(role.equals("4")){
                    session.setAttribute("student_login", email);
                    response.sendRedirect("student/dashboardStudent.jsp");
                }
                
            }
        }
        else{
            request.setAttribute("errorMsg", "Invalid email or password or role");
        }
        pstmt.close();
        con.close();
                
    }
    catch(Exception e){
        e.printStackTrace();
    }
}

      out.write('\n');
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
