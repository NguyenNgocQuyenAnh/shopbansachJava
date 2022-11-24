package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bo.khachhangbo;

/**
 * Servlet implementation class dangky
 */
@WebServlet("/dangky")
public class dangky extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public dangky() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String hoten = request.getParameter("hoten");
		 String email = request.getParameter("email");
		 String tendn = request.getParameter("tendn");
		 String pass = request.getParameter("psw");
		 String passRepeat = request.getParameter("psw-repeat");
		 HttpSession session = request.getSession();
		 if(hoten!= null && email !=null && tendn!=null&& pass!= null) {
			khachhangbo kh = new khachhangbo();
			if(pass.equals(passRepeat)){
				try {
						kh.them(hoten, email, tendn, pass);
					} catch (Exception e) {
						e.printStackTrace();
					}
					 RequestDispatcher rd = request.getRequestDispatcher("ktdn");
					 rd.forward(request, response);
				                       }
		    else {
				     RequestDispatcher rd = request.getRequestDispatcher("dangky.jsp");
				     rd.forward(request, response);
			} 
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
