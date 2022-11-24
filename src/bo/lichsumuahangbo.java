package bo;

import java.util.ArrayList;

import bean.lichsumuahangbean;
import dao.lichsumuahang;

public class lichsumuahangbo {
		lichsumuahang lsdao = new lichsumuahang();
		public ArrayList<lichsumuahangbean> getList(Long makh){
			return lsdao.getlichsu(makh);
	}
}
