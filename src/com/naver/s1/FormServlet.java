package com.naver.s1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FormServlet")
public class FormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public FormServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("form test get");
		
		String search = request.getParameter("search");
		String pw =  request.getParameter("pw");
		String age = request.getParameter("age");
		
		int num = Integer.parseInt(age);
		
		System.out.println(search);
		System.out.println(pw);
		System.out.println(num*10);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("form test post");

		doGet(request, response);
	}

}
