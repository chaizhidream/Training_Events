package com.dao.I;

import java.sql.SQLException;
import java.util.List;

import com.model.UserType;


/**
 * 旅客类型表操作接口
 * @author 柴智
 *
 */
public interface IUserType {
	/**
	 * 获取所有旅客类型列表
	 * @return 旅客类型列表
	 * @throws SQLException
	 */
	List<UserType> getUserTypeList() throws SQLException;
}
