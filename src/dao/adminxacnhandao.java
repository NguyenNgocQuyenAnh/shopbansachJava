package dao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import bean.khachhangbean;
import bean.adminxacnhanbean;

public class adminxacnhandao {
    public ArrayList<adminxacnhanbean> getdanhsach(){
    	try {
    		ArrayList<adminxacnhanbean> ds= new ArrayList<adminxacnhanbean>();
			KetNoi kn= new KetNoi();
			kn.KetNoi();
			String sql="select * from xacnhanmua";
			PreparedStatement cmd= kn.cn.prepareStatement(sql);
			ResultSet rs=cmd.executeQuery();
			while(rs.next()) {
				  long MaChiTietHD=rs.getLong("MaChiTietHD");
				  long MaHoaDon=rs.getLong("MaHoaDon");;
				  String hoten=rs.getString("hoten");
				  String tensach=rs.getString("tensach");;
				  long SoLuongMua=rs.getLong("SoLuongMua");;
				  long gia=rs.getLong("gia");;
				  long thanhtien=rs.getLong("ThanhTien");;
				  boolean damua=rs.getBoolean("damua");
				 ds.add(new adminxacnhanbean(MaChiTietHD, MaHoaDon, hoten, tensach, SoLuongMua, gia, thanhtien, damua));
			}
			rs.close();kn.cn.close();
			return ds;
		} catch (Exception e) {
			e.printStackTrace();return null;
		}
    }
}

