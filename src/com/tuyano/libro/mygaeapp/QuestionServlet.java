package com.tuyano.libro.mygaeapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class QuestionServlet extends HttpServlet {

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
	    out.println("<BODY background="+"./flowerbanner0036.jpg"+">");
	    out.println("<H1><Center><font color="+""+">アンケート内容確認</font></Center></H1>");
	    out.println("<BR><HR><BR>");
	    out.println("<UL>");
	    out.println("<tr>");
	    out.println("<center>氏名</center>"+"<center>"+req.getParameter("name")+"</center>");
	    out.println("<Center>年齢</Center>"+ "<center>"+req.getParameter("age")+"</center>");
	    out.println("<Center>住所</Center>"+ "<center>"+req.getParameter("address")+"</center>");
	    out.println("<Center>サイトの良いところ</Center>"+ "<center>"+req.getParameter("good")+"</center>");
	    out.println("<Center>サイトの悪いところ</Center>"+ "<center>"+req.getParameter("bad")+"</center>");
	    out.println("<Center>アレルギー</Center>"+ "<center>"+req.getParameter("allergie")+"</center>");
	    out.println("<Center>ご要望または感想(フリースペース)</Center>"+ "<center>"+req.getParameter("request")+"</center>");
	    out.println("</div>");
	    out.println("</table>");
	    out.println("<center><a href=ok.html>この内容で送信する</a> "+" <a href=question.html>この内容を変更する</a></center>");
	    out.println("<div><Center>Copyright &copy; 2015 Suger Pop All Rights Reserved.</Center></div>");
	    out.println("</BODY>");
	    out.println("</HTML>");
	    out.close();
}
}