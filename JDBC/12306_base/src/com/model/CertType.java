package com.model;

/**
 * ֤������ʵ����
*1, '�������֤'
*2, '�۰�ͨ��֤'
*3, '̨��ͨ��֤'
*4, '����'

 */
public class CertType {

	/**
	 * ֤������ID
	 */
	private Integer ctypeID;

	/**
	 * ֤������
	 */
	private String ctype;

	public Integer getCtypeID() {
		return ctypeID;
	}

	public void setCtypeID(Integer ctypeID) {
		this.ctypeID = ctypeID;
	}

	public String getCtype() {
		return ctype;
	}

	public void setCtype(String ctype) {
		this.ctype = ctype;
	}

	@Override
	public String toString() {
		return "CertType [ctypeID=" + ctypeID + ", ctype=" + ctype + "]";
	}



	
}
