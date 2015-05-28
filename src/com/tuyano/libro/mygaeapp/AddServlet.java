package com.tuyano.libro.mygaeapp;

import java.io.IOException;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet {
	private static final long serialVersionUID = 1L;
	 
    protected void doGet(HttpServletRequest req,
            HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("text/plain");
        resp.getWriter().println("no url...");
    }
 
    protected void doPost(HttpServletRequest req,
            HttpServletResponse resp)
            throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String name = req.getParameter("name");
        String picture = req.getParameter("picture");
        String price = req.getParameter("price");
        LinkData data = new LinkData(name, picture, price);
        PersistenceManagerFactory factory = PMF.get();
        PersistenceManager manager = factory.getPersistenceManager();
        try {
            manager.makePersistent(data);
        } finally {
            manager.close();
        }
        resp.sendRedirect("/index.html");
    }
}
