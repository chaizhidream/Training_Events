package com.dao.I;

import java.sql.SQLException;
import java.util.List;

import com.model.CertType;



/**
 * ֤�����ͱ�����ӿ�
 * @author ����
 *
 */
public interface ICertType {
	/**
	 * ��ȡ����֤�������б�
	 * @return ֤�������б�
	 * @throws SQLException
	 */
	List<CertType> getCertTypeList() throws SQLException;
}
