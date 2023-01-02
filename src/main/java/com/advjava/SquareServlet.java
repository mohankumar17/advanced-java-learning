package com.advjava;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/square")
public class SquareServlet extends HttpServlet {

	private static final long serialVersionUID = 404033344140868741L;

	public void doPost(HttpServletRequest req, HttpServletResponse res) {

		int val = (int) req.getAttribute("sum");
		// int val = Integer.parseInt(req.getParameter("val"));

		/*
		 * HttpSession session = req.getSession(); int val = (int)
		 * session.getAttribute("val");
		 */

		/*
		 * int val = 0; Cookie[] cookies = req.getCookies(); for (Cookie c : cookies) {
		 * if (c.getName().equals("val")) { val = Integer.parseInt(c.getValue()); } }
		 */

		PrintWriter out = null;
		try {
			out = res.getWriter();
		} catch (IOException e) {
			e.printStackTrace();
		}
		out.println("Square of the sum of both numbers is: " + (val * val));
	}

}
