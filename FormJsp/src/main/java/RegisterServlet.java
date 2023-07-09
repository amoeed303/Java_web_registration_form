//package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet(name = "register", urlPatterns = {"/RegisterServlet"})
//@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	//private static final long serialVersionUID = 1L;
	private static final long serialVersionUID = 102831973239L;
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String em = request.getParameter("user_email");
	      String un = request.getParameter("user_name");
		String pa = request.getParameter("user_password");
	      String ge = request.getParameter("user_gender");
	      String co = request.getParameter("user_section");

	      response.setContentType("text/html");
	      PrintWriter pw=response.getWriter();
	      pw.write("<h2> Following data received sucessfully.. <h2> <br>");
	      pw.write("<h3> Email: "+ em +" </h3>");
	      pw.write("<h3> User name: "+ un +" </h3>");
	      pw.write("<h3> Password: "+ pa +" </h3>");
	      pw.write("<h3> Gender: "+ ge +" </h3>");
	      pw.write("<h3> Course:  "+co+"<h3>");
	     
	}

}
