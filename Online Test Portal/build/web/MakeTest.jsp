<%-- 
    Document   : MakeTest
    Created on : 10 Apr, 2019, 5:22:36 AM
    Author     : Parmjot Singh chahal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title></title>
    <style media="screen">
      html , body{
        margin:0;
        height:100%;
        width:100%;
      }
      .main{
        position:absolute;
        left:15%;
        width:85%;
        background-color:floralwhite;
        height:100%;
        /*display:flex;*/
        justify-content: center;
        align-items: center;
        <%
            String flag =(String)session.getAttribute("CreateQuestion");
            if(flag==null || flag.equalsIgnoreCase("false")){
        %>
            display: none;
        <%} else { %>
            display:flex;
        <%}%>
      }

      .main-container{
        background-image: linear-gradient(141deg, #9fb8ad 0%, #1fc8db 51%, #2cb5e8 75%);
        box-shadow: 0 0 10px 10px rgba(0,0,0,0.2);
        width: 90%;
        height: 80%;
        border-radius: 5px;
        position: relative;
        display:flex;
        justify-content: center;
        align-items: center;
        flex-direction: column;
        overflow: auto;
        backface-visibility:  hidden;

      }

      .question{
        width: 90%;
      }
      @import url('https://fonts.googleapis.com/css?family=Heebo:500,700');
      .question,.optn h2{
        display: block;
        letter-spacing: 2px;
        font-weight: 700;
        color:rgba(50,50,50,1);
        font-family: 'Heebo', sans-serif;
        text-align: center;
      }
      .question textarea{
        /* box-shadow: 0 0 10px rgba(0, 0, 255, 0.5); */
        border-radius: 5px;
        border: inset;
        font-size: 20px;
        position: relative;
      }
      .opt1 p, .opt2 p, .opt3 p , .opt4 p{
        font-family: 'Heebo', sans-serif;
        display: inline;
        color:rgba(50,50,50,1);
        margin-right: 10px;
        font-size: 20px;
        font-weight: 600;
      }
      .opt1 , .opt2 , .opt3 , .opt4 , .opt5{
        display: flex;
        justify-content: center;
        align-items: center;

      }
      .opt1 textarea, .opt2 textarea, .opt3 textarea, .opt4 textarea {
        border-radius: 2px;
        /*font-weight: 600;*/
        font-size: 20px;
        background-color:#323232;
        /*background-image: linear-gradient(141deg, rgba(50, 50, 50) 0%, rgba(200, 130, 85, 1) 51%, rgba(0,0,0,0.5) 75%);*/
        border:none;
        color: white;
      }
      .sbm{
        background-color:rgb(50,50,50);
        font-family: 'Heebo', sans-serif;
        height:40px;
        width:90px;
        color:white;
        font-size:18px;
        border:none;
        letter-spacing:1px;
        position:relative;
        transition-duration: .1s;
        cursor: pointer;
      }
      .sbm:hover{
        background-color:transparent;
        border:solid 2px floralwhite;
        color:rgb(50,50,50);
        box-shadow: 0 0 10px rgb(50,50,50);
      }
      .opt5{
            height:40px;
            font-weight: 600;
            font-size: 18px;
            /*background-image: linear-gradient(141deg, rgba(50, 50, 50) 0%, rgba(200, 130, 85, 1) 51%, rgba(0,0,0,0.5) 75%);*/
            border:none;
            width:200px; color:rgb(60,60,60); display: inline-block;text-align: center; background-color: rgb(240,240,240);
      }
      .requirment{
        position:absolute;
        top:50%;
        left:50%;
        width:50%;
        transform:translate(-35%,-50%);
        background-color:floralwhite;
        height:50%;
        <%
            if( flag==null || flag.equalsIgnoreCase("false")){
        %>
            display: flex;
        <%} else { %>
            display:none;
       <%}%>
/*        display:flex;*/
        justify-content: center;
        align-items: center;
        transition-duration:.2s;
      }
      .requirment::before {
        transition-duration:.5s;
        content: '';
        position: absolute;
        height: 50%;
        width: 50%;
        left: 20px;
        top: 20px;
        transform: skew(3deg,3deg);
        background-color: rgb(191, 63, 135);
        box-shadow: 0 0 20px 7px rgba(191, 63, 135, 0.92);
      }
      .requirment::after{
        transition-duration:.5s;
        content: '';
        position: absolute;
        height: 50%;
        width: 50%;
        right: 20px;
        bottom: 20px;
        transform: skew(3deg,3deg);
        background-color: rgba(63, 72, 191, 1);
        z-index: -1;
        box-shadow: 0 0 20px 7px rgba(63, 72, 191, 0.92);
      }
      .requirment:hover::before{
        left: -5px;
        top: -5px;
      }
      .requirment:hover::after{
        right: -5px;
        bottom: -5px;
      }
      .requirment form{
        position:absolute;
        width:100%;
        height:100%;
        display:flex;
        background-color:rgba(30,30,30,1);
        box-shadow: 0 0 20px 7px rgba(30,30,30,0.6);
        /* border:solid black 2px; */
        justify-content: center;
        align-items: center;
        flex-direction:column;
      }
      .requirment form input{
        margin:20px 10px;
        background-color:transparent;
        border:none;
        padding: 10px 20px;
        text-align: center;
        width: 400px;
        height: 50px;
        font-size: 20px;
        color:rgba(240,240,240,0.9);
        box-sizing: border-box;
        outline: none;
      }
      .requirment form input:nth-child(1){
        border-bottom: solid 3px rgba(191, 63, 135, 0.92);
        text-shadow: 0 0 3px rgba(191, 63, 135, 0.92);
      }
      .requirment form input:nth-child(2){
        border-bottom: solid 3px rgba(63, 72, 191, 0.92);
        text-shadow: 0 0 3px rgba(63, 72, 191, 0.92);
      }
      .requirment form input:nth-child(3){
        color: rgba(72, 191, 63, 0.92);
        transition-duration: .3s;
        font-size: 20px;
        border: solid 1px rgba(72, 191, 63, 0.82);
        position: relative;
        width: 200px;
        cursor: pointer;
      }
      .requirment form input:nth-child(3):hover{
        letter-spacing: 2px;
        font-size: 22px;
        text-shadow: 0 0 1px rgba(72, 191, 63, 0.92), 0 0 1px rgba(240,240,240, 0.92);

      }
      textarea::placeholder { 
        color: rgb(240,240,240);
      }
      .question textarea::placeholder { 
        color: rgb(150,150,150);
      }
    </style>
    <link rel="stylesheet" href="css/navigationBar.css">
    <link rel="stylesheet" href="css/sidebar.css">
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
    <div class="sideBar" style="position:absolute;z-index:1;">
      <span>
        <p class="arr" onClick="tgl()">CLOSE</p>
      </span>
      <script type="text/javascript" src="script/makeTest.js"></script>
      <div class="crs-name">
          <%
              String s=(String)session.getAttribute("CourseName");
              System.out.println(s);
              if(s == null ){%>
                <p>COURSE NAME</p>
                <%}
              else{%>
                   <p><%=s%></p>
                <%}%>
      </div>
      <div style="flex:12;width: 100%;">
        <div class="que-counter">
          <h2>Questions</h2>
          <%
              if(flag!=null && flag.equalsIgnoreCase("true")){
              int questionNumber= Integer.parseInt(session.getAttribute("QuestionNumber").toString()) ;
              for(int i=1; i<=questionNumber ;i++){%>
              <form action="ShowQuestionServlet" target="_blank"><button type="submit" name="quesNum" value="<%=i%>"><%=i%></button></form>
          <%}}%>
        </div>
      </div>
      <form class="endbtn" action="index.html" method="post">
        <input type="submit" name="" value="END">
      </form>
    </div>
    <div class="main">
        <form action="QuestionPaperServlet" class="main-container">

        <div class="question">
          <h2>Question:</h2>
          <textarea rows = "5" cols = "80" name = "question" placeholder="Enter your Question..." required></textarea>
        </div>
        <div class="optn">
          <h2>Options:</h2>

          <div class="opt1">
            <p>1: </p>
            <textarea rows = "1" cols = "50" name = "optn1" placeholder="   OPTION 1" required></textarea>
          </div>
          <div class="opt2">
            <p>2: </p>
            <textarea rows = "1" cols = "50" name = "optn2" placeholder="   OPTION 2"  required></textarea>
          </div>
          <div class="opt3">
            <p>3: </p>
            <textarea rows = "1" cols = "50" name = "optn3" placeholder="   OPTION 3" required></textarea>
          </div>
          <div class="opt4">
            <p>4: </p>
            <textarea rows = "1" cols = "50" name = "optn4" placeholder="   OPTION 4" required></textarea>
          </div>
          <div style="display:flex; align-items: center;justify-content: center;"><input class="opt5" type="number" name="ans" value="" placeholder="ANSWER OPTION" min="1" max="4">  
        <input class="sbm" type="submit" name="" value="Submit"></div>
      </form>
    </div>
          </div>     
    <div class="requirment">
      <form name="createTest" class="" action="createTestServlet" method="post" >
        <input type="text" name="course" value="" placeholder="ENTER COURSE NAME OR CODE" required>
        <input type="number" name="ques" value="" placeholder="ENTER NUMBER OF QUESTION" required>
        <input type="submit" name="" value="Submit" onclick="changeToQues()">
      </form>
    </div>        
  </body>
</html>