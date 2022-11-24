package bo;

import java.util.ArrayList;

import org.apache.jasper.tagplugins.jstl.core.Remove;

import bean.giohangbean;

public class giohangbo {
	  public ArrayList<giohangbean> ds = 
			  new ArrayList<giohangbean>();
	  public void Them(String masach, String tensach, long gia, long soluong) {
		  for(giohangbean h: ds)
			  if(h.getMasach().equals(masach)) {
				 // h.setSoluong(h.getSoluong()+ soluong);
				  h.setSoluong(h.getSoluong()+ soluong);
				  return;
			  }
		   ds.add(new giohangbean(masach, tensach, gia, soluong));
	  }
	  public long Tongtien() {
		  long s=0;
		  for(giohangbean h: ds)
			  s=s+h.getThanhtien();
		  return s;
	  }
		 public void sua(String ms , long sl) {
			 for(giohangbean g : ds) {
				 if(g.getMasach().equals(ms))
				 {
			          g.setSoluong(sl);;
			          return;
				 }
			 }
		 }
 public void xoa(String ms) {
		 for(int i=0; i<ds.size(); i++) {
			 if(ds.get(i).getMasach().equals(ms)) {
				 ds.remove(i);
				 return;
			 }
		 }
	 }
	 public void xoaAll() {
         ds.removeAll(ds);
	 }
	 public int countBook() {
			int count = 0;
			for (giohangbean g: ds) {
				count++;
			}
			
			return count;
		}
}
