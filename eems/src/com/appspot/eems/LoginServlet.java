package com.appspot.eems;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@SuppressWarnings("serial")
public class LoginServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp )
	throws ServletException, IOException{
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/jsp/login.jsp");
		dispatcher.forward(req, resp);
	}
}
