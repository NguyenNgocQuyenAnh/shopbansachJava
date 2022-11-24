package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bo.giohangbo;

/**
 * Servlet implementation class suaxoa
 */
@WebServlet("/suaxoa")
public class suaxoa extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public suaxoa() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		giohangbo gh=(giohangbo)session.getAttribute("gio");
		if(request.getParameter("butcheck")!=null){
			String[] arr=request.getParameterValues("check");
			if(arr!=null)
			   for(String st:arr)
				 gh.xoa(st);
		}
		if(request.getParameter("butsua")!=null){
			String ms=request.getParameter("butsua");
			String tendksl="t"+ms;
			long sl=Long.parseLong(request.getParameter(tendksl));
			if(sl==0){
				gh.xoa(ms);
			}
			else{
				//gh.sua(ms, sl);
				gh.sua(ms, sl);
			}
		}else
			if(request.getParameter("butxoa")!=null){
				String ms=request.getParameter("butxoa");
				gh.xoa(ms);
			}
		else if(request.getParameter("butxoaAll")!=null){
			gh.xoaAll();
		}
		if(gh.ds.size()==0)//Neu trong gio het hang
			   response.sendRedirect("htsach");
		else
			   response.sendRedirect("htgio");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
