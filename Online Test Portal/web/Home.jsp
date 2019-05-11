<%-- 
    Document   : Home
    Created on : 14 Apr, 2019, 7:51:21 PM
    Author     : Parmjot Singh chahal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
    <head>
        <meta charset="utf-8">
        <title></title>
        <style media="screen">
            @import url('https://fonts.googleapis.com/css?family=Monofett');
            @import url('https://fonts.googleapis.com/css?family=Bowlby+One+SC');
            @import url('https://fonts.googleapis.com/css?family=Muli');
            *{
                margin:0;
            }
            html{
                height: 100%;
                width: 99vw;
                margin: 0;
                overflow-x:hidden;
            }
            body{
                width:100%;
                height:100%;
                background-color: rgb(50,50,50);
                margin: 0;
            }
            .div1{
                /* position: relative; */
                width:100%;
                height:100%;
                background-image:url("css/img/books.jpg");
                background-size:100% 100%;
                background-position:center;
                background-repeat:no-repeat;
                background-attachment:fixed;
                /* font-family: 'Monofett', regular; */
                font-family: 'Bowlby One SC', cursive;
                /* font-weight: bolder; */
                display: flex;
                align-items: center;
                justify-content: center;
                flex-direction: column;
                text-align: center;
            }
            .div1 h1{
                color: floralwhite;
                letter-spacing: 8px;
                font-size: 90px;
                text-shadow: 0 0 25px black;
                position: relative;
                display: block;
            }
            .div1 p{
                font-size:50px;
                color:floralwhite;
                font-family: 'Muli', sans-serif;
                font-weight:500;
                text-shadow: 0 0 25px black;
            }
            .sgnUpBtn{
                padding:15px 30px;
                border:none;
                background-color:#0d002c;
                color:#00bcd4;
                font-size:17px;
                font-weight:600;
                border-radius:3px;
                width: 200px;
                /* margin-top:30px; */
                box-sizing: border-box;
                font-family: 'Muli', sans-serif;
                cursor:pointer;
                /* box-shadow:0 0 10px rgb(50,50,50); */
                position: relative;
                transition-duration: .5s;
            }
            .sgnUpBtn::before{
                position: absolute;
                content: '';
                top: 0px;
                left: 0px;
                width: 50%;
                bottom:0px;
                background-color:	#000d3c;
                z-index: -1;
            }
            .sgnUpBtn:hover{
                color:#0d002c;
                text-shadow: 0 0 2px #00bcd4,0 0 4px #50e4f7;
                letter-spacing: 1px;
                z-index: 1;
            }
            .signUpFrm:hover{
                transition-duration: .3s;
                box-shadow: 0 0 5px rgb(77, 121, 255);
            }
            .signUpFrm{
                overflow: hidden;
            }
            .signUpFrm span{
                border: none;
                position: absolute;
                border-radius: 5px;
                z-index: 2;
            }
            .signUpFrm:hover span:nth-child(1){
                top:0px;
                left:0;
                height: 4px;
                width: 100%;
                background-image: linear-gradient(to right,#0d002c,#00bcd4);
                animation: sp1 infinite 2s linear;
            }
            .signUpFrm:hover span:nth-child(2){
                top:0;
                right:0;
                height: 100%;
                width: 4px;
                animation: sp2 infinite 2s linear;
                animation-delay: 1s;
                transform: translateY(-100%);
                background-image: linear-gradient(to bottom,#0d002c,#00bcd4);
            }
            .signUpFrm:hover span:nth-child(3){
                bottom:0%;
                right:0;
                height: 4px;
                width:100%;
                background-image: linear-gradient(to left,#0d002c,#00bcd4);
                animation: sp3 infinite 2s linear;
            }
            .signUpFrm:hover span:nth-child(4){
                bottom:0px;
                left:0;
                height:100%;
                width: 4px;
                transform: translateY(100%);
                background-image: linear-gradient(to top,#0d002c,#00bcd4);
                animation: sp4 infinite 2s linear;
                animation-delay: 1s;
            }
            @keyframes sp1 {
                0%{
                    transform: translateX(-100%);
                }
                100%{
                    transform: translateX(100%);
                }
            }
            @keyframes sp2 {
                0%{
                    transform: translateY(-100%);
                }
                100%{
                    transform: translateY(100%);
                }
            }
            @keyframes sp3{
                0%{
                    transform: translateX(100%);
                }
                100%{
                    transform: translateX(-100%);
                }
            }
            @keyframes sp4 {
                0%{
                    transform: translateY(100%);
                }
                100%{
                    transform: translateY(-100%);
                }
            }

            @import url('https://fonts.googleapis.com/css?family=Arimo:700');
            .div2{
                width:100%;
                height:100%;
                margin:0;
                 margin-top: 67px; 
                transform: translateY(0px) skewY(-5deg);
                background-color: floralwhite;
                display:flex;
                justify-content: center;
                align-items: center;
                flex-direction: row;
                font-family: 'Arimo', sans-serif;
                position: relative;
            }
            .before{
                content: '';
                position: absolute;
                height: 5px;
                width: 0%;
                top:5%;
                left: -35%;
                background-color: rgb(50,50,50);
                transition-duration:1s;
            }
            .after{
                content: '';
                position: absolute;
                height: 5px;
                width: 0%;
                bottom:5%;
                left: 135%;
                background-color: rgb(50,50,50);
                transition-duration:1s;
            }
            .d2lft{
                flex:2;
                height: 20%;
                transform: skewY(5deg) rotateY(180deg);
                display:flex;
                justify-content: space-around;
                align-items: center;
                flex-direction:column;
                transition-duration: .5s;
                backface-visibility: hidden;
                /* position: relative; */
            }
            .d2lft h3{
                /* font-weight: 900; */
                font-size:30px;
                color:rgb(50,50,50);
            }
            .d2lft p{
                /* font-weight: 900; */
                text-align:center;
                width: 441px;
                font-size:24px;
                color:rgb(70,70,70);
            }

            .d2rght{
                transform: skewY(5deg);
                margin:30px 20px;
                flex:1;
                position: relative;
                perspective: 1243px;
            }
            .d2rght::before{
                content: '';
                position: absolute;
                height: 57%;
                width: 2px;
                top: 30%;
                left: -30%;
                background-color: rgb(120,120,120);
            }

            .d2rght img:nth-child(1){
                transform-origin: center;
                transform:rotateY(-40deg);
            }

            .d2rght img:nth-child(2){
                position: absolute;
                top: 12px;
                left: 7px;
                transform: rotateY(-40deg);
                width: 594px;
                height: 348px;
                opacity: 0.2;
            }

            .div2:hover img:nth-child(2){
                animation: codeAni1 3s .2s infinite;
                animation-timing-function: ease-out;
            }
            .d2rght img:nth-child(3){
                position: absolute;
                top: 12px;
                left: 7px;
                transform: rotateY(-40deg);
                width: 594px;
                height: 348px;
                opacity: 0.3;
            }
            .div2:hover img:nth-child(3){
                animation: codeAni2 3s .4s infinite;
                animation-timing-function: ease-out;
            }
            .d2rght img:nth-child(4){
                position: absolute;
                top: 12px;
                left: 7px;
                transform: rotateY(-40deg);
                width: 594px;
                height: 348px;
                opacity: 0.4;
            }
            .div2:hover img:nth-child(4){
                animation: codeAni3 3s infinite;
                animation-timing-function: ease-in-out;
            }
            .d2rght img:nth-child(5){
                position: absolute;
                top: 12px;
                left: 7px;
                transform: rotateY(-40deg);
                width: 594px;
                height: 348px;
                opacity: 0.6;
            }
            .div2:hover img:nth-child(5){
                animation: codeAni4 3s infinite;
                animation-timing-function: ease-in-out;
            }
            .d2rght img:nth-child(6){
                position: absolute;
                top: 12px;
                left: 7px;
                transform: rotateY(-40deg);
                width: 594px;
                height: 348px;
                opacity: 0.8;
            }
            .div2:hover img:nth-child(6){
                animation: codeAni5 3s infinite;
                animation-timing-function: ease-in-out;
            }
            .d2rght img:nth-child(7){
                position: absolute;
                top: 12px;
                left: 7px;
                transform: rotateY(-40deg);
                width: 594px;
                height: 348px;
                opacity: 1;
            }
            .div2:hover img:nth-child(7){
                animation: codeAni6 3s infinite;
                animation-timing-function: ease-in-out;
            }
            @keyframes codeAni1 {
                0%{
                    transform:rotateY(-40deg) translate(0px,0px);
                }
                50%{
                    transform:rotateY(-40deg) translate(-5px,0px);
                }
                100%{
                    transform:rotateY(-40deg) translate(0px,0px);
                }
            }
            @keyframes codeAni2 {
                0%{
                    transform:rotateY(-40deg) translate(0px,0px);
                }
                50%{
                    transform:rotateY(-40deg) translate(-15px,-5px);
                }
                100%{
                    transform:rotateY(-40deg) translate(0px,0px);
                }
            }
            @keyframes codeAni3 {
                0%{
                    transform:rotateY(-40deg) translate(0px,0px);
                }
                50%{
                    transform:rotateY(-40deg) translate(-30px,-10px);
                }
                100%{
                    transform:rotateY(-40deg) translate(0px,0px);
                }
            }
            @keyframes codeAni4 {
                0%{
                    transform:rotateY(-40deg) translate(0px,0px);
                }
                50%{
                    transform:rotateY(-40deg) translate(-45px,-15px);
                }
                100%{
                    transform:rotateY(-40deg) translate(0px,0px);
                }
            }
            @keyframes codeAni5 {
                0%{
                    transform:rotateY(-40deg) translate(0px,0px);
                }
                50%{
                    transform:rotateY(-40deg) translate(-60px,-20px);
                }
                100%{
                    transform:rotateY(-40deg) translate(0px,0px);
                }
            }
            @keyframes codeAni6 {
                0%{
                    transform:rotateY(-40deg) translate(0px,0px);
                }
                50%{
                    transform:rotateY(-40deg) translate(-75px,-25px);
                }
                100%{
                    transform:rotateY(-40deg) translate(0px,0px);
                }
            }
            .div3{
                position:relative;
                width:100%;
                height:70%;
                background-color:rgb(245,245,245);
                color:rgb(50,50,50);
                font-size:30px;
                font-family: 'Arimo', sans-serif;
                transform:skewY(-5deg);
                display:flex;
                justify-content:center;
                align-items:center;
                flex-direction:column;
                transition-duration:1s;
                overflow:hidden;
            }
            .d3btn{
                margin:30px;
            }
            .d3cont{
                position:relative;
            }
            .d3btn1,.d3btn2{
                background-color:transparent;
                font-size:20px;
                padding:16px 30px;
                width:300px;
                height:60px;
                box-sizing:border-box;
                cursor:pointer;
                border:none;
                transition-duration:.4s;
            }
            .d3btn1{
                background-color:rgba(63, 191, 63, 0.8);
                color:floralwhite;
                z-index:1;
            }
            .d3btn2{
                background-color:rgba(63, 191, 191, 0.8);
                color:floralwhite;
                z-index:0;
            }
            .d3btn1:hover{
                background-color:rgb(245,245,245) ;
                color:rgba(63, 191, 63, 0.8);
                box-shadow:0 0 0 800px rgba(63, 191, 63, 0.8);
                font-size:25px;
                letter-spacing:1px;
                z-index:1;
            }
            .d3btn2:hover{
                background-color:rgb(245,245,245) ;
                color:rgba(63, 191, 191, 0.8);
                box-shadow:0 0 0 800px rgba(63, 191, 191, 0.8);
                font-size:23px;
                letter-spacing:1px;
                z-index:0;
            }
            .div4{
                position: relative;
                width: 100%;
                height: 30%;
                background-color: transparent;
                display: flex;
                justify-content: center;
                align-items: center;
                flex-direction: column;
                transition-duration: 1s;
            }
            @import url('https://fonts.googleapis.com/css?family=Nunito:300');
            .div4 div:nth-child(1) h1{
                font-family: monospace;
                color: rgb(200,200,200);
                font-weight: 100;
                text-align: center;
                font-size: 20px;
                letter-spacing: 1px;
            }
            .div4 div:nth-child(3) h1{
                font-family: monospace;
                font-size:18px;
                color:rgb(200,200,200);
                font-weight: 100;
                text-align: center;
                letter-spacing:1px;
            }
        </style>
        <link rel="stylesheet" href="css/navigationBar.css">
        <link rel="stylesheet" href="css/glitch.css">
        <link rel="stylesheet" href="css/icon.css">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.3/css/all.css" integrity="sha384-UHRtZLI+pbxtHCWp1t77Bi1L4ZtiqrqD80Kn4Z8NTSRyMA2Fd33n5dQ8lWUE00s/" crossorigin="anonymous">
    </head>
    <body>

        <%
            String Username = (String) session.getAttribute("Username");
            System.out.println("Username =========== " + Username);
        %>

        <div class="menu-btn" onClick="openClose()">
            <span></span>
            <span></span>
            <span></span>
        </div>
        <div class="menu">
            <form action="LogoutServlet" class="menu-content">
                <button class="btn" type="submit" value="Home.jsp" name="button">HOME</button>
                <button class="btn" type="submit" value="SelectTest.jsp" name="button">COURSES</button>
                <button class="btn" type="submit" value="Profile.jsp" name="button">PROFILE</button>
                <button class="btn" type="submit" value="MakeTest.jsp" name="button">CREATE</button>
                <%
                    if(Username == null){
                %>
                <button class="btn" type="submit" value="Login.jsp" name="button">LOGIN</button>
                <%}else{%>
                <button class="btn" type="submit" value="LogoutServlet" name="button">LOGOUT</button>
                <%}%>
            </form>
        </div>
        <div class="div1">
            <!-- <h1 id="wel">WELCOME</h1> -->
            <p id="wel">Join our website and test your coding skills </p>
            <form class="signUpFrm" action="SignUpCheckHomePageServlet" method="post" style="margin-top:30px;position:relative;">
                <span></span>
                <span></span>
                <span></span>
                <span></span>
                <%if (Username == null) {%>
                <button class="sgnUpBtn" type="submit" value="Login.jsp" name="button">Sign Up & Test</button>
                <%} else {%>
                <button class="sgnUpBtn" type="submit" value="SelectTest.jsp" name="button">Test Yourself</button>
                <%}%>
            </form>
        </div>
        <script type="text/javascript" src="script/home.js"></script>
        <div class="div2" id="div2">
            <span class="before"></span>
            <span class="after"></span>
            <div class="d2lft">
                <h3>Code & Get Evaluated</h3>
                <p>Complete challenges and improve your coding skills</p>
                <div>
                    <form class="signUpFrm" action="SignUpCheckHomePageServlet" method="post" style="margin-top:30px;position:relative;">
                        <span></span>
                        <span></span>
                        <span></span>
                        <span></span>
                        <%if (Username == null) {%>
                        <button class="sgnUpBtn" type="submit" value="Login.jsp" name="button">Sign Up & Test</button>
                        <%} else {%>
                        <button class="sgnUpBtn" type="submit" value="SelectTest.jsp" name="button">Test Yourself</button>
                        <%}%>
                    </form>
                </div>
            </div>
            <div class="d2rght">
                <!-- <img src="css/img/computer_screen.png" alt=""> -->
                <img src="css/img/msc.png" alt="">
                <img src="css/img/replCode.png" alt="" >
                <img src="css/img/replCode.png" alt="" >
                <img src="css/img/replCode.png" alt="" >
                <img src="css/img/replCode.png" alt="" >
                <img src="css/img/replCode.png" alt="" >
                <img src="css/img/replCode.png" alt="" >
            </div>
        </div>

        <div class="div3">
            <div class="d3cont">
                <h1>We're here to help you grow</h1>
            </div>
            <div class="d3btn">
                <form class="" action="ChoiceCreateOrTest" method="post">
                    <button onmouseover="changePosition1()" class="d3btn1" type="submit" value="SelectTest.jsp" name="button">Help me Innovate</button>
                    <button onmouseover="changePosition2()" class="d3btn2" type="submit" value="MakeTest.jsp" name="button">Help me create Test</button>
                </form>
            </div>
        </div>

        <div class="div4">
            <div class="">
                <h1>Contact us</h1>
            </div>
            <div class="center">
                <div class="d">
                    <span class="sp1"></span>
                    <span class="sp2"></span>
                    <span class="sp3"></span>
                    <span class="sp4"></span>
                    <span class="sp5"><i style="font-size: 50px;color: floralwhite;transform: translate(27px,-84px) rotate(35deg);" class="fab fa-google" ></i></span>
                </div>
                <div class="d">
                    <span class="sp1"></span>
                    <span class="sp2"></span>
                    <span class="sp3"></span>
                    <span class="sp4"></span>
                    <span class="sp5"><i style="font-size: 50px;color: floralwhite;transform: translate(35px,-84px) rotate(35deg);" class="fab fa-facebook-f" ></i></span>
                </div>
                <div class="d">
                    <span class="sp1"></span>
                    <span class="sp2"></span>
                    <span class="sp3"></span>
                    <span class="sp4"></span>
                    <span class="sp5"><i style="font-size: 50px;color: floralwhite;transform: translate(27px,-84px) rotate(35deg);" class="fab fa-twitter" ></i></span>
                </div>
                <div class="d">
                    <span class="sp1"></span>
                    <span class="sp2"></span>
                    <span class="sp3"></span>
                    <span class="sp4"></span>
                    <span class="sp5"><i style="font-size: 50px;color: floralwhite;transform: translate(27px,-84px) rotate(35deg);" class="fab fa-linkedin-in" ></i></span>
                </div>
            </div>
            <div class="">
                <h1><i class="fas fa-phone-square" style="color:rgba(63, 191, 63, 0.8);"></i> (+91) 9422568495</h1>
            </div>
        </div>
    </body>
</html>

