package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import bean.khachhangbean;
import bean.sachbean;

public class khachhangdao {
	public ArrayList<khachhangbean> getkh(){
		 try {
			   ArrayList<khachhangbean> ds= new ArrayList<khachhangbean>();
			   //b1: Ket noi vao csdl
			   KetNoi kn = new KetNoi();
			   kn.KetNoi();
			   //b2: Lay du lieu ve
			   String sql = "select * from KhachHang";
			   PreparedStatement cmd = kn.cn.prepareStatement(sql);
			   ResultSet rs = cmd.executeQuery();
			   //b3: Duyet qua tap du lieu lay ve
			   while(rs.next()) {
				   Long makh = rs.getLong("makh");
				   String hoten = rs.getString("hoten");
				   String diachi = rs.getString("diachi");
				   String sodt = rs.getString("sodt");
				   String email = rs.getString("email");
				   String tendn = rs.getString("tendn");
				   String pass = rs.getString("pass");
				   ds.add(new khachhangbean(makh, hoten, diachi, sodt, email, tendn, pass));
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
	public int dangky(String hoten, String email, String tendn, String pass) throws Exception{		  
			   KetNoi kn = new KetNoi();
			   kn.KetNoi();
			   //b2: Lay du lieu ve
			   String sql = "insert into KhachHang (hoten,email,tendn,pass) values (?,?,?,?)";
			   PreparedStatement cmd = kn.cn.prepareStatement(sql);
			  cmd.setString(1, hoten);
			  cmd.setString(2, email);
			  cmd.setString(3, tendn);
			  cmd.setString(4, pass);
			  
			  return cmd.executeUpdate();
		}
}
