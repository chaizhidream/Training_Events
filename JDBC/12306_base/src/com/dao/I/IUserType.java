package com.dao.I;

import java.sql.SQLException;
import java.util.List;

import com.model.UserType;


/**
 * �ÿ����ͱ�����ӿ�
 * @author ����
 *
 */
public interface IUserType {
	/**
	 * ��ȡ�����ÿ������б�
	 * @return �ÿ������б�
	 * @throws SQLException
	 */
	List<UserType> getUserTypeList() throws SQLException;
}
