package com.model;


/**
 * ʡʵ����
 */
public class Province {
	

	/**
	 * ʡ�ݱ�ʶid
	 */
	private Integer provinceId;

	/**
	 * ʡ������
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
