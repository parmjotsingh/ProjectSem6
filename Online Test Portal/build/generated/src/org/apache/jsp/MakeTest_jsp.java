package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class MakeTest_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\" dir=\"ltr\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <title></title>\n");
      out.write("    <style media=\"screen\">\n");
      out.write("      html , body{\n");
      out.write("        margin:0;\n");
      out.write("        height:100%;\n");
      out.write("        width:100%;\n");
      out.write("      }\n");
      out.write("      .main{\n");
      out.write("        position:absolute;\n");
      out.write("        left:15%;\n");
      out.write("        width:85%;\n");
      out.write("        background-color:floralwhite;\n");
      out.write("        height:100%;\n");
      out.write("        /*display:flex;*/\n");
      out.write("        justify-content: center;\n");
      out.write("        align-items: center;\n");
      out.write("        ");

            String flag =(String)session.getAttribute("CreateQuestion");
            if(flag==null || flag.equalsIgnoreCase("false")){
        
      out.write("\n");
      out.write("            display: none;\n");
      out.write("        ");
} else { 
      out.write("\n");
      out.write("            display:flex;\n");
      out.write("        ");
}
      out.write("\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      .main-container{\n");
      out.write("        background-image: linear-gradient(141deg, #9fb8ad 0%, #1fc8db 51%, #2cb5e8 75%);\n");
      out.write("        box-shadow: 0 0 10px 10px rgba(0,0,0,0.2);\n");
      out.write("        width: 90%;\n");
      out.write("        height: 80%;\n");
      out.write("        border-radius: 5px;\n");
      out.write("        position: relative;\n");
      out.write("        display:flex;\n");
      out.write("        justify-content: center;\n");
      out.write("        align-items: center;\n");
      out.write("        flex-direction: column;\n");
      out.write("        overflow: auto;\n");
      out.write("        backface-visibility:  hidden;\n");
      out.write("\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      .question{\n");
      out.write("        width: 90%;\n");
      out.write("      }\n");
      out.write("      @import url('https://fonts.googleapis.com/css?family=Heebo:500,700');\n");
      out.write("      .question,.optn h2{\n");
      out.write("        display: block;\n");
      out.write("        letter-spacing: 2px;\n");
      out.write("        font-weight: 700;\n");
      out.write("        color:rgba(50,50,50,1);\n");
      out.write("        font-family: 'Heebo', sans-serif;\n");
      out.write("        text-align: center;\n");
      out.write("      }\n");
      out.write("      .question textarea{\n");
      out.write("        /* box-shadow: 0 0 10px rgba(0, 0, 255, 0.5); */\n");
      out.write("        border-radius: 5px;\n");
      out.write("        border: inset;\n");
      out.write("        font-size: 20px;\n");
      out.write("        position: relative;\n");
      out.write("      }\n");
      out.write("      .opt1 p, .opt2 p, .opt3 p , .opt4 p{\n");
      out.write("        font-family: 'Heebo', sans-serif;\n");
      out.write("        display: inline;\n");
      out.write("        color:rgba(50,50,50,1);\n");
      out.write("        margin-right: 10px;\n");
      out.write("        font-size: 20px;\n");
      out.write("        font-weight: 600;\n");
      out.write("      }\n");
      out.write("      .opt1 , .opt2 , .opt3 , .opt4 , .opt5{\n");
      out.write("        display: flex;\n");
      out.write("        justify-content: center;\n");
      out.write("        align-items: center;\n");
      out.write("\n");
      out.write("      }\n");
      out.write("      .opt1 textarea, .opt2 textarea, .opt3 textarea, .opt4 textarea {\n");
      out.write("        border-radius: 2px;\n");
      out.write("        /*font-weight: 600;*/\n");
      out.write("        font-size: 20px;\n");
      out.write("        background-color:#323232;\n");
      out.write("        /*background-image: linear-gradient(141deg, rgba(50, 50, 50) 0%, rgba(200, 130, 85, 1) 51%, rgba(0,0,0,0.5) 75%);*/\n");
      out.write("        border:none;\n");
      out.write("        color: white;\n");
      out.write("      }\n");
      out.write("      .sbm{\n");
      out.write("        background-color:rgb(50,50,50);\n");
      out.write("        font-family: 'Heebo', sans-serif;\n");
      out.write("        height:40px;\n");
      out.write("        width:90px;\n");
      out.write("        color:white;\n");
      out.write("        font-size:18px;\n");
      out.write("        border:none;\n");
      out.write("        letter-spacing:1px;\n");
      out.write("        position:relative;\n");
      out.write("        transition-duration: .1s;\n");
      out.write("        cursor: pointer;\n");
      out.write("      }\n");
      out.write("      .sbm:hover{\n");
      out.write("        background-color:transparent;\n");
      out.write("        border:solid 2px floralwhite;\n");
      out.write("        color:rgb(50,50,50);\n");
      out.write("        box-shadow: 0 0 10px rgb(50,50,50);\n");
      out.write("      }\n");
      out.write("      .opt5{\n");
      out.write("            height:40px;\n");
      out.write("            font-weight: 600;\n");
      out.write("            font-size: 18px;\n");
      out.write("            /*background-image: linear-gradient(141deg, rgba(50, 50, 50) 0%, rgba(200, 130, 85, 1) 51%, rgba(0,0,0,0.5) 75%);*/\n");
      out.write("            border:none;\n");
      out.write("            width:200px; color:rgb(60,60,60); display: inline-block;text-align: center; background-color: rgb(240,240,240);\n");
      out.write("      }\n");
      out.write("      .requirment{\n");
      out.write("        position:absolute;\n");
      out.write("        top:50%;\n");
      out.write("        left:50%;\n");
      out.write("        width:50%;\n");
      out.write("        transform:translate(-35%,-50%);\n");
      out.write("        background-color:floralwhite;\n");
      out.write("        height:50%;\n");
      out.write("        ");

            if( flag==null || flag.equalsIgnoreCase("false")){
        
      out.write("\n");
      out.write("            display: flex;\n");
      out.write("        ");
} else { 
      out.write("\n");
      out.write("            display:none;\n");
      out.write("       ");
}
      out.write("\n");
      out.write("/*        display:flex;*/\n");
      out.write("        justify-content: center;\n");
      out.write("        align-items: center;\n");
      out.write("        transition-duration:.2s;\n");
      out.write("      }\n");
      out.write("      .requirment::before {\n");
      out.write("        transition-duration:.5s;\n");
      out.write("        content: '';\n");
      out.write("        position: absolute;\n");
      out.write("        height: 50%;\n");
      out.write("        width: 50%;\n");
      out.write("        left: 20px;\n");
      out.write("        top: 20px;\n");
      out.write("        transform: skew(3deg,3deg);\n");
      out.write("        background-color: rgb(191, 63, 135);\n");
      out.write("        box-shadow: 0 0 20px 7px rgba(191, 63, 135, 0.92);\n");
      out.write("      }\n");
      out.write("      .requirment::after{\n");
      out.write("        transition-duration:.5s;\n");
      out.write("        content: '';\n");
      out.write("        position: absolute;\n");
      out.write("        height: 50%;\n");
      out.write("        width: 50%;\n");
      out.write("        right: 20px;\n");
      out.write("        bottom: 20px;\n");
      out.write("        transform: skew(3deg,3deg);\n");
      out.write("        background-color: rgba(63, 72, 191, 1);\n");
      out.write("        z-index: -1;\n");
      out.write("        box-shadow: 0 0 20px 7px rgba(63, 72, 191, 0.92);\n");
      out.write("      }\n");
      out.write("      .requirment:hover::before{\n");
      out.write("        left: -5px;\n");
      out.write("        top: -5px;\n");
      out.write("      }\n");
      out.write("      .requirment:hover::after{\n");
      out.write("        right: -5px;\n");
      out.write("        bottom: -5px;\n");
      out.write("      }\n");
      out.write("      .requirment form{\n");
      out.write("        position:absolute;\n");
      out.write("        width:100%;\n");
      out.write("        height:100%;\n");
      out.write("        display:flex;\n");
      out.write("        background-color:rgba(30,30,30,1);\n");
      out.write("        box-shadow: 0 0 20px 7px rgba(30,30,30,0.6);\n");
      out.write("        /* border:solid black 2px; */\n");
      out.write("        justify-content: center;\n");
      out.write("        align-items: center;\n");
      out.write("        flex-direction:column;\n");
      out.write("      }\n");
      out.write("      .requirment form input{\n");
      out.write("        margin:20px 10px;\n");
      out.write("        background-color:transparent;\n");
      out.write("        border:none;\n");
      out.write("        padding: 10px 20px;\n");
      out.write("        text-align: center;\n");
      out.write("        width: 400px;\n");
      out.write("        height: 50px;\n");
      out.write("        font-size: 20px;\n");
      out.write("        color:rgba(240,240,240,0.9);\n");
      out.write("        box-sizing: border-box;\n");
      out.write("        outline: none;\n");
      out.write("      }\n");
      out.write("      .requirment form input:nth-child(1){\n");
      out.write("        border-bottom: solid 3px rgba(191, 63, 135, 0.92);\n");
      out.write("        text-shadow: 0 0 3px rgba(191, 63, 135, 0.92);\n");
      out.write("      }\n");
      out.write("      .requirment form input:nth-child(2){\n");
      out.write("        border-bottom: solid 3px rgba(63, 72, 191, 0.92);\n");
      out.write("        text-shadow: 0 0 3px rgba(63, 72, 191, 0.92);\n");
      out.write("      }\n");
      out.write("      .requirment form input:nth-child(3){\n");
      out.write("        color: rgba(72, 191, 63, 0.92);\n");
      out.write("        transition-duration: .3s;\n");
      out.write("        font-size: 20px;\n");
      out.write("        border: solid 1px rgba(72, 191, 63, 0.82);\n");
      out.write("        position: relative;\n");
      out.write("        width: 200px;\n");
      out.write("        cursor: pointer;\n");
      out.write("      }\n");
      out.write("      .requirment form input:nth-child(3):hover{\n");
      out.write("        letter-spacing: 2px;\n");
      out.write("        font-size: 22px;\n");
      out.write("        text-shadow: 0 0 1px rgba(72, 191, 63, 0.92), 0 0 1px rgba(240,240,240, 0.92);\n");
      out.write("\n");
      out.write("      }\n");
      out.write("      textarea::placeholder { \n");
      out.write("        color: rgb(240,240,240);\n");
      out.write("      }\n");
      out.write("      .question textarea::placeholder { \n");
      out.write("        color: rgb(150,150,150);\n");
      out.write("      }\n");
      out.write("    </style>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/navigationBar.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/sidebar.css\">\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <div class=\"menu-btn\" onClick=\"openClose()\">\n");
      out.write("      <span></span>\n");
      out.write("      <span></span>\n");
      out.write("      <span></span>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"menu\">\n");
      out.write("      <div class=\"menu-content\">\n");
      out.write("        <button class=\"btn\" type=\"button\" name=\"button\">HOME</button>\n");
      out.write("        <button class=\"btn\" type=\"button\" name=\"button\">COURSES</button>\n");
      out.write("        <button class=\"btn\" type=\"button\" name=\"button\">PROFILE</button>\n");
      out.write("        <button class=\"btn\" type=\"button\" name=\"button\">SETTING</button>\n");
      out.write("        <button class=\"btn\" type=\"button\" name=\"button\">EXTRA</button>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"sideBar\" style=\"position:absolute;z-index:1;\">\n");
      out.write("      <span>\n");
      out.write("        <p class=\"arr\" onClick=\"tgl()\">CLOSE</p>\n");
      out.write("      </span>\n");
      out.write("      <script type=\"text/javascript\" src=\"script/makeTest.js\"></script>\n");
      out.write("      <div class=\"crs-name\">\n");
      out.write("          ");

              String s=(String)session.getAttribute("CourseName");
              System.out.println(s);
              if(s == null ){
      out.write("\n");
      out.write("                <p>COURSE NAME</p>\n");
      out.write("                ");
}
              else{
      out.write("\n");
      out.write("                   <p>");
      out.print(s);
      out.write("</p>\n");
      out.write("                ");
}
      out.write("\n");
      out.write("      </div>\n");
      out.write("      <div style=\"flex:12;width: 100%;\">\n");
      out.write("        <div class=\"que-counter\">\n");
      out.write("          <h2>Questions</h2>\n");
      out.write("          ");

              if(flag!=null && flag.equalsIgnoreCase("true")){
              int questionNumber= Integer.parseInt(session.getAttribute("QuestionNumber").toString()) ;
              for(int i=1; i<=questionNumber ;i++){
      out.write("\n");
      out.write("              <form action=\"ShowQuestionServlet\" target=\"_blank\"><button type=\"submit\" name=\"quesNum\" value=\"");
      out.print(i);
      out.write('"');
      out.write('>');
      out.print(i);
      out.write("</button></form>\n");
      out.write("          ");
}}
      out.write("\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <form class=\"endbtn\" action=\"index.html\" method=\"post\">\n");
      out.write("        <input type=\"submit\" name=\"\" value=\"END\">\n");
      out.write("      </form>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"main\">\n");
      out.write("        <form action=\"QuestionPaperServlet\" class=\"main-container\">\n");
      out.write("\n");
      out.write("        <div class=\"question\">\n");
      out.write("          <h2>Question:</h2>\n");
      out.write("          <textarea rows = \"5\" cols = \"80\" name = \"question\" placeholder=\"Enter your Question...\" required></textarea>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"optn\">\n");
      out.write("          <h2>Options:</h2>\n");
      out.write("\n");
      out.write("          <div class=\"opt1\">\n");
      out.write("            <p>1: </p>\n");
      out.write("            <textarea rows = \"1\" cols = \"50\" name = \"optn1\" placeholder=\"   OPTION 1\" required></textarea>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"opt2\">\n");
      out.write("            <p>2: </p>\n");
      out.write("            <textarea rows = \"1\" cols = \"50\" name = \"optn2\" placeholder=\"   OPTION 2\"  required></textarea>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"opt3\">\n");
      out.write("            <p>3: </p>\n");
      out.write("            <textarea rows = \"1\" cols = \"50\" name = \"optn3\" placeholder=\"   OPTION 3\" required></textarea>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"opt4\">\n");
      out.write("            <p>4: </p>\n");
      out.write("            <textarea rows = \"1\" cols = \"50\" name = \"optn4\" placeholder=\"   OPTION 4\" required></textarea>\n");
      out.write("          </div>\n");
      out.write("          <div style=\"display:flex; align-items: center;justify-content: center;\"><input class=\"opt5\" type=\"number\" name=\"ans\" value=\"\" placeholder=\"ANSWER OPTION\" min=\"1\" max=\"4\">  \n");
      out.write("        <input class=\"sbm\" type=\"submit\" name=\"\" value=\"Submit\"></div>\n");
      out.write("      </form>\n");
      out.write("    </div>\n");
      out.write("          </div>     \n");
      out.write("    <div class=\"requirment\">\n");
      out.write("      <form name=\"createTest\" class=\"\" action=\"createTestServlet\" method=\"post\" >\n");
      out.write("        <input type=\"text\" name=\"course\" value=\"\" placeholder=\"ENTER COURSE NAME OR CODE\" required>\n");
      out.write("        <input type=\"number\" name=\"ques\" value=\"\" placeholder=\"ENTER NUMBER OF QUESTION\" required>\n");
      out.write("        <input type=\"submit\" name=\"\" value=\"Submit\" onclick=\"changeToQues()\">\n");
      out.write("      </form>\n");
      out.write("    </div>        \n");
      out.write("  </body>\n");
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
