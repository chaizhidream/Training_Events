package com.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.db.DBUtil;


public class TestCheckCityname {
	static Connection con=null;
	static PreparedStatement ps=null;
	static ResultSet rs=null;
	static String cityname;
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);

	while(true){
		 System.out.println("请输入所在城市");
		 cityname=sc.nextLine();
		 if(checkCityname(cityname)){
		       break;
		 }else {
			 System.out.println("输入信息有误，请重新输入");
			continue;
		}
	}
	sc.close();
	 
}
private static boolean checkCityname(String cityname2) {
	
	  con=DBUtil.getConnection();
	  String sql="select * from tab_city where CITYNAME=?";		  
	 try {
		ps=con.prepareStatement(sql);
		ps.setString(1,cityname2);
		rs=ps.executeQuery();
		if (rs.next()) {
			System.out.println("找到了城市");
		cityname=rs.getString("cityname");
			return true;
		}else {
			System.out.println("城市名不存在");
		}
	} catch (SQLException e1) {
		e1.printStackTrace();
	}finally {
		DBUtil.closeConnection(rs, ps, con);
	}
	return false;
	}


}
