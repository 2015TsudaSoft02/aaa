package com.tuyano.libro.mygaeapp;

import java.io.IOException;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.tuyano.libro.mygaeapp.LinkData;
import com.tuyano.libro.mygaeapp.PMF;
public class DelLinkDataServlet extends HttpServlet{
private static final long serialVersionUID = 1L;
@Override
protected void doGet(HttpServletRequest req,
HttpServletResponse resp)
throws ServletException, IOException {
resp.setContentType("text/plain");
resp.getWriter().println("no url...");
}
@Override
protected void doPost(HttpServletRequest req,
HttpServletResponse resp)
throws ServletException, IOException {
req.setCharacterEncoding("UTF-8");
long id = Long.parseLong(req.getParameter("id"));
PersistenceManagerFactory factory = PMF.get();
PersistenceManager manager = factory.getPersistenceManager();
LinkData data = (LinkData)manager.getObjectById(LinkData.class,id);
manager.deletePersistent(data);
manager.close();
resp.sendRedirect("/index.html");
}
}