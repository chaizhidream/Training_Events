package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DBUtil {
	
	static Connection con = null;// 创建一个数据库连接
	    static PreparedStatement pre = null;// 创建预编译语句对象，一般都是用这个而不用Statement
		static ResultSet result = null;// 创建一个结果集对象
		
	static {
		try {
			// 加载Oracle驱动程序
		//	System.out.println("开始尝试连接数据库！");
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public DBUtil() {	
		
	}
	
	
	// 获取数据库连接

	public static Connection getConnection() {

		try {
		    String url = "jdbc:oracle:thin:@127.0.0.1:1521:orcl";// 127.0.0.1是本机地址
			String user = "C##chaizhi";// 用户名,系统默认的账户名
			String password = "123456";// 你安装时选设置的密码
			con = DriverManager.getConnection(url, user, password);// 获取连接
			//System.out.println("连接成功！");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return con;

	}
	
	public static void closeConnection(ResultSet re,PreparedStatement pr,Connection co) {
		try {
			// 逐一将上面的几个对象关闭，因为不关闭的话会影响性能、并且占用资源
			// 注意关闭的顺序，最后使用的最先关闭
			if (re!= null)
				re.close();
			if (pr != null)
				pr.close();
			if (co != null)
				co.close();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("已经关闭数据库连接");
		}
		
	}
	
	
	/**
	 * 开启事务
	 * 
	 * @param con
	 */
	public static void beginTransaction(Connection con) {
		try {
			con.setAutoCommit(false);
		} catch (SQLException e) {
			throw new ServiceException("Can not begin transaction", e);
		}
	}

	/**
	 * 提交事务
	 * 
	 * @param con
	 */
	public static void commit(Connection con) {
		try {
			con.commit();
			con.setAutoCommit(true);
		} catch (SQLException e) {
			throw new ServiceException("Can not commit transaction", e);
		}
	}

	/**
	 * 回滚事务
	 * 
	 * @param con
	 */
	public static void rollback(Connection con) {
		try {
			con.rollback();
			con.setAutoCommit(true);
		} catch (SQLException e) {
			throw new ServiceException("Can not rollback transaction", e);
		}
	}
}


