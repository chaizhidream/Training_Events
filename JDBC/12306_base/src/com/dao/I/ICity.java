package com.dao.I;

import java.sql.SQLException;
import java.util.List;

import com.model.City;

/**
 * ���б�����ӿ�
 * @author ����
 *
 */
public interface ICity {
	/**
	 * ����ʡ�ݱ�ʶ��ȡ���г�����Ϣ�б�
	 * @param proID
	 * @return
	 * @throws SQLException
	 */
	List<City> getCityListByProID(String proID) throws SQLException;
}
