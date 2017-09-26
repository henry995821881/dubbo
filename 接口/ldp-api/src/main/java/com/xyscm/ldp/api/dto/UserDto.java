package com.xyscm.ldp.api.dto;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class UserDto implements Serializable{

	private static final long serialVersionUID = 1L;

	/**会员代码*/
	private String memberCode;
	/**机构代码*/
	private String orgCode;
	/**机构名称*/
	private String orgName;
	/**机构简称*/
	private String orgAbbreviate;
	/**部门代码*/
	private String deptCode;
	/**	部门名称*/
	private String deptName;
	/**员工代码*/
	private String employeeCode;
	/**员工名称*/
	private String 	employeeName;
	/**操作员登录帐号*/
	private String 	operatorUserid;
	/**操作员code*/
	private String 	operatorCode;
	/**	操作员名称*/
	private String 	operatorUser;
	/**	操作员昵称*/
	private String 	operatorNickname;
	public String getMemberCode() {
		return memberCode;
	}
	public void setMemberCode(String memberCode) {
		this.memberCode = memberCode;
	}
	public String getOrgCode() {
		return orgCode;
	}
	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public String getOrgAbbreviate() {
		return orgAbbreviate;
	}
	public void setOrgAbbreviate(String orgAbbreviate) {
		this.orgAbbreviate = orgAbbreviate;
	}
	public String getDeptCode() {
		return deptCode;
	}
	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getEmployeeCode() {
		return employeeCode;
	}
	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getOperatorUserid() {
		return operatorUserid;
	}
	public void setOperatorUserid(String operatorUserid) {
		this.operatorUserid = operatorUserid;
	}
	public String getOperatorCode() {
		return operatorCode;
	}
	public void setOperatorCode(String operatorCode) {
		this.operatorCode = operatorCode;
	}
	public String getOperatorUser() {
		return operatorUser;
	}
	public void setOperatorUser(String operatorUser) {
		this.operatorUser = operatorUser;
	}
	public String getOperatorNickname() {
		return operatorNickname;
	}
	public void setOperatorNickname(String operatorNickname) {
		this.operatorNickname = operatorNickname;
	}
	
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}

}
