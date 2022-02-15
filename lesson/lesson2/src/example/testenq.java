package example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/testenq")
public class testenq extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response)
			throws ServletException, IOException {
			// リクエストパラメータを取得
			request.setCharacterEncoding("UTF-8");
			String name = request.getParameter("name");
			String qtype = request.getParameter("qtype");
			String body = request.getParameter("body");
			
			
			// HTMLを出力
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<meta charset=UTF-8>");
			out.println("<title>お問い合わせフォーム</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<p>" + name + qtype + body + "</p>");
			out.println("</body>");
			out.println("</html>");
	}

}
