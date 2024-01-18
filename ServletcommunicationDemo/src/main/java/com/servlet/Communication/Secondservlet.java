package com.servlet.Communication;
import javax.servlet.http.HttpSession;

import org.apache.tomcat.util.http.parser.Cookie;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/sec")

public class Secondservlet extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {  
		//System.out.println("control came to 2nd servlet"); 
		/*String str=(String) req.getAttribute("data");// getmethod return object type must store in type cast called string
		int count=str.length();
		resp.getWriter().print("Charachter count = "+count);
		SESSION
		//getting session
		HttpSession sess=req.getSession();
		//extraction values
		String c=(String)sess.getAttribute("cricketer"); 
		String f=(String)sess.getAttribute("footballer"); 
		//display response client (browser
		resp.getWriter().print("cricketer "+c);
		resp.getWriter().print("footballer "+f);
		COOKIE*/
		//geting cookies
	       javax.servlet.http.Cookie[] cookies=req.getCookies();                // returing array of cookies javax not to use this code
	       
	       //extracting values
	       String c=cookies[0].getValue();
	       String f=cookies[1].getValue();
	       //display response to client (browser)
	       resp.getWriter().print("cricketer : "+c);
			resp.getWriter().print("footballer :  "+f);

	       

	}

}
