package com.dao.I;

import java.sql.SQLException;
import java.util.List;

import com.model.Province;


/**
 * 省份操作接口
 * @author 柴智
 *
 */
public interface IProvince {
	/**
	 * 获取所有省份列表
	 * @return 省份信息列表
	 * @throws SQLException
	 */
	List<Province> getProvinceList() throws SQLException;
}
