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
	    out.println("<H1>SignUp Dagta</H1>");
	    out.println("<BR><HR><BR>");
	    out.println("<UL>");
	    out.println("<tr>");
	    out.println("<th>"+"<h1>配送場所</h1>"+req.getParameter("place"));
	    out.println("<th>" + "<h1>配送日時</h1>"+ req.getParameter("date"));
	    out.println("</tr></div>");
	    out.println("</table>");
	    out.println("<a href=thankyou.html>この内容で注文する</a>");
	    out.println("</BODY>");
	    out.println("</HTML>");
	    out.close();
	}

}