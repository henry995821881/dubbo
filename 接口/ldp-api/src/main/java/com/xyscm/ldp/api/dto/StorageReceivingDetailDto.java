/**
 * 
 */
package com.xyscm.ldp.api.dto;

import java.io.Serializable;
import java.util.Date;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;


public class StorageReceivingDetailDto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	/**起始时间*/
	private Date receivingDateStart;
	/**结束时间 */
	private Date receivingDateEnd;
	/**单据生成时间*/
	private Date receivingDate;
	/** 单据号 */
	private String receivingBillcode;
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
	
	private Long receivingDetailId;

	private String receivingBillbatch;

	private String memberCode;

	private String enterLeadBillbatch;

	private String receivingDetailOptcode;

	private String receivingDetailOptbatch;

	private String receivingDetailBilltype;

	private String entryinfBillcode;
	
	private String entryinfBillbatch;

	private String entryinfBilltype;

	private Long receivingDetailState;

	private Long dataGoodsflag;

	private Long dataArrangeflag;

	private String receivingDetailRemark;

	private String orgCode;

	private String deptCode;

	private Long dataVernum;


	private String goodstreeCode;

	private String pntreeName;

	private Double goodsSpec1;

	private Double goodsSpec2;

	private Double goodsSpec3;

	private Double goodsSpec4;

	private String goodsProperty1;

	private String goodsProperty2;

	private String goodsProperty3;

	private String goodsProperty4;

	private String goodsProperty5;

	private Double goodsNumproperty1;

	private Double goodsNumproperty2;

	private String goodsContract;

	private String goodsContractbatch;

	private String goodsContractstr1;

	private String goodsContractstr2;

	private String goodsContractstr3;

	private String goodsContractstr4;

	private String goodsContractstr5;

	private String goodsEntrybatch;

	private String goodsEntrybatchold;

	private String goodsEntrystr1;

	private String goodsEntrystr2;

	private String goodsEntrystr3;

	private String goodsEntrystr4;

	private String goodsEntrystr5;

	private String goodsProperty;

	private Double goodsPartsbranch;

	private Double goodsWetpercentage;

	private String goodsOrg;

	private String goodsDept;

	private String goodsCurrency;

	private Double goodsExrate;

	private String partsnameNumunit;

	private String partsnameWeightunit;

	private String goodsMetering;

	private Long goodsPriceun;

	private Long goodsPiecemode;

	private Long goodsWeightmode;

	private String goodsCustomscode;

	private String goodsEnname;

	private String goodsEndescribe;

	private String goodsBatch;

	private String goodsIndustry;

	private Double goodsNum;

	private Double goodsPiecenum;

	private Double goodsSingernum;

	private Double goodsWeight;

	private Double goodsAssistweight;

	private Double recDetailOknum;

	private Double recDetailOkweight;

	private Double recDetailOkassistweight;

	private Double recDetailNum;

	private Double recDetailWeight;

	private Double recDetailAssistweight;

	private Double recDetailSnum;

	private Double recDetailSweight;

	private Double recDetailSassistweight;

	private Double recDetailSoknum;

	private Double recDetailSokweight;

	private Double recDetailSokassistweight;
	
	private Long dataPdaFlag;
	
	private String pdaBillcode;
	
	private Double receivingDetailPdanum;

	private Double receivingDetailPdaweight;

	public Long getReceivingDetailId() {
		return receivingDetailId;
	}

	public void setReceivingDetailId(Long receivingDetailId) {
		this.receivingDetailId = receivingDetailId;
	}

	public String getReceivingBillcode() {
		return receivingBillcode;
	}

	public void setReceivingBillcode(String receivingBillcode) {
		this.receivingBillcode = receivingBillcode;
	}

	public String getReceivingBillbatch() {
		return receivingBillbatch;
	}

	public void setReceivingBillbatch(String receivingBillbatch) {
		this.receivingBillbatch = receivingBillbatch;
	}

	public String getMemberCode() {
		return memberCode;
	}

	public void setMemberCode(String memberCode) {
		this.memberCode = memberCode;
	}

	public String getEnterLeadBillbatch() {
		return enterLeadBillbatch;
	}

	public void setEnterLeadBillbatch(String enterLeadBillbatch) {
		this.enterLeadBillbatch = enterLeadBillbatch;
	}

	public String getReceivingDetailOptcode() {
		return receivingDetailOptcode;
	}

	public void setReceivingDetailOptcode(String receivingDetailOptcode) {
		this.receivingDetailOptcode = receivingDetailOptcode;
	}

	public String getReceivingDetailOptbatch() {
		return receivingDetailOptbatch;
	}

	public void setReceivingDetailOptbatch(String receivingDetailOptbatch) {
		this.receivingDetailOptbatch = receivingDetailOptbatch;
	}

	public String getReceivingDetailBilltype() {
		return receivingDetailBilltype;
	}

	public void setReceivingDetailBilltype(String receivingDetailBilltype) {
		this.receivingDetailBilltype = receivingDetailBilltype;
	}

	public String getEntryinfBillcode() {
		return entryinfBillcode;
	}

	public void setEntryinfBillcode(String entryinfBillcode) {
		this.entryinfBillcode = entryinfBillcode;
	}

	public String getEntryinfBillbatch() {
		return entryinfBillbatch;
	}

	public void setEntryinfBillbatch(String entryinfBillbatch) {
		this.entryinfBillbatch = entryinfBillbatch;
	}

	public String getEntryinfBilltype() {
		return entryinfBilltype;
	}

	public void setEntryinfBilltype(String entryinfBilltype) {
		this.entryinfBilltype = entryinfBilltype;
	}

	public Long getReceivingDetailState() {
		return receivingDetailState;
	}

	public void setReceivingDetailState(Long receivingDetailState) {
		this.receivingDetailState = receivingDetailState;
	}

	public Long getDataGoodsflag() {
		return dataGoodsflag;
	}

	public void setDataGoodsflag(Long dataGoodsflag) {
		this.dataGoodsflag = dataGoodsflag;
	}

	public Long getDataArrangeflag() {
		return dataArrangeflag;
	}

	public void setDataArrangeflag(Long dataArrangeflag) {
		this.dataArrangeflag = dataArrangeflag;
	}

	public String getReceivingDetailRemark() {
		return receivingDetailRemark;
	}

	public void setReceivingDetailRemark(String receivingDetailRemark) {
		this.receivingDetailRemark = receivingDetailRemark;
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

	public Double getRecDetailOknum() {
		return recDetailOknum;
	}

	public void setRecDetailOknum(Double recDetailOknum) {
		this.recDetailOknum = recDetailOknum;
	}

	public Double getRecDetailOkweight() {
		return recDetailOkweight;
	}

	public void setRecDetailOkweight(Double recDetailOkweight) {
		this.recDetailOkweight = recDetailOkweight;
	}

	public Double getRecDetailOkassistweight() {
		return recDetailOkassistweight;
	}

	public void setRecDetailOkassistweight(Double recDetailOkassistweight) {
		this.recDetailOkassistweight = recDetailOkassistweight;
	}

	public Double getRecDetailNum() {
		return recDetailNum;
	}

	public void setRecDetailNum(Double recDetailNum) {
		this.recDetailNum = recDetailNum;
	}

	public Double getRecDetailWeight() {
		return recDetailWeight;
	}

	public void setRecDetailWeight(Double recDetailWeight) {
		this.recDetailWeight = recDetailWeight;
	}

	public Double getRecDetailAssistweight() {
		return recDetailAssistweight;
	}

	public void setRecDetailAssistweight(Double recDetailAssistweight) {
		this.recDetailAssistweight = recDetailAssistweight;
	}

	public Double getRecDetailSnum() {
		return recDetailSnum;
	}

	public void setRecDetailSnum(Double recDetailSnum) {
		this.recDetailSnum = recDetailSnum;
	}

	public Double getRecDetailSweight() {
		return recDetailSweight;
	}

	public void setRecDetailSweight(Double recDetailSweight) {
		this.recDetailSweight = recDetailSweight;
	}

	public Double getRecDetailSassistweight() {
		return recDetailSassistweight;
	}

	public void setRecDetailSassistweight(Double recDetailSassistweight) {
		this.recDetailSassistweight = recDetailSassistweight;
	}

	public Double getRecDetailSoknum() {
		return recDetailSoknum;
	}

	public void setRecDetailSoknum(Double recDetailSoknum) {
		this.recDetailSoknum = recDetailSoknum;
	}

	public Double getRecDetailSokweight() {
		return recDetailSokweight;
	}

	public void setRecDetailSokweight(Double recDetailSokweight) {
		this.recDetailSokweight = recDetailSokweight;
	}

	public Double getRecDetailSokassistweight() {
		return recDetailSokassistweight;
	}

	public void setRecDetailSokassistweight(Double recDetailSokassistweight) {
		this.recDetailSokassistweight = recDetailSokassistweight;
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

	public Double getReceivingDetailPdanum() {
		return receivingDetailPdanum;
	}
	public Date getReceivingDate() {
		return receivingDate;
	}
	public void setReceivingDate(Date receivingDate) {
		this.receivingDate = receivingDate;
	}

	public void setReceivingDetailPdanum(Double receivingDetailPdanum) {
		this.receivingDetailPdanum = receivingDetailPdanum;
	}

	public Double getReceivingDetailPdaweight() {
		return receivingDetailPdaweight;
	}

	public Date getReceivingDateStart() {
		return receivingDateStart;
	}

	public void setReceivingDateStart(Date receivingDateStart) {
		this.receivingDateStart = receivingDateStart;
	}

	public Date getReceivingDateEnd() {
		return receivingDateEnd;
	}

	public void setReceivingDateEnd(Date receivingDateEnd) {
		this.receivingDateEnd = receivingDateEnd;
	}

	public String getWarehouseName() {
		return warehouseName;
	}

	public void setWarehouseName(String warehouseName) {
		this.warehouseName = warehouseName;
	}
	public void setReceivingDetailPdaweight(Double receivingDetailPdaweight) {
		this.receivingDetailPdaweight = receivingDetailPdaweight;
	}
	
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}

}
