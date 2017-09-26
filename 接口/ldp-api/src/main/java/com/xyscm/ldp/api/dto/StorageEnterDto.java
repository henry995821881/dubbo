package com.xyscm.ldp.api.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;


public class StorageEnterDto implements Serializable{

	private static final long serialVersionUID = 1L;
	//主表
	private  StorageEnterMainDto storageEnterMainDto;
	//主表old
	private StorageEnterMainDto oldStorageEnterMainDto;
	//明细
	private List<StorageEnterDetailDto> enterDetailDtoList;
	//码单列表
	private List<StorageEnterCodeDto> enterCodeDtoList;
	
	//临时批号对应的明细 
	//enter_detail_optcode,enter_detail_optbatch
	private Map<String, StorageEnterDetailDto> detailMap;
	
	/**起始时间*/
	private Date enterDateStart;
	/**结束时间 */
	private Date enterDateEnd;
	/**单据生成时间*/
	private Date enterDate;
	/**收货单号*/
	private String receivingBillcode;
	/**收货明细*/
	private String receivingBillbatch;
	/** 单据号 */
	private String enterBillcode;
	/**仓库code*/
	private String warehouseCode;
	/**仓库name*/
	private String warehouseName;
	/**货主code*/
	private String companyCode;
	/**货主name*/
	private String companyName;
	/**产地*/
	private String productareaName;
	/**品名*/
	private String partsnameName;
	/**材质*/
	private String goodsMaterial;
	/**规格*/
	private String goodsSpec;
	/**数量*/
	private Double goodsNum;
	/** 入库单据类型  */
	private String entryinfBilltype;
	/** 日期 */
	private String entryactDateStr;
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
	
	public Double getGoodsNum() {
		return goodsNum;
	}
	public void setGoodsNum(Double goodsNum) {
		this.goodsNum = goodsNum;
	}
	public Date getEnterDateStart() {
		return enterDateStart;
	}
	public void setEnterDateStart(Date enterDateStart) {
		this.enterDateStart = enterDateStart;
	}
	public Date getEnterDateEnd() {
		return enterDateEnd;
	}
	public void setEnterDateEnd(Date enterDateEnd) {
		this.enterDateEnd = enterDateEnd;
	}
	public String getReceivingBillbatch() {
		return receivingBillbatch;
	}
	public void setReceivingBillbatch(String receivingBillbatch) {
		this.receivingBillbatch = receivingBillbatch;
	}
	public String getEnterBillcode() {
		return enterBillcode;
	}
	public void setEnterBillcode(String enterBillcode) {
		this.enterBillcode = enterBillcode;
	}
	public String getReceivingBillcode() {
		return receivingBillcode;
	}
	public void setReceivingBillcode(String receivingBillcode) {
		this.receivingBillcode = receivingBillcode;
	}
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
	public String getProductareaName() {
		return productareaName;
	}
	public void setProductareaName(String productareaName) {
		this.productareaName = productareaName;
	}
	public String getPartsnameName() {
		return partsnameName;
	}
	public void setPartsnameName(String partsnameName) {
		this.partsnameName = partsnameName;
	}
	public String getGoodsMaterial() {
		return goodsMaterial;
	}
	public void setGoodsMaterial(String goodsMaterial) {
		this.goodsMaterial = goodsMaterial;
	}
	public String getGoodsSpec() {
		return goodsSpec;
	}
	public void setGoodsSpec(String goodsSpec) {
		this.goodsSpec = goodsSpec;
	}
	public List<StorageEnterCodeDto> getEnterCodeDtoList() {
		return enterCodeDtoList;
	}
	public void setEnterCodeDtoList(List<StorageEnterCodeDto> enterCodeDtoList) {
		this.enterCodeDtoList = enterCodeDtoList;
	}
	public Date getEnterDate() {
		return enterDate;
	}
	public void setEnterDate(Date enterDate) {
		this.enterDate = enterDate;
	}
	public List<StorageEnterDetailDto> getEnterDetailDtoList() {
		return enterDetailDtoList;
	}
	public void setEnterDetailDtoList(List<StorageEnterDetailDto> enterDetailDtoList) {
		this.enterDetailDtoList = enterDetailDtoList;
	}
	public String getEntryinfBilltype() {
		return entryinfBilltype;
	}
	public void setEntryinfBilltype(String entryinfBilltype) {
		this.entryinfBilltype = entryinfBilltype;
	}
	public String getEntryactDateStr() {
		return entryactDateStr;
	}
	public void setEntryactDateStr(String entryactDateStr) {
		this.entryactDateStr = entryactDateStr;
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
	public StorageEnterMainDto getStorageEnterMainDto() {
		return storageEnterMainDto;
	}
	public void setStorageEnterMainDto(StorageEnterMainDto storageEnterMainDto) {
		this.storageEnterMainDto = storageEnterMainDto;
	}
	public StorageEnterMainDto getOldStorageEnterMainDto() {
		return oldStorageEnterMainDto;
	}
	public void setOldStorageEnterMainDto(StorageEnterMainDto oldStorageEnterMainDto) {
		this.oldStorageEnterMainDto = oldStorageEnterMainDto;
	}
	
	public Map<String, StorageEnterDetailDto> getDetailMap() {
		return detailMap;
	}
	public void setDetailMap(Map<String, StorageEnterDetailDto> detailMap) {
		this.detailMap = detailMap;
	}
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}
	
}
