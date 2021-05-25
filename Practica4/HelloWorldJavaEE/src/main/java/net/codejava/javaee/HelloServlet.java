package net.codejava.javaee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/helloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public HelloServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String yourName = request.getParameter("yourName");	//extrae del jsp
		String yourAge = request.getParameter("yourAge");	//extrae del jsp
		Person person = new Person();
		person.setName(yourName);
		person.setAge(yourAge);
		request.setAttribute("person",person);
		RequestDispatcher dispatcher =
				request.getRequestDispatcher("welcome.jsp");
				dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		doGet(request, response);
	}

}
