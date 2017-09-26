/**
 * 智恒达钢盟网络科技有限公司
 */
package com.xyscm.ldp.api.oconsign.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * 功能描述：
 * 货主发货单信息DTO
 * @author xielf
 * @CreateDate 2017-5-3 下午8:21:24
 * @Version: 1.0
 */
public class StorageOconsignDto implements Serializable {

	private static final long serialVersionUID = 303284396913607820L;

	private String oconsignBillcode;//单据号
 
	private String memberCode;//会员代码 

	private String oconsignlType;//业务类别

	private String warehouseCode;//仓库代码

	private String sbillBillcode;//销提单号

	private Date oconsignDate;//日期

	private String oconsignOthercode;//原始单据号

	private String ddTypeDelivery;//出库方式

	private String ddTypeDestination;//到站港/地

	private String ddTypeTransport;//运输方式

	private String companyCode;//单位代码(货主)

	private String companyName;//单位全称(货主)

	private String datasAcceptcorp;//收货单位

	private String datasAcceptcorpname;//收货单位名称

	private String datasAcceptcorpaddr;//收货单位地址

	private String datasCarnum;//提货车号

	private String datasDriver;//司机/提货人

	private String datasIdentitynum;//证件号

	private String workgroupName;//工作组名称

	private String dataTally;//理货员

	private String dataCrane;//行车工

	private String dataStevedore1;//装卸工

	private String dataStevedore2;//装卸工

	private Double sbillInfeemoney;//含税费用金额

	private Double oconsignInfeemoney;//含税费用金额(页面输入)

	private String oconsignRemark;//备注

	private String orgCode;//业务机构

	private String deptCode;//业务部门

	private String employeeCode;//业务员

	private String dataEditOrg;//登记机构

	private String dataEditDept;//登记部门

	private String operatorCode;//操作员代码

	private String billtypeCode;//单据类型代码

	private Long dataBillstate;//单据状态  0：新增 1：生效

	private Date dataSystemdate;//系统日期（取数据库服务器日期，不可编辑）

	private Long dataAudit;//审核（0：未审 1：已审 2：在审  -1：弃审）

	private String dataAuditPerson;//审核人

	private Date dataAuditDate;//审核日期

	private String dataAuditRemark;//审核备注

	private String dataAuditNremark;//弃审备注

	private Long oconsignMode;//发货方式（0按明细发货，1按码单发货）
	
	private Double goodsNum;//数量
	
	private Double goodsPiecenum;//件数
	
	private Double goodsSingernum;//只数
	
	private Double goodsWeight;//重量
	
	private Double goodsAssistweight;//辅助重量
	
	private Long billtypeCheckmode;//审核模式（0：逐级审核 1:并级审核 2 后级优先）
	
	private Long oconsignCheckFlag;//核对（0：未核对 1：核对）
	
	private Date oconsignCheckDate;//核对日期
	
	private String oconsignCheckPeseron;//核对人
	
	private String icCode;//IC卡号
	
	private String icManageCode;//流水号
	
	private String interfaceWmsscmCode;//仓储贸易接口代码
	private Long wsFlag;//交易来源 0：否，1来自平台
	
	///////////////////////////////////////////////////////////
	//// 以下非数据库字段
	//////////////////////////////////////////////////////////

	/** 业务机构 */
	private String orgName;
	/** 业务部门 */
	private String deptName;
	/** 业务员 */
	private String employeeName;
	/** 操作员 */
	private String operatorName;


	/**
	 * @return the oconsignBillcode
	 */
	public String getOconsignBillcode() {
		return oconsignBillcode;
	}
	/**
	 * @param oconsignBillcode the oconsignBillcode to set
	 */
	public void setOconsignBillcode(String oconsignBillcode) {
		this.oconsignBillcode = oconsignBillcode;
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
	 * @return the oconsignlType
	 */
	public String getOconsignlType() {
		return oconsignlType;
	}
	/**
	 * @param oconsignlType the oconsignlType to set
	 */
	public void setOconsignlType(String oconsignlType) {
		this.oconsignlType = oconsignlType;
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
	 * @return the sbillBillcode
	 */
	public String getSbillBillcode() {
		return sbillBillcode;
	}
	/**
	 * @param sbillBillcode the sbillBillcode to set
	 */
	public void setSbillBillcode(String sbillBillcode) {
		this.sbillBillcode = sbillBillcode;
	}
	/**
	 * @return the oconsignDate
	 */
	public Date getOconsignDate() {
		return oconsignDate;
	}
	/**
	 * @param oconsignDate the oconsignDate to set
	 */
	public void setOconsignDate(Date oconsignDate) {
		this.oconsignDate = oconsignDate;
	}
	/**
	 * @return the oconsignOthercode
	 */
	public String getOconsignOthercode() {
		return oconsignOthercode;
	}
	/**
	 * @param oconsignOthercode the oconsignOthercode to set
	 */
	public void setOconsignOthercode(String oconsignOthercode) {
		this.oconsignOthercode = oconsignOthercode;
	}
	/**
	 * @return the ddTypeDelivery
	 */
	public String getDdTypeDelivery() {
		return ddTypeDelivery;
	}
	/**
	 * @param ddTypeDelivery the ddTypeDelivery to set
	 */
	public void setDdTypeDelivery(String ddTypeDelivery) {
		this.ddTypeDelivery = ddTypeDelivery;
	}
	/**
	 * @return the ddTypeDestination
	 */
	public String getDdTypeDestination() {
		return ddTypeDestination;
	}
	/**
	 * @param ddTypeDestination the ddTypeDestination to set
	 */
	public void setDdTypeDestination(String ddTypeDestination) {
		this.ddTypeDestination = ddTypeDestination;
	}
	/**
	 * @return the ddTypeTransport
	 */
	public String getDdTypeTransport() {
		return ddTypeTransport;
	}
	/**
	 * @param ddTypeTransport the ddTypeTransport to set
	 */
	public void setDdTypeTransport(String ddTypeTransport) {
		this.ddTypeTransport = ddTypeTransport;
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
	 * @return the datasAcceptcorp
	 */
	public String getDatasAcceptcorp() {
		return datasAcceptcorp;
	}
	/**
	 * @param datasAcceptcorp the datasAcceptcorp to set
	 */
	public void setDatasAcceptcorp(String datasAcceptcorp) {
		this.datasAcceptcorp = datasAcceptcorp;
	}
	/**
	 * @return the datasAcceptcorpname
	 */
	public String getDatasAcceptcorpname() {
		return datasAcceptcorpname;
	}
	/**
	 * @param datasAcceptcorpname the datasAcceptcorpname to set
	 */
	public void setDatasAcceptcorpname(String datasAcceptcorpname) {
		this.datasAcceptcorpname = datasAcceptcorpname;
	}
	/**
	 * @return the datasAcceptcorpaddr
	 */
	public String getDatasAcceptcorpaddr() {
		return datasAcceptcorpaddr;
	}
	/**
	 * @param datasAcceptcorpaddr the datasAcceptcorpaddr to set
	 */
	public void setDatasAcceptcorpaddr(String datasAcceptcorpaddr) {
		this.datasAcceptcorpaddr = datasAcceptcorpaddr;
	}
	/**
	 * @return the datasCarnum
	 */
	public String getDatasCarnum() {
		return datasCarnum;
	}
	/**
	 * @param datasCarnum the datasCarnum to set
	 */
	public void setDatasCarnum(String datasCarnum) {
		this.datasCarnum = datasCarnum;
	}
	/**
	 * @return the datasDriver
	 */
	public String getDatasDriver() {
		return datasDriver;
	}
	/**
	 * @param datasDriver the datasDriver to set
	 */
	public void setDatasDriver(String datasDriver) {
		this.datasDriver = datasDriver;
	}
	/**
	 * @return the datasIdentitynum
	 */
	public String getDatasIdentitynum() {
		return datasIdentitynum;
	}
	/**
	 * @param datasIdentitynum the datasIdentitynum to set
	 */
	public void setDatasIdentitynum(String datasIdentitynum) {
		this.datasIdentitynum = datasIdentitynum;
	}
	/**
	 * @return the workgroupName
	 */
	public String getWorkgroupName() {
		return workgroupName;
	}
	/**
	 * @param workgroupName the workgroupName to set
	 */
	public void setWorkgroupName(String workgroupName) {
		this.workgroupName = workgroupName;
	}
	/**
	 * @return the dataTally
	 */
	public String getDataTally() {
		return dataTally;
	}
	/**
	 * @param dataTally the dataTally to set
	 */
	public void setDataTally(String dataTally) {
		this.dataTally = dataTally;
	}
	/**
	 * @return the dataCrane
	 */
	public String getDataCrane() {
		return dataCrane;
	}
	/**
	 * @param dataCrane the dataCrane to set
	 */
	public void setDataCrane(String dataCrane) {
		this.dataCrane = dataCrane;
	}
	/**
	 * @return the dataStevedore1
	 */
	public String getDataStevedore1() {
		return dataStevedore1;
	}
	/**
	 * @param dataStevedore1 the dataStevedore1 to set
	 */
	public void setDataStevedore1(String dataStevedore1) {
		this.dataStevedore1 = dataStevedore1;
	}
	/**
	 * @return the dataStevedore2
	 */
	public String getDataStevedore2() {
		return dataStevedore2;
	}
	/**
	 * @param dataStevedore2 the dataStevedore2 to set
	 */
	public void setDataStevedore2(String dataStevedore2) {
		this.dataStevedore2 = dataStevedore2;
	}
	/**
	 * @return the sbillInfeemoney
	 */
	public Double getSbillInfeemoney() {
		return sbillInfeemoney;
	}
	/**
	 * @param sbillInfeemoney the sbillInfeemoney to set
	 */
	public void setSbillInfeemoney(Double sbillInfeemoney) {
		this.sbillInfeemoney = sbillInfeemoney;
	}
	/**
	 * @return the oconsignInfeemoney
	 */
	public Double getOconsignInfeemoney() {
		return oconsignInfeemoney;
	}
	/**
	 * @param oconsignInfeemoney the oconsignInfeemoney to set
	 */
	public void setOconsignInfeemoney(Double oconsignInfeemoney) {
		this.oconsignInfeemoney = oconsignInfeemoney;
	}
	/**
	 * @return the oconsignRemark
	 */
	public String getOconsignRemark() {
		return oconsignRemark;
	}
	/**
	 * @param oconsignRemark the oconsignRemark to set
	 */
	public void setOconsignRemark(String oconsignRemark) {
		this.oconsignRemark = oconsignRemark;
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
	 * @return the oconsignMode
	 */
	public Long getOconsignMode() {
		return oconsignMode;
	}
	/**
	 * @param oconsignMode the oconsignMode to set
	 */
	public void setOconsignMode(Long oconsignMode) {
		this.oconsignMode = oconsignMode;
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
	 * @return the oconsignCheckFlag
	 */
	public Long getOconsignCheckFlag() {
		return oconsignCheckFlag;
	}
	/**
	 * @param oconsignCheckFlag the oconsignCheckFlag to set
	 */
	public void setOconsignCheckFlag(Long oconsignCheckFlag) {
		this.oconsignCheckFlag = oconsignCheckFlag;
	}
	/**
	 * @return the oconsignCheckDate
	 */
	public Date getOconsignCheckDate() {
		return oconsignCheckDate;
	}
	/**
	 * @param oconsignCheckDate the oconsignCheckDate to set
	 */
	public void setOconsignCheckDate(Date oconsignCheckDate) {
		this.oconsignCheckDate = oconsignCheckDate;
	}
	/**
	 * @return the oconsignCheckPeseron
	 */
	public String getOconsignCheckPeseron() {
		return oconsignCheckPeseron;
	}
	/**
	 * @param oconsignCheckPeseron the oconsignCheckPeseron to set
	 */
	public void setOconsignCheckPeseron(String oconsignCheckPeseron) {
		this.oconsignCheckPeseron = oconsignCheckPeseron;
	}
	/**
	 * @return the icCode
	 */
	public String getIcCode() {
		return icCode;
	}
	/**
	 * @param icCode the icCode to set
	 */
	public void setIcCode(String icCode) {
		this.icCode = icCode;
	}
	/**
	 * @return the icManageCode
	 */
	public String getIcManageCode() {
		return icManageCode;
	}
	/**
	 * @param icManageCode the icManageCode to set
	 */
	public void setIcManageCode(String icManageCode) {
		this.icManageCode = icManageCode;
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
	/**
	 * @return the orgName
	 */
	public String getOrgName() {
		return orgName;
	}
	/**
	 * @param orgName the orgName to set
	 */
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	/**
	 * @return the deptName
	 */
	public String getDeptName() {
		return deptName;
	}
	/**
	 * @param deptName the deptName to set
	 */
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	/**
	 * @return the employeeName
	 */
	public String getEmployeeName() {
		return employeeName;
	}
	/**
	 * @param employeeName the employeeName to set
	 */
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	/**
	 * @return the operatorName
	 */
	public String getOperatorName() {
		return operatorName;
	}
	/**
	 * @param operatorName the operatorName to set
	 */
	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}
	
	
	
	public Long getWsFlag() {
		return wsFlag;
	}
	public void setWsFlag(Long wsFlag) {
		this.wsFlag = wsFlag;
	}
	@Override
	public String toString() {
		return "StorageOconsignDto [oconsignBillcode=" + oconsignBillcode
				+ ", memberCode=" + memberCode + ", oconsignlType="
				+ oconsignlType + ", warehouseCode=" + warehouseCode
				+ ", sbillBillcode=" + sbillBillcode + ", oconsignDate="
				+ oconsignDate + ", oconsignOthercode=" + oconsignOthercode
				+ ", ddTypeDelivery=" + ddTypeDelivery + ", ddTypeDestination="
				+ ddTypeDestination + ", ddTypeTransport=" + ddTypeTransport
				+ ", companyCode=" + companyCode + ", companyName="
				+ companyName + ", datasAcceptcorp=" + datasAcceptcorp
				+ ", datasAcceptcorpname=" + datasAcceptcorpname
				+ ", datasAcceptcorpaddr=" + datasAcceptcorpaddr
				+ ", datasCarnum=" + datasCarnum + ", datasDriver="
				+ datasDriver + ", datasIdentitynum=" + datasIdentitynum
				+ ", workgroupName=" + workgroupName + ", dataTally="
				+ dataTally + ", dataCrane=" + dataCrane + ", dataStevedore1="
				+ dataStevedore1 + ", dataStevedore2=" + dataStevedore2
				+ ", sbillInfeemoney=" + sbillInfeemoney
				+ ", oconsignInfeemoney=" + oconsignInfeemoney
				+ ", oconsignRemark=" + oconsignRemark + ", orgCode=" + orgCode
				+ ", deptCode=" + deptCode + ", employeeCode=" + employeeCode
				+ ", dataEditOrg=" + dataEditOrg + ", dataEditDept="
				+ dataEditDept + ", operatorCode=" + operatorCode
				+ ", billtypeCode=" + billtypeCode + ", dataBillstate="
				+ dataBillstate + ", dataSystemdate=" + dataSystemdate
				+ ", dataAudit=" + dataAudit + ", dataAuditPerson="
				+ dataAuditPerson + ", dataAuditDate=" + dataAuditDate
				+ ", dataAuditRemark=" + dataAuditRemark
				+ ", dataAuditNremark=" + dataAuditNremark + ", oconsignMode="
				+ oconsignMode + ", goodsNum=" + goodsNum + ", goodsPiecenum="
				+ goodsPiecenum + ", goodsSingernum=" + goodsSingernum
				+ ", goodsWeight=" + goodsWeight + ", goodsAssistweight="
				+ goodsAssistweight + ", billtypeCheckmode="
				+ billtypeCheckmode + ", oconsignCheckFlag="
				+ oconsignCheckFlag + ", oconsignCheckDate="
				+ oconsignCheckDate + ", oconsignCheckPeseron="
				+ oconsignCheckPeseron + ", icCode=" + icCode
				+ ", icManageCode=" + icManageCode + ", interfaceWmsscmCode="
				+ interfaceWmsscmCode + ", orgName=" + orgName + ", deptName="
				+ deptName + ", employeeName=" + employeeName
				+ ", operatorName=" + operatorName + "]";
	}
	
	
	


}
