package com.pages;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.dao.Impl.UserImpl;
import com.tools.Input;

public class UserPage {
	static Connection con;
	static PreparedStatement ps;
	static String uname=null;
	public static void Userpage(String name){

uname=name;
		System.out.println("***********进入用户页面***********");
		System.out.println("*请选择功能*");
		System.out.println("1：查询自身信息");
		System.out.println("2：修改自身信息");
		System.out.println("按其他键回到首页");
	      String s=	Input.sc.next();
		if (s.equals("1")) {
			try {
				new UserImpl().select(uname);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			Userpage(uname);
		} else if(s.equals("2")){
			try {
				new UserImpl().updateUser(name);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			Userpage(uname);
		}else {
			System.out.println("返回首页");
		       Main.mainPage();
		}
	
	}
	
	
}
