package com.model;


/**
 * �ÿ�����ʵ����
 *1������
 *2����ͯ 
 *3��ѧ��
 *4���м����ˡ��˲����񾯲�
 */
public class UserType {

	/**
	 * �ÿ�����ID
	 */
	private Integer utypeID;

	/**
	 * �ÿ�����
	 */
	private String utype;

	public Integer getUtypeID() {
		return utypeID;
	}

	public void setUtypeID(Integer utypeID) {
		this.utypeID = utypeID;
	}

	public String getUtype() {
		return utype;
	}

	public void setUtype(String utype) {
		this.utype = utype;
	}

	@Override
	public String toString() {
		return "UserType [utypeID=" + utypeID + ", utype=" + utype + "]";
	}



}
