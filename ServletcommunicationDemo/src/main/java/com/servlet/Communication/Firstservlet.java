package com.servlet.Communication;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/first")
public class Firstservlet extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {  
	//System.out.println("control came to 1st servlet"); //1st print this and go to next line
		//fetching valuse from web page(index.html)
	String c=req.getParameter("cri");
	String f=req.getParameter("foot");

	//resp.sendRedirect("sec");   //link to 2nd servlet no need to use/
	//CREATE SESSION ATTRIBUTE
	//HttpSession sess=req.getSession();
	//sess.setAttribute("cricketer", c);    //set variable c for cricketer
	//sess.setAttribute("footballer", f);   //set variable f for cricketer
	//req.setAttribute("data", value); //before made dispatcher must use set atri for req, data place we cwn give any name,pass value var set on before code
	//RequestDispatcher rd=req.getRequestDispatcher("sec");           //need to pass url to another servlet,return us object of dispatcher type
	//rd.forward(req, resp);
	//CREATING COOKIS OBJECT
	Cookie c1=new Cookie("Cricketer",c);    //give some name foe cookis and give some value "c"
	Cookie c2=new Cookie("Footballer",f);
	//ADDING COOKIES TO RESPONSE 
	resp.addCookie(c1);
	resp.addCookie(c2);
//REDIRECTING TO SECONDSERVLET

	resp.sendRedirect("sec");
	}

}
