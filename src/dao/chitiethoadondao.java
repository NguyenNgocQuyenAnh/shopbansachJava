package dao;

import java.sql.PreparedStatement;

public class chitiethoadondao {
	public int them(String masach, int soluongmua, int mahoadon) {
		try {
			KetNoi kn= new KetNoi();
			kn.KetNoi();
			String sql="insert into ChiTietHoaDon(MaSach,SoLuongMua,MaHoaDon,DaMua) values(?,?,?,?)";
			PreparedStatement cmd= kn.cn.prepareStatement(sql);
			cmd.setString(1, masach);
			cmd.setInt(2,soluongmua);
			cmd.setInt(3,mahoadon);
			cmd.setBoolean(4, false);
			int kq= cmd.executeUpdate();
			kn.cn.close();
			return kq;
		} catch (Exception e) {
			// TODO: handle exception
			return 0;
		}
	
	}
}
