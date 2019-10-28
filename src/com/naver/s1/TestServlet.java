package com.naver.s1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public TestServlet() {
        super();
    }
    
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RandomTest randomTest = new RandomTest();
		int num = randomTest.getNum();
		
		String name =  request.getParameter("name");
		String age = request.getParameter("age");
		
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<style type=\"text/css\">");
		out.println("#i1{color: red;}");
		out.println("</style>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1 id=\"i1\">"+num+name+age+"</h1>");
		out.println("</body>");
		out.println("</html>");
		
		/*
		 * String encoding = request.getCharacterEncoding(); String la =
		 * request.getLocalAddr(); int lp = request.getLocalPort(); String method =
		 * request.getMethod(); String sa = request.getRemoteAddr(); int sq =
		 * request.getRemotePort();
		 * 
		 * System.out.println(encoding); System.out.println(la); System.out.println(lp);
		 * System.out.println(method); System.out.println(sa); System.out.println(sq);
		 */
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
