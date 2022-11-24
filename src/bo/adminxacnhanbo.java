package bo;

import java.util.ArrayList;

import bean.adminxacnhanbean;
import dao.adminxacnhandao;

public class adminxacnhanbo {
	adminxacnhandao xndao= new adminxacnhandao();
	  public ArrayList<adminxacnhanbean> getdanhsach(){
		  return xndao.getdanhsach();
	  }


}
