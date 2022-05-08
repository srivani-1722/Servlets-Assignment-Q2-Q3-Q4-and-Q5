package com.srivani;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomeServlet extends HttpServlet {
	
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
		res.setContentType("text/html");
		ServletContext cons1=getServletContext();
		String val1=cons1.getInitParameter("name");
		ServletConfig con=getServletConfig();
		String val2=con.getInitParameter("name");
		PrintWriter out=res.getWriter();
		out.println("example for using servlet config and servlet context<br>");
		out.println(val1);
		out.print(val2);
		
	}

}
