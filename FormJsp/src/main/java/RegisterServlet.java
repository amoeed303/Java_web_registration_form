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
//for db 
// 	String name = request.getParameter("name");
// 	      String department = request.getParameter("dept");
// 	      String type = request.getParameter("type");
// 		String pl = request.getParameter("pl");
// 	      String section = request.getParameter("sec");
// 	      String designation = request.getParameter("desig");
// //
// 	      response.setContentType("text/html");
// 	      PrintWriter pw=response.getWriter();
	      
// 	      try {
// 	    	  Class.forName("com.mysql.jdbc.Driver");
// 	    	  Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/contact_form","root","");
// 	    	  PreparedStatement ps = conn.prepareStatement("insert into survey_data(name,department,type, pl,section,designation) values(?,?,?,?,?,?);");
// 	    	    ps.setString(1,name);
// 	    	    ps.setString(2,department);
// 	    	    ps.setString(3,type);
// 	    	    ps.setString(4,pl);
// 	    	    ps.setString(5,section);
// 	    	    ps.setString(6,designation);
// 	    	    int x = ps.executeUpdate();
// 	    	    if(x>0) {
// 	    	    	pw.write("<h1>Data saved successfully</h1>");
// 	    	    }else {
// 	    	    	pw.write("<h1>Data Cannot be saved</h1>");
// 	    	    }
// 	      }catch(Exception e) {
// 	    	  System.out.println(e);
// 	      }
}
