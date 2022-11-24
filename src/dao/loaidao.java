package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import bean.loaibean;

public class loaidao {
	  public ArrayList<loaibean> getloai(){
		   try {
			   ArrayList<loaibean> ds= new ArrayList<loaibean>();
			   //b1: Ket noi vao csdl
			   KetNoi kn = new KetNoi();
			   kn.KetNoi();
			   //b2: Lay du lieu ve
			   String sql = "select * from loai";
			   PreparedStatement cmd = kn.cn.prepareStatement(sql);
			   ResultSet rs = cmd.executeQuery();
			   //b3: Duyet qua tap du lieu lay ve
			   while(rs.next()) {
				   String maloai = rs.getString("maloai");
				   String tenloai = rs.getString("tenloai");
				   ds.add(new loaibean(maloai, tenloai));
			   }
			   //b4: Dong rs va cn
			   rs.close();
			   kn.cn.close();
			   return ds;
		   }catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	   }
}