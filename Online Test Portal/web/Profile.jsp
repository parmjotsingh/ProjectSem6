<%-- 
    Document   : Profile
    Created on : 14 Apr, 2019, 4:22:24 PM
    Author     : Parmjot Singh chahal
--%>

<%@page import="modal.User"%>
<%@page import="modal.UserDAO"%>
<%@page import="java.util.List"%>
<%@page import="modal.Course"%>
<%@page import="modal.CourseDAO"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
    <head>
        <meta charset="utf-8">
        <title></title>
        <link rel="stylesheet" href="css/navigationBar.css">
        <style media="screen">
            body,html{
                margin:0;
                padding:0;
                width:100%;
                height:100%;
            }
            body{
                width:100%;
                height:100%;
                display:flex;
                justify-content:center;
                flex-direction:column;
                align-items:center;
                background-color: rgb(240,240,240);
            }
            .container{
                height: 95%;
                width: 65%;
                /* border: solid 1px rgb(80,80,80); */
                display:flex;
                justify-content: space-evenly;
                flex-direction:column;
                align-items:center;
            }
            @import url('https://fonts.googleapis.com/css?family=Lato|Nunito|Roboto+Mono');
            .box1{
                height: 30%;
                width: 100%;
                background-color: rgb(235,235,235);
                box-shadow: 0 2px 20px 0px rgba(80, 80, 80,0.5);
                font-family: 'Lato', sans-serif;
                color: rgb(60,60,60);
                letter-spacing: 2px;
                padding-left: 5%;
                box-sizing: border-box;
                display:flex;
                justify-content: center;
                flex-direction:column;
                align-items:center;
                text-align: center;
            }
            .detail{
                width:50%;
            }
            .detail h2{
                position: relative;
                left: -5%;
                text-align: center;
                font-size: 30px;
                font-family: 'Nunito', sans-serif;
            }
            .detail div{
                width:100%;
                /* border:solid 1px black; */
                display:flex;
                justify-content: space-between;
                flex-direction:row;
                align-items:center;
            }
            .detail div p{
                font-weight: 600;
                text-align:center;
                width:50%;
                box-sizing: border-box;
            }
            .detail div span{
                width:50%;
                text-align:left;
                position: relative;
                box-sizing: border-box;
            }
            .detail div span::after{
                content: '';
                position: absolute;
                left: -14%;
                top:-5px;
                width:1px;
                height: 30px;
                background-color: rgb(100,100,100);
            }

            .box2{
                height: 60%;
                width: 100%;
                /* border: solid 1px rgb(40,0,190); */
                box-shadow: 0 2px 20px 0px rgba(80, 80, 80,0.5);
                display:flex;
                justify-content: center;
                flex-direction:column;
                align-items:center;
                overflow-y: auto;
            }
            .header{
                color: rgb(50,50,50);
                font-family: 'Nunito', sans-serif;
                letter-spacing: 1px;
            }
            .list{
                height:90%;
                width:100%;
                display:flex;
                justify-content: center;
                flex-direction:row;
                align-items:center;
            }
            .side1{
                height:100%;
                width:50%;
                /* border:solid 1px black; */
                color: rgb(90,90,90);
                display:flex;
                justify-content: flex-start;
                flex-direction:column;
                align-items:flex-end;
                padding: 10px;
                box-sizing: border-box;
                letter-spacing: 0.5px;
            }
            .side1 h3{
                margin:0;
                padding: 10px 20px;
                margin-bottom: 5px;
                cursor: none;
            }
            .side2{
                height:100%;
                width:50%;
                /* border:solid 1px black; */
                color: rgb(90,90,90);
                display:flex;
                justify-content: flex-start;
                flex-direction:column;
                align-items:flex-start;
                padding: 10px;
                box-sizing: border-box;
                letter-spacing: 0.5px;
            }
            .side2 button{
                border: solid 1px rgba(0,190,0,0.8);
                color: rgba(0,190,0,1);
                font-size: 16px;
                background-color:transparent;
                font-family: 'Roboto Mono', monospace;
                font-weight: bold;
                padding: 10px 20px;
                cursor: pointer;
                transition-duration: .2s;
                margin-bottom: 5px;
            }
            .side2 button:hover{
                box-shadow: 0 0 10px 1px rgba(0,190,0,0.3);
            }
            .empty{
                height:90%;
                text-align: center;
                color: rgb(40,40,40);
            }
        </style>
    </head>
    <body>

        <%
            String Username = (String) session.getAttribute("Username");
            System.out.println("Username =========== " + Username);
            if (Username == null) {
                response.sendRedirect("Login.jsp");
            } else {
        %>

        <div class="menu-btn" onClick="openClose()">
            <span></span>
            <span></span>
            <span></span>
        </div>
        <div class="menu">
            <form action="MenuServlet" class="menu-content">
                <button class="btn" type="submit" value="home" name="home">HOME</button>
                <button class="btn" type="submit" value="courses" name="courses">COURSES</button>
                <button class="btn" type="submit" value="profile" name="profile">PROFILE</button>
                <button class="btn" type="submit" value="setting" name="setting">SETTING</button>
                <button class="btn" type="submit" value="loginLogout" name="loginLogout">LOGOUT</button>
            </form>
        </div>
        <script type="text/javascript" src="script/home.js"></script>

        <div class="container">
            <div class="box1">
                <div class="profile"></div>
                <div class="detail">
                    <%
                        UserDAO ud = new UserDAO();
                        User u = ud.getUser((String) session.getAttribute("Username"));
                    %>
                    <h2><%=u.getUsername()%></h2>
                    <div><p>Email</p><span><%=u.getEmail()%></span></div>
                    <div><p>Contact</p><span><%=u.getContact()%></span></div>
                </div>
            </div>
            <div class="box2">
                <%
                    CourseDAO cd = new CourseDAO();
                    List<Course> l = cd.getExam((String) session.getAttribute("Username"));
                %>
                <div class="header"><h2>COURSES</h2></div>
                <%if (l != null) {%>
                <div class="list">
                    <div class="side1">
                        <%for (Course i : l) {%>
                        <h3><%=i.getCourse()%></h3>
                        <%}%>
                    </div>
                    <form class="side2" target="_blank" action="ShowResultServlet">
                        <%for (Course i : l) {%>
                        <button type="submit" name="button" value="<%=i.getCourse()%>">Check Result</button>
                        <%}%>
                    </form>
                </div>
                <%} else {%><div class="empty"><h1>Nothing to Show<br/>You have not set any Test</h1></div><%}%>
            </div>
            <%}%>
    </body>
</html>
