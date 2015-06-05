package com.tuyano.libro.mygaeapp;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class PlaceServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest req, HttpServletResponse res)
	          throws ServletException, IOException {
	    res.setContentType("text/html; charset=UTF-8");
	    PrintWriter out = res.getWriter();
	    //クライアントに送るHTML
	    out.println("<div align=(center)");
	    out.println("<HTML>");
	    out.println("<HEAD>");
	    out.println("<TITLE>配送場所・配送日時</TITLE>");
	    out.println("</HEAD>");
	    out.println("<BODY>");
	    out.println("<H1><Center>SignUp Dagta</Center></H1>");
	    out.println("<BR><HR><BR>");
	    out.println("<UL>");
	    out.println("<tr>");
	    out.println("<center>配送場所</center>"+"<center>"+req.getParameter("place")+"</center>");
	    out.println("<Center>配送日時</Center>"+ "<center>"+req.getParameter("date")+"</center>");
	    out.println("</div>");
	    out.println("</table>");
	    out.println("<center><a href=thankyou.html>この内容で注文する</a> "+" <a href=place_date.html>この内容を変更する</a></center>");
	    out.println("</BODY>");
	    out.println("</HTML>");
	    out.close();
	}

}