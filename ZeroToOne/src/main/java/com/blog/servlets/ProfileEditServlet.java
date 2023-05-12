package com.blog.servlets;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import com.blog.dao.UserDao;
import com.blog.entities.User;
import com.blog.helper.ConnectionProvider;
import com.blog.helper.Helper;


//is annotation se hm classko bata rahe hain ki form mein multipart data aaya hai 
@MultipartConfig
@WebServlet("/ProfileEditServlet")
public class ProfileEditServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		//fetching all the details 
		String userEmail=request.getParameter("email");
		String userNumber=request.getParameter("number");
		String userPassword=request.getParameter("password");
		Part part=request.getPart("image");
		String imageName=part.getSubmittedFileName();
		
		
		//getting user from session 
		
		HttpSession session=request.getSession();
	User user=(User)session.getAttribute("currentUser");
	user.setEmail(userEmail);
		user.setNumber(userNumber);
		user.setPassword(userPassword);
		
		String oldPathImage=user.getProfile();
		user.setProfile(imageName);
		
		
		
		//update new details in database 
		UserDao uDao=new UserDao(ConnectionProvider.getConnection());
	boolean ans=	uDao.updateUserDetails(user);
	
		if (ans) {
			//setting new path for image 
			String path="C:\\Users\\Gaurav\\Desktop\\HibernateProject\\ZeroToOne\\src\\main\\webapp\\pics"+File.separator+user.getProfile();
			
			System.out.println(path);
			//deleting old path image 
			String path1="C:\\Users\\Gaurav\\Desktop\\HibernateProject\\ZeroToOne\\src\\main\\webapp\\pics"+File.separator+oldPathImage;
			System.out.println(path1);
			Helper.deletePath(path1);
				if (Helper.saveFile(part.getInputStream(), path)) {
					session.setAttribute("sucMsg2", "Profile Updated Successfully..");
					response.sendRedirect("profile.jsp");
					
					
				}
				else {
					
					response.sendRedirect("profile.jsp");
				}
			}
			
		}
		
	}

	

	
	

