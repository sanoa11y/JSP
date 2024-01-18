package com.jspDEmo;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/serv1")
public class Servlet1 extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {  
	resp.getWriter().print("doGet() of server 1 excuting");//whenevere click get button going to serve1 link the servlet as serv1 the doDet mathod execute 

}
}
