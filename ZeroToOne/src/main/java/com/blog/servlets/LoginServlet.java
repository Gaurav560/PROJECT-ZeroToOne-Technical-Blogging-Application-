package com.blog.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.blog.dao.UserDao;
import com.blog.entities.User;
import com.blog.helper.ConnectionProvider;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {

			String email = request.getParameter("email");
			String password = request.getParameter("password");

			UserDao uDao = new UserDao(ConnectionProvider.getConnection());
			User user = uDao.getUserDetailsByEmailAndPassword(email, password);

			HttpSession session = request.getSession();
			if (user != null) {
				session.setAttribute("currentUser", user);
				response.sendRedirect("profile.jsp");
			} else {
				session.setAttribute("failMsg", "Invalid Login Credentials.");
				response.sendRedirect("login_page.jsp");
			}

		} catch (Exception e) {

		}

	}

}
