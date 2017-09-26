package com.xyscm.ldp.api.base.dto;

import java.io.Serializable;

public class CompanyDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private String companyCode ;
	private String companyName;
	public String getCompanyCode() {
		return companyCode;
	}
	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	@Override
	public String toString() {
		return "CompanyDto [companyCode=" + companyCode + ", companyName="
				+ companyName + "]";
	}

}
