package com.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.db.DBUtil;

public class LoginCheck {
	static Connection con=null;
	static PreparedStatement ps=null;
	static ResultSet rs=null;
public static void main(String[] args) {
	
	String pass=null;
	//�������ݿ���к���
	String reg="select * from tab_user where USERNAME=?";
	con=DBUtil.getConnection();
	try {
		ps=con.prepareStatement(reg);
		ps.setString(1, "chaizhi");
		rs=ps.executeQuery();
		if (rs.next()) {
			pass=rs.getString("PASSWORD");
			System.out.println("�û������ڣ�");
			System.out.println(pass);
			}else {
			System.out.println("�û��������ڣ�");

		}
	
	} catch (SQLException e) {
		e.printStackTrace();
	}finally {
		DBUtil.closeConnection(rs, ps, con);
	}

	



}}
