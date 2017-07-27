package com.pages;

//管理员页面
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
		System.out.println("***********进入管理员页面***********");
		
		System.out.println("*请选择功能*");
		System.out.println("1：查询信息");
		System.out.println("2：修改信息");
		System.out.println("3：增加信息");
		System.out.println("4：删除信息");
		System.out.println("5：直接执行增删改SQL语句");
		System.out.println("按其他键回到首页");
		
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
			System.out.println("跳转到注册页面");
			Register.userRegister();
			System.out.println("插入数据成功，返回管理页");
			UserManagement(mname);
		} else if (s.equals("4")) {
			deleteUser();
		} else if (s.equals("5")) {
			sql();
		} else {
			System.out.println("即将返回首页");
			Main.mainPage();
		}

	}

	private static void chooseSelect() {
	

		System.out.println("请选择查询方式");
		System.out.println("1:查询特定信息");
		System.out.println("2:按其他键查询全部信息");
		String s=Input.sc.next();

		if (s.equals("1")) {
			try {
				List<User> list = new UserImpl().select();
				list.forEach(i -> System.out.println(i.toString()));
			} catch (SQLException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}finally {
				System.out.println("查询完毕，返回管理页面 ");
				UserManagement(mname);
			}

		} else {
			try {
				List<User> list = new UserImpl().showAll();
				list.forEach(i -> System.out.println(i.toString()));
			} catch (SQLException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}finally {
				System.out.println("查询完毕，返回管理页面 ");
				UserManagement(mname);
			}
		}
		

	}

	private static void sql() {

String sql =Input.sc.nextLine();
		System.out.println("请输入增删改SQL语句：");
	 sql =Input.sc.nextLine();

		try {
			con = DBUtil.getConnection();
			ps = con.prepareStatement(sql);
			int n = ps.executeUpdate();
			System.out.println("操作成功"+n+"条记录被修改");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			System.out.println("操作完毕，返回管理页面 ");
			UserManagement(mname);
		}

	}

	private static void deleteUser() {
	
		
		System.out.println("请输入要删除的用户名：");
		String uname = Input.sc.next();
	if(uname.equals(mname)){
		System.out.println("不能删除自己");
		System.out.println("返回管理页面 ");
		UserManagement(mname);
	}

		try {
			new UserImpl().deleteUser(uname);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			System.out.println("删除完毕，返回管理页面 ");
			UserManagement(mname);
		}

	}

}
