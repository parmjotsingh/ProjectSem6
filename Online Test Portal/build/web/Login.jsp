<%-- 
    Document   : Login
    Created on : 10 Apr, 2019, 2:09:48 PM
    Author     : Parmjot Singh chahal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title></title>
    <style media="screen">
    @import url('https://fonts.googleapis.com/css?family=Roboto|Ubuntu');
      html,body{
        width:100%;
        height:100%;
        margin:0;
      }
      body{
        border-top: solid 3px #00b8e6;
        display:flex;
        justify-content: flex-end;
        align-items:center;
        position: relative;
         background-image: url("css/img/1.jpg"); 
        background-size: contain;
      }
      .login::before{
        position:absolute;
        content: '';
        /* left: -10px;
        top:-10px; */
        width: 90%;
        height: 80%;
        background-color: rgb(26, 140, 255);
        box-shadow: 0 0 10px rgb(26, 140, 255);
        transform: skew(4deg,4deg);
        z-index: -1;
        animation: ani 4s infinite;
      }
      .login::after{
        position:absolute;
        content: '';
        bottom: -10px;
        right:-10px;
        width: 90%;
        height: 80%;
        background-color: rgb(255, 51, 133);
        box-shadow: 0 0 10px rgb(255, 51, 133);
        transform: skew(4deg,4deg);
        z-index:-1;
        animation: ani2 4s infinite;

      }
      @keyframes ani{
        0%{
          left: -10px;
          top:-10px;
          transform: skew(4deg,4deg);
        }
        25%{
          top:auto;
          bottom: -10px;
          left:-10px;
          transform: skew(-4deg,-4deg);
        }
        50%{
          top:auto;
          bottom: -10px;
          right:-10px;
          left: auto;
          transform: skew(4deg,4deg);
        }
        75%{
          left: auto;
          bottom: auto;
          top: -10px;
          right:-10px;
          transform: skew(-4deg,-4deg);
        }
        100%{
          left: -10px;
          top:-10px;
          transform: skew(4deg,4deg);
        }
      }
      @keyframes ani2{
        0%{
          top:auto;
          bottom: -10px;
          right:-10px;
          left: auto;
          transform: skew(4deg,4deg);
        }
        25%{
          left: auto;
          bottom: auto;
          top: -10px;
          right:-10px;
          transform: skew(-4deg,-4deg);
        }
        50%{
          top:auto;
          bottom: auto;
          right:auto;
          left: -10px;
          top:-10px;
          transform: skew(4deg,4deg);
        }
        75%{
          top:auto;
          bottom: -10px;
          left:-10px;
          right:auto;
          transform: skew(-4deg,-4deg);
        }
        100%{
          bottom: -10px;
          right:-10px;
          transform: skew(4deg,4deg);
        }
      }
      .login{
          height:500px;
          width: 400px;
          border:solid black 2px;
          background-color: #00001a;
          position: relative;
          /* z-index:1; */
          margin-right: 100px;
          transition-duration: 1s;
          backface-visibility: hidden;
          /* display:none; */
      }
      .login form{
        width:100%;
        height:100%;
        display:flex;
        justify-content:center;
        align-items:center;
        flex-direction:column;
        position: relative;
      }
      .signUP{
          height:500px;
          width: 400px;
          border:solid black 2px;
          background-color: #00001a;
          position: relative;
          z-index:1;
          margin-right: 100px;
          display:none;
          padding: 10px 0;
          padding-top: 20px;
          transition-duration: 1s;
          backface-visibility: hidden;
      }
      .signUP form{
        width:100%;
        height:100%;
        display:flex;
        justify-content:center;
        align-items:center;
        flex-direction:column;
        position: relative;
      }
      @import url('https://fonts.googleapis.com/css?family=Ubuntu');
      .login form input{
        font-family:'Ubuntu', sans-serif;
        margin:10px;
        padding:10px 20px;
        height:50px;
        width:300px;
        box-sizzing:border-box;
        font-size:20px;
        border: none;
        outline: none;
        letter-spacing:2px;
        border-left: 6px solid #00b8e6;
      }
      .signUP form input{
        font-family:'Ubuntu', sans-serif;
        margin:10px;
        padding:10px 20px;
        height:50px;
        width:300px;
        box-sizzing:border-box;
        font-size:20px;
        border: none;
        outline: none;
        letter-spacing:2px;
        border-left: 6px solid #00b8e6;
      }

      .bf{
        font-family: 'Roboto', sans-serif;
        position: absolute;
        content: '';
        left:5px;
        top:5px;
        height: 70%;
        width: 50%;
        background-color: rgb(255, 51, 133);
        transform: skew(3deg,3deg);
        box-shadow: -2px -2px 10px rgba(255, 51, 133,0.6);
        z-index: -1;
        transition-duration:.3s;
      }
      .af{
        font-family: 'Roboto', sans-serif;
        position: absolute;
        content: '';
        right:5px;
        bottom:5px;
        height: 70%;
        width: 50%;
        background-color: rgb(26, 140, 255);
        box-shadow: -2px -2px 10px rgba(26, 140, 255,0.9);
        transform: skew(7deg,7deg);
        z-index: -1;
        transition-duration:.3s;
      }
      .btn:hover .bf{
        font-family: 'Roboto', sans-serif;
        position: absolute;
        content: '';
        left:-3px;
        top:-3px;
        height: 70%;
        width: 50%;
        background-color: rgb(255, 51, 133);
        transform: skew(7deg,7deg);
        box-shadow: -2px -2px 10px rgba(255, 51, 133,0.6);
        z-index: -1;
      }
      .btn:hover .af{
        font-family: 'Roboto', sans-serif;
        position: absolute;
        content: '';
        right:-3px;
        bottom:-3px;
        height: 70%;
        width: 50%;
        background-color: rgb(26, 140, 255);
        box-shadow: -2px -2px 10px rgba(26, 140, 255,0.9);
        transform: skew(7deg,7deg);
        z-index: -1;
      }
      .btn{
        font-family: 'Roboto', sans-serif;
        padding:10px 10px;
        height: 50px;
        width:100px;
        font-size:20px;
        letter-spacing: 3px;
        font-weight: 600;
        border:none;
        background-color: rgb(10, 10, 60);
        color:#00b8e6;
        margin-top: 10px;
        position: relative;
        cursor:pointer;
        outline:none;
        /*z-index: 1;*/
      }
      .login form p{
        position:absolute;
        bottom:10px;
        color:rgb(0, 153, 204);
        border-bottom:solid 1px rgb(0, 153, 204);
        cursor:pointer;
      }
      .login form h1{
        font-family: monospace;
        font-size: 40px;
        position:absolute;
        top:10px;
        color:#ffffff;
        letter-spacing: 4px;
      }
      .signUP form p{
        bottom:10px;
        color:rgb(0, 153, 204);
        border-bottom:solid 1px rgb(0, 153, 204);
        cursor:pointer;
      }
      .signUP form h1{
        font-family: monospace;
        font-size: 40px;
        color:#ffffff;
        letter-spacing: 4px;
      }
    </style>
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css" integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf" crossorigin="anonymous">
  </head>
  <body>
    <div class="login">
      <form name="frm" class="" action="LoginServlet" method="post" onsubmit="return check()">
        <h1>LOGIN</h1>
        <input type="text" name="username" value="" placeholder="USERNAME" onchange="check()"  required>
        <input type="password" name="pass" value="" placeholder="PASSWORD" onchange="check()"  required>
        <span id="pass" style="color:rgba(236, 54, 54, 0.9);font-size: 14px;letter-spacing: 2px;display:none;">Minimum 8 characters</span>
        <button class="btn" type="submit" name="button" onclick="check()"><span class="bf"></span> <span class="af"></span> Login</button>
        <p onclick="toSignup()">SignUP Here!<p>
      </form>
    </div>
    <div class="signUP">
        <form name="frm2" class="" action="SignUpServlet" method="post" onsubmit="return checkSignup()">
        <h1>SignUP</h1>
        <input type="text" name="username" value="" placeholder="USERNAME" onchange="checkSignup()" required>
        <input type="email" name="email" value="" placeholder="EMAIL" onchange="checkSignup()" required>
        <input type="text" name="contact" value="" placeholder="CONTACT" onchange="checkSignup()" required>
        <input type="password" name="pass" value="" placeholder="PASSWORD" onchange="checkSignup()" required>
        <span id="pass2" style="color:rgba(236, 54, 54, 0.9);font-size: 14px;letter-spacing: 2px;display:none;">Minimum 8 characters</span>
        <button class="btn" type="submit" name="button" onclick="checkSignup()"><span class="bf"></span> <span class="af"></span> Login</button>
        <p onclick="toLogin()">Login Here!<p>
      </form>
      <script type="text/javascript" src="script/login.js"></script>
    </div>
  </body>
</html>
