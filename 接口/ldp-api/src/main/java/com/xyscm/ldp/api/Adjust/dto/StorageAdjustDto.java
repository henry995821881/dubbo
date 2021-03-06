package com.xyscm.ldp.api.Adjust.dto;

import java.io.Serializable;
import java.util.Date;

public class StorageAdjustDto implements Serializable {
	// Fields

		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		
		private String sumGoodsBatch; //物资对应
	
		private Long adjustId;

		private String adjustBillcode;

		private String memberCode;

		private String warehouseCode;

		private Date adjustDate;

		private String adjustOthercode;

		private String companyCode;

		private String companyName;

		private String transferCompany;

		private String transferCname;

		private String workgroupName;

		private String dataTally;

		private String dataCrane;

		private String dataStevedore1;

		private String dataStevedore2;

		private String adjustType;

		private String adjustTypepro;

		private String adjustRemark;

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
		private Long adjustCheckFlag;
		private Date adjustCheckDate;
		private String adjustCheckPeseron;
		private Double dataInfeemoney;

		private String interfaceWmsscmCode;

		public Long getAdjustId() {
			return this.adjustId;
		}

		public void setAdjustId(Long adjustId) {
			this.adjustId = adjustId;
		}

		public String getAdjustBillcode() {
			return this.adjustBillcode;
		}

		public void setAdjustBillcode(String adjustBillcode) {
			this.adjustBillcode = adjustBillcode;
		}

		public String getMemberCode() {
			return this.memberCode;
		}

		public void setMemberCode(String memberCode) {
			this.memberCode = memberCode;
		}

		public String getWarehouseCode() {
			return this.warehouseCode;
		}

		public void setWarehouseCode(String warehouseCode) {
			this.warehouseCode = warehouseCode;
		}

		public Date getAdjustDate() {
			return this.adjustDate;
		}

		public void setAdjustDate(Date adjustDate) {
			this.adjustDate = adjustDate;
		}

		public String getAdjustOthercode() {
			return this.adjustOthercode;
		}

		public void setAdjustOthercode(String adjustOthercode) {
			this.adjustOthercode = adjustOthercode;
		}

		public String getCompanyCode() {
			return this.companyCode;
		}

		public void setCompanyCode(String companyCode) {
			this.companyCode = companyCode;
		}

		public String getCompanyName() {
			return this.companyName;
		}

		public void setCompanyName(String companyName) {
			this.companyName = companyName;
		}

		public String getTransferCompany() {
			return this.transferCompany;
		}

		public void setTransferCompany(String transferCompany) {
			this.transferCompany = transferCompany;
		}

		public String getTransferCname() {
			return this.transferCname;
		}

		public void setTransferCname(String transferCname) {
			this.transferCname = transferCname;
		}

		public String getWorkgroupName() {
			return this.workgroupName;
		}

		public void setWorkgroupName(String workgroupName) {
			this.workgroupName = workgroupName;
		}

		public String getDataTally() {
			return this.dataTally;
		}

		public void setDataTally(String dataTally) {
			this.dataTally = dataTally;
		}

		public String getDataCrane() {
			return this.dataCrane;
		}

		public void setDataCrane(String dataCrane) {
			this.dataCrane = dataCrane;
		}

		public String getDataStevedore1() {
			return this.dataStevedore1;
		}

		public void setDataStevedore1(String dataStevedore1) {
			this.dataStevedore1 = dataStevedore1;
		}

		public String getDataStevedore2() {
			return this.dataStevedore2;
		}

		public void setDataStevedore2(String dataStevedore2) {
			this.dataStevedore2 = dataStevedore2;
		}

		public String getAdjustType() {
			return this.adjustType;
		}

		public void setAdjustType(String adjustType) {
			this.adjustType = adjustType;
		}

		public String getAdjustTypepro() {
			return this.adjustTypepro;
		}

		public void setAdjustTypepro(String adjustTypepro) {
			this.adjustTypepro = adjustTypepro;
		}

		public String getAdjustRemark() {
			return this.adjustRemark;
		}

		public void setAdjustRemark(String adjustRemark) {
			this.adjustRemark = adjustRemark;
		}

		public String getOrgCode() {
			return this.orgCode;
		}

		public void setOrgCode(String orgCode) {
			this.orgCode = orgCode;
		}

		public String getDeptCode() {
			return this.deptCode;
		}

		public void setDeptCode(String deptCode) {
			this.deptCode = deptCode;
		}

		public String getEmployeeCode() {
			return this.employeeCode;
		}

		public void setEmployeeCode(String employeeCode) {
			this.employeeCode = employeeCode;
		}

		public String getDataEditOrg() {
			return this.dataEditOrg;
		}

		public void setDataEditOrg(String dataEditOrg) {
			this.dataEditOrg = dataEditOrg;
		}

		public String getDataEditDept() {
			return this.dataEditDept;
		}

		public void setDataEditDept(String dataEditDept) {
			this.dataEditDept = dataEditDept;
		}

		public String getOperatorCode() {
			return this.operatorCode;
		}

		public void setOperatorCode(String operatorCode) {
			this.operatorCode = operatorCode;
		}

		public String getBilltypeCode() {
			return this.billtypeCode;
		}

		public void setBilltypeCode(String billtypeCode) {
			this.billtypeCode = billtypeCode;
		}

		public Long getDataBillstate() {
			return this.dataBillstate;
		}

		public void setDataBillstate(Long dataBillstate) {
			this.dataBillstate = dataBillstate;
		}

		public Date getDataSystemdate() {
			return this.dataSystemdate;
		}

		public void setDataSystemdate(Date dataSystemdate) {
			this.dataSystemdate = dataSystemdate;
		}

		public Long getDataAudit() {
			return this.dataAudit;
		}

		public void setDataAudit(Long dataAudit) {
			this.dataAudit = dataAudit;
		}

		public String getDataAuditPerson() {
			return this.dataAuditPerson;
		}

		public void setDataAuditPerson(String dataAuditPerson) {
			this.dataAuditPerson = dataAuditPerson;
		}

		public Date getDataAuditDate() {
			return this.dataAuditDate;
		}

		public void setDataAuditDate(Date dataAuditDate) {
			this.dataAuditDate = dataAuditDate;
		}

		public String getDataAuditRemark() {
			return this.dataAuditRemark;
		}

		public void setDataAuditRemark(String dataAuditRemark) {
			this.dataAuditRemark = dataAuditRemark;
		}

		public String getDataAuditNremark() {
			return this.dataAuditNremark;
		}

		public void setDataAuditNremark(String dataAuditNremark) {
			this.dataAuditNremark = dataAuditNremark;
		}

		public Double getGoodsNum() {
			return this.goodsNum;
		}

		public void setGoodsNum(Double goodsNum) {
			this.goodsNum = goodsNum;
		}

		public Double getGoodsPiecenum() {
			return this.goodsPiecenum;
		}

		public void setGoodsPiecenum(Double goodsPiecenum) {
			this.goodsPiecenum = goodsPiecenum;
		}

		public Double getGoodsSingernum() {
			return this.goodsSingernum;
		}

		public void setGoodsSingernum(Double goodsSingernum) {
			this.goodsSingernum = goodsSingernum;
		}

		public Double getGoodsWeight() {
			return this.goodsWeight;
		}

		public void setGoodsWeight(Double goodsWeight) {
			this.goodsWeight = goodsWeight;
		}

		public Double getGoodsAssistweight() {
			return this.goodsAssistweight;
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

		public Date getAdjustCheckDate() {
			return adjustCheckDate;
		}

		public void setAdjustCheckDate(Date adjustCheckDate) {
			this.adjustCheckDate = adjustCheckDate;
		}

		public Long getAdjustCheckFlag() {
			return adjustCheckFlag;
		}

		public void setAdjustCheckFlag(Long adjustCheckFlag) {
			this.adjustCheckFlag = adjustCheckFlag;
		}

		public String getAdjustCheckPeseron() {
			return adjustCheckPeseron;
		}

		public void setAdjustCheckPeseron(String adjustCheckPeseron) {
			this.adjustCheckPeseron = adjustCheckPeseron;
		}

		public Double getDataInfeemoney() {
			return dataInfeemoney;
		}

		public void setDataInfeemoney(Double dataInfeemoney) {
			this.dataInfeemoney = dataInfeemoney;
		}

		public String getInterfaceWmsscmCode() {
			return interfaceWmsscmCode;
		}

		public void setInterfaceWmsscmCode(String interfaceWmsscmCode) {
			this.interfaceWmsscmCode = interfaceWmsscmCode;
		}

		public String getSumGoodsBatch() {
			return sumGoodsBatch;
		}

		public void setSumGoodsBatch(String sumGoodsBatch) {
			this.sumGoodsBatch = sumGoodsBatch;
		}
		
		
}
