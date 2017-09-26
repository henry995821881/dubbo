package com.xyscm.ldp.api.base.dto;

import java.io.Serializable;

public class WarehouseDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private String warehouseCode;
	private String warehouseName;
	private String memberCode;
	private String warehouseRemark;
	public String getWarehouseCode() {
		return warehouseCode;
	}
	public void setWarehouseCode(String warehouseCode) {
		this.warehouseCode = warehouseCode;
	}
	public String getWarehouseName() {
		return warehouseName;
	}
	public void setWarehouseName(String warehouseName) {
		this.warehouseName = warehouseName;
	}
	public String getMemberCode() {
		return memberCode;
	}
	public void setMemberCode(String memberCode) {
		this.memberCode = memberCode;
	}
	public String getWarehouseRemark() {
		return warehouseRemark;
	}
	public void setWarehouseRemark(String warehouseRemark) {
		this.warehouseRemark = warehouseRemark;
	}
	@Override
	public String toString() {
		return "WarehouseDto [warehouseCode=" + warehouseCode
				+ ", warehouseName=" + warehouseName + ", memberCode="
				+ memberCode + ", warehouseRemark=" + warehouseRemark + "]";
	}
	
	
	

}
