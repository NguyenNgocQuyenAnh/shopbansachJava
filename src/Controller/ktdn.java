package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.khachhangbean;
import bo.khachhangbo;

/**
 * Servlet implementation class ktdn
 */
@WebServlet("/ktdn")
public class ktdn extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ktdn() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String un = request.getParameter("txtun");
	     String pass = request.getParameter("txtpass");
	     String but = request.getParameter("but1");
	      if(un!=null && pass!=null) 
	      {
		    	 HttpSession session = request.getSession();
		    	 khachhangbo khbo= new khachhangbo();
		    	 ArrayList<khachhangbean> dskhg = khbo.getkh();
		    	 khachhangbean kh = new khachhangbean();
//		    	 Neu chua tao session
		    	 kh = khbo.ktdn(un, pass);
		    	if(kh != null)
		    	 { session.setAttribute("kh", kh);
		           RequestDispatcher rd = request.getRequestDispatcher("htsach");
		    	   rd.forward(request, response);
		    	 }
		    	else {
					request.setAttribute("error", "error");
					RequestDispatcher rd = request.getRequestDispatcher("dangnhaplogin.jsp");
					rd.forward(request, response);
				}
	      }
		    else { // chay lan dau
		    	RequestDispatcher rd = request.getRequestDispatcher("dangnhaplogin.jsp");
		        rd.forward(request, response);
		    }   
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
