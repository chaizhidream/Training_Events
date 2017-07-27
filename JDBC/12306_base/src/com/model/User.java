package com.model;

import java.util.Date;

/**
 * 用户体类
 */
public class User {

	/**
	 * ID,自增长
	 */
	private Integer id;

	/**
	 * 用户名
	 */
	private String username;

	/**
	 * 密码
	 */
	private String psd="123456";

	/**
	 * 确认密码
	 */
	private String password2=psd;

	/**
	 * 原密码
	 */
	private String passwordOld=password2;

	/**
	 * 权限(1、管理员 2、普通用户)
	 */
	private Integer ru=2;

	/**
	 * 真实姓名
	 */
	private String realname;

	/**
	 * 性别(1、男 2、女)
	 */
	private Integer sex=1;

	/**
	 * 市信息
	 */
	private String cityname;

	/**
	 * 证件类型
	 */
	private int ctypeID=1;

	/**
	 * 证件号码
	 */
	private String cert;

	/**
	 * 生日
	 */
	private Date birthday;

	/**
	 * 旅客类型
	 */
	private int utype=1;

	/**
	 * 备注信息
	 */
	private String information="无";

	/**
	 * 用户状态（0、无效 1、有效 ）
	 */
	private Integer status=1;

	/**
	 * 登陆IP
	 */
	private String loginIp="127.0.0.1";

	/**
	 * 用户头像路径
	 */
	private String imagePath="C://a.jpg";

	public User() {
		// TODO 自动生成的构造函数存根
	}
	


	/**
	 * @param id  主键，自增序列	 int
	 * @param username   用户名
	 * @param psd   密码
	 * @param password2   确认密码
	 * @param passwordOld   旧密码
	 * @param ru   权限，默认2,1为管理员  int 
	 * @param realname   真实姓名
	 * @param sex   性别  int
	 * @param city   城市
	 * @param certType     证件类型   int   
	 * @param cert  证件号
	 * @param birthday   生日
	 * @param userType  用户类型   int  
	 * @param information   备注信息
	 * @param status   用户状态（0、无效  1、有效 ），默认1  int   
	 * @param loginIp   登录IP
	 * @param imagePath    头像地址
	 */
	
	public User(String username, String psd , 
			String realname, int sex, String cityname, int ctypeID, 
			String cert, Date birthday, int utype,
			String information ) {
		super();
		//this.id = id;
		this.username = username;
		this.psd = psd;
		//this.password2 = password;
		this.passwordOld = psd;
		//this.rule = rule;
		this.realname = realname;
		this.sex = sex;
		this.cityname = cityname;
		this.ctypeID = ctypeID;
		this.cert = cert;
		this.birthday = birthday;
		this.utype = utype;
		this.information = information;
		//this.status = status;
		//this.loginIp = loginIp;
		//this.imagePath = imagePath;
	}





	public Integer getId() {
		return id;
	}




	public void setId(Integer id) {
		this.id = id;
	}




	public String getUsername() {
		return username;
	}




	public void setUsername(String username) {
		this.username = username;
	}




	public String getPsd() {
		return psd;
	}




	public void setPsd(String password) {
		this.psd = password;
	}




	public String getPassword2() {
		return password2;
	}




	public void setPassword2(String password2) {
		this.password2 = password2;
	}




	public String getPasswordOld() {
		return passwordOld;
	}




	public void setPasswordOld(String passwordOld) {
		this.passwordOld = passwordOld;
	}




	public Integer getRu() {
		return ru;
	}




	public void setRu(Integer rule) {
		this.ru = rule;
	}




	public String getRealname() {
		return realname;
	}




	public void setRealname(String realname) {
		this.realname = realname;
	}




	public Integer getSex() {
		return sex;
	}




	public void setSex(Integer sex) {
		this.sex = sex;
	}




	public String getCityname() {
		return cityname;
	}




	public void setCityname(String cityname) {
		this.cityname = cityname;
	}




	public int getCtypeID() {
		return ctypeID;
	}




	public void setCtypeID(int ctypeID) {
		this.ctypeID = ctypeID;
	}




	public String getCert() {
		return cert;
	}




	public void setCert(String cert) {
		this.cert = cert;
	}




	public Date getBirthday() {
		return birthday;
	}




	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}




	public int getUtype() {
		return utype;
	}




	public void setUtype(int utype) {
		this.utype = utype;
	}




	public String getInformation() {
		return information;
	}




	public void setInformation(String information) {
		this.information = information;
	}




	public Integer getStatus() {
		return status;
	}




	public void setStatus(Integer status) {
		this.status = status;
	}




	public String getLoginIp() {
		return loginIp;
	}




	public void setLoginIp(String loginIp) {
		this.loginIp = loginIp;
	}




	public String getImagePath() {
		return imagePath;
	}




	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}



	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", psd=" + psd + ", password2=" + password2
				+ ", passwordOld=" + passwordOld + ", ru=" + ru + ", realname=" + realname + ", sex=" + sex
				+ ", cityname=" + cityname + ", ctypeID=" + ctypeID + ", cert=" + cert + ", birthday=" + birthday
				+ ", utype=" + utype + ", information=" + information + ", status=" + status + ", loginIp=" + loginIp
				+ ", imagePath=" + imagePath + "]";
	}
	
}
