package com.dao.I;

import java.sql.SQLException;
import java.util.List;

import com.model.CertType;



/**
 * 证件类型表操作接口
 * @author 柴智
 *
 */
public interface ICertType {
	/**
	 * 获取所有证件类型列表
	 * @return 证件类型列表
	 * @throws SQLException
	 */
	List<CertType> getCertTypeList() throws SQLException;
}
