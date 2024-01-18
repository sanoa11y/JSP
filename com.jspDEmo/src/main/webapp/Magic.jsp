<%@page import="com.jspDEmo.Test"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Jsp demo page</title>
</head>
<body>
	<%!
          int age=10;                         //this tag is useful to declare var,method,many java program
          String name="sano";
          public int sub(int x, int y){
        	  return x-y;
          }
%>
	<%
      int res=Test.add(10,20);
      //out.print(res);        //out is work both requst & response
%>
	<%= res %>
	// expression tag it quickly and directly print result , no writer to
	wreite or call
</body>
</html>