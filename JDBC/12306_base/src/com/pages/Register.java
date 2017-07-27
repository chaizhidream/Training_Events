package com.pages;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.dao.Impl.UserImpl;
import com.db.DBUtil;

import com.model.User;
import com.tools.Input;

public class Register {
	static Connection con = null;
	static PreparedStatement ps = null;
	static ResultSet rs = null;
	static String username = null;
	static String psd = null;
	static String password2 = null;
	static String realname = null;
	static Integer sex = 0;
	static String cityname = null;
	static Integer ctype = 0;
	static String cert = null;
	static Date birthday = null;
	static Integer utype = 0;
	static String information = null;

	@SuppressWarnings("deprecation")
	public static void userRegister() {

		System.out.println("--------����ע��ҳ��--------");

		// �û���
		while (true) {
			username = Input.sc.nextLine();
			System.out.println("�������û���");
			username = Input.sc.nextLine();

			if (checkUsername(username)) {
				System.out.println("��ϲ���û�����û�б�ʹ��");
				break;
			}

		}

		// ��������
		while (true) {
			System.out.println("����������");
			psd = Input.sc.nextLine();
			System.out.println("��ȷ������");
			password2 = Input.sc.nextLine();
			if (psd.equals(password2) && psd != null && password2 != null) {
				System.out.println("����������ͬ���������óɹ�");
				break;

			}
			System.out.println("�������벻ͬ��");
		}

		// ��ʵ����
		while (true) {
			System.out.println("��������ʵ����");
			realname = Input.sc.nextLine();
			if (checkRealname(realname)) {
				System.out.println("��ϲ����ʵ�������óɹ�");
				break;
			}

		}

		// �Ա�
		String s;
		while (true) {
			System.out.println("�������Ա�1��/2Ů");
			s = Input.sc.nextLine();
			if (s.equals("��") || s.equals("1")) {
				System.out.println("�Ա����óɹ�");
				sex = 1;
				break;
			}

			if (s.equals("Ů") || s.equals("2")) {
				System.out.println("�Ա����óɹ�");
				sex = 2;
				break;
			}
			System.out.println("������������������");
		}

		// ʡ��

		while (true) {
			System.out.println("���������ڳ���");
			cityname = Input.sc.nextLine();
			if (checkCityname(cityname)) {
				break;
			} else {
				System.out.println("������Ϣ��������������");
				continue;
			}
		}

		// ����
		String b;
		while (true) {
			System.out.println("2000-01-01");
			System.out.println("�밴���ϸ�ʽ����������Ϣ");
			b = Input.sc.nextLine();
			if (checkBirthday(b)) {
				System.out.println("�������óɹ�");
				int year = Integer.valueOf(b.substring(0, 4));
				System.out.println(year);
				int month = Integer.valueOf(b.substring(5, 7));
				System.out.println(month);
				int day = Integer.valueOf(b.substring(8, 10));
				System.out.println(day);
				birthday = new Date(year - 1900, month - 1, day);
				break;
			}

		}

		// �ÿ�����
		while (true) {
			System.out.println("��ѡ���ÿ����ͣ�");
			System.out.println("1������");
			System.out.println("2����ͯ");
			System.out.println("3��ѧ��");
			System.out.println("4���м����ˡ��˲����񾯲�");
			System.out.println("5��������������ѡ��");
			System.out.println("����������������������������������������������������");

			utype = Input.sc.nextInt();
			if (utype == 1 || utype == 2 || utype == 3 || utype == 4) {
				System.out.println("�ÿ��������óɹ���");
				break;
			} else {
				continue;
			}

		}

		// ֤������
		while (true) {
			System.out.println("��ѡ��֤�����ͣ�");
			System.out.println("1���������֤");
			System.out.println("2���۰�ͨ��֤");
			System.out.println("3��̨��ͨ��֤");
			System.out.println("4������");
			System.out.println("5��������������ѡ��");
			System.out.println("����������������������������������������������������");

			ctype = Input.sc.nextInt();
			if (ctype == 1 || ctype == 2 || ctype == 3 || ctype == 4) {
				System.out.println("֤���������óɹ���");
				break;
			} else {
				continue;
			}

		}

		// ֤������
		while (true) {
			cert = Input.sc.nextLine();
			System.out.println("������֤������");
			cert = Input.sc.nextLine();
			if (checkCert(cert)) {
				System.out.println("��ϲ��֤��������ɹ�");
				break;
			}

		}

		// ��ע��Ϣ
		while (true) {
			System.out.println("�����뱸ע��Ϣ������س�����");
			information = Input.sc.nextLine();
			System.out.println("��ע��Ϣ����ɹ�");
			break;
		}

		User u = new User(username, psd, realname, sex, cityname, ctype, cert, birthday, utype, information);
		System.out.println(u.toString());

		try {
			if (new UserImpl().addUser(u) > 0) {

			} else {
				System.out.println("ע��ʧ�ܣ�������ע��");
				userRegister();
			}

		} catch (SQLException e1) {
			e1.printStackTrace();
		}

	}

	private static boolean checkCityname(String cityname2) {

		con = DBUtil.getConnection();
		String sql = "select * from tab_city where cityname=?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, cityname2);
			rs = ps.executeQuery();
			if (rs.next()) {
				System.out.println("�ҵ��˳���");
				cityname = rs.getString("cityname");
				return true;
			} else {
				System.out.println("������������");
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		} finally {
			DBUtil.closeConnection(rs, ps, con);
		}
		return false;
	}

	public static boolean checkUsername(String str) {

		if (!str.matches("^[0-9a-zA-Z]+$")) {
			System.out.println("�û������ܺ��������ַ������������룡");
			return false;
		}

		con = DBUtil.getConnection();
		String sql = "select * from tab_user where username=?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, str);
			rs = ps.executeQuery();
			if (rs.next()) {
				System.out.println("�û����Ѵ���");
				return false;
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		} finally {
			DBUtil.closeConnection(rs, ps, con);
		}
		return true;
	}

	private static boolean checkRealname(String str) {

		if (!str.matches("^[\u4E00-\u9FA5]{2,4}$")) {
			System.out.println("��ʵ���������Ϲ淶�����������룡");
			return false;
		}
		return true;
	}

	/**
	 * ƥ����ݵ�������ʽ���ο����ӣ�
	 * http://www.cnblogs.com/jay-xu33/archive/2009/01/08/1371953.html
	 */

	private static boolean checkBirthday(String bir) {
		String reg = "^(([0-9]{3}[1-9]|[0-9]{2}[1-9][0-9]{1}|[0-9]{1}[1-9][0-9]{2}|[1-9][0-9]{3})-(((0[13578]|1[02])-(0[1-9]|[12][0-9]|3[01]))|((0[469]|11)-(0[1-9]|[12][0-9]|30))|(02-(0[1-9]|[1][0-9]|2[0-8]))))|((([0-9]{2})(0[48]|[2468][048]|[13579][26])|((0[48]|[2468][048]|[3579][26])00))-02-29)$";
		if (!bir.matches(reg)) {
			System.out.println("�������벻���Ϲ淶�����������룡");
			return false;
		}
		return true;
	}

	/**
	 * ����Ӧ�ø���֤�����Ͳ�ͬ���鲻ͬ�Ĺ��
	 * 
	 * @param cer
	 * @return
	 */
	private static boolean checkCert(String cer) {
		String reg = "^[0-9]+$";
		if (!cer.matches(reg)) {
			System.out.println("֤���Ų����Ϲ淶�����������룡");
			return false;
		}
		return true;
	}

	public static void userRegisterToMain() {
		System.out.println("ע��ɹ���3��󷵻���ҳ��");

		try {
			Thread.currentThread();
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("");
		Main.mainPage();
	}

}