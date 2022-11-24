package bo;

import dao.hoadondao;

public class hoadonbo {
	hoadondao hddao= new hoadondao();
	public int mahoadonmoi() {
		return hddao.mahoadon();
	}
	public long them(long makh) {
		return hddao.Them(makh);
	}
}
