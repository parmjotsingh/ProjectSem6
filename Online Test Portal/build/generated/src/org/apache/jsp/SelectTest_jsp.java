package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modal.UserEnrolledDAO;
import modal.UserEnrolled;
import modal.Course;
import java.util.List;
import modal.QuestionPaper;
import modal.CourseDAO;

public final class SelectTest_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\" dir=\"ltr\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <title></title>\n");
      out.write("    </head>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/navigationBar.css\">\n");
      out.write("    <style media=\"screen\">\n");
      out.write("        body,html{\n");
      out.write("            margin:0;\n");
      out.write("            padding:0;\n");
      out.write("        }\n");
      out.write("        body{\n");
      out.write("            width:100%;\n");
      out.write("            height:100%;\n");
      out.write("            display:flex;\n");
      out.write("            justify-content:center;\n");
      out.write("            flex-direction:column;\n");
      out.write("            align-items:center;\n");
      out.write("            padding-top: 20px;\n");
      out.write("            background-image: url(\"css/img/bookwallpaper.jpg\");\n");
      out.write("            background-size: cover;\n");
      out.write("            background-repeat: no-repeat;\n");
      out.write("        }\n");
      out.write("        @import url('https://fonts.googleapis.com/css?family=Montserrat:500');\n");
      out.write("        .box{\n");
      out.write("            width: 90%;\n");
      out.write("            margin-top:20px;\n");
      out.write("            border: solid 2px rgb(207, 207, 207);\n");
      out.write("            font-family: 'Montserrat', sans-serif;\n");
      out.write("            display:flex;\n");
      out.write("            justify-content:center;\n");
      out.write("            align-items:center;\n");
      out.write("            flex-direction:column;\n");
      out.write("            border-radius: 5px;\n");
      out.write("        }\n");
      out.write("        .CourseInfo h2{\n");
      out.write("            color:rgb(50,50,50);\n");
      out.write("            letter-spacing: 1px;\n");
      out.write("        }\n");
      out.write("        .CourseInfo{\n");
      out.write("            display:flex;\n");
      out.write("            justify-content:space-between;\n");
      out.write("            align-items:center;\n");
      out.write("            width:90%;\n");
      out.write("        }\n");
      out.write("        @import url('https://fonts.googleapis.com/css?family=Roboto+Mono');\n");
      out.write("        .CourseInfo button{\n");
      out.write("            font-family: 'Roboto Mono', monospace;\n");
      out.write("            height: 40px;\n");
      out.write("            width: 150px;\n");
      out.write("            border: solid 1px rgb(50,50,50);\n");
      out.write("            background-color: rgb(50,50,50);\n");
      out.write("            color: rgb(240,240,240);\n");
      out.write("            box-sizing: border-box;\n");
      out.write("            font-size: 20px;\n");
      out.write("            letter-spacing: 1px;\n");
      out.write("            position: relative;\n");
      out.write("            z-index: 1;\n");
      out.write("            overflow: hidden;\n");
      out.write("\n");
      out.write("        }\n");
      out.write("        .CourseInfo button:hover{\n");
      out.write("            border: solid 1px rgb(50,50,50);\n");
      out.write("            background-color:  transparent;\n");
      out.write("            color: rgb(50,50,50);\n");
      out.write("            cursor: pointer;\n");
      out.write("            transition-duration: .2s;\n");
      out.write("            box-shadow: 0px 2px 10px 3px rgba(50,50,50,0.5);\n");
      out.write("        }\n");
      out.write("        .CourseInfo button::before{\n");
      out.write("            position: absolute;\n");
      out.write("            content: '';\n");
      out.write("            width: 30px;\n");
      out.write("            height: 110%;\n");
      out.write("            left: -37px;\n");
      out.write("            /* left: 105%; */\n");
      out.write("            top:-2px;\n");
      out.write("            background-color: rgb(207, 207, 207);\n");
      out.write("            transform: skew(-15deg,0);\n");
      out.write("            z-index: -1;\n");
      out.write("\n");
      out.write("        }\n");
      out.write("        .CourseInfo button:hover::before{\n");
      out.write("            transition-duration: .7s;\n");
      out.write("            left: 105%;\n");
      out.write("        }\n");
      out.write("        .ques{\n");
      out.write("            background-color: rgb(207, 207, 207);\n");
      out.write("            width: 100%;\n");
      out.write("        }\n");
      out.write("        .ques p{\n");
      out.write("            padding-left: 5%;\n");
      out.write("            font-size: 14px;\n");
      out.write("            display: inline-block;\n");
      out.write("            font-family: 'Montserrat', sans-serif;\n");
      out.write("        }\n");
      out.write("        .ques p span{\n");
      out.write("            font-weight: 600;\n");
      out.write("            font-size: 16px;\n");
      out.write("            font-family: 'Montserrat', sans-serif;\n");
      out.write("        }\n");
      out.write("        .searchBar{\n");
      out.write("            /* width: 50%; */\n");
      out.write("            width: 4%;\n");
      out.write("            height:50px;\n");
      out.write("            border: solid rgb(40,40,40) 2px;\n");
      out.write("            display:flex;\n");
      out.write("            transition-duration: .4s;\n");
      out.write("        }\n");
      out.write("        .searchBar:hover{\n");
      out.write("            width: 50%;\n");
      out.write("        }\n");
      out.write("        .searchBar:hover .search{\n");
      out.write("            flex:10;\n");
      out.write("        }\n");
      out.write("        .search{\n");
      out.write("            flex:0;\n");
      out.write("            justify-content: center;\n");
      out.write("            display: flex;\n");
      out.write("            align-items: center;\n");
      out.write("        }\n");
      out.write("        .search form{\n");
      out.write("            justify-content: center;\n");
      out.write("            display: flex;\n");
      out.write("            align-items: center;\n");
      out.write("        }\n");
      out.write("        .search form, .search form input{\n");
      out.write("            width:100%;\n");
      out.write("            height:100%;\n");
      out.write("            border:none;\n");
      out.write("            font-family: 'Roboto Mono', monospace;\n");
      out.write("            font-size:30px;\n");
      out.write("            text-align:center;\n");
      out.write("            background-color:transparent;\n");
      out.write("            letter-spacing: 2px;\n");
      out.write("            outline: none;\n");
      out.write("        }\n");
      out.write("        .search form input::placeholder{\n");
      out.write("            color:black;\n");
      out.write("        }\n");
      out.write("        .searchIcon{\n");
      out.write("            flex: 1;\n");
      out.write("            justify-content: center;\n");
      out.write("            display: flex;\n");
      out.write("            align-items: center;\n");
      out.write("            font-size: 25px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("    </style>\n");
      out.write("    <script src=\"https://use.fontawesome.com/318828acc1.js\"></script>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        ");

            String Username = (String) session.getAttribute("Username");
            if (Username == null) {
                response.sendRedirect("Login.jsp");
            }
        
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"menu-btn\" onClick=\"openClose()\">\n");
      out.write("            <span></span>\n");
      out.write("            <span></span>\n");
      out.write("            <span></span>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"menu\">\n");
      out.write("            <form action=\"MenuServlet\" class=\"menu-content\">\n");
      out.write("                <button class=\"btn\" type=\"submit\" value=\"home\" name=\"home\">HOME</button>\n");
      out.write("                <button class=\"btn\" type=\"submit\" value=\"courses\" name=\"courses\">COURSES</button>\n");
      out.write("                <button class=\"btn\" type=\"submit\" value=\"profile\" name=\"profile\">PROFILE</button>\n");
      out.write("                <button class=\"btn\" type=\"submit\" value=\"setting\" name=\"setting\">CREATE</button>\n");
      out.write("                <button class=\"btn\" type=\"submit\" value=\"loginLogout\" name=\"loginLogout\">LOGOUT</button>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        <script type=\"text/javascript\" src=\"script/home.js\"></script>\n");
      out.write("\n");
      out.write("        <div class=\"searchBar\">\n");
      out.write("            <div class=\"search\">\n");
      out.write("                <form class=\"\" action=\"index.html\" method=\"post\">\n");
      out.write("                    <input type=\"text\" name=\"\" value=\"\" placeholder=\"Enter course name... \">\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"searchIcon\">\n");
      out.write("                <i class=\"fa fa-search\" aria-hidden=\"true\"></i>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        ");

            CourseDAO cd = new CourseDAO();
            List<Course> l = cd.getExam();
            UserEnrolledDAO ued = new UserEnrolledDAO();
            UserEnrolled u = new UserEnrolled();
            for (Course i : l) {
                u.setCourse(i.getCourse());
                u.setUser(Username);
                boolean flag = ued.checkUser(u);
        
      out.write("\n");
      out.write("        <div class=\"box\">\n");
      out.write("            <div class=\"CourseInfo\">\n");
      out.write("                <h2>");
      out.print(i.getCourse());
      out.write("</h2>\n");
      out.write("                <form class=\"\" action=\"TakeTestServlet\" method=\"post\">\n");
      out.write("                    <button type=\"submit\" value=\"");
      out.print(i.getCourse());
      out.write("\" name=\"course\" ");
 if (flag) {
      out.write(" disabled style=\"cursor:no-drop;\"");
}
      out.write(" >Take Test</button>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"ques\">\n");
      out.write("                <p>Questions: <span>");
      out.print(i.getQues());
      out.write("</span> </p>\n");
      out.write("                ");
if (flag) {
                
      out.write("  <p style=\"color:red;display: inline;float: right;\">YOU HAVE ALREADY ATTEMPTED THIS TEST</p>    ");

            }
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        ");
}
      out.write("\n");
      out.write("    </body>\n");
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
