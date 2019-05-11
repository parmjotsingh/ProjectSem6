package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Stop;
import model.StopDAO;
import model.BusRouteDAO;
import java.util.List;
import model.BusRoute;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
 int j = 0; 
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\" dir=\"ltr\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <title></title>\n");
      out.write("\n");
      out.write("        <style media=\"screen\">\n");
      out.write("            body{\n");
      out.write("                margin:0;\n");
      out.write("                background:black;\n");
      out.write("                /* overflow-x: hidden; */\n");
      out.write("            }\n");
      out.write("            .container{\n");
      out.write("                display:flex;\n");
      out.write("                flex-direction:column;\n");
      out.write("            }\n");
      out.write("            .row1,.row2{\n");
      out.write("                /* flex-wrap: wrap; */\n");
      out.write("                display:flex;\n");
      out.write("                flex-direction:row;\n");
      out.write("                justify-content: space-around;\n");
      out.write("                background-color:inherit;\n");
      out.write("            }\n");
      out.write("            .box{\n");
      out.write("                font-family: 'Roboto Slab';\n");
      out.write("                width:100%;\n");
      out.write("                display:flex;\n");
      out.write("                justify-content:center;\n");
      out.write("                align-items:center;\n");
      out.write("                height:400px;\n");
      out.write("                background-color: black ;\n");
      out.write("            }\n");
      out.write("            .box:hover{\n");
      out.write("                box-shadow:0 5px 100px green;\n");
      out.write("                transform: translate(0,-5px);\n");
      out.write("                transition-duration: 0.5s;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            .box:hover .container{\n");
      out.write("                background: black;\n");
      out.write("            }\n");
      out.write("            .box h1{\n");
      out.write("                color:white;\n");
      out.write("            }\n");
      out.write("            .box .hed span::after{\n");
      out.write("                content: '\\00bb';\n");
      out.write("                opacity: 0;\n");
      out.write("                position: absolute;\n");
      out.write("                right: -150px;\n");
      out.write("            }\n");
      out.write("            .hed{\n");
      out.write("                position: relative;\n");
      out.write("            }\n");
      out.write("            .btn:hover{\n");
      out.write("                border: 2px solid #ffc400;\n");
      out.write("                border-radius: 3px;\n");
      out.write("                color: #ffc400;\n");
      out.write("                padding: 5px 10px;\n");
      out.write("                transition: 0.5s;\n");
      out.write("                background-color: transparent;\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("            .hed:hover{\n");
      out.write("                cursor: pointer;\n");
      out.write("                border: 2px solid #0fe1bc;\n");
      out.write("                border-radius: 3px;\n");
      out.write("                color: #0fe1bc;\n");
      out.write("                padding: 5px 10px;\n");
      out.write("                background-color: transparent;\n");
      out.write("            }\n");
      out.write("            .box:hover .hed{\n");
      out.write("                transform: rotate(360deg);\n");
      out.write("                transition-duration: 0.5s;\n");
      out.write("            }\n");
      out.write("            .box:hover .hed span::after{\n");
      out.write("                content: '\\00bb';\n");
      out.write("                opacity: 1;\n");
      out.write("                transition-duration: 1s;\n");
      out.write("                transform: rotate(-360deg);\n");
      out.write("                right: -30px;\n");
      out.write("            }\n");
      out.write("            .clock{\n");
      out.write("                position:absolute;\n");
      out.write("                height:300px;\n");
      out.write("                width:300px;\n");
      out.write("                background-color:rgb(250,250,250,0.1);\n");
      out.write("                border-radius:50%;\n");
      out.write("                display:flex;\n");
      out.write("                justify-content:center;\n");
      out.write("                background:url(\"images.png\");\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("                background-position: center;\n");
      out.write("                background-size: cover;\n");
      out.write("                opacity: 0;\n");
      out.write("            }\n");
      out.write("            .box:hover .clock{\n");
      out.write("                opacity: 0.6;\n");
      out.write("                transition-delay:0s;\n");
      out.write("                transition-duration: 1s;\n");
      out.write("            }\n");
      out.write("            .second{\n");
      out.write("                width: 1px;\n");
      out.write("                height: 135px;\n");
      out.write("                color: red;\n");
      out.write("                top:4%;\n");
      out.write("                transform-origin: bottom;\n");
      out.write("                border: solid;\n");
      out.write("                opacity: 1;\n");
      out.write("                position:absolute;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .minute{\n");
      out.write("                width: 3px;\n");
      out.write("                height: 140px;\n");
      out.write("                color: green;\n");
      out.write("                transform-origin: bottom;\n");
      out.write("                border: solid;\n");
      out.write("                opacity: 1;\n");
      out.write("                position:absolute;\n");
      out.write("                top:2%;\n");
      out.write("            }\n");
      out.write("            .hour{\n");
      out.write("                width: 5px;\n");
      out.write("                height: 100px;\n");
      out.write("                color: blue;\n");
      out.write("                top:16%;\n");
      out.write("                transform-origin: bottom;\n");
      out.write("                border: solid;\n");
      out.write("                opacity: 1;\n");
      out.write("                position:absolute;\n");
      out.write("            }\n");
      out.write("            .clock canvas {\n");
      out.write("                position:absolute;\n");
      out.write("                width:100%;\n");
      out.write("                height:100%;\n");
      out.write("                z-index:-1;\n");
      out.write("                display: block;\n");
      out.write("            }\n");
      out.write("            #forStops{\n");
      out.write("                position: absolute;\n");
      out.write("                height: 90vh;\n");
      out.write("                width:  90vw;\n");
      out.write("                background-image:  linear-gradient(141deg, #9fb8ad 0%, #1fc8db 51%, #2cb5e8 75%);\n");
      out.write("                left: 50%;\n");
      out.write("                top: 150%;\n");
      out.write("                transform: translate(-50%,-30%);\n");
      out.write("                display: none;\n");
      out.write("                /*justify-content: center;*/\n");
      out.write("                align-items: center;\n");
      out.write("                flex-direction: column;\n");
      out.write("            }\n");
      out.write("            #forStops thead tr{\n");
      out.write("                background-color: whitesmoke;\n");
      out.write("            }\n");
      out.write("            #forStops table{\n");
      out.write("                border: solid black 3px;\n");
      out.write("                border-radius: 3px;\n");
      out.write("                padding: 5px;\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("            #forStops tbody tr{\n");
      out.write("                width:100%;\n");
      out.write("            }\n");
      out.write("            #forStops tbody tr td{\n");
      out.write("                width:20%;\n");
      out.write("                height: 50px;\n");
      out.write("            }\n");
      out.write("            #closeStops {\n");
      out.write("                position: absolute;\n");
      out.write("                width:  30px;\n");
      out.write("                height: 30px;\n");
      out.write("                border: solid black 2px;\n");
      out.write("                border-radius: 2px;\n");
      out.write("                right: 20px;\n");
      out.write("                top: 20px;\n");
      out.write("                transition-duration: 1s;\n");
      out.write("            }\n");
      out.write("            #closeStops span:nth-child(1){\n");
      out.write("                position: absolute;\n");
      out.write("                width:25px;\n");
      out.write("                height: 3px;\n");
      out.write("                background-color: black;\n");
      out.write("                border:black;\n");
      out.write("                left:50%;\n");
      out.write("                top:50%;\n");
      out.write("                transform: translate(-50%,-50%) rotate(-45deg);\n");
      out.write("                transition-duration: 1s;\n");
      out.write("            }\n");
      out.write("            #closeStops span:nth-child(2){\n");
      out.write("                position: absolute;\n");
      out.write("                width:25px;\n");
      out.write("                height: 3px;\n");
      out.write("                background-color: black;\n");
      out.write("                border:black;\n");
      out.write("                left:50%;\n");
      out.write("                top:50%;\n");
      out.write("                transform: translate(-50%,-50%) rotate(45deg);\n");
      out.write("                transition-duration: 1s;\n");
      out.write("            }\n");
      out.write("            #closeStops:hover span:nth-child(2){\n");
      out.write("                transform:translate(-50%,-50%)  rotate(-135deg);\n");
      out.write("            }\n");
      out.write("            .inpst{\n");
      out.write("                display: inline-block;padding:5px 10px;\n");
      out.write("                background-image: linear-gradient(141deg ,black, grey);\n");
      out.write("                border: none;\n");
      out.write("                border-bottom: solid 2px black;\n");
      out.write("                color:white;\n");
      out.write("                font-size: 18px;\n");
      out.write("                padding: 3px 5px;\n");
      out.write("            }\n");
      out.write("            .inpstbtn{\n");
      out.write("                padding: 3px 10px;\n");
      out.write("                letter-spacing: 2px;\n");
      out.write("                font-weight: 700;\n");
      out.write("                border: none;\n");
      out.write("                background-image: none;\n");
      out.write("                background-color: black;\n");
      out.write("                color:white;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <script src=\"script/jquery.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                $(\"#info-Search-bar\").on(\"keyup\", function () {\n");
      out.write("                    var value = $(this).val().toLowerCase();\n");
      out.write("                    $(\"#mytable1 tr\").filter(function () {\n");
      out.write("                        console.log($(\"#mytable1 tr\").text().toLowerCase());\n");
      out.write("                        $(this).toggle($(this).children(\"td:nth-child(1)\").text().toLowerCase().indexOf(value) > -1);\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("                $(\"#infoCenter-Search-btn\").on(\"click\", function () {\n");
      out.write("                    var value = $(\"#infoCenter-Search-bar\").val().toLowerCase();\n");
      out.write("                    $(\"#mytable2 tr\").filter(function () {\n");
      out.write("                        console.log($(this).children(\"td:nth-child(4)\").text().toLowerCase());\n");
      out.write("                        $(this).toggle($(this).children(\"td:nth-child(4)\").text().toLowerCase().indexOf(value) > -1);\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("                $('#infoCenter-frm input').on('keypress', function (e) {\n");
      out.write("                    return e.which !== 13;\n");
      out.write("                });\n");
      out.write("                $(\"#slctStp,#option4,.routeid\").on(\"click\", function () {\n");
      out.write("                    var value = $(\"#slctStp\").val().toLowerCase();\n");
      out.write("                    $(\"#tbl4bdy tr\").filter(function () {\n");
      out.write("                        console.log($(this).children(\"td:nth-child(2)\").text().toLowerCase());\n");
      out.write("                        $(this).toggle($(this).children(\"td:nth-child(2)\").text().toLowerCase().indexOf(value) > -1);\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("                $(function () {\n");
      out.write("                    var value = $(\"#slctStp\").val().toLowerCase();\n");
      out.write("                    $(\"#tbl4bdy tr\").filter(function () {\n");
      out.write("                        console.log($(this).children(\"td:nth-child(2)\").text().toLowerCase());\n");
      out.write("                        $(this).toggle($(this).children(\"td:nth-child(2)\").text().toLowerCase().indexOf(value) > -1);\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("                $('#frm1,#frm2,#frm3 input').on('keypress', function (e) {\n");
      out.write("                    return e.which !== 13;\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Crete+Round\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Roboto+Slab\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Rakkas\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Concert+One\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"http://fonts.googleapis.com/css?family=Permanent+Marker\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/navigation.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/parallax.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/info.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/infoCenter.css\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"effect\" id=\"img\">\n");
      out.write("            <h1 id=\"wel\" class=\"welcome\">Welcome</h1>\n");
      out.write("            <div id=\"img1\" class=\"img1\"></div>\n");
      out.write("            <div id=\"img2\" class=\"img2\"></div>\n");
      out.write("            <div id=\"img3\" class=\"img3\"></div>\n");
      out.write("            <script type=\"text/javascript\" src=\"script/parallax.js\"></script>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"nav\">\n");
      out.write("            <div class=\"navLeft\">\n");
      out.write("                <div class=\"navElementL\">\n");
      out.write("                    <button type=\"button\"class=\"navbtn\" name=\"button\">Home</button>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"navElementL\">\n");
      out.write("                    <button type=\"button\"class=\"navbtn\" name=\"button\">Contact US</button>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"navElementL\">\n");
      out.write("                    <button type=\"button\"class=\"navbtn\" name=\"button\">Routes</button>\n");
      out.write("                    <div class=\"content\" >\n");
      out.write("                        ");

                            BusRouteDAO bdao = new BusRouteDAO();
                            List<BusRoute> ll = bdao.busList();
                            //              List<BusRoute> l= (List<BusRoute>)request.getAttribute("list");
                            if (ll != null) {
                                int c=0;
                                for (BusRoute i : ll) {
                                    
                        
      out.write("\n");
      out.write("                        <a href=\"#forStops\" class=\"routeid\"  onclick=\"displayStops(");
      out.print(c);
      out.write(")\" >");
      out.print(i.getPlace());
      out.write(' ');
      out.print(i.getRoute());
      out.write("</a>\n");
      out.write("                        ");
       c++;   }
                            }
      out.write("\n");
      out.write("                        <script type=\"text/javascript\" src=\"script/home.js\"></script>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"navRight\">\n");
      out.write("                ");
 HttpSession s = request.getSession();
                    String username = (String) s.getAttribute("un");
                    System.out.println(username);
                    if (username == null) {
                
      out.write("\n");
      out.write("                <div class=\"navElement\">\n");
      out.write("                    <button type=\"button\" class=\"navbtn\" name=\"button\" >Login</button>\n");
      out.write("                </div>\n");
      out.write("                ");

                } else {
                
      out.write("\n");
      out.write("                <div class=\"navElement\">\n");
      out.write("                    <button type=\"button\" class=\"navbtn\" name=\"button\" disabled>");
      out.print(username);
      out.write("</button>\n");
      out.write("                </div>\n");
      out.write("                ");

                    }
                
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"navElement\">\n");
      out.write("                    <button type=\"button\"class=\"navbtn\" name=\"button\">Extra</button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- <div class=\"info-right\">\n");
      out.write("          fsdfsd\n");
      out.write("        </div> -->\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row1\">\n");
      out.write("                <div class=\"box\">\n");
      out.write("                    <h1 class=\"hed\" onclick=\"showInfo()\"><span>Bus Routes</span></h1>\n");
      out.write("                    <script type=\"text/javascript\" src=\"script/info.js\"></script>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"box\" id=\"slide-left\">\n");
      out.write("                    <div class=\"clock\" id=\"clock\">\n");
      out.write("                        <span class=\"minute\" id=\"minuteHand\"></span>\n");
      out.write("                        <span class=\"hour\" id=\"hourHand\"></span>\n");
      out.write("                        <span class=\"second\" id=\"secondHand\"></span>\n");
      out.write("                        <script type=\"text/javascript\" src=\"script/scriptTime.js\" ></script>\n");
      out.write("                        <script src=\"script/scriptTimeP5.js\"></script>\n");
      out.write("                    </div>\n");
      out.write("                    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/p5.js/0.7.2/p5.min.js\"></script>\n");
      out.write("                    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/p5.js/0.7.2/addons/p5.dom.min.js\"></script>\n");
      out.write("                    <!-- <script src=\"https://cdnjs.cloudflare.com/ajax/libs/p5.js/0.7.2/addons/p5.sound.min.js\"></script> -->\n");
      out.write("\n");
      out.write("                    <h1 class=\"hed2\">\n");
      out.write("                        Timings\n");
      out.write("                    </h1>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"info-right\" id=\"inf-rgt\"><!--HERE ONLY============================-->\n");
      out.write("                    <button id=\"cross\" onclick=\"closeInfo()\"><span>&#10060;</span></button>\n");
      out.write("                    <form id=\"info-frm\"  method=\"post\"> <!--action=\"RouteSearchServlet\" --> \n");
      out.write("                        <input id=\"info-Search-bar\" type=\"text\" name=\"routeNo\" value=\"\" maxlength=\"3\" min=\"100\"placeholder=\"🔍eg. '101'\"></input>\n");
      out.write("                        <!--                                                <select id=\"info-select\" name=\"place\">\n");
      out.write("                                                                            <option value=\"ALL\">ALL</option>\n");
      out.write("                                                                            <option value=\"CHD\">Chandigarh</option>\n");
      out.write("                                                                            <option value=\"MHL\">Mohali</option>\n");
      out.write("                                                                            <option value=\"NAL\">Nalagarh</option>\n");
      out.write("                                                                        </select>-->\n");
      out.write("                        <!--<button id=\"info-Search-btn\" name=\"button\">Search</button>-->\n");
      out.write("                    </form>\n");
      out.write("                    <table>\n");
      out.write("                        <thead>\n");
      out.write("                            <tr class=\"info-tr\">\n");
      out.write("                                <th>Bus Route</th>\n");
      out.write("                                <th>Place</th>\n");
      out.write("                                <th>Driver</th>\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody id=\"mytable1\">\n");
      out.write("                            ");

                                BusRouteDAO bd = new BusRouteDAO();
                                List<BusRoute> l = bd.busList();
                                //              List<BusRoute> l= (List<BusRoute>)request.getAttribute("list");
                                if (l != null) {
                                    for (BusRoute i : l) {
                            
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td>");
      out.print(i.getRoute());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(i.getPlace());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(i.getDriverName());
      out.write("</td>\n");
      out.write("                            </tr>\n");
      out.write("                            ");
}
                                }
      out.write("\n");
      out.write("                        </tbody>\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row2\">\n");
      out.write("                <div class=\"box\">\n");
      out.write("                    <h1 class=\"btn\" onclick=\"showInfoCenter()\">Bus Number</h1>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"box\">\n");
      out.write("                    <h1 onclick=\"displayStops()\">Bus Stops</h1>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"\" id=\"info-center\"><!--here only-->\n");
      out.write("                <span onclick=\"closeInfoCenter()\">&#9932;</span>\n");
      out.write("                <form id=\"infoCenter-frm\" action=\"\" method=\"post\" onsubmit=\"false\">\n");
      out.write("                    <input id=\"infoCenter-Search-bar\" type=\"text\" name=\"\" value=\"\" placeholder=\"🚌 eg. 'HR 0* AB 1234'\"></input>\n");
      out.write("                    <button id=\"infoCenter-Search-btn\" type=\"button\" name=\"button\">🔍</button>\n");
      out.write("                </form>\n");
      out.write("                <table>\n");
      out.write("                    <tr class=\"info-tr\">\n");
      out.write("                        <th>S.No</th>\n");
      out.write("                        <th>Driver</th>\n");
      out.write("                        <th>Bus Route</th>\n");
      out.write("                        <th>Bus Number</th>\n");
      out.write("                    </tr>\n");
      out.write("                    ");

                        if (l != null) {
                            j = 0;
                            for (BusRoute i : l) {
                                j++;
                    
      out.write("\n");
      out.write("                    <tbody id=\"mytable2\">\n");
      out.write("                        <tr>\n");
      out.write("                            <td>");
      out.print(j);
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(i.getDriverName());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(i.getPlace());
      out.write(' ');
      out.print(i.getRoute());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(i.getBusNumber());
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                        ");
  }
                            }
      out.write("\n");
      out.write("                    </tbody> \n");
      out.write("                </table>\n");
      out.write("                <script type=\"text/javascript\" src=\"script/infoCenter.js\"></script>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("                    \n");
      out.write("        ");

            String dspType = (String) session.getAttribute("displayType");
            if (dspType == null) {
                dspType = "none";
            }
            session.removeAttribute("displayType");
        
      out.write("\n");
      out.write("        <div id=\"forStops\" style=\"display:");
      out.print(dspType);
      out.write("\">\n");
      out.write("            ");

                if (dspType.equals("flex")) {
                    dspType = null;
                }
            
      out.write("\n");
      out.write("            <span id=\"closeStops\" onclick=\"closeStops()\" >\n");
      out.write("                <span></span>\n");
      out.write("                <span></span>\n");
      out.write("            </span>\n");
      out.write("            <h2>Route NO \n");
      out.write("                <form style=\"display: inline-block;\">\n");
      out.write("                    <select id=\"slctStp\" style=\"padding: 5px 10px;\">\n");
      out.write("                        ");
BusRouteDAO obj = new BusRouteDAO();
                            List<BusRoute> list = obj.busList();
                            for (BusRoute i : list) {
                        
      out.write("\n");
      out.write("                        <option value=\"");
      out.print(i.getRoute());
      out.write('"');
      out.write('>');
      out.print(i.getRoute());
      out.write("</option>\n");
      out.write("                        ");
}
      out.write("\n");
      out.write("                    </select>\n");
      out.write("                </form>\n");
      out.write("            </h2>\n");
      out.write("            <div style=\"overflow-y:auto; height:70%;width:94%;\">\n");
      out.write("                <table id=\"tbl4\">\n");
      out.write("                    <thead>\n");
      out.write("                        <tr>\n");
      out.write("                            <th>S.NO</th>\n");
      out.write("                            <th>Route</th>\n");
      out.write("                            <th>Stop</th>\n");
      out.write("                            <th>Time</th>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody id=\"tbl4bdy\">\n");
      out.write("                        ");
StopDAO sd = new StopDAO();
                            List<Stop> list2 = sd.list();
                            if (list != null) {
                                for (Stop i : list2) {
                        
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td>");
      out.print(i.getSerialNo());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(i.getRoute());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(i.getStop());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(i.getAtime());
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                        ");
}
                            }
      out.write("\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"footer\">\n");
      out.write("\n");
      out.write("        </div>\n");
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
