<%@page import="model.Stop"%>
<%@page import="model.StopDAO"%>
<%@page import="model.BusRoute"%>
<%@page import="java.util.List"%>
<%@page import="model.BusRouteDAO"%>
<!DOCTYPE html>

                <%  HttpSession s = request.getSession();
                    String username = (String) s.getAttribute("un");
                    System.out.println("============================="+username);
                    if (username == null) {
                        response.sendRedirect("newLogin.html");
                    }
//                    else if(((String) s.getAttribute("un")).equals("st") || ((String) s.getAttribute("un")).equals("sf")){
//                        System.out.println("============================="+username);
//                        response.sendRedirect("Home.jsp");
//                    }
                    else if(!((String) s.getAttribute("un")).equalsIgnoreCase("admin")){
                        response.sendRedirect("newLogin.html");
                    }
                    else{
                %>

<html lang="en" dir="ltr">
    <head>
        <meta charset="utf-8">
        <title></title>
        <link href="https://fonts.googleapis.com/css?family=B612" rel="stylesheet">
        <style media="screen">
            body{
                background: linear-gradient(to bottom right,#f4a142,#c75050);
                /*        background-color:#f4a142;*/
                margin:0;
                /*position: relative;*/
                /* z-index:0; */
                /*overflow-y:hidden;*/
            }
            .container{
                background-color:rgba(240,240,240,0.4);
                height:91vh;
                width:95%;
                margin: 6vh 1% 3vh 4%;
                border-radius:10px;
                display:flex;
                align-item:center;
                justify-content:center;
                flex-wrap:wrap;
                /* position:relative; */
                /* z-index:1; */
            }
            .left-detail{
                flex:4.5;
                background-color:rgba(40,40,40,0.4);
                border-radius:10px;
                margin:3px;
                margin-right:0;
                width: 100%;
                position:relative;

            }
            .left-detail-content{
                position: relative;
                display: flex;
                align-items:  center;
                flex-direction: column;
                width:100%;
                overflow:hidden;

            }
            .right-content{
                flex:1;
                display:flex;
                align-items:center;
            }
            .options{
                background-color:rgba(255,255,255,0.4);
                text-align:center;
                width:100%;
                height:50%;
                border-radius:10px;
                display:flex;
                align-items:center;
                justify-content:center;
                flex-direction:column;
            }
            .options p{
                position:relative;
                font-family: 'Staatliches';
                font-size:25px;

            }
            .options span{
                position:absolute;
                height:2px;
                width:60px;
                background-color:black;
                transition-duration:.3s;
                transition-timing-function: linear;
            }
            #pointer{
                transition-duration:0s;
                border: solid 20px transparent;
                border-left: solid 30px #a18462;
                background-color: transparent;
            }
            .Search{
                width: 100%;
                padding-top:5px;
                margin-bottom:5px;
            }
            .Search form{
                width:100%;
                display:flex;
                align-items:center;
                justify-content:center;
            }
            .input{
                background-color:rgba(0,0,0,0.4);
                border:none;
                padding:2px 5px;
                width:50%;
                height:30px;
                color:white;
                font-size:18px;
                border-bottom:1px solid white;
                border-radius:2px;
                outline: none;
            }
            .sbmBtn{
                background-color:rgba(20,20,20,0.4);
                color:white;
                height:35px;
                font-size:18px;
                padding:2px 5px;
                border:none;
                letter-spacing:2px;
                font-weight: bold;
                font-family: 'Shadows Into Light';
            }
            .sbmBtn:hover{
                border:1px solid lightseagreen;
                color:lightseagreen;
                padding:1px 4px;
                transition-duration:.3s;
            }
            .tbl{
                display:flex;
                align-items:center;
                justify-content: center;
                width: 100%;
                /* z-index:-1; */
            }
            table{
                border-collapse: collapse;
                width: 85%;
                text-align: center;
                overflow-y: scroll;
            }
            table tr:nth-child(odd) {
                background-color:rgba(210,210,210,0.9);
            }
            table tr td{
                font-family: 'Satisfy';
                width:20%;
                margin: 0;
                letter-spacing: 2px;
                font-size: 16px;
                font-weight: bold;
                padding: 10px;
                /* box-sizing: border-box; */
            }

            tr:hover td{
                transition-duration: .1s;
                font-size: 24px;
                /*padding: 4.5px;*/
                letter-spacing: 5px;
            }
            th{
                padding: 10px;
                font-weight: bold;
                font-size: 20px;
                letter-spacing: 3px;
                font-family: 'Bree Serif', serif;
            }
            #leftDetailContent2{
                display:none;
                position:absolute;
                top:0;
            }
            #leftDetailContent3{
                display:none;
                position:absolute;
                top:0;
            }
            .sbmBtnred{
                background-color:rgba(20,20,20,0.4);
                color:white;
                height:35px;
                font-size:18px;
                padding:2px 5px;
                border:none;
                letter-spacing:2px;
                font-weight: bold;
                font-family: 'Shadows Into Light';
                margin: 0;
            }
            .sbmBtnred:hover{
                border:1px solid red;
                color:red;
                padding:1px 4px;
                transition-duration:.3s;
            }
            .sbmBtngreen{
                background-color:rgba(20,20,20,0.4);
                color:white;
                height:35px;
                font-size:18px;
                padding:2px 5px;
                border:none;
                letter-spacing:2px;
                font-weight: bold;
                font-family: 'Shadows Into Light';
            }
            .sbmBtngreen:hover{
                border:1px solid green;
                color:green;
                padding:1px 4px;
                transition-duration:.3s;
            }
            .sbmBtnaqua{
                background-color:rgba(20,20,20,0.4);
                color:white;
                height:35px;
                font-size:18px;
                padding:2px 5px;
                border:none;
                letter-spacing:2px;
                font-weight: bold;
                font-family: 'Shadows Into Light';
            }
            .sbmBtnaqua:hover{
                border:1px solid aqua;
                color:aqua;
                padding:1px 4px;
                transition-duration:.3s;
            }
            #forUpdate{
                padding:20px 30px;
                width:500px;
                height:500px;
                position:absolute;
                top:150%;
                left:50%;
                transform:translate(-50%,-50%);
                display:none;
                justify-content:center;
                align-items:center;
                background-color:rgba(0,0,0,0.8);
                border-radius:10px;
            }
            #forUpdate form{
                display:flex;
                justify-content:center;
                align-items:center;
                flex-direction:column;
            }
            #forUpdate input{
                background-color:transparent;
                color:white;
                font-size:20px;
                border:none;
                border-bottom:2px solid white;
                margin:20px 0;
                padding:10px 0;
                outline:none;
            }
            .busno{
                display: none;
            }
            #forStops{
                position: absolute;
                height: 90vh;
                width:  90vw;
                background-image:  linear-gradient(141deg, #9fb8ad 0%, #1fc8db 51%, #2cb5e8 75%);
                left: 50%;
                top: 150%;
                transform: translate(-50%,-50%);
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
                border: inset black 3px;
                border-radius: 30px;
            }
            .inpstbtn{
                padding: 5px 16px;
                letter-spacing: 2px;
                font-weight: 700;
                border: none;
                background-image: none;
                background-color: black;
                color:white;
                border-radius: 0;
                border: none;
            }
        </style>
        <script src="script/jquery.js"></script>
        <script>
            $(document).ready(function () {
                $("#Search-btn1").on("click", function () {
                    var value = $("#Search-bar1").val().toLowerCase();
                    $("#mytable1 tr").filter(function () {
                        console.log($(this).children("td:nth-child(2)").text().toLowerCase());
                        $(this).toggle($(this).children("td:nth-child(2)").text().toLowerCase().indexOf(value) > -1);
                    });
                });
                $("#Search-btn2").on("click", function () {
                    var value = $("#Search-bar2").val().toLowerCase();
                    $("#mytable2 tr").filter(function () {
                        console.log($(this).children("td:nth-child(4)").text().toLowerCase());
                        $(this).toggle($(this).children("td:nth-child(4)").text().toLowerCase().indexOf(value) > -1);
                    });
                });
                $("#Search-btn3").on("click", function () {
                    var value = $("#Search-bar3").val().toLowerCase();
                    $("#mytable3 tr").filter(function () {
                        console.log($(this).children("td:nth-child(3)").text().toLowerCase());
                        $(this).toggle($(this).children("td:nth-child(3)").text().toLowerCase().indexOf(value) > -1);
                    });
                });
                $("#slctStp,#option4").on("click", function () {
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
        <script src="https://unpkg.com/@babel/standalone/babel.min.js"></script>
        <script crossorigin src="https://unpkg.com/react@16/umd/react.development.js"></script>
        <script crossorigin src="https://unpkg.com/react-dom@16/umd/react-dom.development.js"></script>
        <!--<link rel="stylesheet" href="css/font-awesome.css">-->
        <link href="https://fonts.googleapis.com/css?family=Bree+Serif|Satisfy|Shadows+Into+Light|Molle:400i|Bad+Script" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Staatliches" rel="stylesheet">
        <link rel="stylesheet" href="css/adminNav.css">
        <link rel="stylesheet" href="css/adminWelcome.css">
    </head>
    <body>
        <div class="welcome">
            <h1>
                <span>W</span>
                <span>e</span>
                <span>l</span>
                <span>c</span>
                <span>o</span>
                <span>m</span>
                <span>e</span>
            </h1>
            <button type="button" name="button" onclick="slideDown()">&#8744;</button>
        </div>
        <div class="nav">
            <div class="nav-btn" id="nav-btn" onclick="openNav()">
                &#9776;
            </div>
            <script type="text/javascript" src="script/adminnav.js"></script>
            <div class="nav-content">
                <p class="nav-elem" >Home</p>
                <p class="nav-elem" >About us</p>
                <p class="nav-elem" >Contact us</p>
                <form action="LogoutServlet" style="padding:0;width: 120px;margin-top: 0;"><button type="submit" style="width: 120px;margin-top: 0;border: none;" class="nav-elem" ><p style="z-index: 100;padding: 0;margin: 0;" >Logout</p></button></form>
            </div>
        </div>
        <div class="container">
            <div class="left-detail">
                <div class="left-detail-content" id="leftDetailContent1">
                    <div class="Search">
                        <form id="frm1" class="" action=""  method="post" >
                            <input class="input" type="text" name="search1" id="Search-bar1">
                            <button class="sbmBtn" type="button" id="Search-btn1">Search</button>
                            <button class="sbmBtngreen" type="button" name="button" onclick="setTypeOfButton('Add')">ADD</button>
                            <!--<button class="sbmBtnred" type="button" name="button" onclick="setTypeOfButton('Delete')">DELETE</button>-->
                            <button class="sbmBtnaqua" type="button" name="button" onclick="setTypeOfButton('Update')">UPDATE</button>
                        </form>
                        <script>
                            function setTypeOfButton(type) {
                                var frm = document.getElementById("frmlast");
                                frm.setAttribute("action", type + "DriverServlet");
                                upd(type);
                            }
                        </script>
                    </div>
                    <div class="tbl">
                        <table>
                            <tr class="drv-tr">
                                <th>S.No</th>
                                <th>Driver</th>
                                <th>Contact</th>
                                <th>Delete</th>
                            </tr>
                            <tbody id="mytable1">
                                <%
                                    BusRouteDAO bd = new BusRouteDAO();
                                    List<BusRoute> l = bd.busList();
                                    int j = 0;
                                    //              List<BusRoute> l= (List<BusRoute>)request.getAttribute("list");
                                    if (l != null) {
                                        for (BusRoute i : l) {
                                            j++;
                                %>
                                <tr>
                                    <td><%=j%></td>
                                    <td><%= i.getDriverName()%></td>
                                    <td><%=i.getPhone()%></td>
                                    <td><form action="DeleteServlet"><button name="delete" value="<%=i.getRoute()%>" type="submit" class="sbmBtnred">Delete</button></form></td>
                                </tr>
                                <%
                                        }
                                    }
                                %>
                            </tbody>>
                        </table>
                    </div>
                </div>
                <div class="left-detail-content" id="leftDetailContent2">
                    <div class="Search">
                        <form id="frm2" class="">
                            <input class="input" type="text"  value="" id="Search-bar2">
                            <button class="sbmBtn" type="button" id="Search-btn2">Search</button>
                            <button class="sbmBtngreen" type="button" name="button" onclick="setTypeOfButton('Add')">ADD</button>
                            <!--<button class="sbmBtnred" type="button" name="button" onclick="setTypeOfButton('Delete')">DELETE</button>-->
                            <button class="sbmBtnaqua" type="button" name="button" onclick="setTypeOfButton('Update')">UPDATE</button>
                        </form>
                    </div>
                    <div class="tbl">
                        <table>
                            <tr class="info-tr">
                                <th>S.No</th>
                                <th>Driver</th>
                                <th>Bus Route</th>
                                <th>Bus Number</th>
                                <th>Delete</th>
                            </tr>
                            <tbody id="mytable2"> 
                                <%
                                    j = 0;
                                    //              List<BusRoute> l= (List<BusRoute>)request.getAttribute("list");
                                    if (l != null) {
                                        for (BusRoute i : l) {
                                            j++;
                                %>
                                <tr>
                                    <td><%=j%></td>
                                    <td><%=i.getDriverName()%></td>
                                    <td><%=i.getPlace()%> <%=i.getRoute()%></td>
                                    <td style="width:30%;"><%=i.getBusNumber()%></td>
                                    <td><form action="DeleteServlet"><button name="delete" value="<%=i.getRoute()%>" type="submit" class="sbmBtnred">Delete</button></form></td>
                                </tr>
                                <%}
                                    }%>
                            </tbody>
                        </table>
                    </div>
                </div>
                <div class="left-detail-content" id="leftDetailContent3">
                    <div class="Search">
                        <form id="frm3" class=""  method="post">
                            <input class="input" type="text" name="" value="" id="Search-bar3">
                            <button class="sbmBtn" type="button" id="Search-btn3">Search</button>
                            <button class="sbmBtngreen" type="button" name="button" onclick="setTypeOfButton('Add')">ADD</button>
                            <!--<button class="sbmBtnred" type="button" name="button" onclick="setTypeOfButton('Delete')">DELETE</button>-->
                            <button class="sbmBtnaqua" type="button" name="button" onclick="setTypeOfButton('Update')">UPDATE</button>
                        </form>
                    </div>
                    <div class="tbl">
                        <table>
                            <tr class="drv-tr">
                                <th>S.No</th>
                                <th>Driver</th>
                                <th>Routes</th>
                                <th>Delete</th>
                            </tr>
                            <tbody id="mytable3">
                                <%
                                    j = 0;
                                    //              List<BusRoute> l= (List<BusRoute>)request.getAttribute("list");
                                    if (l != null) {
                                        for (BusRoute i : l) {
                                            j++;
                                %>
                                <tr>
                                    <td><%=j%></td>
                                    <td><%=i.getDriverName()%></td>
                                    <td style="cursor:pointer;"><%=i.getPlace()%> <%=i.getRoute()%></td>
                                    <td><form action="DeleteServlet"><button name="delete" value="<%=i.getRoute()%>" type="submit" class="sbmBtnred">Delete</button></form></td>
                                </tr>
                                <%}
                                    }%>
                            </tbody>
                        </table>
                    </div>
                </div>
                <!-- <script type="text/babel" src="script/react.js"></script>
                <script type="text/javascript" src="script/admin.js"></script> -->
            </div>
            <div class="right-content">
                <div class="options">
                    <p id="option1" onclick="view(1)">Driver</p>
                    <p id="option2" onclick="view(2)">Bus Number</p>
                    <p id="option3" onclick="view(3)">Bus Routes</p>
                    <p id="option4" onclick="view(4)">Bus Route Stops</p>
                    <span id="line"></span>
                    <span id="pointer"></span>
                </div>
                <script type="text/javascript" src="script/admin.js"></script>
            </div>
        </div>
        <div id="forUpdate">
            <form id="frmlast" name="frmlast" class="" action="" method="post" onsubmit="return validation()">
                <input type="text" name="route" value="" placeholder="Route eg. 101" maxlength="3" required>
                <input type="text" name="driver" value="" placeholder="Driver Name" required>
                <input type="text" name="contact" value="" placeholder="Contact" maxlength="10" required>
                <input class="busno" type="text" name="place" value="" placeholder="place code eg. CHD" maxlength="3" required>
                <input class="busno" type="text" name="busno" value="" placeholder="Bus Number eg. HR 01 AA 0001" maxlength="13" required>
                <div class="">
                    <input id="chgBtnType" type="submit" name="" value="Update" onClick="validation()" style="border:lightgreen solid 2px;color:lightgreen;padding:5px 10px;cursor:pointer;">
                    <button type="button" name="button"  style="border:red solid 2px;color:red;padding:5px 10px;cursor:pointer;background-color:transparent;font-size:20px;outline:none;" onclick="updClose()">Cancel</button>
                </div>
                <script type="text/javascript" src="script/adminFrmValidation.js"></script>
            </form>
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
                if(dspType.equals("flex")){
                    dspType=null;
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
                            List<BusRoute> ll = obj.busList();
                            for (BusRoute i : ll) {
                        %>
                        <option value="<%=i.getRoute()%>"><%=i.getRoute()%></option>
                        <%}%>
                    </select>
                </form>
            </h2>
            <div style="overflow-y:scroll; height:70%;width:94%;">
                <table id="tbl4">
                    <thead>
                        <tr>
                            <th>S.NO</th>
                            <th>Route</th>
                            <th>Stop</th>
                            <th>Time</th>
                            <th style="color:red;">&#x2718;</th>
                        </tr>
                    </thead>
                    <tbody id="tbl4bdy">
                        <%StopDAO sd = new StopDAO();
                            List<Stop> list = sd.list();
                            if (list != null) {
                                for (Stop i : list) {
                        %>
                        <tr>
                            <td><%=i.getSerialNo()%></td>
                            <td><%=i.getRoute()%></td>
                            <td><%=i.getStop()%></td>
                            <td><%=i.getAtime()%></td>
                            <td style="color:red;"><form action="deleteStopServlet"><button style="border:none;color:red;background-color: transparent;height: 20px;" value="<%=i.getNo() %>" name="no" type="submit" >&#x2718;</button></form></td>
                        </tr>
                        <%}
                        }%>
                    </tbody>
                </table>
            </div>
            <form action="BusStopsServlet" style="display: inline-block;margin:10px;">
                <input class="inpst" name="serial" type="text" placeholder="S.no"/>
                <input class="inpst" name="route" type="text" placeholder="Route"/>
                <input class="inpst" name="stop" type="text" placeholder="Stop Name"/>
                <input class="inpst" name="time" type="text" placeholder="Time"/>
                <input class="inpst inpstbtn" type="submit" value="ADD"/>
            </form>
        </div>
    </body>
</html>
<%}%>
