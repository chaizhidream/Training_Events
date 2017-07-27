package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DBUtil {
	
	static Connection con = null;// ����һ�����ݿ�����
	    static PreparedStatement pre = null;// ����Ԥ����������һ�㶼�������������Statement
		static ResultSet result = null;// ����һ�����������
		
	static {
		try {
			// ����Oracle��������
		//	System.out.println("��ʼ�����������ݿ⣡");
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public DBUtil() {	
		
	}
	
	
	// ��ȡ���ݿ�����

	public static Connection getConnection() {

		try {
		    String url = "jdbc:oracle:thin:@127.0.0.1:1521:orcl";// 127.0.0.1�Ǳ�����ַ
			String user = "C##chaizhi";// �û���,ϵͳĬ�ϵ��˻���
			String password = "123456";// �㰲װʱѡ���õ�����
			con = DriverManager.getConnection(url, user, password);// ��ȡ����
			//System.out.println("���ӳɹ���");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return con;

	}
	
	public static void closeConnection(ResultSet re,PreparedStatement pr,Connection co) {
		try {
			// ��һ������ļ�������رգ���Ϊ���رյĻ���Ӱ�����ܡ�����ռ����Դ
			// ע��رյ�˳�����ʹ�õ����ȹر�
			if (re!= null)
				re.close();
			if (pr != null)
				pr.close();
			if (co != null)
				co.close();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("�Ѿ��ر����ݿ�����");
		}
		
	}
	
	
	/**
	 * ��������
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
	 * �ύ����
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
	 * �ع�����
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


