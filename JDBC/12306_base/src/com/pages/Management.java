package com.pages;

//����Աҳ��
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



import java.sql.SQLException;
import java.util.List;

import com.dao.Impl.UserImpl;
import com.db.DBUtil;
import com.model.User;
import com.tools.Input;

public class Management {
	static Connection con;
	static PreparedStatement ps;
	static ResultSet rs;
static String mname=null;
	public static void UserManagement(String name) {
	                mname=name;
		System.out.println("***********�������Աҳ��***********");
		
		System.out.println("*��ѡ����*");
		System.out.println("1����ѯ��Ϣ");
		System.out.println("2���޸���Ϣ");
		System.out.println("3��������Ϣ");
		System.out.println("4��ɾ����Ϣ");
		System.out.println("5��ֱ��ִ����ɾ��SQL���");
		System.out.println("���������ص���ҳ");
		
		String s = Input.sc.next();

		
		if (s.equals("1")) {
			chooseSelect();
		} else if (s.equals("2")) {
			try {
				new UserImpl().updateUser();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			UserManagement(mname);
		} else if (s.equals("3")) {
			System.out.println("��ת��ע��ҳ��");
			Register.userRegister();
			System.out.println("�������ݳɹ������ع���ҳ");
			UserManagement(mname);
		} else if (s.equals("4")) {
			deleteUser();
		} else if (s.equals("5")) {
			sql();
		} else {
			System.out.println("����������ҳ");
			Main.mainPage();
		}

	}

	private static void chooseSelect() {
	

		System.out.println("��ѡ���ѯ��ʽ");
		System.out.println("1:��ѯ�ض���Ϣ");
		System.out.println("2:����������ѯȫ����Ϣ");
		String s=Input.sc.next();

		if (s.equals("1")) {
			try {
				List<User> list = new UserImpl().select();
				list.forEach(i -> System.out.println(i.toString()));
			} catch (SQLException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}finally {
				System.out.println("��ѯ��ϣ����ع���ҳ�� ");
				UserManagement(mname);
			}

		} else {
			try {
				List<User> list = new UserImpl().showAll();
				list.forEach(i -> System.out.println(i.toString()));
			} catch (SQLException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}finally {
				System.out.println("��ѯ��ϣ����ع���ҳ�� ");
				UserManagement(mname);
			}
		}
		

	}

	private static void sql() {

String sql =Input.sc.nextLine();
		System.out.println("��������ɾ��SQL��䣺");
	 sql =Input.sc.nextLine();

		try {
			con = DBUtil.getConnection();
			ps = con.prepareStatement(sql);
			int n = ps.executeUpdate();
			System.out.println("�����ɹ�"+n+"����¼���޸�");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			System.out.println("������ϣ����ع���ҳ�� ");
			UserManagement(mname);
		}

	}

	private static void deleteUser() {
	
		
		System.out.println("������Ҫɾ�����û�����");
		String uname = Input.sc.next();
	if(uname.equals(mname)){
		System.out.println("����ɾ���Լ�");
		System.out.println("���ع���ҳ�� ");
		UserManagement(mname);
	}

		try {
			new UserImpl().deleteUser(uname);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			System.out.println("ɾ����ϣ����ع���ҳ�� ");
			UserManagement(mname);
		}

	}

}
