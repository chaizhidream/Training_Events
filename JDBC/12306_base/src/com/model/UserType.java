package com.model;


/**
 * 旅客类型实体类
 *1：成人
 *2：儿童 
 *3：学生
 *4：残疾军人、伤残人民警察
 */
public class UserType {

	/**
	 * 旅客类型ID
	 */
	private Integer utypeID;

	/**
	 * 旅客类型
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
