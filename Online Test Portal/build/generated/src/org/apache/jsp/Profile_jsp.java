package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import modal.Course;
import modal.CourseDAO;

public final class Profile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<html lang=\"en\" dir=\"ltr\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <title></title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/navigationBar.css\">\n");
      out.write("        <style media=\"screen\">\n");
      out.write("            body,html{\n");
      out.write("                margin:0;\n");
      out.write("                padding:0;\n");
      out.write("                width:100%;\n");
      out.write("                height:100%;\n");
      out.write("            }\n");
      out.write("            body{\n");
      out.write("                width:100%;\n");
      out.write("                height:100%;\n");
      out.write("                display:flex;\n");
      out.write("                justify-content:center;\n");
      out.write("                flex-direction:column;\n");
      out.write("                align-items:center;\n");
      out.write("                background-color: rgb(240,240,240);\n");
      out.write("            }\n");
      out.write("            .container{\n");
      out.write("                height: 95%;\n");
      out.write("                width: 65%;\n");
      out.write("                /* border: solid 1px rgb(80,80,80); */\n");
      out.write("                display:flex;\n");
      out.write("                justify-content: space-evenly;\n");
      out.write("                flex-direction:column;\n");
      out.write("                align-items:center;\n");
      out.write("            }\n");
      out.write("            @import url('https://fonts.googleapis.com/css?family=Lato|Nunito|Roboto+Mono');\n");
      out.write("            .box1{\n");
      out.write("                height: 30%;\n");
      out.write("                width: 100%;\n");
      out.write("                background-color: rgb(235,235,235);\n");
      out.write("                box-shadow: 0 2px 20px 20px rgba(80, 80, 80,0.5);\n");
      out.write("                font-family: 'Lato', sans-serif;\n");
      out.write("                color: rgb(60,60,60);\n");
      out.write("                letter-spacing: 2px;\n");
      out.write("                padding-left: 5%;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("                display:flex;\n");
      out.write("                justify-content: center;\n");
      out.write("                flex-direction:column;\n");
      out.write("                align-items:center;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("            .detail{\n");
      out.write("                width:50%;\n");
      out.write("            }\n");
      out.write("            .detail h2{\n");
      out.write("                position: relative;\n");
      out.write("                left: -5%;\n");
      out.write("                text-align: center;\n");
      out.write("                font-size: 30px;\n");
      out.write("                font-family: 'Nunito', sans-serif;\n");
      out.write("            }\n");
      out.write("            .detail div{\n");
      out.write("                width:100%;\n");
      out.write("                /* border:solid 1px black; */\n");
      out.write("                display:flex;\n");
      out.write("                justify-content: space-between;\n");
      out.write("                flex-direction:row;\n");
      out.write("                align-items:center;\n");
      out.write("            }\n");
      out.write("            .detail div p{\n");
      out.write("                font-weight: 600;\n");
      out.write("                text-align:center;\n");
      out.write("                width:50%;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("            }\n");
      out.write("            .detail div span{\n");
      out.write("                width:50%;\n");
      out.write("                text-align:left;\n");
      out.write("                position: relative;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("            }\n");
      out.write("            .detail div span::after{\n");
      out.write("                content: '';\n");
      out.write("                position: absolute;\n");
      out.write("                left: -14%;\n");
      out.write("                top:-5px;\n");
      out.write("                width:1px;\n");
      out.write("                height: 30px;\n");
      out.write("                background-color: rgb(100,100,100);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .box2{\n");
      out.write("                height: 60%;\n");
      out.write("                width: 100%;\n");
      out.write("                /* border: solid 1px rgb(40,0,190); */\n");
      out.write("                box-shadow: 0 2px 20px 20px rgba(80, 80, 80,0.5);\n");
      out.write("                display:flex;\n");
      out.write("                justify-content: center;\n");
      out.write("                flex-direction:column;\n");
      out.write("                align-items:center;\n");
      out.write("            }\n");
      out.write("            .header{\n");
      out.write("                color: rgb(50,50,50);\n");
      out.write("                font-family: 'Nunito', sans-serif;\n");
      out.write("                letter-spacing: 1px;\n");
      out.write("            }\n");
      out.write("            .list{\n");
      out.write("                height:90%;\n");
      out.write("                width:100%;\n");
      out.write("                display:flex;\n");
      out.write("                justify-content: center;\n");
      out.write("                flex-direction:row;\n");
      out.write("                align-items:center;\n");
      out.write("            }\n");
      out.write("            .side1{\n");
      out.write("                height:100%;\n");
      out.write("                width:50%;\n");
      out.write("                /* border:solid 1px black; */\n");
      out.write("                color: rgb(90,90,90);\n");
      out.write("                display:flex;\n");
      out.write("                justify-content: flex-start;\n");
      out.write("                flex-direction:column;\n");
      out.write("                align-items:flex-end;\n");
      out.write("                padding: 10px;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("                letter-spacing: 0.5px;\n");
      out.write("            }\n");
      out.write("            .side1 h3{\n");
      out.write("                margin:0;\n");
      out.write("                padding: 10px 20px;\n");
      out.write("                margin-bottom: 5px;\n");
      out.write("                cursor: none;\n");
      out.write("            }\n");
      out.write("            .side2{\n");
      out.write("                height:100%;\n");
      out.write("                width:50%;\n");
      out.write("                /* border:solid 1px black; */\n");
      out.write("                color: rgb(90,90,90);\n");
      out.write("                display:flex;\n");
      out.write("                justify-content: flex-start;\n");
      out.write("                flex-direction:column;\n");
      out.write("                align-items:flex-start;\n");
      out.write("                padding: 10px;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("                letter-spacing: 0.5px;\n");
      out.write("            }\n");
      out.write("            .side2 button{\n");
      out.write("                border: solid 1px rgba(0,190,0,0.8);\n");
      out.write("                color: rgba(0,190,0,1);\n");
      out.write("                font-size: 16px;\n");
      out.write("                background-color:transparent;\n");
      out.write("                font-family: 'Roboto Mono', monospace;\n");
      out.write("                font-weight: bold;\n");
      out.write("                padding: 10px 20px;\n");
      out.write("                cursor: pointer;\n");
      out.write("                transition-duration: .2s;\n");
      out.write("                margin-bottom: 5px;\n");
      out.write("            }\n");
      out.write("            .side2 button:hover{\n");
      out.write("                box-shadow: 0 0 10px 1px rgba(0,190,0,0.3);\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"menu-btn\" onClick=\"openClose()\">\n");
      out.write("            <span></span>\n");
      out.write("            <span></span>\n");
      out.write("            <span></span>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"menu\">\n");
      out.write("            <div class=\"menu-content\">\n");
      out.write("                <button class=\"btn\" type=\"button\" name=\"button\">HOME</button>\n");
      out.write("                <button class=\"btn\" type=\"button\" name=\"button\">COURSES</button>\n");
      out.write("                <button class=\"btn\" type=\"button\" name=\"button\">PROFILE</button>\n");
      out.write("                <button class=\"btn\" type=\"button\" name=\"button\">SETTING</button>\n");
      out.write("                <button class=\"btn\" type=\"button\" name=\"button\">EXTRA</button>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script type=\"text/javascript\" src=\"script/home.js\"></script>\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"box1\">\n");
      out.write("                <div class=\"profile\"></div>\n");
      out.write("                <div class=\"detail\">\n");
      out.write("                    <h2>Parmjot</h2>\n");
      out.write("                    <div><p>Email</p><span>parmjot@gmail.com</span></div>\n");
      out.write("                    <div><p>Contact</p><span>8888888888</span></div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"box2\">\n");
      out.write("                ");

                    CourseDAO cd = new CourseDAO();
                    List<Course> l = cd.getExam();
                
      out.write("\n");
      out.write("                <div class=\"header\"><h2>COURSES</h2></div>\n");
      out.write("                <div class=\"list\">\n");
      out.write("                    <div class=\"side1\">\n");
      out.write("                        ");
for (Course i : l) {
      out.write("\n");
      out.write("                            <h3>");
      out.print(i.getCourse());
      out.write("</h3>\n");
      out.write("                        ");
}
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <form class=\"side2\">\n");
      out.write("                        ");
for (Course i : l) {
      out.write("\n");
      out.write("                            <button type=\"submit\" name=\"button\">Check Result</button>\n");
      out.write("                        ");
}
      out.write("\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
