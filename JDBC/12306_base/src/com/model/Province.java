package com.model;


/**
 * 省实体类
 */
public class Province {
	

	/**
	 * 省份标识id
	 */
	private Integer provinceId;

	/**
	 * 省份名称
	 */
	private String province;

	public Integer getProvinceId() {
		return provinceId;
	}

	public void setProvinceId(Integer provinceId) {
		this.provinceId = provinceId;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	@Override
	public String toString() {
		return "Province [ provinceId=" + provinceId
				+ ", province=" + province + "]";
	}

}
