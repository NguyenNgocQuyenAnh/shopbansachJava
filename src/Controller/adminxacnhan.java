package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import bo.adminxacnhanbo;

/**
 * Servlet implementation class adminxacnhan
 */
@WebServlet("/adminxacnhan")
public class adminxacnhan extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public adminxacnhan() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 HttpSession session= request.getSession();
		    if(session.getAttribute("admin")!=null) {
				adminxacnhanbo xnbo=new adminxacnhanbo();
			    request.setAttribute("dsxn", xnbo.getdanhsach());
			    RequestDispatcher rd=request.getRequestDispatcher("adminxacnhan.jsp");
			    rd.forward(request, response);
			 }else
				 response.sendRedirect("dangnhapadmin");

		
		}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
