/**
 * 智恒达钢盟网络科技有限公司
 */
package com.xyscm.ldp.api.oconsign.dto;

import java.io.Serializable;

/**
 * 功能描述：
 * 
 * 出库登记码单
 * 
 * @author xielf
 * @CreateDate 2017-5-4 上午7:56:19
 * @Version: 1.0
 */
public class StorageOconsignCodeDto implements Serializable{

	private static final long serialVersionUID = -5334255313985433601L;

	private String oconsignBillcode;//发货单号

	private String oconsignBillbatch;//发货单批号

	private String oconsignCodeBatch;//发货单码单批号

	private String memberCode;//会员代码

	private String oconsignDetailOptcode;//业务单据号

	private String oconsignDetailOptbatch;//业务明细单据批号

	private String oconsignCodeOptbatch;//'业务码单单据批号

	private String oconsignDetailBilltype;//业务单据类型代码

	private String scontractBillcode;//销售合同号

	private String scontractBillbatch;//销售合同批号

	private String scontractCodeBatch;//销售合同码单批号

	private String sbillBillcode;//销售提单号

	private String sbillBillbatch;//销售提单批号

	private String sbillCodeBatch;//销售提单码单批号

	private Long oconsignCodeState;//资源完成标记（0：新增1：执行中 2：完成）

	private String oconsignCodeRemark;//备注

	private Long dataVernum;//数据版本号--实际未使用

	private String warehouseCode;//仓库代码

	private String goodstreeCode;//品名总类

	private String pntreeName;//品名大类

	private String productareaName;//产地

	private String partsnameName;//品名

	private String goodsMaterial;//材质

	private String goodsSpec;//规格

	private Double goodsSpec1;//规格2

	private Double goodsSpec2;

	private Double goodsSpec3;

	private Double goodsSpec4;

	private String goodsProperty1;//物资属性1

	private String goodsProperty2;

	private String goodsProperty3;

	private String goodsProperty4;

	private String goodsProperty5;

	private Double goodsNumproperty1;//'物资数值属性1

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

	private String goodsCodebill;//入库码单号
	
	private String goodsWmscodebill;//仓储入库码单号

	private String goodsCodebillold;//原始入库码单号

	private String goodsCodestr1;//入库码单属性1

	private String goodsCodestr2;

	private String goodsCodestr3;

	private String goodsCodestr4;

	private String goodsCodestr5;

	private String goodsCodestr6;

	private String goodsCodestr7;

	private String goodsCodestr8;

	private String goodsCodestr9;

	private String goodsCodestr10;

	private Double goodsCodenum1;//入库码单数值属性1

	private Double goodsCodenum2;

	private Double goodsCodenum3;

	private Long partsnameSplit;//拆分标志0都可拆分1不可拆分2按数量拆分3按重量拆分4按计量

	private String goodsProperty;//'物资属性

	private Double goodsPartsbranch;//件支数

	private Double goodsWetpercentage;//水分

	private String goodsOrg;//'货权机构

	private String goodsDept;//货权部门

	private String goodsCurrency;//成本币种

	private Double goodsExrate;//成本汇率

	private String companyCode;//单位代码(货主)

	private String companyName;//单位名称(货主)

	private String partsnameNumunit;//数量单位

	private String partsnameWeightunit;//重量单位

	private String goodsMetering;//计量方式:默认理算（理算、过磅、干吨、湿吨）

	private Long goodsPriceun;//成本计价单位 0：默认重量

	private Long goodsPiecemode;//'计件模式（0：默认，1：启用件只模式）

	private Long goodsWeightmode;//计重模式0：默认 1过磅理算 2湿吨干吨

	private String goodsCustomscode;//海关编码

	private String goodsEnname;//英文名称

	private String goodsEndescribe;//英文描述

	private String goodsBatch;//物资项目批次

	private String goodsIndustry;//'行业类别

	private Double goodsNum;//数量

	private Double goodsPiecenum;//件数

	private Double goodsSingernum;//'只数

	private Double goodsWeight;//重量

	private Double goodsAssistweight;//辅助重量

	private Double oconsignCodeOknum;//实提数量

	private Double oconsignCodeOkweight;//实提重量

	private Double oconsignCodeOkassistweight;//实提辅助重量

	private Double oconsignCodePdaweight;//PDA出库重量
	
	private Double oconsignCodePdanum;//'PDA出库数量
	
	private Long dataPdaFlag;//PDA是否已操作（0：未操作 1：已操作）
	
	private String pdaBillcode;//'pda验收单号
	
	private String sbillDetailBilltype;//提单单据类型代码
	
	///////////////////////////////////////////////////////////
	////  以下非数据库字段
	//////////////////////////////////////////////////////////
	private int dataFlag = Integer.valueOf(1);

	private String billtypeCode;
	
	/**实提未执行数量(处理库存可供量)*/
	private Double oconsignCodeSupNnum;
	/**实提未执行重量(处理库存可供量)*/
	private Double oconsignCodeSupNweight;
	/**实提未执行辅助重量(处理库存可供量)*/
	private Double oconsignCodeSupNassistweight;
	/**未执行提单数量*/
	private Double oconsignCodeOkNnum;
	/**未执行提单重量*/
	private Double oconsignCodeOkNweight;
	/**未执行提单辅助重量*/
	private Double oconsignCodeOkNassistweight;
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
	public String getOconsignCodeBatch() {
		return oconsignCodeBatch;
	}
	public void setOconsignCodeBatch(String oconsignCodeBatch) {
		this.oconsignCodeBatch = oconsignCodeBatch;
	}
	public String getMemberCode() {
		return memberCode;
	}
	public void setMemberCode(String memberCode) {
		this.memberCode = memberCode;
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
	public String getOconsignCodeOptbatch() {
		return oconsignCodeOptbatch;
	}
	public void setOconsignCodeOptbatch(String oconsignCodeOptbatch) {
		this.oconsignCodeOptbatch = oconsignCodeOptbatch;
	}
	public String getOconsignDetailBilltype() {
		return oconsignDetailBilltype;
	}
	public void setOconsignDetailBilltype(String oconsignDetailBilltype) {
		this.oconsignDetailBilltype = oconsignDetailBilltype;
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
	public String getScontractCodeBatch() {
		return scontractCodeBatch;
	}
	public void setScontractCodeBatch(String scontractCodeBatch) {
		this.scontractCodeBatch = scontractCodeBatch;
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
	public String getSbillCodeBatch() {
		return sbillCodeBatch;
	}
	public void setSbillCodeBatch(String sbillCodeBatch) {
		this.sbillCodeBatch = sbillCodeBatch;
	}
	public Long getOconsignCodeState() {
		return oconsignCodeState;
	}
	public void setOconsignCodeState(Long oconsignCodeState) {
		this.oconsignCodeState = oconsignCodeState;
	}
	public String getOconsignCodeRemark() {
		return oconsignCodeRemark;
	}
	public void setOconsignCodeRemark(String oconsignCodeRemark) {
		this.oconsignCodeRemark = oconsignCodeRemark;
	}
	public Long getDataVernum() {
		return dataVernum;
	}
	public void setDataVernum(Long dataVernum) {
		this.dataVernum = dataVernum;
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
	public String getGoodsCodebill() {
		return goodsCodebill;
	}
	public void setGoodsCodebill(String goodsCodebill) {
		this.goodsCodebill = goodsCodebill;
	}
	public String getGoodsWmscodebill() {
		return goodsWmscodebill;
	}
	public void setGoodsWmscodebill(String goodsWmscodebill) {
		this.goodsWmscodebill = goodsWmscodebill;
	}
	public String getGoodsCodebillold() {
		return goodsCodebillold;
	}
	public void setGoodsCodebillold(String goodsCodebillold) {
		this.goodsCodebillold = goodsCodebillold;
	}
	public String getGoodsCodestr1() {
		return goodsCodestr1;
	}
	public void setGoodsCodestr1(String goodsCodestr1) {
		this.goodsCodestr1 = goodsCodestr1;
	}
	public String getGoodsCodestr2() {
		return goodsCodestr2;
	}
	public void setGoodsCodestr2(String goodsCodestr2) {
		this.goodsCodestr2 = goodsCodestr2;
	}
	public String getGoodsCodestr3() {
		return goodsCodestr3;
	}
	public void setGoodsCodestr3(String goodsCodestr3) {
		this.goodsCodestr3 = goodsCodestr3;
	}
	public String getGoodsCodestr4() {
		return goodsCodestr4;
	}
	public void setGoodsCodestr4(String goodsCodestr4) {
		this.goodsCodestr4 = goodsCodestr4;
	}
	public String getGoodsCodestr5() {
		return goodsCodestr5;
	}
	public void setGoodsCodestr5(String goodsCodestr5) {
		this.goodsCodestr5 = goodsCodestr5;
	}
	public String getGoodsCodestr6() {
		return goodsCodestr6;
	}
	public void setGoodsCodestr6(String goodsCodestr6) {
		this.goodsCodestr6 = goodsCodestr6;
	}
	public String getGoodsCodestr7() {
		return goodsCodestr7;
	}
	public void setGoodsCodestr7(String goodsCodestr7) {
		this.goodsCodestr7 = goodsCodestr7;
	}
	public String getGoodsCodestr8() {
		return goodsCodestr8;
	}
	public void setGoodsCodestr8(String goodsCodestr8) {
		this.goodsCodestr8 = goodsCodestr8;
	}
	public String getGoodsCodestr9() {
		return goodsCodestr9;
	}
	public void setGoodsCodestr9(String goodsCodestr9) {
		this.goodsCodestr9 = goodsCodestr9;
	}
	public String getGoodsCodestr10() {
		return goodsCodestr10;
	}
	public void setGoodsCodestr10(String goodsCodestr10) {
		this.goodsCodestr10 = goodsCodestr10;
	}
	public Double getGoodsCodenum1() {
		return goodsCodenum1;
	}
	public void setGoodsCodenum1(Double goodsCodenum1) {
		this.goodsCodenum1 = goodsCodenum1;
	}
	public Double getGoodsCodenum2() {
		return goodsCodenum2;
	}
	public void setGoodsCodenum2(Double goodsCodenum2) {
		this.goodsCodenum2 = goodsCodenum2;
	}
	public Double getGoodsCodenum3() {
		return goodsCodenum3;
	}
	public void setGoodsCodenum3(Double goodsCodenum3) {
		this.goodsCodenum3 = goodsCodenum3;
	}
	public Long getPartsnameSplit() {
		return partsnameSplit;
	}
	public void setPartsnameSplit(Long partsnameSplit) {
		this.partsnameSplit = partsnameSplit;
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
	public Double getOconsignCodeOknum() {
		return oconsignCodeOknum;
	}
	public void setOconsignCodeOknum(Double oconsignCodeOknum) {
		this.oconsignCodeOknum = oconsignCodeOknum;
	}
	public Double getOconsignCodeOkweight() {
		return oconsignCodeOkweight;
	}
	public void setOconsignCodeOkweight(Double oconsignCodeOkweight) {
		this.oconsignCodeOkweight = oconsignCodeOkweight;
	}
	public Double getOconsignCodeOkassistweight() {
		return oconsignCodeOkassistweight;
	}
	public void setOconsignCodeOkassistweight(Double oconsignCodeOkassistweight) {
		this.oconsignCodeOkassistweight = oconsignCodeOkassistweight;
	}
	public Double getOconsignCodePdaweight() {
		return oconsignCodePdaweight;
	}
	public void setOconsignCodePdaweight(Double oconsignCodePdaweight) {
		this.oconsignCodePdaweight = oconsignCodePdaweight;
	}
	public Double getOconsignCodePdanum() {
		return oconsignCodePdanum;
	}
	public void setOconsignCodePdanum(Double oconsignCodePdanum) {
		this.oconsignCodePdanum = oconsignCodePdanum;
	}
	public Long getDataPdaFlag() {
		return dataPdaFlag;
	}
	public void setDataPdaFlag(Long dataPdaFlag) {
		this.dataPdaFlag = dataPdaFlag;
	}
	public String getPdaBillcode() {
		return pdaBillcode;
	}
	public void setPdaBillcode(String pdaBillcode) {
		this.pdaBillcode = pdaBillcode;
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
	public String getBilltypeCode() {
		return billtypeCode;
	}
	public void setBilltypeCode(String billtypeCode) {
		this.billtypeCode = billtypeCode;
	}
	public Double getOconsignCodeSupNnum() {
		return oconsignCodeSupNnum;
	}
	public void setOconsignCodeSupNnum(Double oconsignCodeSupNnum) {
		this.oconsignCodeSupNnum = oconsignCodeSupNnum;
	}
	public Double getOconsignCodeSupNweight() {
		return oconsignCodeSupNweight;
	}
	public void setOconsignCodeSupNweight(Double oconsignCodeSupNweight) {
		this.oconsignCodeSupNweight = oconsignCodeSupNweight;
	}
	public Double getOconsignCodeSupNassistweight() {
		return oconsignCodeSupNassistweight;
	}
	public void setOconsignCodeSupNassistweight(Double oconsignCodeSupNassistweight) {
		this.oconsignCodeSupNassistweight = oconsignCodeSupNassistweight;
	}
	public Double getOconsignCodeOkNnum() {
		return oconsignCodeOkNnum;
	}
	public void setOconsignCodeOkNnum(Double oconsignCodeOkNnum) {
		this.oconsignCodeOkNnum = oconsignCodeOkNnum;
	}
	public Double getOconsignCodeOkNweight() {
		return oconsignCodeOkNweight;
	}
	public void setOconsignCodeOkNweight(Double oconsignCodeOkNweight) {
		this.oconsignCodeOkNweight = oconsignCodeOkNweight;
	}
	public Double getOconsignCodeOkNassistweight() {
		return oconsignCodeOkNassistweight;
	}
	public void setOconsignCodeOkNassistweight(Double oconsignCodeOkNassistweight) {
		this.oconsignCodeOkNassistweight = oconsignCodeOkNassistweight;
	}
	@Override
	public String toString() {
		return "StorageOconsignCodeDto [oconsignBillcode=" + oconsignBillcode
				+ ", oconsignBillbatch=" + oconsignBillbatch
				+ ", oconsignCodeBatch=" + oconsignCodeBatch + ", memberCode="
				+ memberCode + ", oconsignDetailOptcode="
				+ oconsignDetailOptcode + ", oconsignDetailOptbatch="
				+ oconsignDetailOptbatch + ", oconsignCodeOptbatch="
				+ oconsignCodeOptbatch + ", oconsignDetailBilltype="
				+ oconsignDetailBilltype + ", scontractBillcode="
				+ scontractBillcode + ", scontractBillbatch="
				+ scontractBillbatch + ", scontractCodeBatch="
				+ scontractCodeBatch + ", sbillBillcode=" + sbillBillcode
				+ ", sbillBillbatch=" + sbillBillbatch + ", sbillCodeBatch="
				+ sbillCodeBatch + ", oconsignCodeState=" + oconsignCodeState
				+ ", oconsignCodeRemark=" + oconsignCodeRemark
				+ ", dataVernum=" + dataVernum + ", warehouseCode="
				+ warehouseCode + ", goodstreeCode=" + goodstreeCode
				+ ", pntreeName=" + pntreeName + ", productareaName="
				+ productareaName + ", partsnameName=" + partsnameName
				+ ", goodsMaterial=" + goodsMaterial + ", goodsSpec="
				+ goodsSpec + ", goodsSpec1=" + goodsSpec1 + ", goodsSpec2="
				+ goodsSpec2 + ", goodsSpec3=" + goodsSpec3 + ", goodsSpec4="
				+ goodsSpec4 + ", goodsProperty1=" + goodsProperty1
				+ ", goodsProperty2=" + goodsProperty2 + ", goodsProperty3="
				+ goodsProperty3 + ", goodsProperty4=" + goodsProperty4
				+ ", goodsProperty5=" + goodsProperty5 + ", goodsNumproperty1="
				+ goodsNumproperty1 + ", goodsNumproperty2="
				+ goodsNumproperty2 + ", goodsContract=" + goodsContract
				+ ", goodsContractbatch=" + goodsContractbatch
				+ ", goodsContractstr1=" + goodsContractstr1
				+ ", goodsContractstr2=" + goodsContractstr2
				+ ", goodsContractstr3=" + goodsContractstr3
				+ ", goodsContractstr4=" + goodsContractstr4
				+ ", goodsContractstr5=" + goodsContractstr5
				+ ", goodsEntrybatch=" + goodsEntrybatch
				+ ", goodsEntrybatchold=" + goodsEntrybatchold
				+ ", goodsEntrystr1=" + goodsEntrystr1 + ", goodsEntrystr2="
				+ goodsEntrystr2 + ", goodsEntrystr3=" + goodsEntrystr3
				+ ", goodsEntrystr4=" + goodsEntrystr4 + ", goodsEntrystr5="
				+ goodsEntrystr5 + ", goodsCodebill=" + goodsCodebill
				+ ", goodsWmscodebill=" + goodsWmscodebill
				+ ", goodsCodebillold=" + goodsCodebillold + ", goodsCodestr1="
				+ goodsCodestr1 + ", goodsCodestr2=" + goodsCodestr2
				+ ", goodsCodestr3=" + goodsCodestr3 + ", goodsCodestr4="
				+ goodsCodestr4 + ", goodsCodestr5=" + goodsCodestr5
				+ ", goodsCodestr6=" + goodsCodestr6 + ", goodsCodestr7="
				+ goodsCodestr7 + ", goodsCodestr8=" + goodsCodestr8
				+ ", goodsCodestr9=" + goodsCodestr9 + ", goodsCodestr10="
				+ goodsCodestr10 + ", goodsCodenum1=" + goodsCodenum1
				+ ", goodsCodenum2=" + goodsCodenum2 + ", goodsCodenum3="
				+ goodsCodenum3 + ", partsnameSplit=" + partsnameSplit
				+ ", goodsProperty=" + goodsProperty + ", goodsPartsbranch="
				+ goodsPartsbranch + ", goodsWetpercentage="
				+ goodsWetpercentage + ", goodsOrg=" + goodsOrg
				+ ", goodsDept=" + goodsDept + ", goodsCurrency="
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
				+ goodsIndustry + ", goodsNum=" + goodsNum + ", goodsPiecenum="
				+ goodsPiecenum + ", goodsSingernum=" + goodsSingernum
				+ ", goodsWeight=" + goodsWeight + ", goodsAssistweight="
				+ goodsAssistweight + ", oconsignCodeOknum="
				+ oconsignCodeOknum + ", oconsignCodeOkweight="
				+ oconsignCodeOkweight + ", oconsignCodeOkassistweight="
				+ oconsignCodeOkassistweight + ", oconsignCodePdaweight="
				+ oconsignCodePdaweight + ", oconsignCodePdanum="
				+ oconsignCodePdanum + ", dataPdaFlag=" + dataPdaFlag
				+ ", pdaBillcode=" + pdaBillcode + ", sbillDetailBilltype="
				+ sbillDetailBilltype + ", dataFlag=" + dataFlag
				+ ", billtypeCode=" + billtypeCode + ", oconsignCodeSupNnum="
				+ oconsignCodeSupNnum + ", oconsignCodeSupNweight="
				+ oconsignCodeSupNweight + ", oconsignCodeSupNassistweight="
				+ oconsignCodeSupNassistweight + ", oconsignCodeOkNnum="
				+ oconsignCodeOkNnum + ", oconsignCodeOkNweight="
				+ oconsignCodeOkNweight + ", oconsignCodeOkNassistweight="
				+ oconsignCodeOkNassistweight + "]";
	}


}
