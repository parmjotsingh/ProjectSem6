<%-- 
    Document   : ShowQuestion
    Created on : 13 Apr, 2019, 8:46:33 AM
    Author     : Parmjot Singh chahal
--%>

<%@page import="modal.QuestionPaper"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <style>
        @import url('https://fonts.googleapis.com/css?family=Montserrat:500');
        body{
            display:flex;
            align-items: center;
            /*justify-content: center;*/
            flex-direction: column;
            width: 100%
        }
        h1,h2{
            width:70%;
            text-align: left;
            color: rgb(40,40,40);
            font-family: 'Montserrat', sans-serif;
        }
        h1{
            width: fit-content;
        }
        h3{
            width: 50%;
            text-align: left;
            font-size: x-large;
            color: rgb(70,70,70);
            font-family: 'Montserrat', sans-serif;
        }
    </style>
    <body>
        <%
            QuestionPaper q = (QuestionPaper)request.getAttribute("Ques");
            if(q== null){
                %><h1>ਅਫਸੋਸ ਹੈ ਕਿ ਇੱਥੇ ਕੁਝ ਨਹੀਂ ਹੈ</h1><br/>
                  <h1>क्षमा करें यहाँ कुछ भी नहीं है</h1><br/>
                  <h1>Sorry nothing is here</h1>
            <%}
                else{
        %>
        <h2><b><u> Question <%=q.getQuesNo() %>)</u></b>    <%=q.getQuestion()%></h2>
        <br/>
        <h2><u>OPTIONS</u></h2>
        <h3>    1. <%=q.getOpt1()%></h3>
        <h3>    2. <%=q.getOpt2()%></h3>
        <h3>    3. <%=q.getOpt3()%></h3>
        <h3>    4. <%=q.getOpt4()%></h3>
        <br/>
        <br/>
        <h2>Answer option= <%=q.getAns() %></h2>
        <%}%>
    </body>
</html>
