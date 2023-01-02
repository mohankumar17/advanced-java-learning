package com.advjava;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/add")
public class AddServlet extends HttpServlet {

	private static final long serialVersionUID = -7248815503969476312L;

	public void doPost(HttpServletRequest req, HttpServletResponse res) {
		int num1 = Integer.parseInt(req.getParameter("num1"));
		int num2 = Integer.parseInt(req.getParameter("num2"));

		int sum = num1 + num2;

		req.setAttribute("sum", sum);

		RequestDispatcher rd = req.getRequestDispatcher("square");

		try {
			rd.forward(req, res);
		} catch (ServletException | IOException e) {
			e.printStackTrace();
		}

		/*
		 * try { res.sendRedirect("square?val=" + sum); } catch (IOException e) {
		 * e.printStackTrace(); }
		 */

		/*
		 * HttpSession session = req.getSession(); session.setAttribute("val", sum);
		 */

		/*
		 * Cookie cokkie = new Cookie("val", sum + ""); res.addCookie(cokkie);
		 * 
		 * try { res.sendRedirect("square"); } catch (IOException e) {
		 * e.printStackTrace(); }
		 */

	}

}
