package com.dao.I;

import java.sql.SQLException;
import java.util.List;

import com.model.Province;


/**
 * ʡ�ݲ����ӿ�
 * @author ����
 *
 */
public interface IProvince {
	/**
	 * ��ȡ����ʡ���б�
	 * @return ʡ����Ϣ�б�
	 * @throws SQLException
	 */
	List<Province> getProvinceList() throws SQLException;
}
