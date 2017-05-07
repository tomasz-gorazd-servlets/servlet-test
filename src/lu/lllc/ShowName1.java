package lu.lllc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ShowName1
 */
@WebServlet("/ShowName1")
public class ShowName1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ShowName1() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String name;
		HttpSession session = request.getSession();
		name = (String) session.getAttribute("name");

		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML><html><body bgcolor='yellow'><h1>Welcome to Servlet 1</h1>");
		if (name != null) {
			out.println("Your name is: <strong>" + name + "</strong><br>");
		} else {
			out.println("Your name is <strong>unknown</strong> at this moment <br>");
		}
		out.println("<a href = '/MyName'>Back</a>");
		out.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
