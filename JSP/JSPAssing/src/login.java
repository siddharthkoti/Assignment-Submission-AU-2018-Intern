import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
       super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		
		String email = request.getParameter("email");
		String pw = request.getParameter("password");
		
		
if(pw.equals("q")) {
			
			List<Employee> l = new ArrayList<Employee>();
			
			Employee e1 = new Employee("Siddharth Koti","siddharth@gmail.com","Block-Chain","Accolite","20k");
			Employee e2 = new Employee("Rakesh Kumar","Rakesh@gmail.com","electronics","DE shaw","20k");
			Employee e3 = new Employee("Divya S","Divya@gmail.com","Machiene Learning","Goldman Sacchs","20k");
			Employee e4 = new Employee("Ananta M","ananta@gmail.com","Python-Frame work","Morgan Stanley", "30k");
			
			l.add(e1);
			l.add(e2);
			l.add(e3);
			l.add(e4);
			
			
			
			request.setAttribute("list", l);
			RequestDispatcher rd = request.getRequestDispatcher("employees_managed.jsp");
			rd.forward(request,response);
		}else {
			RequestDispatcher rd = request.getRequestDispatcher("error.jsp");
			rd.forward(request,response);
		}
	}

}
