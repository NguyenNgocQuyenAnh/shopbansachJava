package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bo.loaibo;
import bo.sachbo;
import bean.loaibean;
import bean.sachbean;

/**
 * Servlet implementation class htsach
 */
@WebServlet("/htsach")
public class htsach extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public htsach() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		loaibo lbo=new loaibo();
        ArrayList<loaibean> dsloai=lbo.getloai(); // lay ds loai ve
        request.setAttribute("dsloai", dsloai); // chuyen sang cho htsach.jsp
        
        sachbo sbo = new sachbo();
        ArrayList<sachbean> dssach = sbo.getsach(); // lay sach ve
        String ml=request.getParameter("ml");
        String key=request.getParameter("txttk");
        if(ml!=null)
          	dssach=sbo.TimMa(ml);
        else
          	if(key!=null)
          		dssach=sbo.Tim(key);
          
        int trang;
  		if(request.getParameter("trang") == null) {
  			trang = 1;
  		}else trang = Integer.parseInt(request.getParameter("trang"));
  		
  		request.setAttribute("trang", trang);
  		  
        request.setAttribute("dssach", dssach); //gui ve cho htsach.jsp
        RequestDispatcher rd= request.getRequestDispatcher("htsach.jsp");
        rd.forward(request, response);
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
