package com.model;

/**
 * 证件类型实体类
*1, '二代身份证'
*2, '港澳通行证'
*3, '台湾通行证'
*4, '护照'

 */
public class CertType {

	/**
	 * 证件类型ID
	 */
	private Integer ctypeID;

	/**
	 * 证件类型
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
