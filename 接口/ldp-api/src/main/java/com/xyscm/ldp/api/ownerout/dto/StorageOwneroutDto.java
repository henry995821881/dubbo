package com.xyscm.ldp.api.ownerout.dto;

import java.io.Serializable;
import java.util.Date;

public class StorageOwneroutDto implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String startDate;
	private String endDate;
	
	/** 旧对象时间-修改时判断关账用 */
	private Date oldDate;
	/**业务单据用来生成单据批号或者码单批号*/
	private String tempMaxBillNumber;
	/**业务单据用来生成单据码单号*/
	private String tempMaxCodeNumber;
	/** 从发货单操作（删除，修改，新增） */
	private boolean sbillOp = false;
	/** 仓库 */
	private String warehouseName;
	/** 业务机构 */
	private String orgName;
	/** 业务部门 */
	private String deptName;
	/** 业务员 */
	private String employeeName;
	/** 操作员 */
	private String operatorName;
	/** 理货员 */
	private String dataTallyName;
	/** 行车工 */
	private String dataCraneName;
	/** 装卸工1 */
	private String dataStevedore1Name;
	/** 装卸工2 */
	private String dataStevedore2Name;
	/**核对 */
	private String owneroutCheckFlagStr;
	
	private Long owneroutId;

	private String owneroutBillcode;

	private String memberCode;

	private String owneroutType;

	private String warehouseCode;

	private String oconsignBillcode;

	private String sbillBillcode;

	private Date owneroutDate;

	private String ddTypeTransport;

	private String companyCode;

	private String companyName;

	private String datasAcceptcorp;

	private String datasAcceptcorpname;

	private String datasAcceptcorpaddr;

	private String workgroupName;

	private String dataTally;

	private String dataCrane;

	private String dataStevedore1;

	private String dataStevedore2;

	private String datasCarnum;

	private String datasDriver;

	private String datasIdentitynum;

	private Double sbillInfeemoney;

	private Double owneroutInfeemoney;

	private String owneroutRemark;

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

	private Long billtypeCheckmode;
	private Long owneroutCheckFlag;
	private Date owneroutCheckDate;
	private String owneroutCheckPeseron;
	private String icCode;
	private String icManageCode;
	private String interfaceWmsscmCode;
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public Date getOldDate() {
		return oldDate;
	}
	public void setOldDate(Date oldDate) {
		this.oldDate = oldDate;
	}
	public String getTempMaxBillNumber() {
		return tempMaxBillNumber;
	}
	public void setTempMaxBillNumber(String tempMaxBillNumber) {
		this.tempMaxBillNumber = tempMaxBillNumber;
	}
	public String getTempMaxCodeNumber() {
		return tempMaxCodeNumber;
	}
	public void setTempMaxCodeNumber(String tempMaxCodeNumber) {
		this.tempMaxCodeNumber = tempMaxCodeNumber;
	}
	public boolean isSbillOp() {
		return sbillOp;
	}
	public void setSbillOp(boolean sbillOp) {
		this.sbillOp = sbillOp;
	}
	public String getWarehouseName() {
		return warehouseName;
	}
	public void setWarehouseName(String warehouseName) {
		this.warehouseName = warehouseName;
	}
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getOperatorName() {
		return operatorName;
	}
	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}
	public String getDataTallyName() {
		return dataTallyName;
	}
	public void setDataTallyName(String dataTallyName) {
		this.dataTallyName = dataTallyName;
	}
	public String getDataCraneName() {
		return dataCraneName;
	}
	public void setDataCraneName(String dataCraneName) {
		this.dataCraneName = dataCraneName;
	}
	public String getDataStevedore1Name() {
		return dataStevedore1Name;
	}
	public void setDataStevedore1Name(String dataStevedore1Name) {
		this.dataStevedore1Name = dataStevedore1Name;
	}
	public String getDataStevedore2Name() {
		return dataStevedore2Name;
	}
	public void setDataStevedore2Name(String dataStevedore2Name) {
		this.dataStevedore2Name = dataStevedore2Name;
	}
	public String getOwneroutCheckFlagStr() {
		return owneroutCheckFlagStr;
	}
	public void setOwneroutCheckFlagStr(String owneroutCheckFlagStr) {
		this.owneroutCheckFlagStr = owneroutCheckFlagStr;
	}
	public Long getOwneroutId() {
		return owneroutId;
	}
	public void setOwneroutId(Long owneroutId) {
		this.owneroutId = owneroutId;
	}
	public String getOwneroutBillcode() {
		return owneroutBillcode;
	}
	public void setOwneroutBillcode(String owneroutBillcode) {
		this.owneroutBillcode = owneroutBillcode;
	}
	public String getMemberCode() {
		return memberCode;
	}
	public void setMemberCode(String memberCode) {
		this.memberCode = memberCode;
	}
	public String getOwneroutType() {
		return owneroutType;
	}
	public void setOwneroutType(String owneroutType) {
		this.owneroutType = owneroutType;
	}
	public String getWarehouseCode() {
		return warehouseCode;
	}
	public void setWarehouseCode(String warehouseCode) {
		this.warehouseCode = warehouseCode;
	}
	public String getOconsignBillcode() {
		return oconsignBillcode;
	}
	public void setOconsignBillcode(String oconsignBillcode) {
		this.oconsignBillcode = oconsignBillcode;
	}
	public String getSbillBillcode() {
		return sbillBillcode;
	}
	public void setSbillBillcode(String sbillBillcode) {
		this.sbillBillcode = sbillBillcode;
	}
	public Date getOwneroutDate() {
		return owneroutDate;
	}
	public void setOwneroutDate(Date owneroutDate) {
		this.owneroutDate = owneroutDate;
	}
	public String getDdTypeTransport() {
		return ddTypeTransport;
	}
	public void setDdTypeTransport(String ddTypeTransport) {
		this.ddTypeTransport = ddTypeTransport;
	}
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
	public String getDatasAcceptcorp() {
		return datasAcceptcorp;
	}
	public void setDatasAcceptcorp(String datasAcceptcorp) {
		this.datasAcceptcorp = datasAcceptcorp;
	}
	public String getDatasAcceptcorpname() {
		return datasAcceptcorpname;
	}
	public void setDatasAcceptcorpname(String datasAcceptcorpname) {
		this.datasAcceptcorpname = datasAcceptcorpname;
	}
	public String getDatasAcceptcorpaddr() {
		return datasAcceptcorpaddr;
	}
	public void setDatasAcceptcorpaddr(String datasAcceptcorpaddr) {
		this.datasAcceptcorpaddr = datasAcceptcorpaddr;
	}
	public String getWorkgroupName() {
		return workgroupName;
	}
	public void setWorkgroupName(String workgroupName) {
		this.workgroupName = workgroupName;
	}
	public String getDataTally() {
		return dataTally;
	}
	public void setDataTally(String dataTally) {
		this.dataTally = dataTally;
	}
	public String getDataCrane() {
		return dataCrane;
	}
	public void setDataCrane(String dataCrane) {
		this.dataCrane = dataCrane;
	}
	public String getDataStevedore1() {
		return dataStevedore1;
	}
	public void setDataStevedore1(String dataStevedore1) {
		this.dataStevedore1 = dataStevedore1;
	}
	public String getDataStevedore2() {
		return dataStevedore2;
	}
	public void setDataStevedore2(String dataStevedore2) {
		this.dataStevedore2 = dataStevedore2;
	}
	public String getDatasCarnum() {
		return datasCarnum;
	}
	public void setDatasCarnum(String datasCarnum) {
		this.datasCarnum = datasCarnum;
	}
	public String getDatasDriver() {
		return datasDriver;
	}
	public void setDatasDriver(String datasDriver) {
		this.datasDriver = datasDriver;
	}
	public String getDatasIdentitynum() {
		return datasIdentitynum;
	}
	public void setDatasIdentitynum(String datasIdentitynum) {
		this.datasIdentitynum = datasIdentitynum;
	}
	public Double getSbillInfeemoney() {
		return sbillInfeemoney;
	}
	public void setSbillInfeemoney(Double sbillInfeemoney) {
		this.sbillInfeemoney = sbillInfeemoney;
	}
	public Double getOwneroutInfeemoney() {
		return owneroutInfeemoney;
	}
	public void setOwneroutInfeemoney(Double owneroutInfeemoney) {
		this.owneroutInfeemoney = owneroutInfeemoney;
	}
	public String getOwneroutRemark() {
		return owneroutRemark;
	}
	public void setOwneroutRemark(String owneroutRemark) {
		this.owneroutRemark = owneroutRemark;
	}
	public String getOrgCode() {
		return orgCode;
	}
	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}
	public String getDeptCode() {
		return deptCode;
	}
	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}
	public String getEmployeeCode() {
		return employeeCode;
	}
	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}
	public String getDataEditOrg() {
		return dataEditOrg;
	}
	public void setDataEditOrg(String dataEditOrg) {
		this.dataEditOrg = dataEditOrg;
	}
	public String getDataEditDept() {
		return dataEditDept;
	}
	public void setDataEditDept(String dataEditDept) {
		this.dataEditDept = dataEditDept;
	}
	public String getOperatorCode() {
		return operatorCode;
	}
	public void setOperatorCode(String operatorCode) {
		this.operatorCode = operatorCode;
	}
	public String getBilltypeCode() {
		return billtypeCode;
	}
	public void setBilltypeCode(String billtypeCode) {
		this.billtypeCode = billtypeCode;
	}
	public Long getDataBillstate() {
		return dataBillstate;
	}
	public void setDataBillstate(Long dataBillstate) {
		this.dataBillstate = dataBillstate;
	}
	public Date getDataSystemdate() {
		return dataSystemdate;
	}
	public void setDataSystemdate(Date dataSystemdate) {
		this.dataSystemdate = dataSystemdate;
	}
	public Long getDataAudit() {
		return dataAudit;
	}
	public void setDataAudit(Long dataAudit) {
		this.dataAudit = dataAudit;
	}
	public String getDataAuditPerson() {
		return dataAuditPerson;
	}
	public void setDataAuditPerson(String dataAuditPerson) {
		this.dataAuditPerson = dataAuditPerson;
	}
	public Date getDataAuditDate() {
		return dataAuditDate;
	}
	public void setDataAuditDate(Date dataAuditDate) {
		this.dataAuditDate = dataAuditDate;
	}
	public String getDataAuditRemark() {
		return dataAuditRemark;
	}
	public void setDataAuditRemark(String dataAuditRemark) {
		this.dataAuditRemark = dataAuditRemark;
	}
	public String getDataAuditNremark() {
		return dataAuditNremark;
	}
	public void setDataAuditNremark(String dataAuditNremark) {
		this.dataAuditNremark = dataAuditNremark;
	}
	public Double getGoodsNum() {
		return goodsNum;
	}
	public void setGoodsNum(Double goodsNum) {
		this.goodsNum = goodsNum;
	}
	public Double getGoodsPiecenum() {
		return goodsPiecenum;
	}
	public void setGoodsPiecenum(Double goodsPiecenum) {
		this.goodsPiecenum = goodsPiecenum;
	}
	public Double getGoodsSingernum() {
		return goodsSingernum;
	}
	public void setGoodsSingernum(Double goodsSingernum) {
		this.goodsSingernum = goodsSingernum;
	}
	public Double getGoodsWeight() {
		return goodsWeight;
	}
	public void setGoodsWeight(Double goodsWeight) {
		this.goodsWeight = goodsWeight;
	}
	public Double getGoodsAssistweight() {
		return goodsAssistweight;
	}
	public void setGoodsAssistweight(Double goodsAssistweight) {
		this.goodsAssistweight = goodsAssistweight;
	}
	public Long getBilltypeCheckmode() {
		return billtypeCheckmode;
	}
	public void setBilltypeCheckmode(Long billtypeCheckmode) {
		this.billtypeCheckmode = billtypeCheckmode;
	}
	public Long getOwneroutCheckFlag() {
		return owneroutCheckFlag;
	}
	public void setOwneroutCheckFlag(Long owneroutCheckFlag) {
		this.owneroutCheckFlag = owneroutCheckFlag;
	}
	public Date getOwneroutCheckDate() {
		return owneroutCheckDate;
	}
	public void setOwneroutCheckDate(Date owneroutCheckDate) {
		this.owneroutCheckDate = owneroutCheckDate;
	}
	public String getOwneroutCheckPeseron() {
		return owneroutCheckPeseron;
	}
	public void setOwneroutCheckPeseron(String owneroutCheckPeseron) {
		this.owneroutCheckPeseron = owneroutCheckPeseron;
	}
	public String getIcCode() {
		return icCode;
	}
	public void setIcCode(String icCode) {
		this.icCode = icCode;
	}
	public String getIcManageCode() {
		return icManageCode;
	}
	public void setIcManageCode(String icManageCode) {
		this.icManageCode = icManageCode;
	}
	public String getInterfaceWmsscmCode() {
		return interfaceWmsscmCode;
	}
	public void setInterfaceWmsscmCode(String interfaceWmsscmCode) {
		this.interfaceWmsscmCode = interfaceWmsscmCode;
	}
	@Override
	public String toString() {
		return "StorageOwneroutDto [startDate=" + startDate + ", endDate="
				+ endDate + ", oldDate=" + oldDate + ", tempMaxBillNumber="
				+ tempMaxBillNumber + ", tempMaxCodeNumber="
				+ tempMaxCodeNumber + ", sbillOp=" + sbillOp
				+ ", warehouseName=" + warehouseName + ", orgName=" + orgName
				+ ", deptName=" + deptName + ", employeeName=" + employeeName
				+ ", operatorName=" + operatorName + ", dataTallyName="
				+ dataTallyName + ", dataCraneName=" + dataCraneName
				+ ", dataStevedore1Name=" + dataStevedore1Name
				+ ", dataStevedore2Name=" + dataStevedore2Name
				+ ", owneroutCheckFlagStr=" + owneroutCheckFlagStr
				+ ", owneroutId=" + owneroutId + ", owneroutBillcode="
				+ owneroutBillcode + ", memberCode=" + memberCode
				+ ", owneroutType=" + owneroutType + ", warehouseCode="
				+ warehouseCode + ", oconsignBillcode=" + oconsignBillcode
				+ ", sbillBillcode=" + sbillBillcode + ", owneroutDate="
				+ owneroutDate + ", ddTypeTransport=" + ddTypeTransport
				+ ", companyCode=" + companyCode + ", companyName="
				+ companyName + ", datasAcceptcorp=" + datasAcceptcorp
				+ ", datasAcceptcorpname=" + datasAcceptcorpname
				+ ", datasAcceptcorpaddr=" + datasAcceptcorpaddr
				+ ", workgroupName=" + workgroupName + ", dataTally="
				+ dataTally + ", dataCrane=" + dataCrane + ", dataStevedore1="
				+ dataStevedore1 + ", dataStevedore2=" + dataStevedore2
				+ ", datasCarnum=" + datasCarnum + ", datasDriver="
				+ datasDriver + ", datasIdentitynum=" + datasIdentitynum
				+ ", sbillInfeemoney=" + sbillInfeemoney
				+ ", owneroutInfeemoney=" + owneroutInfeemoney
				+ ", owneroutRemark=" + owneroutRemark + ", orgCode=" + orgCode
				+ ", deptCode=" + deptCode + ", employeeCode=" + employeeCode
				+ ", dataEditOrg=" + dataEditOrg + ", dataEditDept="
				+ dataEditDept + ", operatorCode=" + operatorCode
				+ ", billtypeCode=" + billtypeCode + ", dataBillstate="
				+ dataBillstate + ", dataSystemdate=" + dataSystemdate
				+ ", dataAudit=" + dataAudit + ", dataAuditPerson="
				+ dataAuditPerson + ", dataAuditDate=" + dataAuditDate
				+ ", dataAuditRemark=" + dataAuditRemark
				+ ", dataAuditNremark=" + dataAuditNremark + ", goodsNum="
				+ goodsNum + ", goodsPiecenum=" + goodsPiecenum
				+ ", goodsSingernum=" + goodsSingernum + ", goodsWeight="
				+ goodsWeight + ", goodsAssistweight=" + goodsAssistweight
				+ ", billtypeCheckmode=" + billtypeCheckmode
				+ ", owneroutCheckFlag=" + owneroutCheckFlag
				+ ", owneroutCheckDate=" + owneroutCheckDate
				+ ", owneroutCheckPeseron=" + owneroutCheckPeseron
				+ ", icCode=" + icCode + ", icManageCode=" + icManageCode
				+ ", interfaceWmsscmCode=" + interfaceWmsscmCode + "]";
	}
	
	
}
