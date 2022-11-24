package bean;

public class loaibean {
  private String maloai;
  private String tenloai;
  //phat sinh 2 ham tao: kh tham so va day du tham so
  //phat sinh cac ham get set
public loaibean(String maloai, String tenloai) {
	super();
	this.maloai = maloai;
	this.tenloai = tenloai;
}
public loaibean() {
	super();
	// TODO Auto-generated constructor stub
}

public String getMaloai() {
	return maloai;
}
public void setMaloai(String maloai) {
	this.maloai = maloai;
}
public String getTenloai() {
	return tenloai;
}
public void setTenloai(String tenloai) {
	this.tenloai = tenloai;
}
  
}
