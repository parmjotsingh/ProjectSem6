<%-- 
    Document   : TakeTest
    Created on : 13 Apr, 2019, 12:25:30 PM
    Author     : Parmjot Singh chahal
--%>

<%@page import="modal.UserEnrolledDAO"%>
<%@page import="modal.UserEnrolled"%>
<%@page import="modal.QuestionPaper"%>
<%@page import="modal.CourseDAO"%>
<%@page import="java.util.List"%>
<%@page import="modal.Course"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title></title>
    <style media="screen">
      html{
        margin:0;
      }
      body{
        margin:0;
        background-color:rgb(240,240,240);
        height:100vh;
        width:100%;
        display:flex;
        justify-content:center;
        align-items:center;
        flex-direction:row;
      }
      .main{
        position:relative;
        /* flex:5; */
        height:100%;
        width:85%;
        display:flex;
        justify-content:center;
        align-items:center;
        flex-direction:column;
      }
      .main::after{
        content:'';
        background-color:rgb(240,240,240);
        background-image: url("css/img/white.png");
        background-position:center;
        background-size:100% 100%;
        opacity: 0.3;
        top: 0;
        left: 0;
        bottom: 0;
        right: 0;
        position: absolute;
        z-index: -1;
      }
      .main-content{
        overflow-Y:scroll;
        flex:12;
        height:100%;
        width:100%;
        display:flex;
        justify-content:flex-start;
        align-items:center;
        flex-direction:column;
        box-sizzing:border-box;
      }
      .submission{
        flex:1;
        /* background-color:grey; */
        height:100%;
        width:100%;
        display:flex;
        justify-content:flex-start;
        align-items:center;
      }
      @import url('https://fonts.googleapis.com/css?family=Montserrat');
      .option form div{
        display:block;
        margin:20px 10px;
        font-family: 'Montserrat', sans-serif;
        font-size:20px;
      }
      .question-container{
        margin:10px 0;
        border-bottom:solid rgba(50,50,50,0.4) 2px;
        width:95%;
        display:flex;
        justify-content:center;
        align-items:center;
        flex-direction:column;
      }
      .option form div:nth-child(5) input{
        box-sizing:border-box;
        width:100px;
        height:40px;
        font-size:20px;
        border-radius:2px;
        border:none;
        background-color:rgba(19, 96, 174, 0.8);
        color:floralwhite;
        cursor:pointer;
        position:relative;
      }
      .ques{
        font-size:23px;
        font-family: 'Montserrat', sans-serif;
        padding:10px 20px;
        background-color:rgba(25, 135, 178, 0.84);
        width: 90%;
      }
      .ques p{
        color: rgba(50,50,50);
      }
      .option{
        width:80%;
      }
      .submission form input{
        box-sizing:border-box;
        width:100px;
        height:40px;
        font-size:20px;
        border-radius:2px;
        border:none;
        background-color:rgba(19, 96, 174, 0.8);
        color:floralwhite;
        cursor:pointer;
      }
      .submission form input:nth-child(1){
        background-color:rgba(69, 221, 69, 0.9);
        margin-left: 100px;
      }
      .submission form input:nth-child(2){
        background-color:rgba(221, 69, 69, 0.9);
        margin-left: 10px;
      }

    </style>
    <link rel="stylesheet" href="css/navigationBar.css">
    <link rel="stylesheet" href="css/sidebar.css">
    <!-- <link rel="stylesheet" href="css/font/css/font-awesome.css"> -->
    <!-- <link rel="stylesheet" href="css/font/fonts/fontawesome-webfont.eot"> -->
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css" integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf" crossorigin="anonymous">
  </head>
  <body>
      
      <%
          String Username = (String)session.getAttribute("Username");
          if(Username == null){
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
  <!-- <script type="text/javascript" src="script/home.js"></script> -->
    <div class="sideBar">
      <span>
        <p class="arr" onClick="tgl()">CLOSE</p>
      </span>
      <script type="text/javascript" src="script/userTest.js"></script>
      
      <%
        CourseDAO cd= new CourseDAO();
        Course c= cd.getCourseDetail( (String)session.getAttribute("TestCourse") );
        %>
      <div class="crs-name">
        <p><%=c.getCourse() %></p>
      </div>
      <div style="flex:12;">
        <div class="que-counter">
          <h2>Questions</h2>
          <%  
              UserEnrolledDAO o=new UserEnrolledDAO();
              List<UserEnrolled> userList =o.getList(c.getCourse(),Username);
              int questionNumber= c.getQues();
              for(int i=1; i<=questionNumber ;i++){%>
              <form action="GoToQuestionServlet" ><button type="submit" name="quesNum" <%for(UserEnrolled j:userList){if(j.getqNo() == i){%>Style="background-color:lightseagreen;"<%}}%>  value="<%=i%>"><%=i%></button></form>
          <%}%>
        </div>
      </div>
<!--      <form class="endbtn" action="index.html" method="post">
        <input type="submit" name="" value="END">
      </form>-->
    </div>
          <%   String qNo= (String)session.getAttribute("QusetionNumber");
                System.out.println("====================== "+qNo+c.getCourse());
               if( qNo == null){
                qNo="1";
                session.setAttribute("QusetionNumber",""+qNo);
               }
               QuestionPaper qp= cd.getQuestion( Integer.parseInt(qNo), c.getCourse());
               System.out.println("------------------------- "+qp);
               
               UserEnrolled u= new UserEnrolled();
               u.setCourse(c.getCourse());
               u.setUser(Username); 
               u.setqNo(qp.getQuesNo());
               
               UserEnrolledDAO ued =new UserEnrolledDAO();
               int option=ued.getAns(u);
          %>
    <div class="main">
      <div class="main-content">
        <div class="question-container">
          <div class="ques">
            <p>Q<%=qp.getQuesNo() %>) <%=qp.getQuestion() %></p>
          </div>
          <div class="option">
            <form class="" action="SaveUserAnsServlet" method="get">
              <div><input type="radio" name="mcq" value="1" <%if(option == 1){%> checked <%}%> ><%=qp.getOpt1() %></div>
              <div><input type="radio" name="mcq" value="2" <%if(option == 2){%> checked <%}%> ><%=qp.getOpt2() %></div>
              <div><input type="radio" name="mcq" value="3" <%if(option == 3){%> checked <%}%> ><%=qp.getOpt3() %></div>
              <div><input type="radio" name="mcq" value="4" <%if(option == 4){%> checked <%}%> ><%=qp.getOpt4() %></div>

              <div><input type="submit" name="" value="Next"></div>
            </form>
          </div>
        </div>

      </div>
      <div class="submission">
        <form class="" action="EndTestServlet" method="post">
          <input type="submit" name="" value="Submit">
          <!-- <input type="submit" name="" value="Cancel"> -->
        </form>
      </div>
    </div>
  </body>
</html>

