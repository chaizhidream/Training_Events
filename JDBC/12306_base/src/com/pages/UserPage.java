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
		System.out.println("***********�����û�ҳ��***********");
		System.out.println("*��ѡ����*");
		System.out.println("1����ѯ������Ϣ");
		System.out.println("2���޸�������Ϣ");
		System.out.println("���������ص���ҳ");
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
			System.out.println("������ҳ");
		       Main.mainPage();
		}
	
	}
	
	
}
