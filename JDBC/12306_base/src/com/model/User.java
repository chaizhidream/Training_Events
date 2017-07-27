package com.model;

import java.util.Date;

/**
 * �û�����
 */
public class User {

	/**
	 * ID,������
	 */
	private Integer id;

	/**
	 * �û���
	 */
	private String username;

	/**
	 * ����
	 */
	private String psd="123456";

	/**
	 * ȷ������
	 */
	private String password2=psd;

	/**
	 * ԭ����
	 */
	private String passwordOld=password2;

	/**
	 * Ȩ��(1������Ա 2����ͨ�û�)
	 */
	private Integer ru=2;

	/**
	 * ��ʵ����
	 */
	private String realname;

	/**
	 * �Ա�(1���� 2��Ů)
	 */
	private Integer sex=1;

	/**
	 * ����Ϣ
	 */
	private String cityname;

	/**
	 * ֤������
	 */
	private int ctypeID=1;

	/**
	 * ֤������
	 */
	private String cert;

	/**
	 * ����
	 */
	private Date birthday;

	/**
	 * �ÿ�����
	 */
	private int utype=1;

	/**
	 * ��ע��Ϣ
	 */
	private String information="��";

	/**
	 * �û�״̬��0����Ч 1����Ч ��
	 */
	private Integer status=1;

	/**
	 * ��½IP
	 */
	private String loginIp="127.0.0.1";

	/**
	 * �û�ͷ��·��
	 */
	private String imagePath="C://a.jpg";

	public User() {
		// TODO �Զ����ɵĹ��캯�����
	}
	


	/**
	 * @param id  ��������������	 int
	 * @param username   �û���
	 * @param psd   ����
	 * @param password2   ȷ������
	 * @param passwordOld   ������
	 * @param ru   Ȩ�ޣ�Ĭ��2,1Ϊ����Ա  int 
	 * @param realname   ��ʵ����
	 * @param sex   �Ա�  int
	 * @param city   ����
	 * @param certType     ֤������   int   
	 * @param cert  ֤����
	 * @param birthday   ����
	 * @param userType  �û�����   int  
	 * @param information   ��ע��Ϣ
	 * @param status   �û�״̬��0����Ч  1����Ч ����Ĭ��1  int   
	 * @param loginIp   ��¼IP
	 * @param imagePath    ͷ���ַ
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
