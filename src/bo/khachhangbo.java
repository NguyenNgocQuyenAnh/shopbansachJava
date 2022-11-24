package bo;

import java.util.ArrayList;
import bean.khachhangbean;
import dao.khachhangdao;


public class khachhangbo {
//	 sachdao sdao = new sachdao();
//	  ArrayList<sachbean> ds;
//	  public ArrayList<sachbean> getsach(){
//		  ds =sdao.getsach();
//		  return ds;
//	  }
	khachhangdao khdao = new khachhangdao();
	ArrayList<khachhangbean> ds;
	public ArrayList<khachhangbean> getkh(){
		ds = khdao.getkh();
		return ds;
	}
	 public khachhangbean ktdn(String tendn , String pass){
		   ds = khdao.getkh();
		   for(khachhangbean s: ds)
			   if(s.getTendn().equals(tendn) && s.getPass().equals(pass))
				   return s;
		   return null;
	  }
//	 public khachhangbean ktdn(String tendn , String pass){
//		   return khdao.ktdn(us,pass)
//	  }
	 public void them(String hoten , String email , String tendn ,String pass) throws Exception {
		  khdao.dangky(hoten,email,tendn,pass);
	 }
}
