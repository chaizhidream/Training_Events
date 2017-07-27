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

		System.out.println("--------进入注册页面--------");

		// 用户名
		while (true) {
			username = Input.sc.nextLine();
			System.out.println("请输入用户名");
			username = Input.sc.nextLine();

			if (checkUsername(username)) {
				System.out.println("恭喜！用户名还没有被使用");
				break;
			}

		}

		// 核验密码
		while (true) {
			System.out.println("请输入密码");
			psd = Input.sc.nextLine();
			System.out.println("请确认密码");
			password2 = Input.sc.nextLine();
			if (psd.equals(password2) && psd != null && password2 != null) {
				System.out.println("两次密码相同，密码设置成功");
				break;

			}
			System.out.println("两次密码不同！");
		}

		// 真实姓名
		while (true) {
			System.out.println("请输入真实姓名");
			realname = Input.sc.nextLine();
			if (checkRealname(realname)) {
				System.out.println("恭喜！真实姓名设置成功");
				break;
			}

		}

		// 性别
		String s;
		while (true) {
			System.out.println("请输入性别：1男/2女");
			s = Input.sc.nextLine();
			if (s.equals("男") || s.equals("1")) {
				System.out.println("性别设置成功");
				sex = 1;
				break;
			}

			if (s.equals("女") || s.equals("2")) {
				System.out.println("性别设置成功");
				sex = 2;
				break;
			}
			System.out.println("输入有误，请重新输入");
		}

		// 省份

		while (true) {
			System.out.println("请输入所在城市");
			cityname = Input.sc.nextLine();
			if (checkCityname(cityname)) {
				break;
			} else {
				System.out.println("输入信息有误，请重新输入");
				continue;
			}
		}

		// 生日
		String b;
		while (true) {
			System.out.println("2000-01-01");
			System.out.println("请按以上格式输入生日信息");
			b = Input.sc.nextLine();
			if (checkBirthday(b)) {
				System.out.println("生日设置成功");
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

		// 旅客类型
		while (true) {
			System.out.println("请选择旅客类型：");
			System.out.println("1：成人");
			System.out.println("2：儿童");
			System.out.println("3：学生");
			System.out.println("4：残疾军人、伤残人民警察");
			System.out.println("5：按其他键重新选择");
			System.out.println("——————————————————————————");

			utype = Input.sc.nextInt();
			if (utype == 1 || utype == 2 || utype == 3 || utype == 4) {
				System.out.println("旅客类型设置成功！");
				break;
			} else {
				continue;
			}

		}

		// 证件类型
		while (true) {
			System.out.println("请选择证件类型：");
			System.out.println("1：二代身份证");
			System.out.println("2：港澳通行证");
			System.out.println("3：台湾通行证");
			System.out.println("4：护照");
			System.out.println("5：按其他键重新选择");
			System.out.println("——————————————————————————");

			ctype = Input.sc.nextInt();
			if (ctype == 1 || ctype == 2 || ctype == 3 || ctype == 4) {
				System.out.println("证件类型设置成功！");
				break;
			} else {
				continue;
			}

		}

		// 证件号码
		while (true) {
			cert = Input.sc.nextLine();
			System.out.println("请输入证件号码");
			cert = Input.sc.nextLine();
			if (checkCert(cert)) {
				System.out.println("恭喜！证件号输入成功");
				break;
			}

		}

		// 备注信息
		while (true) {
			System.out.println("请输入备注信息，输入回车结束");
			information = Input.sc.nextLine();
			System.out.println("备注信息输入成功");
			break;
		}

		User u = new User(username, psd, realname, sex, cityname, ctype, cert, birthday, utype, information);
		System.out.println(u.toString());

		try {
			if (new UserImpl().addUser(u) > 0) {

			} else {
				System.out.println("注册失败，请重新注册");
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
				System.out.println("找到了城市");
				cityname = rs.getString("cityname");
				return true;
			} else {
				System.out.println("城市名不存在");
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
			System.out.println("用户名不能含有特殊字符，请重新输入！");
			return false;
		}

		con = DBUtil.getConnection();
		String sql = "select * from tab_user where username=?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, str);
			rs = ps.executeQuery();
			if (rs.next()) {
				System.out.println("用户名已存在");
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
			System.out.println("真实姓名不符合规范，请重新输入！");
			return false;
		}
		return true;
	}

	/**
	 * 匹配年份的正则表达式，参考链接：
	 * http://www.cnblogs.com/jay-xu33/archive/2009/01/08/1371953.html
	 */

	private static boolean checkBirthday(String bir) {
		String reg = "^(([0-9]{3}[1-9]|[0-9]{2}[1-9][0-9]{1}|[0-9]{1}[1-9][0-9]{2}|[1-9][0-9]{3})-(((0[13578]|1[02])-(0[1-9]|[12][0-9]|3[01]))|((0[469]|11)-(0[1-9]|[12][0-9]|30))|(02-(0[1-9]|[1][0-9]|2[0-8]))))|((([0-9]{2})(0[48]|[2468][048]|[13579][26])|((0[48]|[2468][048]|[3579][26])00))-02-29)$";
		if (!bir.matches(reg)) {
			System.out.println("生日输入不符合规范，请重新输入！");
			return false;
		}
		return true;
	}

	/**
	 * 本来应该根据证件类型不同核验不同的规格
	 * 
	 * @param cer
	 * @return
	 */
	private static boolean checkCert(String cer) {
		String reg = "^[0-9]+$";
		if (!cer.matches(reg)) {
			System.out.println("证件号不符合规范，请重新输入！");
			return false;
		}
		return true;
	}

	public static void userRegisterToMain() {
		System.out.println("注册成功，3秒后返回首页！");

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