<%-- 
    Document   : Displayjsp
    Created on : 26 Mar, 2019, 9:27:30 AM
    Author     : Parmjot Singh chahal
--%>

<%@page import="java.util.List"%>
<%@page import="model.Student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% List<Student> list=(List<Student>)request.getAttribute("list"); 
            for(Student s: list){
                %><h1> <%=s.getName()%> <%=s.getId()%> </h1> <%
            }
        %>
    </body>
</html>
