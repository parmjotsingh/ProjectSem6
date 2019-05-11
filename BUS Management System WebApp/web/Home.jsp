<%-- 
    Document   : Home
    Created on : 26 Mar, 2019, 12:45:20 PM
    Author     : Parmjot Singh chahal
--%>

<%@page import="model.Stop"%>
<%@page import="model.StopDAO"%>
<%@page import="model.BusRouteDAO"%>
<%@page import="java.util.List"%>
<%@page import="model.BusRoute"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% int j = 0; %>
<!DOCTYPE html>

                <% HttpSession s = request.getSession();
                    String username = (String) s.getAttribute("un");
                    System.out.println("======================================username "+username);
                    if (username == null) {
                        response.sendRedirect("newLogin.html");
                    }
                    else if(((String) s.getAttribute("un")).equalsIgnoreCase("admin")){
                        response.sendRedirect("admin.jsp");
                    }
                %>


<html lang="en" dir="ltr">
    <head>
        <meta charset="utf-8">
        <title></title>

        <style media="screen">
            body{
                margin:0;
                background:black;
                 overflow-x: hidden; 
            }
            .container{
                display:flex;
                flex-direction:column;
            }
            .row1,.row2{
                /* flex-wrap: wrap; */
                display:flex;
                flex-direction:row;
                justify-content: space-around;
                background-color:inherit;
            }
            .box{
                font-family: 'Roboto Slab';
                width:100%;
                display:flex;
                justify-content:center;
                align-items:center;
                height:400px;
                background-color: black ;
            }
            .box:hover{
                box-shadow:0 5px 100px green;
                transform: translate(0,-5px);
                transition-duration: 0.5s;

            }
            .box:hover .container{
                background: black;
            }
            .box h1{
                color:white;
            }
            .box .hed span::after{
                content: '\00bb';
                opacity: 0;
                position: absolute;
                right: -150px;
            }
            .hed{
                position: relative;
            }
            .btn:hover{
                border: 2px solid #ffc400;
                border-radius: 3px;
                color: #ffc400;
                padding: 5px 10px;
                transition: 0.5s;
                background-color: transparent;
                cursor: pointer;
            }
            .hed:hover{
                cursor: pointer;
                border: 2px solid #0fe1bc;
                border-radius: 3px;
                color: #0fe1bc;
                padding: 5px 10px;
                background-color: transparent;
            }
            .box:hover .hed{
                transform: rotate(360deg);
                transition-duration: 0.5s;
            }
            .box:hover .hed span::after{
                content: '\00bb';
                opacity: 1;
                transition-duration: 1s;
                transform: rotate(-360deg);
                right: -30px;
            }
            .clock{
                position:absolute;
                height:300px;
                width:300px;
                background-color:rgb(250,250,250,0.1);
                border-radius:50%;
                display:flex;
                justify-content:center;
                background:url("images.png");
                background-repeat: no-repeat;
                background-position: center;
                background-size: cover;
                opacity: 0;
            }
            .box:hover .clock{
                opacity: 0.6;
                transition-delay:0s;
                transition-duration: 1s;
            }
            .second{
                width: 1px;
                height: 135px;
                color: red;
                top:4%;
                transform-origin: bottom;
                border: solid;
                opacity: 1;
                position:absolute;
            }

            .minute{
                width: 3px;
                height: 140px;
                color: green;
                transform-origin: bottom;
                border: solid;
                opacity: 1;
                position:absolute;
                top:2%;
            }
            .hour{
                width: 5px;
                height: 100px;
                color: blue;
                top:16%;
                transform-origin: bottom;
                border: solid;
                opacity: 1;
                position:absolute;
            }
            .clock canvas {
                position:absolute;
                width:100%;
                height:100%;
                z-index:-1;
                display: block;
            }
            #forStops{
                position: absolute;
                height: 90vh;
                width:  90vw;
                background-image:  linear-gradient(141deg, #9fb8ad 0%, #1fc8db 51%, #2cb5e8 75%);
                left: 50%;
                top: 150%;
                transform: translate(-50%,-30%);
                display: none;
                /*justify-content: center;*/
                align-items: center;
                flex-direction: column;
            }
            #forStops thead tr{
                background-color: whitesmoke;
            }
            #forStops table{
                border: solid black 3px;
                border-radius: 3px;
                padding: 5px;
                width: 100%;
            }
            #forStops tbody tr{
                width:100%;
            }
            #forStops tbody tr td{
                width:20%;
                height: 50px;
            }
            #closeStops {
                position: absolute;
                width:  30px;
                height: 30px;
                border: solid black 2px;
                border-radius: 2px;
                right: 20px;
                top: 20px;
                transition-duration: 1s;
            }
            #closeStops span:nth-child(1){
                position: absolute;
                width:25px;
                height: 3px;
                background-color: black;
                border:black;
                left:50%;
                top:50%;
                transform: translate(-50%,-50%) rotate(-45deg);
                transition-duration: 1s;
            }
            #closeStops span:nth-child(2){
                position: absolute;
                width:25px;
                height: 3px;
                background-color: black;
                border:black;
                left:50%;
                top:50%;
                transform: translate(-50%,-50%) rotate(45deg);
                transition-duration: 1s;
            }
            #closeStops:hover span:nth-child(2){
                transform:translate(-50%,-50%)  rotate(-135deg);
            }
            .inpst{
                display: inline-block;padding:5px 10px;
                background-image: linear-gradient(141deg ,black, grey);
                border: none;
                border-bottom: solid 2px black;
                color:white;
                font-size: 18px;
                padding: 3px 5px;
            }
            .inpstbtn{
                padding: 3px 10px;
                letter-spacing: 2px;
                font-weight: 700;
                border: none;
                background-image: none;
                background-color: black;
                color:white;
            }
        </style>
        <script src="script/jquery.js"></script>
        <script>
            $(document).ready(function () {
                $("#info-Search-bar").on("keyup", function () {
                    var value = $(this).val().toLowerCase();
                    $("#mytable1 tr").filter(function () {
                        console.log($("#mytable1 tr").text().toLowerCase());
                        $(this).toggle($(this).children("td:nth-child(1)").text().toLowerCase().indexOf(value) > -1);
                    });
                });
                $("#infoCenter-Search-btn").on("click", function () {
                    var value = $("#infoCenter-Search-bar").val().toLowerCase();
                    $("#mytable2 tr").filter(function () {
                        console.log($(this).children("td:nth-child(4)").text().toLowerCase());
                        $(this).toggle($(this).children("td:nth-child(4)").text().toLowerCase().indexOf(value) > -1);
                    });
                });
                $('#infoCenter-frm input').on('keypress', function (e) {
                    return e.which !== 13;
                });
                $("#slctStp,#option4,.routeid").on("click", function () {
                    var value = $("#slctStp").val().toLowerCase();
                    $("#tbl4bdy tr").filter(function () {
                        console.log($(this).children("td:nth-child(2)").text().toLowerCase());
                        $(this).toggle($(this).children("td:nth-child(2)").text().toLowerCase().indexOf(value) > -1);
                    });
                });
                $(function () {
                    var value = $("#slctStp").val().toLowerCase();
                    $("#tbl4bdy tr").filter(function () {
                        console.log($(this).children("td:nth-child(2)").text().toLowerCase());
                        $(this).toggle($(this).children("td:nth-child(2)").text().toLowerCase().indexOf(value) > -1);
                    });
                });
                $('#frm1,#frm2,#frm3 input').on('keypress', function (e) {
                    return e.which !== 13;
                });
            });
        </script>
        <link href="https://fonts.googleapis.com/css?family=Crete+Round" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Roboto+Slab" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Rakkas" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Concert+One" rel="stylesheet">
        <link rel="stylesheet" type="text/css" href="http://fonts.googleapis.com/css?family=Permanent+Marker">
        <link rel="stylesheet" href="css/navigation.css">
        <link rel="stylesheet" href="css/parallax.css">
        <link rel="stylesheet" href="css/info.css">
        <link rel="stylesheet" href="css/infoCenter.css">

    </head>
    <body>
        <div class="effect" id="img">
            <h1 id="wel" class="welcome">Welcome</h1>
            <div id="img1" class="img1"></div>
            <div id="img2" class="img2"></div>
            <div id="img3" class="img3"></div>
            <script type="text/javascript" src="script/parallax.js"></script>
        </div>
        <div class="nav">
            <div class="navLeft">
                <div class="navElementL">
                    <button type="button"class="navbtn" name="button">Home</button>
                </div>
                <div class="navElementL">
                    <button type="button"class="navbtn" name="button">Contact US</button>
                </div>
                <div class="navElementL">
                    <button type="button"class="navbtn" name="button">Routes</button>
                    <div class="content" >
                        <%
                            BusRouteDAO bdao = new BusRouteDAO();
                            List<BusRoute> ll = bdao.busList();
                            //              List<BusRoute> l= (List<BusRoute>)request.getAttribute("list");
                            if (ll != null) {
                                int c=0;
                                for (BusRoute i : ll) {
                                    
                        %>
                        <a href="#forStops" class="routeid"  onclick="displayStops(<%=c%>)" ><%=i.getPlace()%> <%=i.getRoute()%></a>
                        <%       c++;   }
                            }%>
                        <script type="text/javascript" src="script/home.js"></script>
                    </div>
                </div>
            </div>

            <div class="navRight">
                <% s = request.getSession();
                    username = (String) s.getAttribute("un");
                    System.out.println(username);
                    if (username == null) {
                %>
                <div class="navElement">
                    <a type="button" class="navbtn" name="button" href="newLogin.html" >Login</a>
                </div>
                <%
                } else {
                %>
                <div class="navElement">
                    <button type="button" class="navbtn" name="button" disabled><%=username%></button>
                </div>
                <div class="navElement">
                    <form style="padding:0;" action="LogoutServlet"><button style="color:crimson;" type="submit" class="navbtn" name="button">Logout</button></form>
                </div>
                 <%
                    }
                %>
            </div>
        </div>
        <!-- <div class="info-right">
          fsdfsd
        </div> -->
        <div class="container">
            <div class="row1">
                <div class="box">
                    <h1 class="hed" onclick="showInfo()"><span>Bus Routes</span></h1>
                    <script type="text/javascript" src="script/info.js"></script>
                </div>
                <div class="box" id="slide-left">
                    <div class="clock" id="clock">
                        <span class="minute" id="minuteHand"></span>
                        <span class="hour" id="hourHand"></span>
                        <span class="second" id="secondHand"></span>
                        <script type="text/javascript" src="script/scriptTime.js" ></script>
                        <script src="script/scriptTimeP5.js"></script>
                    </div>
                    <script src="https://cdnjs.cloudflare.com/ajax/libs/p5.js/0.7.2/p5.min.js"></script>
                    <script src="https://cdnjs.cloudflare.com/ajax/libs/p5.js/0.7.2/addons/p5.dom.min.js"></script>
                    <!-- <script src="https://cdnjs.cloudflare.com/ajax/libs/p5.js/0.7.2/addons/p5.sound.min.js"></script> -->

                    <h1 class="hed2">
                        Timings
                    </h1>
                </div>
                <div class="info-right" id="inf-rgt"><!--HERE ONLY============================-->
                    <button id="cross" onclick="closeInfo()"><span>&#10060;</span></button>
                    <form id="info-frm"  method="post"> <!--action="RouteSearchServlet" --> 
                        <input id="info-Search-bar" type="text" name="routeNo" value="" maxlength="3" min="100"placeholder="🔍eg. '101'"></input>
                        <!--                                                <select id="info-select" name="place">
                                                                            <option value="ALL">ALL</option>
                                                                            <option value="CHD">Chandigarh</option>
                                                                            <option value="MHL">Mohali</option>
                                                                            <option value="NAL">Nalagarh</option>
                                                                        </select>-->
                        <!--<button id="info-Search-btn" name="button">Search</button>-->
                    </form>
                    <table>
                        <thead>
                            <tr class="info-tr">
                                <th>Bus Route</th>
                                <th>Place</th>
                                <th>Driver</th>
                            </tr>
                        </thead>
                        <tbody id="mytable1">
                            <%
                                BusRouteDAO bd = new BusRouteDAO();
                                List<BusRoute> l = bd.busList();
                                //              List<BusRoute> l= (List<BusRoute>)request.getAttribute("list");
                                if (l != null) {
                                    for (BusRoute i : l) {
                            %>
                            <tr>
                                <td><%=i.getRoute()%></td>
                                <td><%=i.getPlace()%></td>
                                <td><%=i.getDriverName()%></td>
                            </tr>
                            <%}
                                }%>
                        </tbody>
                    </table>
                </div>
            </div>
            <div class="row2">
                <div class="box">
                    <h1 class="btn" onclick="showInfoCenter()">Bus Number</h1>
                </div>
                <div class="box">
                    <h1 onclick="displayStops()">Bus Stops</h1>
                </div>
            </div>
            <div class="" id="info-center"><!--here only-->
                <span onclick="closeInfoCenter()">&#9932;</span>
                <form id="infoCenter-frm" action="" method="post" onsubmit="false">
                    <input id="infoCenter-Search-bar" type="text" name="" value="" placeholder="🚌 eg. 'HR 0* AB 1234'"></input>
                    <button id="infoCenter-Search-btn" type="button" name="button">🔍</button>
                </form>
                <table>
                    <tr class="info-tr">
                        <th>S.No</th>
                        <th>Driver</th>
                        <th>Bus Route</th>
                        <th>Bus Number</th>
                    </tr>
                    <%
                        if (l != null) {
                            j = 0;
                            for (BusRoute i : l) {
                                j++;
                    %>
                    <tbody id="mytable2">
                        <tr>
                            <td><%=j%></td>
                            <td><%=i.getDriverName()%></td>
                            <td><%=i.getPlace()%> <%=i.getRoute()%></td>
                            <td><%=i.getBusNumber()%></td>
                        </tr>
                        <%  }
                            }%>
                    </tbody> 
                </table>
                <script type="text/javascript" src="script/infoCenter.js"></script>
            </div>
        </div>

                    
        <%
            String dspType = (String) session.getAttribute("displayType");
            if (dspType == null) {
                dspType = "none";
            }
            session.removeAttribute("displayType");
        %>
        <div id="forStops" style="display:<%=dspType%>">
            <%
                if (dspType.equals("flex")) {
                    dspType = null;
                }
            %>
            <span id="closeStops" onclick="closeStops()" >
                <span></span>
                <span></span>
            </span>
            <h2>Route NO 
                <form style="display: inline-block;">
                    <select id="slctStp" style="padding: 5px 10px;">
                        <%BusRouteDAO obj = new BusRouteDAO();
                            List<BusRoute> list = obj.busList();
                            for (BusRoute i : list) {
                        %>
                        <option value="<%=i.getRoute()%>"><%=i.getRoute()%></option>
                        <%}%>
                    </select>
                </form>
            </h2>
            <div style="overflow-y:auto; height:70%;width:94%;">
                <table id="tbl4">
                    <thead>
                        <tr>
                            <th>S.NO</th>
                            <th>Route</th>
                            <th>Stop</th>
                            <th>Time</th>
                        </tr>
                    </thead>
                    <tbody id="tbl4bdy">
                        <%StopDAO sd = new StopDAO();
                            List<Stop> list2 = sd.list();
                            if (list != null) {
                                for (Stop i : list2) {
                        %>
                        <tr>
                            <td><%=i.getSerialNo()%></td>
                            <td><%=i.getRoute()%></td>
                            <td><%=i.getStop()%></td>
                            <td><%=i.getAtime()%></td>
                        </tr>
                        <%}
                            }%>
                    </tbody>
                </table>
            </div>
        </div>
        <div class="footer">

        </div>
    </body>
</html>
