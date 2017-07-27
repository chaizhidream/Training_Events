package com.dao.I;

import java.sql.SQLException;
import java.util.List;

import com.model.User;


/**
 * 用户表操作接口
 * 增删查改还有登录等功能
 */
public interface IUser {
	
	/**
	 * 增加用户
	 * 
	 * @param user 用户对象
	 * @throws SQLException
	 */
	public int addUser(User user) throws SQLException;
	
	/**
	 * 更新用户信息
	 * @param one，需要更新的用户信息对象
	 * @return 执行是否成功
	 * @throws SQLException
	 */
	public  boolean updateUser() throws SQLException;
	
	/**
	 * 更新特定用户信息
	 * @param one，需要更新的用户信息对象
	 * @return 执行是否成功
	 * @throws SQLException
	 */
	public  boolean updateUser(String name) throws SQLException;
	/**
	 * 获取全部的用户信息表，不推荐使用
	 * @return
	 * @throws SQLException
	 */
public 	List<User>  showAll() throws SQLException;



	/**
	 * 根据用户名删除某个用户
	 * 
	 * @param username
	 * @throws SQLException
	 */
	
public 	boolean deleteUser(String name) throws SQLException;


/**
 * 查询特定信息
 * 
 * @param username
 * @return 
 * @throws SQLException
 */

public 	List<com.model.User> select() throws SQLException;

	
/**
 * 查询特定用户信息
 * 
 * @param username
 * @return 
 * @throws SQLException
 */

public 	void select(String name) throws SQLException;



}