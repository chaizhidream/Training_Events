package com.model;



/**
 * 城市实体类
 */
public class City {
	

	/**
	 * 市名称
	 */
	private String cityname;
	/**
	 * 市名称ID
	 */
	private Integer cityID;
	
	/**
	 * 省份
	 */
	private Province province;

	public String getCityname() {
		return cityname;
	}

	public void setCityname(String cityname) {
		this.cityname = cityname;
	}

	public Integer getCityID() {
		return cityID;
	}

	public void setCityID(Integer cityID) {
		this.cityID = cityID;
	}

	public Province getProvince() {
		return province;
	}

	public void setProvince(Province province) {
		this.province = province;
	}

	@Override
	public String toString() {
		return "City [cityname=" + cityname + ", cityID=" + cityID + ", province=" + province.getProvince() + "]";
	}

	
	

}
