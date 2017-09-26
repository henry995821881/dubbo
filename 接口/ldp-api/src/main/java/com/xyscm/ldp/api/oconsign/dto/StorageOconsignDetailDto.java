/**
 * 智恒达钢盟网络科技有限公司
 */
package com.xyscm.ldp.api.oconsign.dto;

import java.io.Serializable;


/**
 * 功能描述：
 * 
 * 货主发货单明细DTO
 * 
 * @author xielf
 * @CreateDate 2017-5-3 下午8:21:45
 * @Version: 1.0
 */
public class StorageOconsignDetailDto implements Serializable {

	private static final long serialVersionUID = 8364585300237605555L;

	private String oconsignBillcode; //发货单号

	private String oconsignBillbatch;//发货批号

	private String memberCode;//会员代码

	private String sbillBillcode;//销提单号

	private String sbillBillbatch;//销售提单批号

	private String scontractBillcode;//销售合同号

	private String scontractBillbatch;//销售合同批号

	private String oconsignDetailPerbatch;//引导表中批次号(或库存)

	private String oconsignDetailOptcode;//业务单据号

	private String oconsignDetailOptbatch;//业务单据批号

	private String oconsignDetailBilltype;//业务单据类型代码

	private Long oconsignDetailCode;//码单标志（0:无 1:有）

	private Long oconsignDetailState;//资源完成标记（0：新增1：执行中 2：完成）

	private Long dataGoodsflag;//货齐标记（0：新增 1：完成）

	private String oconsignDetailRemark;//备注

	private Long dataVernum; //当前记录的版本号(修改后增加1),--实际未使用

	private String orgCode;//业务机构

	private String deptCode;//业务部门

	private String warehouseCode;//仓库代码

	private String goodstreeCode;//品名总类

	private String pntreeName;//品名大类

	private String productareaName;//产地

	private String partsnameName;//品名

	private String goodsMaterial;//材质

	private String goodsSpec;//规格

	private Double goodsSpec1;//规格系数1

	private Double goodsSpec2;

	private Double goodsSpec3;

	private Double goodsSpec4;

	private String goodsProperty1;//物资属性1

	private String goodsProperty2;

	private String goodsProperty3;

	private String goodsProperty4;

	private String goodsProperty5;

	private Double goodsNumproperty1;//物资数值属性1

	private Double goodsNumproperty2;

	private String goodsContract;//采购合同号

	private String goodsContractbatch;//采购合同批号

	private String goodsContractstr1;//采购合同属性1

	private String goodsContractstr2;

	private String goodsContractstr3;

	private String goodsContractstr4;

	private String goodsContractstr5;

	private String goodsEntrybatch;//入库批号

	private String goodsEntrybatchold;//原始入库批号

	private String goodsEntrystr1;//入库批号属性1

	private String goodsEntrystr2;

	private String goodsEntrystr3;

	private String goodsEntrystr4;

	private String goodsEntrystr5;

	private String goodsProperty;//物资属性

	private Double goodsPartsbranch;//件支数

	private Double goodsWetpercentage;//水分

	private String goodsOrg;//货权机构

	private String goodsDept;//货权部门

	private String goodsCurrency;//成本币种

	private Double goodsExrate;//'成本汇率

	private String companyCode;//单位代码(货主)

	private String companyName;//单位名称(货主)

	private String partsnameNumunit;//数量单位

	private String partsnameWeightunit;//重量单位

	private String goodsMetering;//计量方式:默认理算（理算、过磅、干吨、湿吨）

	private Long goodsPriceun;//成本计价单位 0：默认重量

	private Long goodsPiecemode;//计件模式（0：默认，1：启用件只模式）

	private Long goodsWeightmode;//计重模式0：默认 1过磅理算 2湿吨干吨

	private String goodsCustomscode;//海关编码

	private String goodsEnname;//英文名称

	private String goodsEndescribe;//英文描述

	private String goodsBatch;//物资项目批次

	private String goodsIndustry;//行业类别

	private String sumgoodsBatch;

	private Double goodsNum;//数量

	private Double goodsPiecenum;//件数

	private Double goodsSingernum;//只数

	private Double goodsWeight;//重量

	private Double goodsAssistweight;//辅助重量

	private Double oconsignDetailOknum;//实提数量

	private Double oconsignDetailOkweight;//实提重量

	private Double oconsignDetailOkassistweight;//实提辅助重量

	private Double oconsignDetailTnum;//运输任务数量

	private Double oconsignDetailTweight;//运输任务重量

	private Double oconsignDetailTassistweight;//运输任务辅助重量

	private String sbillDetailBilltype;//提单单据类型代码
	
	
	
	/////////////////////////////////////////////////////
	////   以下非数据库字段
	////////////////////////////////////////////////////
	/** 新增、修改、删除标志（新增：0 修改：1 删除：2） */
	private int dataFlag = 1;
	/**临时批号*/
	private String oconsignTempbatch;
	/** 上级的版本号,新增加的用到*/
	private Long previousDataVernum;
	/** 库存版本号*/
	private Long warehouseDataVernum;
	private String billtypeCode;
	/** 旧的是否有码单标志 */
	private Long oconsignDetailCodeOld;
	/**实提未执行数量(处理库存可供量)*/
	private Double oconsignDetailSupNnum;
	/**实提未执行重量(处理库存可供量)*/
	private Double oconsignDetailSupNweight;
	/**实提未执行辅助重量(处理库存可供量)*/
	private Double oconsignDetailSupNassistweight;
	/**货齐 */
	private String dataGoodsflagStr;
	public String getOconsignBillcode() {
		return oconsignBillcode;
	}
	public void setOconsignBillcode(String oconsignBillcode) {
		this.oconsignBillcode = oconsignBillcode;
	}
	public String getOconsignBillbatch() {
		return oconsignBillbatch;
	}
	public void setOconsignBillbatch(String oconsignBillbatch) {
		this.oconsignBillbatch = oconsignBillbatch;
	}
	public String getMemberCode() {
		return memberCode;
	}
	public void setMemberCode(String memberCode) {
		this.memberCode = memberCode;
	}
	public String getSbillBillcode() {
		return sbillBillcode;
	}
	public void setSbillBillcode(String sbillBillcode) {
		this.sbillBillcode = sbillBillcode;
	}
	public String getSbillBillbatch() {
		return sbillBillbatch;
	}
	public void setSbillBillbatch(String sbillBillbatch) {
		this.sbillBillbatch = sbillBillbatch;
	}
	public String getScontractBillcode() {
		return scontractBillcode;
	}
	public void setScontractBillcode(String scontractBillcode) {
		this.scontractBillcode = scontractBillcode;
	}
	public String getScontractBillbatch() {
		return scontractBillbatch;
	}
	public void setScontractBillbatch(String scontractBillbatch) {
		this.scontractBillbatch = scontractBillbatch;
	}
	public String getOconsignDetailPerbatch() {
		return oconsignDetailPerbatch;
	}
	public void setOconsignDetailPerbatch(String oconsignDetailPerbatch) {
		this.oconsignDetailPerbatch = oconsignDetailPerbatch;
	}
	public String getOconsignDetailOptcode() {
		return oconsignDetailOptcode;
	}
	public void setOconsignDetailOptcode(String oconsignDetailOptcode) {
		this.oconsignDetailOptcode = oconsignDetailOptcode;
	}
	public String getOconsignDetailOptbatch() {
		return oconsignDetailOptbatch;
	}
	public void setOconsignDetailOptbatch(String oconsignDetailOptbatch) {
		this.oconsignDetailOptbatch = oconsignDetailOptbatch;
	}
	public String getOconsignDetailBilltype() {
		return oconsignDetailBilltype;
	}
	public void setOconsignDetailBilltype(String oconsignDetailBilltype) {
		this.oconsignDetailBilltype = oconsignDetailBilltype;
	}
	public Long getOconsignDetailCode() {
		return oconsignDetailCode;
	}
	public void setOconsignDetailCode(Long oconsignDetailCode) {
		this.oconsignDetailCode = oconsignDetailCode;
	}
	public Long getOconsignDetailState() {
		return oconsignDetailState;
	}
	public void setOconsignDetailState(Long oconsignDetailState) {
		this.oconsignDetailState = oconsignDetailState;
	}
	public Long getDataGoodsflag() {
		return dataGoodsflag;
	}
	public void setDataGoodsflag(Long dataGoodsflag) {
		this.dataGoodsflag = dataGoodsflag;
	}
	public String getOconsignDetailRemark() {
		return oconsignDetailRemark;
	}
	public void setOconsignDetailRemark(String oconsignDetailRemark) {
		this.oconsignDetailRemark = oconsignDetailRemark;
	}
	public Long getDataVernum() {
		return dataVernum;
	}
	public void setDataVernum(Long dataVernum) {
		this.dataVernum = dataVernum;
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
	public String getWarehouseCode() {
		return warehouseCode;
	}
	public void setWarehouseCode(String warehouseCode) {
		this.warehouseCode = warehouseCode;
	}
	public String getGoodstreeCode() {
		return goodstreeCode;
	}
	public void setGoodstreeCode(String goodstreeCode) {
		this.goodstreeCode = goodstreeCode;
	}
	public String getPntreeName() {
		return pntreeName;
	}
	public void setPntreeName(String pntreeName) {
		this.pntreeName = pntreeName;
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
	public Double getGoodsSpec1() {
		return goodsSpec1;
	}
	public void setGoodsSpec1(Double goodsSpec1) {
		this.goodsSpec1 = goodsSpec1;
	}
	public Double getGoodsSpec2() {
		return goodsSpec2;
	}
	public void setGoodsSpec2(Double goodsSpec2) {
		this.goodsSpec2 = goodsSpec2;
	}
	public Double getGoodsSpec3() {
		return goodsSpec3;
	}
	public void setGoodsSpec3(Double goodsSpec3) {
		this.goodsSpec3 = goodsSpec3;
	}
	public Double getGoodsSpec4() {
		return goodsSpec4;
	}
	public void setGoodsSpec4(Double goodsSpec4) {
		this.goodsSpec4 = goodsSpec4;
	}
	public String getGoodsProperty1() {
		return goodsProperty1;
	}
	public void setGoodsProperty1(String goodsProperty1) {
		this.goodsProperty1 = goodsProperty1;
	}
	public String getGoodsProperty2() {
		return goodsProperty2;
	}
	public void setGoodsProperty2(String goodsProperty2) {
		this.goodsProperty2 = goodsProperty2;
	}
	public String getGoodsProperty3() {
		return goodsProperty3;
	}
	public void setGoodsProperty3(String goodsProperty3) {
		this.goodsProperty3 = goodsProperty3;
	}
	public String getGoodsProperty4() {
		return goodsProperty4;
	}
	public void setGoodsProperty4(String goodsProperty4) {
		this.goodsProperty4 = goodsProperty4;
	}
	public String getGoodsProperty5() {
		return goodsProperty5;
	}
	public void setGoodsProperty5(String goodsProperty5) {
		this.goodsProperty5 = goodsProperty5;
	}
	public Double getGoodsNumproperty1() {
		return goodsNumproperty1;
	}
	public void setGoodsNumproperty1(Double goodsNumproperty1) {
		this.goodsNumproperty1 = goodsNumproperty1;
	}
	public Double getGoodsNumproperty2() {
		return goodsNumproperty2;
	}
	public void setGoodsNumproperty2(Double goodsNumproperty2) {
		this.goodsNumproperty2 = goodsNumproperty2;
	}
	public String getGoodsContract() {
		return goodsContract;
	}
	public void setGoodsContract(String goodsContract) {
		this.goodsContract = goodsContract;
	}
	public String getGoodsContractbatch() {
		return goodsContractbatch;
	}
	public void setGoodsContractbatch(String goodsContractbatch) {
		this.goodsContractbatch = goodsContractbatch;
	}
	public String getGoodsContractstr1() {
		return goodsContractstr1;
	}
	public void setGoodsContractstr1(String goodsContractstr1) {
		this.goodsContractstr1 = goodsContractstr1;
	}
	public String getGoodsContractstr2() {
		return goodsContractstr2;
	}
	public void setGoodsContractstr2(String goodsContractstr2) {
		this.goodsContractstr2 = goodsContractstr2;
	}
	public String getGoodsContractstr3() {
		return goodsContractstr3;
	}
	public void setGoodsContractstr3(String goodsContractstr3) {
		this.goodsContractstr3 = goodsContractstr3;
	}
	public String getGoodsContractstr4() {
		return goodsContractstr4;
	}
	public void setGoodsContractstr4(String goodsContractstr4) {
		this.goodsContractstr4 = goodsContractstr4;
	}
	public String getGoodsContractstr5() {
		return goodsContractstr5;
	}
	public void setGoodsContractstr5(String goodsContractstr5) {
		this.goodsContractstr5 = goodsContractstr5;
	}
	public String getGoodsEntrybatch() {
		return goodsEntrybatch;
	}
	public void setGoodsEntrybatch(String goodsEntrybatch) {
		this.goodsEntrybatch = goodsEntrybatch;
	}
	public String getGoodsEntrybatchold() {
		return goodsEntrybatchold;
	}
	public void setGoodsEntrybatchold(String goodsEntrybatchold) {
		this.goodsEntrybatchold = goodsEntrybatchold;
	}
	public String getGoodsEntrystr1() {
		return goodsEntrystr1;
	}
	public void setGoodsEntrystr1(String goodsEntrystr1) {
		this.goodsEntrystr1 = goodsEntrystr1;
	}
	public String getGoodsEntrystr2() {
		return goodsEntrystr2;
	}
	public void setGoodsEntrystr2(String goodsEntrystr2) {
		this.goodsEntrystr2 = goodsEntrystr2;
	}
	public String getGoodsEntrystr3() {
		return goodsEntrystr3;
	}
	public void setGoodsEntrystr3(String goodsEntrystr3) {
		this.goodsEntrystr3 = goodsEntrystr3;
	}
	public String getGoodsEntrystr4() {
		return goodsEntrystr4;
	}
	public void setGoodsEntrystr4(String goodsEntrystr4) {
		this.goodsEntrystr4 = goodsEntrystr4;
	}
	public String getGoodsEntrystr5() {
		return goodsEntrystr5;
	}
	public void setGoodsEntrystr5(String goodsEntrystr5) {
		this.goodsEntrystr5 = goodsEntrystr5;
	}
	public String getGoodsProperty() {
		return goodsProperty;
	}
	public void setGoodsProperty(String goodsProperty) {
		this.goodsProperty = goodsProperty;
	}
	public Double getGoodsPartsbranch() {
		return goodsPartsbranch;
	}
	public void setGoodsPartsbranch(Double goodsPartsbranch) {
		this.goodsPartsbranch = goodsPartsbranch;
	}
	public Double getGoodsWetpercentage() {
		return goodsWetpercentage;
	}
	public void setGoodsWetpercentage(Double goodsWetpercentage) {
		this.goodsWetpercentage = goodsWetpercentage;
	}
	public String getGoodsOrg() {
		return goodsOrg;
	}
	public void setGoodsOrg(String goodsOrg) {
		this.goodsOrg = goodsOrg;
	}
	public String getGoodsDept() {
		return goodsDept;
	}
	public void setGoodsDept(String goodsDept) {
		this.goodsDept = goodsDept;
	}
	public String getGoodsCurrency() {
		return goodsCurrency;
	}
	public void setGoodsCurrency(String goodsCurrency) {
		this.goodsCurrency = goodsCurrency;
	}
	public Double getGoodsExrate() {
		return goodsExrate;
	}
	public void setGoodsExrate(Double goodsExrate) {
		this.goodsExrate = goodsExrate;
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
	public String getPartsnameNumunit() {
		return partsnameNumunit;
	}
	public void setPartsnameNumunit(String partsnameNumunit) {
		this.partsnameNumunit = partsnameNumunit;
	}
	public String getPartsnameWeightunit() {
		return partsnameWeightunit;
	}
	public void setPartsnameWeightunit(String partsnameWeightunit) {
		this.partsnameWeightunit = partsnameWeightunit;
	}
	public String getGoodsMetering() {
		return goodsMetering;
	}
	public void setGoodsMetering(String goodsMetering) {
		this.goodsMetering = goodsMetering;
	}
	public Long getGoodsPriceun() {
		return goodsPriceun;
	}
	public void setGoodsPriceun(Long goodsPriceun) {
		this.goodsPriceun = goodsPriceun;
	}
	public Long getGoodsPiecemode() {
		return goodsPiecemode;
	}
	public void setGoodsPiecemode(Long goodsPiecemode) {
		this.goodsPiecemode = goodsPiecemode;
	}
	public Long getGoodsWeightmode() {
		return goodsWeightmode;
	}
	public void setGoodsWeightmode(Long goodsWeightmode) {
		this.goodsWeightmode = goodsWeightmode;
	}
	public String getGoodsCustomscode() {
		return goodsCustomscode;
	}
	public void setGoodsCustomscode(String goodsCustomscode) {
		this.goodsCustomscode = goodsCustomscode;
	}
	public String getGoodsEnname() {
		return goodsEnname;
	}
	public void setGoodsEnname(String goodsEnname) {
		this.goodsEnname = goodsEnname;
	}
	public String getGoodsEndescribe() {
		return goodsEndescribe;
	}
	public void setGoodsEndescribe(String goodsEndescribe) {
		this.goodsEndescribe = goodsEndescribe;
	}
	public String getGoodsBatch() {
		return goodsBatch;
	}
	public void setGoodsBatch(String goodsBatch) {
		this.goodsBatch = goodsBatch;
	}
	public String getGoodsIndustry() {
		return goodsIndustry;
	}
	public void setGoodsIndustry(String goodsIndustry) {
		this.goodsIndustry = goodsIndustry;
	}
	public String getSumgoodsBatch() {
		return sumgoodsBatch;
	}
	public void setSumgoodsBatch(String sumgoodsBatch) {
		this.sumgoodsBatch = sumgoodsBatch;
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
	public Double getOconsignDetailOknum() {
		return oconsignDetailOknum;
	}
	public void setOconsignDetailOknum(Double oconsignDetailOknum) {
		this.oconsignDetailOknum = oconsignDetailOknum;
	}
	public Double getOconsignDetailOkweight() {
		return oconsignDetailOkweight;
	}
	public void setOconsignDetailOkweight(Double oconsignDetailOkweight) {
		this.oconsignDetailOkweight = oconsignDetailOkweight;
	}
	public Double getOconsignDetailOkassistweight() {
		return oconsignDetailOkassistweight;
	}
	public void setOconsignDetailOkassistweight(Double oconsignDetailOkassistweight) {
		this.oconsignDetailOkassistweight = oconsignDetailOkassistweight;
	}
	public Double getOconsignDetailTnum() {
		return oconsignDetailTnum;
	}
	public void setOconsignDetailTnum(Double oconsignDetailTnum) {
		this.oconsignDetailTnum = oconsignDetailTnum;
	}
	public Double getOconsignDetailTweight() {
		return oconsignDetailTweight;
	}
	public void setOconsignDetailTweight(Double oconsignDetailTweight) {
		this.oconsignDetailTweight = oconsignDetailTweight;
	}
	public Double getOconsignDetailTassistweight() {
		return oconsignDetailTassistweight;
	}
	public void setOconsignDetailTassistweight(Double oconsignDetailTassistweight) {
		this.oconsignDetailTassistweight = oconsignDetailTassistweight;
	}
	public String getSbillDetailBilltype() {
		return sbillDetailBilltype;
	}
	public void setSbillDetailBilltype(String sbillDetailBilltype) {
		this.sbillDetailBilltype = sbillDetailBilltype;
	}
	public int getDataFlag() {
		return dataFlag;
	}
	public void setDataFlag(int dataFlag) {
		this.dataFlag = dataFlag;
	}
	public String getOconsignTempbatch() {
		return oconsignTempbatch;
	}
	public void setOconsignTempbatch(String oconsignTempbatch) {
		this.oconsignTempbatch = oconsignTempbatch;
	}
	public Long getPreviousDataVernum() {
		return previousDataVernum;
	}
	public void setPreviousDataVernum(Long previousDataVernum) {
		this.previousDataVernum = previousDataVernum;
	}
	public Long getWarehouseDataVernum() {
		return warehouseDataVernum;
	}
	public void setWarehouseDataVernum(Long warehouseDataVernum) {
		this.warehouseDataVernum = warehouseDataVernum;
	}
	public String getBilltypeCode() {
		return billtypeCode;
	}
	public void setBilltypeCode(String billtypeCode) {
		this.billtypeCode = billtypeCode;
	}
	public Long getOconsignDetailCodeOld() {
		return oconsignDetailCodeOld;
	}
	public void setOconsignDetailCodeOld(Long oconsignDetailCodeOld) {
		this.oconsignDetailCodeOld = oconsignDetailCodeOld;
	}
	public Double getOconsignDetailSupNnum() {
		return oconsignDetailSupNnum;
	}
	public void setOconsignDetailSupNnum(Double oconsignDetailSupNnum) {
		this.oconsignDetailSupNnum = oconsignDetailSupNnum;
	}
	public Double getOconsignDetailSupNweight() {
		return oconsignDetailSupNweight;
	}
	public void setOconsignDetailSupNweight(Double oconsignDetailSupNweight) {
		this.oconsignDetailSupNweight = oconsignDetailSupNweight;
	}
	public Double getOconsignDetailSupNassistweight() {
		return oconsignDetailSupNassistweight;
	}
	public void setOconsignDetailSupNassistweight(
			Double oconsignDetailSupNassistweight) {
		this.oconsignDetailSupNassistweight = oconsignDetailSupNassistweight;
	}
	public String getDataGoodsflagStr() {
		return dataGoodsflagStr;
	}
	public void setDataGoodsflagStr(String dataGoodsflagStr) {
		this.dataGoodsflagStr = dataGoodsflagStr;
	}
	@Override
	public String toString() {
		return "StorageOconsignDetailDto [oconsignBillcode=" + oconsignBillcode
				+ ", oconsignBillbatch=" + oconsignBillbatch + ", memberCode="
				+ memberCode + ", sbillBillcode=" + sbillBillcode
				+ ", sbillBillbatch=" + sbillBillbatch + ", scontractBillcode="
				+ scontractBillcode + ", scontractBillbatch="
				+ scontractBillbatch + ", oconsignDetailPerbatch="
				+ oconsignDetailPerbatch + ", oconsignDetailOptcode="
				+ oconsignDetailOptcode + ", oconsignDetailOptbatch="
				+ oconsignDetailOptbatch + ", oconsignDetailBilltype="
				+ oconsignDetailBilltype + ", oconsignDetailCode="
				+ oconsignDetailCode + ", oconsignDetailState="
				+ oconsignDetailState + ", dataGoodsflag=" + dataGoodsflag
				+ ", oconsignDetailRemark=" + oconsignDetailRemark
				+ ", dataVernum=" + dataVernum + ", orgCode=" + orgCode
				+ ", deptCode=" + deptCode + ", warehouseCode=" + warehouseCode
				+ ", goodstreeCode=" + goodstreeCode + ", pntreeName="
				+ pntreeName + ", productareaName=" + productareaName
				+ ", partsnameName=" + partsnameName + ", goodsMaterial="
				+ goodsMaterial + ", goodsSpec=" + goodsSpec + ", goodsSpec1="
				+ goodsSpec1 + ", goodsSpec2=" + goodsSpec2 + ", goodsSpec3="
				+ goodsSpec3 + ", goodsSpec4=" + goodsSpec4
				+ ", goodsProperty1=" + goodsProperty1 + ", goodsProperty2="
				+ goodsProperty2 + ", goodsProperty3=" + goodsProperty3
				+ ", goodsProperty4=" + goodsProperty4 + ", goodsProperty5="
				+ goodsProperty5 + ", goodsNumproperty1=" + goodsNumproperty1
				+ ", goodsNumproperty2=" + goodsNumproperty2
				+ ", goodsContract=" + goodsContract + ", goodsContractbatch="
				+ goodsContractbatch + ", goodsContractstr1="
				+ goodsContractstr1 + ", goodsContractstr2="
				+ goodsContractstr2 + ", goodsContractstr3="
				+ goodsContractstr3 + ", goodsContractstr4="
				+ goodsContractstr4 + ", goodsContractstr5="
				+ goodsContractstr5 + ", goodsEntrybatch=" + goodsEntrybatch
				+ ", goodsEntrybatchold=" + goodsEntrybatchold
				+ ", goodsEntrystr1=" + goodsEntrystr1 + ", goodsEntrystr2="
				+ goodsEntrystr2 + ", goodsEntrystr3=" + goodsEntrystr3
				+ ", goodsEntrystr4=" + goodsEntrystr4 + ", goodsEntrystr5="
				+ goodsEntrystr5 + ", goodsProperty=" + goodsProperty
				+ ", goodsPartsbranch=" + goodsPartsbranch
				+ ", goodsWetpercentage=" + goodsWetpercentage + ", goodsOrg="
				+ goodsOrg + ", goodsDept=" + goodsDept + ", goodsCurrency="
				+ goodsCurrency + ", goodsExrate=" + goodsExrate
				+ ", companyCode=" + companyCode + ", companyName="
				+ companyName + ", partsnameNumunit=" + partsnameNumunit
				+ ", partsnameWeightunit=" + partsnameWeightunit
				+ ", goodsMetering=" + goodsMetering + ", goodsPriceun="
				+ goodsPriceun + ", goodsPiecemode=" + goodsPiecemode
				+ ", goodsWeightmode=" + goodsWeightmode
				+ ", goodsCustomscode=" + goodsCustomscode + ", goodsEnname="
				+ goodsEnname + ", goodsEndescribe=" + goodsEndescribe
				+ ", goodsBatch=" + goodsBatch + ", goodsIndustry="
				+ goodsIndustry + ", sumgoodsBatch=" + sumgoodsBatch
				+ ", goodsNum=" + goodsNum + ", goodsPiecenum=" + goodsPiecenum
				+ ", goodsSingernum=" + goodsSingernum + ", goodsWeight="
				+ goodsWeight + ", goodsAssistweight=" + goodsAssistweight
				+ ", oconsignDetailOknum=" + oconsignDetailOknum
				+ ", oconsignDetailOkweight=" + oconsignDetailOkweight
				+ ", oconsignDetailOkassistweight="
				+ oconsignDetailOkassistweight + ", oconsignDetailTnum="
				+ oconsignDetailTnum + ", oconsignDetailTweight="
				+ oconsignDetailTweight + ", oconsignDetailTassistweight="
				+ oconsignDetailTassistweight + ", sbillDetailBilltype="
				+ sbillDetailBilltype + ", dataFlag=" + dataFlag
				+ ", oconsignTempbatch=" + oconsignTempbatch
				+ ", previousDataVernum=" + previousDataVernum
				+ ", warehouseDataVernum=" + warehouseDataVernum
				+ ", billtypeCode=" + billtypeCode + ", oconsignDetailCodeOld="
				+ oconsignDetailCodeOld + ", oconsignDetailSupNnum="
				+ oconsignDetailSupNnum + ", oconsignDetailSupNweight="
				+ oconsignDetailSupNweight
				+ ", oconsignDetailSupNassistweight="
				+ oconsignDetailSupNassistweight + ", dataGoodsflagStr="
				+ dataGoodsflagStr + "]";
	}
	
	

}
