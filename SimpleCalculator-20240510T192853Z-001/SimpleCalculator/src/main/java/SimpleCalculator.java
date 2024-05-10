


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class SimpleCalculator
 */
public class SimpleCalculator extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		try (PrintWriter out = response.getWriter()) {
			double num1, num2, result;
			num1 = Double.parseDouble(request.getParameter("num1"));
			num2 = Double.parseDouble(request.getParameter("num2"));
			result = 0;
			String opr=request.getParameter("opr");
			if(opr.equals("+")) result = num1 + num2;
			if(opr.equals("-")) result = num1 - num2;
			if(opr.equals("*")) result = num1 * num2;
			if(opr.equals("/")) result = num1 / num2;
			out.println("<h1> Result = "+result); 
			out.println("</body></html>");
		}

	}
}

