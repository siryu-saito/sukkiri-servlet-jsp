package ex62;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex62Servlet")
public class Ex62Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
		HttpServletResponse response)
		throws ServletException, IOException {
		
		int rand = (int) (Math.random() * 10);
		if (false) {
			response.sendRedirect("redirected.jsp");
		} else {
			RequestDispatcher d = request.getRequestDispatcher(
				"/forwarded.jsp");
			d.forward(request,  response);
		}
	}

}
