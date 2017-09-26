/**
 * 智恒达钢盟网络科技有限公司
 */
package com.xyscm.ldp.api.dto;

import java.io.Serializable;
import java.util.Date;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 * 功能描述：仓储加工任务主表DTO
 * 
 * @author xielf
 * @CreateDate 2017-7-19 下午3:03:28
 * @Version: 1.0
 */
public class StorageMtaskDto implements Serializable{

	private static final long serialVersionUID = 5598897606619316793L;
	
	private Long mtaskId;

	private String mtaskBillcode;

	private String memberCode;

	private String warehouseCode;

	private Date mtaskDate;

	private String mtaskOthercode;

	private String mtaskProperty;

	private String mtaskCtype;

	private String companyCode;

	private String companyName;

	private String mtaskType;

	private String mtaskTypepro;

	private String ddTypeCraft;

	private String ddTypePacktype;

	private String mtaskMsta;

	private Long mtaskMply;

	private Long datasMto;

	private String datasBillflow;

	private String datasNextflow;

	private Double dataInfeemoney;

	private Long feeEdittype;

	private String mtaskRemark;

	private String orgCode;

	private String deptCode;

	private String employeeCode;

	private String dataEditOrg;

	private String dataEditDept;

	private String operatorCode;

	private String billtypeCode;

	private Long dataBillstate;

	private Date dataSystemdate;

	private Long dataAudit;

	private String dataAuditPerson;

	private Date dataAuditDate;

	private String dataAuditRemark;

	private String dataAuditNremark;

	private Double goodsNum;

	private Double goodsPiecenum;

	private Double goodsSingernum;

	private Double goodsWeight;

	private Double goodsAssistweight;

	private Long mtaskProcesscount;
	private Long billtypeCheckmode;

	private String interfaceWmsscmCode;

	/**
	 * @return the mtaskId
	 */
	public Long getMtaskId() {
		return mtaskId;
	}

	/**
	 * @param mtaskId the mtaskId to set
	 */
	public void setMtaskId(Long mtaskId) {
		this.mtaskId = mtaskId;
	}

	/**
	 * @return the mtaskBillcode
	 */
	public String getMtaskBillcode() {
		return mtaskBillcode;
	}

	/**
	 * @param mtaskBillcode the mtaskBillcode to set
	 */
	public void setMtaskBillcode(String mtaskBillcode) {
		this.mtaskBillcode = mtaskBillcode;
	}

	/**
	 * @return the memberCode
	 */
	public String getMemberCode() {
		return memberCode;
	}

	/**
	 * @param memberCode the memberCode to set
	 */
	public void setMemberCode(String memberCode) {
		this.memberCode = memberCode;
	}

	/**
	 * @return the warehouseCode
	 */
	public String getWarehouseCode() {
		return warehouseCode;
	}

	/**
	 * @param warehouseCode the warehouseCode to set
	 */
	public void setWarehouseCode(String warehouseCode) {
		this.warehouseCode = warehouseCode;
	}

	/**
	 * @return the mtaskDate
	 */
	public Date getMtaskDate() {
		return mtaskDate;
	}

	/**
	 * @param mtaskDate the mtaskDate to set
	 */
	public void setMtaskDate(Date mtaskDate) {
		this.mtaskDate = mtaskDate;
	}

	/**
	 * @return the mtaskOthercode
	 */
	public String getMtaskOthercode() {
		return mtaskOthercode;
	}

	/**
	 * @param mtaskOthercode the mtaskOthercode to set
	 */
	public void setMtaskOthercode(String mtaskOthercode) {
		this.mtaskOthercode = mtaskOthercode;
	}

	/**
	 * @return the mtaskProperty
	 */
	public String getMtaskProperty() {
		return mtaskProperty;
	}

	/**
	 * @param mtaskProperty the mtaskProperty to set
	 */
	public void setMtaskProperty(String mtaskProperty) {
		this.mtaskProperty = mtaskProperty;
	}

	/**
	 * @return the mtaskCtype
	 */
	public String getMtaskCtype() {
		return mtaskCtype;
	}

	/**
	 * @param mtaskCtype the mtaskCtype to set
	 */
	public void setMtaskCtype(String mtaskCtype) {
		this.mtaskCtype = mtaskCtype;
	}

	/**
	 * @return the companyCode
	 */
	public String getCompanyCode() {
		return companyCode;
	}

	/**
	 * @param companyCode the companyCode to set
	 */
	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	/**
	 * @return the companyName
	 */
	public String getCompanyName() {
		return companyName;
	}

	/**
	 * @param companyName the companyName to set
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	/**
	 * @return the mtaskType
	 */
	public String getMtaskType() {
		return mtaskType;
	}

	/**
	 * @param mtaskType the mtaskType to set
	 */
	public void setMtaskType(String mtaskType) {
		this.mtaskType = mtaskType;
	}

	/**
	 * @return the mtaskTypepro
	 */
	public String getMtaskTypepro() {
		return mtaskTypepro;
	}

	/**
	 * @param mtaskTypepro the mtaskTypepro to set
	 */
	public void setMtaskTypepro(String mtaskTypepro) {
		this.mtaskTypepro = mtaskTypepro;
	}

	/**
	 * @return the ddTypeCraft
	 */
	public String getDdTypeCraft() {
		return ddTypeCraft;
	}

	/**
	 * @param ddTypeCraft the ddTypeCraft to set
	 */
	public void setDdTypeCraft(String ddTypeCraft) {
		this.ddTypeCraft = ddTypeCraft;
	}

	/**
	 * @return the ddTypePacktype
	 */
	public String getDdTypePacktype() {
		return ddTypePacktype;
	}

	/**
	 * @param ddTypePacktype the ddTypePacktype to set
	 */
	public void setDdTypePacktype(String ddTypePacktype) {
		this.ddTypePacktype = ddTypePacktype;
	}

	/**
	 * @return the mtaskMsta
	 */
	public String getMtaskMsta() {
		return mtaskMsta;
	}

	/**
	 * @param mtaskMsta the mtaskMsta to set
	 */
	public void setMtaskMsta(String mtaskMsta) {
		this.mtaskMsta = mtaskMsta;
	}

	/**
	 * @return the mtaskMply
	 */
	public Long getMtaskMply() {
		return mtaskMply;
	}

	/**
	 * @param mtaskMply the mtaskMply to set
	 */
	public void setMtaskMply(Long mtaskMply) {
		this.mtaskMply = mtaskMply;
	}

	/**
	 * @return the datasMto
	 */
	public Long getDatasMto() {
		return datasMto;
	}

	/**
	 * @param datasMto the datasMto to set
	 */
	public void setDatasMto(Long datasMto) {
		this.datasMto = datasMto;
	}

	/**
	 * @return the datasBillflow
	 */
	public String getDatasBillflow() {
		return datasBillflow;
	}

	/**
	 * @param datasBillflow the datasBillflow to set
	 */
	public void setDatasBillflow(String datasBillflow) {
		this.datasBillflow = datasBillflow;
	}

	/**
	 * @return the datasNextflow
	 */
	public String getDatasNextflow() {
		return datasNextflow;
	}

	/**
	 * @param datasNextflow the datasNextflow to set
	 */
	public void setDatasNextflow(String datasNextflow) {
		this.datasNextflow = datasNextflow;
	}

	/**
	 * @return the dataInfeemoney
	 */
	public Double getDataInfeemoney() {
		return dataInfeemoney;
	}

	/**
	 * @param dataInfeemoney the dataInfeemoney to set
	 */
	public void setDataInfeemoney(Double dataInfeemoney) {
		this.dataInfeemoney = dataInfeemoney;
	}

	/**
	 * @return the feeEdittype
	 */
	public Long getFeeEdittype() {
		return feeEdittype;
	}

	/**
	 * @param feeEdittype the feeEdittype to set
	 */
	public void setFeeEdittype(Long feeEdittype) {
		this.feeEdittype = feeEdittype;
	}

	/**
	 * @return the mtaskRemark
	 */
	public String getMtaskRemark() {
		return mtaskRemark;
	}

	/**
	 * @param mtaskRemark the mtaskRemark to set
	 */
	public void setMtaskRemark(String mtaskRemark) {
		this.mtaskRemark = mtaskRemark;
	}

	/**
	 * @return the orgCode
	 */
	public String getOrgCode() {
		return orgCode;
	}

	/**
	 * @param orgCode the orgCode to set
	 */
	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	/**
	 * @return the deptCode
	 */
	public String getDeptCode() {
		return deptCode;
	}

	/**
	 * @param deptCode the deptCode to set
	 */
	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}

	/**
	 * @return the employeeCode
	 */
	public String getEmployeeCode() {
		return employeeCode;
	}

	/**
	 * @param employeeCode the employeeCode to set
	 */
	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}

	/**
	 * @return the dataEditOrg
	 */
	public String getDataEditOrg() {
		return dataEditOrg;
	}

	/**
	 * @param dataEditOrg the dataEditOrg to set
	 */
	public void setDataEditOrg(String dataEditOrg) {
		this.dataEditOrg = dataEditOrg;
	}

	/**
	 * @return the dataEditDept
	 */
	public String getDataEditDept() {
		return dataEditDept;
	}

	/**
	 * @param dataEditDept the dataEditDept to set
	 */
	public void setDataEditDept(String dataEditDept) {
		this.dataEditDept = dataEditDept;
	}

	/**
	 * @return the operatorCode
	 */
	public String getOperatorCode() {
		return operatorCode;
	}

	/**
	 * @param operatorCode the operatorCode to set
	 */
	public void setOperatorCode(String operatorCode) {
		this.operatorCode = operatorCode;
	}

	/**
	 * @return the billtypeCode
	 */
	public String getBilltypeCode() {
		return billtypeCode;
	}

	/**
	 * @param billtypeCode the billtypeCode to set
	 */
	public void setBilltypeCode(String billtypeCode) {
		this.billtypeCode = billtypeCode;
	}

	/**
	 * @return the dataBillstate
	 */
	public Long getDataBillstate() {
		return dataBillstate;
	}

	/**
	 * @param dataBillstate the dataBillstate to set
	 */
	public void setDataBillstate(Long dataBillstate) {
		this.dataBillstate = dataBillstate;
	}

	/**
	 * @return the dataSystemdate
	 */
	public Date getDataSystemdate() {
		return dataSystemdate;
	}

	/**
	 * @param dataSystemdate the dataSystemdate to set
	 */
	public void setDataSystemdate(Date dataSystemdate) {
		this.dataSystemdate = dataSystemdate;
	}

	/**
	 * @return the dataAudit
	 */
	public Long getDataAudit() {
		return dataAudit;
	}

	/**
	 * @param dataAudit the dataAudit to set
	 */
	public void setDataAudit(Long dataAudit) {
		this.dataAudit = dataAudit;
	}

	/**
	 * @return the dataAuditPerson
	 */
	public String getDataAuditPerson() {
		return dataAuditPerson;
	}

	/**
	 * @param dataAuditPerson the dataAuditPerson to set
	 */
	public void setDataAuditPerson(String dataAuditPerson) {
		this.dataAuditPerson = dataAuditPerson;
	}

	/**
	 * @return the dataAuditDate
	 */
	public Date getDataAuditDate() {
		return dataAuditDate;
	}

	/**
	 * @param dataAuditDate the dataAuditDate to set
	 */
	public void setDataAuditDate(Date dataAuditDate) {
		this.dataAuditDate = dataAuditDate;
	}

	/**
	 * @return the dataAuditRemark
	 */
	public String getDataAuditRemark() {
		return dataAuditRemark;
	}

	/**
	 * @param dataAuditRemark the dataAuditRemark to set
	 */
	public void setDataAuditRemark(String dataAuditRemark) {
		this.dataAuditRemark = dataAuditRemark;
	}

	/**
	 * @return the dataAuditNremark
	 */
	public String getDataAuditNremark() {
		return dataAuditNremark;
	}

	/**
	 * @param dataAuditNremark the dataAuditNremark to set
	 */
	public void setDataAuditNremark(String dataAuditNremark) {
		this.dataAuditNremark = dataAuditNremark;
	}

	/**
	 * @return the goodsNum
	 */
	public Double getGoodsNum() {
		return goodsNum;
	}

	/**
	 * @param goodsNum the goodsNum to set
	 */
	public void setGoodsNum(Double goodsNum) {
		this.goodsNum = goodsNum;
	}

	/**
	 * @return the goodsPiecenum
	 */
	public Double getGoodsPiecenum() {
		return goodsPiecenum;
	}

	/**
	 * @param goodsPiecenum the goodsPiecenum to set
	 */
	public void setGoodsPiecenum(Double goodsPiecenum) {
		this.goodsPiecenum = goodsPiecenum;
	}

	/**
	 * @return the goodsSingernum
	 */
	public Double getGoodsSingernum() {
		return goodsSingernum;
	}

	/**
	 * @param goodsSingernum the goodsSingernum to set
	 */
	public void setGoodsSingernum(Double goodsSingernum) {
		this.goodsSingernum = goodsSingernum;
	}

	/**
	 * @return the goodsWeight
	 */
	public Double getGoodsWeight() {
		return goodsWeight;
	}

	/**
	 * @param goodsWeight the goodsWeight to set
	 */
	public void setGoodsWeight(Double goodsWeight) {
		this.goodsWeight = goodsWeight;
	}

	/**
	 * @return the goodsAssistweight
	 */
	public Double getGoodsAssistweight() {
		return goodsAssistweight;
	}

	/**
	 * @param goodsAssistweight the goodsAssistweight to set
	 */
	public void setGoodsAssistweight(Double goodsAssistweight) {
		this.goodsAssistweight = goodsAssistweight;
	}

	/**
	 * @return the mtaskProcesscount
	 */
	public Long getMtaskProcesscount() {
		return mtaskProcesscount;
	}

	/**
	 * @param mtaskProcesscount the mtaskProcesscount to set
	 */
	public void setMtaskProcesscount(Long mtaskProcesscount) {
		this.mtaskProcesscount = mtaskProcesscount;
	}

	/**
	 * @return the billtypeCheckmode
	 */
	public Long getBilltypeCheckmode() {
		return billtypeCheckmode;
	}

	/**
	 * @param billtypeCheckmode the billtypeCheckmode to set
	 */
	public void setBilltypeCheckmode(Long billtypeCheckmode) {
		this.billtypeCheckmode = billtypeCheckmode;
	}

	/**
	 * @return the interfaceWmsscmCode
	 */
	public String getInterfaceWmsscmCode() {
		return interfaceWmsscmCode;
	}

	/**
	 * @param interfaceWmsscmCode the interfaceWmsscmCode to set
	 */
	public void setInterfaceWmsscmCode(String interfaceWmsscmCode) {
		this.interfaceWmsscmCode = interfaceWmsscmCode;
	}

	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}
}
