<%-- 
    Document   : SelectTest
    Created on : 13 Apr, 2019, 3:07:15 PM
    Author     : Parmjot Singh chahal
--%>

<%@page import="modal.UserEnrolledDAO"%>
<%@page import="modal.UserEnrolled"%>
<%@page import="modal.Course"%>
<%@page import="java.util.List"%>
<%@page import="modal.QuestionPaper"%>
<%@page import="modal.CourseDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        }
        body{
            width:100%;
            height:100%;
            display:flex;
            justify-content:center;
            flex-direction:column;
            align-items:center;
            padding-top: 20px;
            background-image: url("css/img/bookwallpaper.jpg");
            background-size: cover;
            background-repeat: no-repeat;
        }
        @import url('https://fonts.googleapis.com/css?family=Montserrat:500');
        .box{
            width: 90%;
            margin-top:20px;
            border: solid 2px rgb(207, 207, 207);
            font-family: 'Montserrat', sans-serif;
            display:flex;
            justify-content:center;
            align-items:center;
            flex-direction:column;
            border-radius: 5px;
        }
        .CourseInfo h2{
            color:rgb(50,50,50);
            letter-spacing: 1px;
        }
        .CourseInfo{
            display:flex;
            justify-content:space-between;
            align-items:center;
            width:90%;
        }
        @import url('https://fonts.googleapis.com/css?family=Roboto+Mono');
        .CourseInfo button{
            font-family: 'Roboto Mono', monospace;
            height: 40px;
            width: 150px;
            border: solid 1px rgb(50,50,50);
            background-color: rgb(50,50,50);
            color: rgb(240,240,240);
            box-sizing: border-box;
            font-size: 20px;
            letter-spacing: 1px;
            position: relative;
            z-index: 1;
            overflow: hidden;

        }
        .CourseInfo button:hover{
            border: solid 1px rgb(50,50,50);
            background-color:  transparent;
            color: rgb(50,50,50);
            cursor: pointer;
            transition-duration: .2s;
            box-shadow: 0px 2px 10px 3px rgba(50,50,50,0.5);
        }
        .CourseInfo button::before{
            position: absolute;
            content: '';
            width: 30px;
            height: 110%;
            left: -37px;
            /* left: 105%; */
            top:-2px;
            background-color: rgb(207, 207, 207);
            transform: skew(-15deg,0);
            z-index: -1;

        }
        .CourseInfo button:hover::before{
            transition-duration: .7s;
            left: 105%;
        }
        .ques{
            background-color: rgb(207, 207, 207);
            width: 100%;
        }
        .ques p{
            padding-left: 5%;
            font-size: 14px;
            display: inline-block;
            font-family: 'Montserrat', sans-serif;
        }
        .ques p span{
            font-weight: 600;
            font-size: 16px;
            font-family: 'Montserrat', sans-serif;
        }
        .searchBar{
            /* width: 50%; */
            width: 4%;
            height:50px;
            border: solid rgb(40,40,40) 2px;
            display:flex;
            transition-duration: .4s;
        }
        .searchBar:hover{
            width: 50%;
        }
        .searchBar:hover .search{
            flex:10;
        }
        .search{
            flex:0;
            justify-content: center;
            display: flex;
            align-items: center;
        }
        .search form{
            justify-content: center;
            display: flex;
            align-items: center;
        }
        .search form, .search form input{
            width:100%;
            height:100%;
            border:none;
            font-family: 'Roboto Mono', monospace;
            font-size:30px;
            text-align:center;
            background-color:transparent;
            letter-spacing: 2px;
            outline: none;
        }
        .search form input::placeholder{
            color:black;
        }
        .searchIcon{
            flex: 1;
            justify-content: center;
            display: flex;
            align-items: center;
            font-size: 25px;
        }

    </style>
    <script src="https://use.fontawesome.com/318828acc1.js"></script>
    <!--<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>-->
    </head>
    <body>

        <%
            String Username = (String) session.getAttribute("Username");
            if (Username == null) {
                response.sendRedirect("Login.jsp");
            }
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
                <button class="btn" type="submit" value="setting" name="setting">CREATE</button>
                <button class="btn" type="submit" value="loginLogout" name="loginLogout">LOGOUT</button>
            </form>
        </div>
        <script type="text/javascript" src="script/home.js"></script>

        <div class="searchBar">
            <div class="search">
                <form class="" action="index.html" method="post">
                    <input id="search" type="text" name="" value="" placeholder="Enter course name... ">
                </form>
            </div>
            <div class="searchIcon">
                <i class="fa fa-search" aria-hidden="true"></i>
            </div>
        </div>

        <%
            CourseDAO cd = new CourseDAO();
            List<Course> l = cd.getExam();
            UserEnrolledDAO ued = new UserEnrolledDAO();
            UserEnrolled u = new UserEnrolled();
            for (Course i : l) {
                u.setCourse(i.getCourse());
                u.setUser(Username);
                boolean flag = ued.checkUser(u);
        %>
        <div class="box" >
            <div class="CourseInfo">
                <h2 class="crs"><%=i.getCourse()%></h2>
                <form class="" action="TakeTestServlet" method="post">
                    <button type="submit" value="<%=i.getCourse()%>" name="course" <% if (flag) {%> disabled style="cursor:no-drop;"<%}%> >Take Test</button>
                </form>
            </div>
            <div class="ques">
                <p>Questions: <span><%=i.getQues()%></span> </p>
                <%if (flag) {
                %>  <p style="color:red;display: inline;float: right;">YOU HAVE ALREADY ATTEMPTED THIS TEST</p>    <%
            }%>
            </div>
        </div>
        <%}%>
    </body>
</html>

