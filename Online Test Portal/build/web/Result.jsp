<%-- 
    Document   : Result
    Created on : 15 Apr, 2019, 1:39:05 PM
    Author     : Parmjot Singh chahal
--%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.Set"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            html,body{
                width: 100%;
                height: 100%;
                margin: 0;
                padding: 0;
            }
            body{
                display:flex;
                justify-content: flex-start;
                align-items:center;
                flex-direction: column;
                width: 100%;
                height: 100%;
                letter-spacing: 1px;
                color:rgb(60,60,60);
                }
            div{
                font-size: 30px;
                font-family:monospace;
                }
        </style>
    </head>
    
    <body>
        <div style="padding-top:20px;padding-bottom: 20px;font-weight: bold;font-size: 40px;letter-spacing: 4px;color:rgb(40,40,40);">SCORE</div>
        <%  
            Set<String> set= (Set)request.getAttribute("set");
            Iterator itr= set.iterator();int i=1;
            while( itr.hasNext() ){
        %>
        <div><%=i%>) <%=((String)itr.next()) %></div>
        <%i++;}%>
    </body>
</html>
