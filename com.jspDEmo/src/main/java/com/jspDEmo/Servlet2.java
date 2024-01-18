package com.jspDEmo;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/serv1")
public class Servlet2 extends HttpServlet{
	
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {  
	resp.getWriter().print("doPost() of server 2 excuting");//accept 2 obj httpservlet request,httpservlet response

}
}
