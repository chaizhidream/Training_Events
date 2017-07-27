package com.dao.I;

import java.sql.SQLException;
import java.util.List;

import com.model.User;


/**
 * �û�������ӿ�
 * ��ɾ��Ļ��е�¼�ȹ���
 */
public interface IUser {
	
	/**
	 * �����û�
	 * 
	 * @param user �û�����
	 * @throws SQLException
	 */
	public int addUser(User user) throws SQLException;
	
	/**
	 * �����û���Ϣ
	 * @param one����Ҫ���µ��û���Ϣ����
	 * @return ִ���Ƿ�ɹ�
	 * @throws SQLException
	 */
	public  boolean updateUser() throws SQLException;
	
	/**
	 * �����ض��û���Ϣ
	 * @param one����Ҫ���µ��û���Ϣ����
	 * @return ִ���Ƿ�ɹ�
	 * @throws SQLException
	 */
	public  boolean updateUser(String name) throws SQLException;
	/**
	 * ��ȡȫ�����û���Ϣ�����Ƽ�ʹ��
	 * @return
	 * @throws SQLException
	 */
public 	List<User>  showAll() throws SQLException;



	/**
	 * �����û���ɾ��ĳ���û�
	 * 
	 * @param username
	 * @throws SQLException
	 */
	
public 	boolean deleteUser(String name) throws SQLException;


/**
 * ��ѯ�ض���Ϣ
 * 
 * @param username
 * @return 
 * @throws SQLException
 */

public 	List<com.model.User> select() throws SQLException;

	
/**
 * ��ѯ�ض��û���Ϣ
 * 
 * @param username
 * @return 
 * @throws SQLException
 */

public 	void select(String name) throws SQLException;



}