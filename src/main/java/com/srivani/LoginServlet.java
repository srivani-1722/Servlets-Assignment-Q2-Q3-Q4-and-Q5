package com.srivani;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		String uname=(String) req.getParameter("uname");
		String pwd=(String) req.getParameter("pwd");
		ServletContext cons=getServletContext();
		String val=cons.getInitParameter("name");
		if(uname.equals("srivani") && pwd.equals("root")) {
			RequestDispatcher dis=req.getRequestDispatcher("/home");
			dis.forward(req, res);
		}
		else {
			res.setContentType("text/html");

			ServletContext cons1=getServletContext();
			String val1=cons1.getInitParameter("name");
			RequestDispatcher dis=req.getRequestDispatcher("index.html");
			res.getWriter().println("<center><p style=\"color:#FF0000\">please check the credentials entered</p></center>\n<h1>"+val1+"</h1>");

			dis.include(req, res);


		}
		
	}

}
