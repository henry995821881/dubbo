package com.xyscm.ldp.api.dto;

import java.io.Serializable;
import java.util.Date;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class StorageEnterMainDto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	/** 是否可以写财务引导*/
	private boolean fundLeadFlag=false;
	/** 是否可以打印标志 0选择打印 1直接打印 2不能打印*/
	private int printTempletFlag;
	/** 检测数据权限, 是否有写的权限 */
	private boolean write;
	
	/** 日期 */
	private String entryactDateStr;
	/** 仓库 */
	private String warehouseName;
	/** 入库数量 */
	private String goodsNumStr;
	/** 入库重量 */
	private String goodsWeightStr;
	/** 入库辅助重量 */
	private String goodsAssistweightStr;
	/** 验收数量 */
	private String entryactNumStr;
	/** 验收理重 */
	private String entryactAssistweightStr;
	/** 验收重量 */
	private String entryactWeightStr;
	/** 未验收数量 */
	private String entryactNnumStr;
	/** 未验收重量 */
	private String entryactNweightStr;
	/** 业务机构 */
	private String orgName;
	/** 业务部门 */
	private String deptName;
	/** 业务员 */
	private String employeeName;
	/** 操作员 */
	private String operatorName;
	/** 审核日期 */
	private String dataAuditDateStr;
	/** 审核 */
	private String dataAuditStr;
	/** 合计量*/
	/** 数量*/
	private Double goodsSumNum;
	/** 理重*/
	private Double goodsSumAssistweight;
	/** 重量*/
	private Double goodsSumWeight;
	/**含税金额*/
	private Double dataSumInmoney;
	/** 从入库操作（删除，修改，新增） */
	private boolean entryinOp = false;
	/**调出机构 简称*/
	private String outOrgAbbreviate;
	/** 入库单据类型  */
	private String entryinfBilltype;
	
	private String entryactBillcode;
	
	private Long dataVernum;
	
	private String memberCode;

	private String entryinfBillcode;
	
	private Long dataBackgoods;
	
	private Long dataSubnum;
	
	private Long feeEdittype;
	
	private Date entryactDate;

	private String entryactProperty;

	private String entryactType;

	private String entryactTypepro;

	private String entryactCtype;

	private String datasSupplier;

	private String datasSuppliername;

	private String datasBalcorp;
	private String dataCondition;
	private String datasBalcorpname;

	private String ddTypeTransport;

	private String warehouseCode;

	private String workgroupName;

	private String dataTally;

	private String dataCrane;

	private String dataStevedore1;

	private String dataStevedore2;

	private String entryactStr1;

	private String entryactStr2;

	private String entryactStr3;

	private String datasCarnum;

	private String datasDriver;

	private Long entryinfStatclass;

	private Double goodsNum;

	private Double goodsWeight;

	private Double goodsAssistweight;

	private Double dataInmoney;

	private Double dataInfeemoney;

	private Double entryactNum;

	private Double entryactWeight;

	private Double entryactAssistweight;

	private Double dataBnum;

	private Double dataBweight;

	private String entryactRemark;

	private String employeeCode;

	private String operatorCode;

	private String orgCode;

	private String deptCode;

	private String dataEditOrg;

	private String dataEditDept;

	private String billtypeCode;

	private Long billtypeCheckmode;

	private Long dataInvalitstate;

	private String dataInvalitext;

	private Long dataBillstate;

	private Date dataSystemdate;

	private Long dataTypeEbp;

	private Long dataTypeWlp;

	private Long dataAudit;

	private String dataAuditPerson;

	private Date dataAuditDate;

	private String dataAuditRemark;

	private String dataAuditNremark;

	private String datasStr1;

	private String datasStr2;

	private String datasStr3;

	private String dataVouchernum;

	private String dataVouchertype;

	private Date dataVoucherdate;

	private Long dataVoucherflag;
	private String feeStr1;
	
	public boolean isFundLeadFlag() {
		return fundLeadFlag;
	}

	public void setFundLeadFlag(boolean fundLeadFlag) {
		this.fundLeadFlag = fundLeadFlag;
	}

	public int getPrintTempletFlag() {
		return printTempletFlag;
	}

	public void setPrintTempletFlag(int printTempletFlag) {
		this.printTempletFlag = printTempletFlag;
	}

	public boolean isWrite() {
		return write;
	}

	public void setWrite(boolean write) {
		this.write = write;
	}

	public String getEntryactDateStr() {
		return entryactDateStr;
	}

	public void setEntryactDateStr(String entryactDateStr) {
		this.entryactDateStr = entryactDateStr;
	}

	public String getWarehouseName() {
		return warehouseName;
	}

	public void setWarehouseName(String warehouseName) {
		this.warehouseName = warehouseName;
	}

	public String getGoodsNumStr() {
		return goodsNumStr;
	}

	public void setGoodsNumStr(String goodsNumStr) {
		this.goodsNumStr = goodsNumStr;
	}

	public String getGoodsWeightStr() {
		return goodsWeightStr;
	}

	public void setGoodsWeightStr(String goodsWeightStr) {
		this.goodsWeightStr = goodsWeightStr;
	}

	public String getGoodsAssistweightStr() {
		return goodsAssistweightStr;
	}

	public void setGoodsAssistweightStr(String goodsAssistweightStr) {
		this.goodsAssistweightStr = goodsAssistweightStr;
	}

	public String getEntryactNumStr() {
		return entryactNumStr;
	}

	public void setEntryactNumStr(String entryactNumStr) {
		this.entryactNumStr = entryactNumStr;
	}

	public String getEntryactAssistweightStr() {
		return entryactAssistweightStr;
	}

	public void setEntryactAssistweightStr(String entryactAssistweightStr) {
		this.entryactAssistweightStr = entryactAssistweightStr;
	}

	public String getEntryactWeightStr() {
		return entryactWeightStr;
	}

	public void setEntryactWeightStr(String entryactWeightStr) {
		this.entryactWeightStr = entryactWeightStr;
	}

	public String getEntryactNnumStr() {
		return entryactNnumStr;
	}

	public void setEntryactNnumStr(String entryactNnumStr) {
		this.entryactNnumStr = entryactNnumStr;
	}

	public String getEntryactNweightStr() {
		return entryactNweightStr;
	}

	public void setEntryactNweightStr(String entryactNweightStr) {
		this.entryactNweightStr = entryactNweightStr;
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

	public String getDataAuditDateStr() {
		return dataAuditDateStr;
	}

	public void setDataAuditDateStr(String dataAuditDateStr) {
		this.dataAuditDateStr = dataAuditDateStr;
	}

	public String getDataAuditStr() {
		return dataAuditStr;
	}

	public void setDataAuditStr(String dataAuditStr) {
		this.dataAuditStr = dataAuditStr;
	}

	public Double getGoodsSumNum() {
		return goodsSumNum;
	}

	public void setGoodsSumNum(Double goodsSumNum) {
		this.goodsSumNum = goodsSumNum;
	}

	public Double getGoodsSumAssistweight() {
		return goodsSumAssistweight;
	}

	public void setGoodsSumAssistweight(Double goodsSumAssistweight) {
		this.goodsSumAssistweight = goodsSumAssistweight;
	}

	public Double getGoodsSumWeight() {
		return goodsSumWeight;
	}

	public void setGoodsSumWeight(Double goodsSumWeight) {
		this.goodsSumWeight = goodsSumWeight;
	}

	public Double getDataSumInmoney() {
		return dataSumInmoney;
	}

	public void setDataSumInmoney(Double dataSumInmoney) {
		this.dataSumInmoney = dataSumInmoney;
	}

	public boolean isEntryinOp() {
		return entryinOp;
	}

	public void setEntryinOp(boolean entryinOp) {
		this.entryinOp = entryinOp;
	}

	public String getOutOrgAbbreviate() {
		return outOrgAbbreviate;
	}

	public void setOutOrgAbbreviate(String outOrgAbbreviate) {
		this.outOrgAbbreviate = outOrgAbbreviate;
	}

	public String getEntryinfBilltype() {
		return entryinfBilltype;
	}

	public void setEntryinfBilltype(String entryinfBilltype) {
		this.entryinfBilltype = entryinfBilltype;
	}

	public String getEntryactBillcode() {
		return entryactBillcode;
	}

	public void setEntryactBillcode(String entryactBillcode) {
		this.entryactBillcode = entryactBillcode;
	}

	public Long getDataVernum() {
		return dataVernum;
	}

	public void setDataVernum(Long dataVernum) {
		this.dataVernum = dataVernum;
	}

	public String getMemberCode() {
		return memberCode;
	}

	public void setMemberCode(String memberCode) {
		this.memberCode = memberCode;
	}

	public String getEntryinfBillcode() {
		return entryinfBillcode;
	}

	public void setEntryinfBillcode(String entryinfBillcode) {
		this.entryinfBillcode = entryinfBillcode;
	}

	public Long getDataBackgoods() {
		return dataBackgoods;
	}

	public void setDataBackgoods(Long dataBackgoods) {
		this.dataBackgoods = dataBackgoods;
	}

	public Long getDataSubnum() {
		return dataSubnum;
	}

	public void setDataSubnum(Long dataSubnum) {
		this.dataSubnum = dataSubnum;
	}

	public Long getFeeEdittype() {
		return feeEdittype;
	}

	public void setFeeEdittype(Long feeEdittype) {
		this.feeEdittype = feeEdittype;
	}

	public Date getEntryactDate() {
		return entryactDate;
	}

	public void setEntryactDate(Date entryactDate) {
		this.entryactDate = entryactDate;
	}

	public String getEntryactProperty() {
		return entryactProperty;
	}

	public void setEntryactProperty(String entryactProperty) {
		this.entryactProperty = entryactProperty;
	}

	public String getEntryactType() {
		return entryactType;
	}

	public void setEntryactType(String entryactType) {
		this.entryactType = entryactType;
	}

	public String getEntryactTypepro() {
		return entryactTypepro;
	}

	public void setEntryactTypepro(String entryactTypepro) {
		this.entryactTypepro = entryactTypepro;
	}

	public String getEntryactCtype() {
		return entryactCtype;
	}

	public void setEntryactCtype(String entryactCtype) {
		this.entryactCtype = entryactCtype;
	}

	public String getDatasSupplier() {
		return datasSupplier;
	}

	public void setDatasSupplier(String datasSupplier) {
		this.datasSupplier = datasSupplier;
	}

	public String getDatasSuppliername() {
		return datasSuppliername;
	}

	public void setDatasSuppliername(String datasSuppliername) {
		this.datasSuppliername = datasSuppliername;
	}

	public String getDatasBalcorp() {
		return datasBalcorp;
	}

	public void setDatasBalcorp(String datasBalcorp) {
		this.datasBalcorp = datasBalcorp;
	}

	public String getDataCondition() {
		return dataCondition;
	}

	public void setDataCondition(String dataCondition) {
		this.dataCondition = dataCondition;
	}

	public String getDatasBalcorpname() {
		return datasBalcorpname;
	}

	public void setDatasBalcorpname(String datasBalcorpname) {
		this.datasBalcorpname = datasBalcorpname;
	}

	public String getDdTypeTransport() {
		return ddTypeTransport;
	}

	public void setDdTypeTransport(String ddTypeTransport) {
		this.ddTypeTransport = ddTypeTransport;
	}

	public String getWarehouseCode() {
		return warehouseCode;
	}

	public void setWarehouseCode(String warehouseCode) {
		this.warehouseCode = warehouseCode;
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

	public String getEntryactStr1() {
		return entryactStr1;
	}

	public void setEntryactStr1(String entryactStr1) {
		this.entryactStr1 = entryactStr1;
	}

	public String getEntryactStr2() {
		return entryactStr2;
	}

	public void setEntryactStr2(String entryactStr2) {
		this.entryactStr2 = entryactStr2;
	}

	public String getEntryactStr3() {
		return entryactStr3;
	}

	public void setEntryactStr3(String entryactStr3) {
		this.entryactStr3 = entryactStr3;
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

	public Long getEntryinfStatclass() {
		return entryinfStatclass;
	}

	public void setEntryinfStatclass(Long entryinfStatclass) {
		this.entryinfStatclass = entryinfStatclass;
	}

	public Double getGoodsNum() {
		return goodsNum;
	}

	public void setGoodsNum(Double goodsNum) {
		this.goodsNum = goodsNum;
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

	public Double getDataInmoney() {
		return dataInmoney;
	}

	public void setDataInmoney(Double dataInmoney) {
		this.dataInmoney = dataInmoney;
	}

	public Double getDataInfeemoney() {
		return dataInfeemoney;
	}

	public void setDataInfeemoney(Double dataInfeemoney) {
		this.dataInfeemoney = dataInfeemoney;
	}

	public Double getEntryactNum() {
		return entryactNum;
	}

	public void setEntryactNum(Double entryactNum) {
		this.entryactNum = entryactNum;
	}

	public Double getEntryactWeight() {
		return entryactWeight;
	}

	public void setEntryactWeight(Double entryactWeight) {
		this.entryactWeight = entryactWeight;
	}

	public Double getEntryactAssistweight() {
		return entryactAssistweight;
	}

	public void setEntryactAssistweight(Double entryactAssistweight) {
		this.entryactAssistweight = entryactAssistweight;
	}

	public Double getDataBnum() {
		return dataBnum;
	}

	public void setDataBnum(Double dataBnum) {
		this.dataBnum = dataBnum;
	}

	public Double getDataBweight() {
		return dataBweight;
	}

	public void setDataBweight(Double dataBweight) {
		this.dataBweight = dataBweight;
	}

	public String getEntryactRemark() {
		return entryactRemark;
	}

	public void setEntryactRemark(String entryactRemark) {
		this.entryactRemark = entryactRemark;
	}

	public String getEmployeeCode() {
		return employeeCode;
	}

	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}

	public String getOperatorCode() {
		return operatorCode;
	}

	public void setOperatorCode(String operatorCode) {
		this.operatorCode = operatorCode;
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

	public String getBilltypeCode() {
		return billtypeCode;
	}

	public void setBilltypeCode(String billtypeCode) {
		this.billtypeCode = billtypeCode;
	}

	public Long getBilltypeCheckmode() {
		return billtypeCheckmode;
	}

	public void setBilltypeCheckmode(Long billtypeCheckmode) {
		this.billtypeCheckmode = billtypeCheckmode;
	}

	public Long getDataInvalitstate() {
		return dataInvalitstate;
	}

	public void setDataInvalitstate(Long dataInvalitstate) {
		this.dataInvalitstate = dataInvalitstate;
	}

	public String getDataInvalitext() {
		return dataInvalitext;
	}

	public void setDataInvalitext(String dataInvalitext) {
		this.dataInvalitext = dataInvalitext;
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

	public Long getDataTypeEbp() {
		return dataTypeEbp;
	}

	public void setDataTypeEbp(Long dataTypeEbp) {
		this.dataTypeEbp = dataTypeEbp;
	}

	public Long getDataTypeWlp() {
		return dataTypeWlp;
	}

	public void setDataTypeWlp(Long dataTypeWlp) {
		this.dataTypeWlp = dataTypeWlp;
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

	public String getDatasStr1() {
		return datasStr1;
	}

	public void setDatasStr1(String datasStr1) {
		this.datasStr1 = datasStr1;
	}

	public String getDatasStr2() {
		return datasStr2;
	}

	public void setDatasStr2(String datasStr2) {
		this.datasStr2 = datasStr2;
	}

	public String getDatasStr3() {
		return datasStr3;
	}

	public void setDatasStr3(String datasStr3) {
		this.datasStr3 = datasStr3;
	}

	public String getDataVouchernum() {
		return dataVouchernum;
	}

	public void setDataVouchernum(String dataVouchernum) {
		this.dataVouchernum = dataVouchernum;
	}

	public String getDataVouchertype() {
		return dataVouchertype;
	}

	public void setDataVouchertype(String dataVouchertype) {
		this.dataVouchertype = dataVouchertype;
	}

	public Date getDataVoucherdate() {
		return dataVoucherdate;
	}

	public void setDataVoucherdate(Date dataVoucherdate) {
		this.dataVoucherdate = dataVoucherdate;
	}

	public Long getDataVoucherflag() {
		return dataVoucherflag;
	}

	public void setDataVoucherflag(Long dataVoucherflag) {
		this.dataVoucherflag = dataVoucherflag;
	}
	public String getFeeStr1() {
		return feeStr1;
	}
	public void setFeeStr1(String feeStr1) {
		this.feeStr1 = feeStr1;
	}

	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}
	
}
