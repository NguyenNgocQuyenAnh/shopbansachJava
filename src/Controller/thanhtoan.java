package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.giohangbean;
import bean.khachhangbean;
import bo.giohangbo;
import dao.chitiethoadondao;
import dao.hoadondao;

/**
 * Servlet implementation class thanhtoan
 */
@WebServlet("/thanhtoan")
public class thanhtoan extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public thanhtoan() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		hoadondao hddao= new hoadondao();
		chitiethoadondao  ct = new chitiethoadondao();
		HttpSession ss=request.getSession();
		khachhangbean kh= (khachhangbean) ss.getAttribute("kh");
		    if(kh == null) {
		    	RequestDispatcher rd = request.getRequestDispatcher("ktdn");
				rd.forward(request, response);
		    }
			if(kh!=null) {
				giohangbo gh= (giohangbo)ss.getAttribute("gio");
				hddao.Them(kh.getMakh());//them vao 1 hoa don;
				int mahd=hddao.mahoadon();
				for(giohangbean g: gh.ds) 
				{
				  ct.them(g.getMasach(),(int)g.getSoluong(), mahd);	
				}
				ss.removeAttribute("gio");
		    }
		RequestDispatcher rd = request.getRequestDispatcher("htsach");
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
