

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Calculator")
public class Calculator extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>Calc result</title></head><body><center>");
		int a = Integer.parseInt(request.getParameter("t1"));
		int b = Integer.parseInt(request.getParameter("t2"));
		int c = 0;
		String op = request.getParameter("opr");
		if (op.equals("+")) c = a+b;
		if (op.equals("-")) c = a-b;
		if (op.equals("*")) c = a*b;
		if (op.equals("/")) c = a/b;
		out.println("<h3> Result = " + c + "</h3>");	
		out.println("To go to main page <a href = index.html> Click Here </a>");
		out.println("</center></body></html>");
		}
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
