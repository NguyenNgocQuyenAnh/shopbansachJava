package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import bean.hoadonbean;
import bean.khachhangbean;

public class hoadondao {
	public int Them(long makh) {
		try {
			KetNoi kn= new KetNoi();
			kn.KetNoi();
			String sql="insert into hoadon(makh,NgayMua,damua) values(?,?,?)";
			PreparedStatement cmd= kn.cn.prepareStatement(sql);
			cmd.setLong(1, makh);
			SimpleDateFormat dd = new SimpleDateFormat("yyyy-MM-dd");
			Date d = new Date();
			Date ngay = dd.parse(dd.format(d));
			cmd.setDate(2, new java.sql.Date(ngay.getTime()));
			cmd.setBoolean(3, false);
			int kq= cmd.executeUpdate();
			kn.cn.close();
			return kq;
		} catch (Exception e) {
			return 0;
		}
	}

    public int mahoadon() {
		try {
			KetNoi kn= new KetNoi();
			kn.KetNoi();
			String sql="select max(mahoadon) as mahd from hoadon";
			PreparedStatement cmd= kn.cn.prepareStatement(sql);
			ResultSet rs= cmd.executeQuery();
			int mahd=0;
			if(rs.next()) {
				mahd=rs.getInt("mahd");
			}
			rs.close(); kn.cn.close();
			return mahd;
		} catch (Exception e) {
			// TODO: handle exception
			return 0;
		}
		
	}
//    public int xacNhanMua(long mahd) throws Exception {
//    	KetNoi kn = new KetNoi();
//		   kn.KetNoi();
//		   //b2: Lay du lieu ve
//		   String sql = "update hoadon set damua =? where MaHoaDon = ?";
//		   PreparedStatement cmd = kn.cn.prepareStatement(sql);
//		   cmd.setBoolean(1, true);
//		   cmd.setLong(2, mahd);
//		  return cmd.executeUpdate();
//    }
}
