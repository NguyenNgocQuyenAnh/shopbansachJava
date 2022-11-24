package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;

import bean.lichsumuahangbean;

public class KetNoi {
	public Connection cn;
	public void KetNoi() {
		  		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			System.out.println("Da xac dinh HQTCSDL");
			String url ="jdbc:sqlserver://LAPTOP-MB50MFR1\\SQLEXPRESS:1433;databaseName=QLSach;user=sa; password=Ron25251325";
			cn= DriverManager.getConnection(url);
			System.out.println("da ket noi den csdl");
		} catch (Exception e) {  
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	public static void main(String[] args) {
		KetNoi kn = new KetNoi();
		kn.KetNoi();
	
	}
}