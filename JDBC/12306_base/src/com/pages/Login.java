package com.pages;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.db.DBUtil;
import com.tools.Input;

public class Login {
	static Connection con;
	static PreparedStatement ps;
	static ResultSet rs;

	public static void userLogin() {

		con = DBUtil.getConnection();

		System.out.println("--------�����¼ҳ��--------");

		System.out.println("�������û���");
		String uname = Input.sc.next();

		System.out.println("����������");
		String upsw = Input.sc.next();

		if (check(uname, upsw)) {

			System.out.println("��¼�ɹ��������û�ҳ��");

			if (rule(uname)) {
				Management.UserManagement(uname);
			} else {
				UserPage.Userpage(uname);
			}

		} else {

			System.out.println("��¼ʧ�ܣ�3��󷵻���ҳ��");

		}

		try {
			Thread.currentThread();
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("");

		Main.mainPage();
	}

	private static boolean check(String uname, String upsw) {
		String pass = null;
		// �������ݿ���к���
		String reg = "select * from tab_user where username=?";
		con = DBUtil.getConnection();
		try {
			ps = con.prepareStatement(reg);
			ps.setString(1, uname);
			rs = ps.executeQuery();
			if (rs.next()) {
				pass = rs.getString("psd");
			} else {
				System.out.println("�û��������ڣ�");
				return false;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeConnection(rs, ps, con);
		}
		if (pass.equals(upsw)) {
			return true;
		}
		return false;
	}

	private static boolean rule(String uname) {
		int r = 2;
		String reg = "select ru from tab_user where username=?";
		con = DBUtil.getConnection();
		try {
			ps = con.prepareStatement(reg);
			ps.setString(1, uname);
			rs = ps.executeQuery();
			System.out.println(r);
			if (rs.next()) {
				r = rs.getInt("ru");// ȡ����4�е�ֵ�ж�Ȩ��
			}
			System.out.println(r);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeConnection(rs, ps, con);
		}
		System.out.println(r == 1);
		return r == 1;
	}

}
