package com.xyscm.ldp.api.Adjust.dto;

import java.io.Serializable;
import java.util.Date;

public class StorageAdjustDetailDto implements Serializable{
	// Fields

		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		/**临时匹配号*/
		private String tempAdjustDetailFilter;
		//操作类型 0 新增 1更新 2删除
		private int dataFlag;
		/** 上级的版本号,新增加的用到*/
		private Long previousDataVernum;
		/**单据类型*/
		private String billtypeCode;
		/**结存数量*/
		private Double handNum;
		/** 结存重量*/
		private Double handWeight;
		/** 结存辅助重量*/
		private Double handAssistweight;
		
		private Long adjustDetailId;

		private String adjustBillcode;

		private String adjustBillbatch;

		private String memberCode;

		private String adjustDetailFilter;

		private String adjustDetailOptcode;

		private String adjustDetailOptbatch;

		private String adjustDetailBilltype;

		private Long adjustDetailFlag;

		private String adjustDetailLoca;

		private Date goodsDate;

		private String adjustDetailRemark;

		private String orgCode;

		private String deptCode;

		private Long dataVernum;

		private String warehouseCode;

		private String goodstreeCode;

		private String pntreeName;

		private String productareaName;

		private String partsnameName;

		private String goodsMaterial;

		private String goodsSpec;

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

		private String goodsCodebill;
		
		private String goodsWmscodebill;

		private String goodsCodebillold;

		private String goodsCodestr1;

		private String goodsCodestr2;

		private String goodsCodestr3;

		private String goodsCodestr4;

		private String goodsCodestr5;

		private String goodsCodestr6;

		private String goodsCodestr7;

		private String goodsCodestr8;

		private String goodsCodestr9;

		private String goodsCodestr10;

		private Double goodsCodenum1;

		private Double goodsCodenum2;

		private Double goodsCodenum3;

		private Long partsnameSplit;

		private String goodsProperty;

		private Double goodsPartsbranch;

		private Double goodsWetpercentage;

		private String goodsOrg;

		private String goodsDept;

		private String goodsCurrency;

		private Double goodsExrate;

		private String companyCode;

		private String companyName;

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

		private Double goodsOnum;

		private Double goodsOweight;

		private Double goodsOassistweight;

		private Long interfaceWmsscmFlag;
		
		private String adjustBillotherbatch;
		// Constructors

		private String adjustDetailFilterPd;

		public Long getAdjustDetailId() {
			return this.adjustDetailId;
		}

		public void setAdjustDetailId(Long adjustDetailId) {
			this.adjustDetailId = adjustDetailId;
		}

		public String getAdjustBillcode() {
			return this.adjustBillcode;
		}

		public void setAdjustBillcode(String adjustBillcode) {
			this.adjustBillcode = adjustBillcode;
		}

		public String getAdjustBillbatch() {
			return this.adjustBillbatch;
		}

		public void setAdjustBillbatch(String adjustBillbatch) {
			this.adjustBillbatch = adjustBillbatch;
		}

		public String getMemberCode() {
			return this.memberCode;
		}

		public void setMemberCode(String memberCode) {
			this.memberCode = memberCode;
		}

		public String getAdjustDetailFilter() {
			return this.adjustDetailFilter;
		}

		public void setAdjustDetailFilter(String adjustDetailFilter) {
			this.adjustDetailFilter = adjustDetailFilter;
		}

		public String getAdjustDetailOptcode() {
			return this.adjustDetailOptcode;
		}

		public void setAdjustDetailOptcode(String adjustDetailOptcode) {
			this.adjustDetailOptcode = adjustDetailOptcode;
		}

		public String getAdjustDetailOptbatch() {
			return this.adjustDetailOptbatch;
		}

		public void setAdjustDetailOptbatch(String adjustDetailOptbatch) {
			this.adjustDetailOptbatch = adjustDetailOptbatch;
		}

		public String getAdjustDetailBilltype() {
			return this.adjustDetailBilltype;
		}

		public void setAdjustDetailBilltype(String adjustDetailBilltype) {
			this.adjustDetailBilltype = adjustDetailBilltype;
		}

		public Long getAdjustDetailFlag() {
			return this.adjustDetailFlag;
		}

		public void setAdjustDetailFlag(Long adjustDetailFlag) {
			this.adjustDetailFlag = adjustDetailFlag;
		}

		public String getAdjustDetailLoca() {
			return this.adjustDetailLoca;
		}

		public void setAdjustDetailLoca(String adjustDetailLoca) {
			this.adjustDetailLoca = adjustDetailLoca;
		}

		public Date getGoodsDate() {
			return this.goodsDate;
		}

		public void setGoodsDate(Date goodsDate) {
			this.goodsDate = goodsDate;
		}

		public String getAdjustDetailRemark() {
			return this.adjustDetailRemark;
		}

		public void setAdjustDetailRemark(String adjustDetailRemark) {
			this.adjustDetailRemark = adjustDetailRemark;
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

		public Long getDataVernum() {
			return this.dataVernum;
		}

		public void setDataVernum(Long dataVernum) {
			this.dataVernum = dataVernum;
		}

		public String getWarehouseCode() {
			return this.warehouseCode;
		}

		public void setWarehouseCode(String warehouseCode) {
			this.warehouseCode = warehouseCode;
		}

		public String getGoodstreeCode() {
			return this.goodstreeCode;
		}

		public void setGoodstreeCode(String goodstreeCode) {
			this.goodstreeCode = goodstreeCode;
		}

		public String getPntreeName() {
			return this.pntreeName;
		}

		public void setPntreeName(String pntreeName) {
			this.pntreeName = pntreeName;
		}

		public String getProductareaName() {
			return this.productareaName;
		}

		public void setProductareaName(String productareaName) {
			this.productareaName = productareaName;
		}

		public String getPartsnameName() {
			return this.partsnameName;
		}

		public void setPartsnameName(String partsnameName) {
			this.partsnameName = partsnameName;
		}

		public String getGoodsMaterial() {
			return this.goodsMaterial;
		}

		public void setGoodsMaterial(String goodsMaterial) {
			this.goodsMaterial = goodsMaterial;
		}

		public String getGoodsSpec() {
			return this.goodsSpec;
		}

		public void setGoodsSpec(String goodsSpec) {
			this.goodsSpec = goodsSpec;
		}

		public Double getGoodsSpec1() {
			return this.goodsSpec1;
		}

		public void setGoodsSpec1(Double goodsSpec1) {
			this.goodsSpec1 = goodsSpec1;
		}

		public Double getGoodsSpec2() {
			return this.goodsSpec2;
		}

		public void setGoodsSpec2(Double goodsSpec2) {
			this.goodsSpec2 = goodsSpec2;
		}

		public Double getGoodsSpec3() {
			return this.goodsSpec3;
		}

		public void setGoodsSpec3(Double goodsSpec3) {
			this.goodsSpec3 = goodsSpec3;
		}

		public Double getGoodsSpec4() {
			return this.goodsSpec4;
		}

		public void setGoodsSpec4(Double goodsSpec4) {
			this.goodsSpec4 = goodsSpec4;
		}

		public String getGoodsProperty1() {
			return this.goodsProperty1;
		}

		public void setGoodsProperty1(String goodsProperty1) {
			this.goodsProperty1 = goodsProperty1;
		}

		public String getGoodsProperty2() {
			return this.goodsProperty2;
		}

		public void setGoodsProperty2(String goodsProperty2) {
			this.goodsProperty2 = goodsProperty2;
		}

		public String getGoodsProperty3() {
			return this.goodsProperty3;
		}

		public void setGoodsProperty3(String goodsProperty3) {
			this.goodsProperty3 = goodsProperty3;
		}

		public String getGoodsProperty4() {
			return this.goodsProperty4;
		}

		public void setGoodsProperty4(String goodsProperty4) {
			this.goodsProperty4 = goodsProperty4;
		}

		public String getGoodsProperty5() {
			return this.goodsProperty5;
		}

		public void setGoodsProperty5(String goodsProperty5) {
			this.goodsProperty5 = goodsProperty5;
		}

		public Double getGoodsNumproperty1() {
			return this.goodsNumproperty1;
		}

		public void setGoodsNumproperty1(Double goodsNumproperty1) {
			this.goodsNumproperty1 = goodsNumproperty1;
		}

		public Double getGoodsNumproperty2() {
			return this.goodsNumproperty2;
		}

		public void setGoodsNumproperty2(Double goodsNumproperty2) {
			this.goodsNumproperty2 = goodsNumproperty2;
		}

		public String getGoodsContract() {
			return this.goodsContract;
		}

		public void setGoodsContract(String goodsContract) {
			this.goodsContract = goodsContract;
		}

		public String getGoodsContractbatch() {
			return this.goodsContractbatch;
		}

		public void setGoodsContractbatch(String goodsContractbatch) {
			this.goodsContractbatch = goodsContractbatch;
		}

		public String getGoodsContractstr1() {
			return this.goodsContractstr1;
		}

		public void setGoodsContractstr1(String goodsContractstr1) {
			this.goodsContractstr1 = goodsContractstr1;
		}

		public String getGoodsContractstr2() {
			return this.goodsContractstr2;
		}

		public void setGoodsContractstr2(String goodsContractstr2) {
			this.goodsContractstr2 = goodsContractstr2;
		}

		public String getGoodsContractstr3() {
			return this.goodsContractstr3;
		}

		public void setGoodsContractstr3(String goodsContractstr3) {
			this.goodsContractstr3 = goodsContractstr3;
		}

		public String getGoodsContractstr4() {
			return this.goodsContractstr4;
		}

		public void setGoodsContractstr4(String goodsContractstr4) {
			this.goodsContractstr4 = goodsContractstr4;
		}

		public String getGoodsContractstr5() {
			return this.goodsContractstr5;
		}

		public void setGoodsContractstr5(String goodsContractstr5) {
			this.goodsContractstr5 = goodsContractstr5;
		}

		public String getGoodsEntrybatch() {
			return this.goodsEntrybatch;
		}

		public void setGoodsEntrybatch(String goodsEntrybatch) {
			this.goodsEntrybatch = goodsEntrybatch;
		}

		public String getGoodsEntrybatchold() {
			return this.goodsEntrybatchold;
		}

		public void setGoodsEntrybatchold(String goodsEntrybatchold) {
			this.goodsEntrybatchold = goodsEntrybatchold;
		}

		public String getGoodsEntrystr1() {
			return this.goodsEntrystr1;
		}

		public void setGoodsEntrystr1(String goodsEntrystr1) {
			this.goodsEntrystr1 = goodsEntrystr1;
		}

		public String getGoodsEntrystr2() {
			return this.goodsEntrystr2;
		}

		public void setGoodsEntrystr2(String goodsEntrystr2) {
			this.goodsEntrystr2 = goodsEntrystr2;
		}

		public String getGoodsEntrystr3() {
			return this.goodsEntrystr3;
		}

		public void setGoodsEntrystr3(String goodsEntrystr3) {
			this.goodsEntrystr3 = goodsEntrystr3;
		}

		public String getGoodsEntrystr4() {
			return this.goodsEntrystr4;
		}

		public void setGoodsEntrystr4(String goodsEntrystr4) {
			this.goodsEntrystr4 = goodsEntrystr4;
		}

		public String getGoodsEntrystr5() {
			return this.goodsEntrystr5;
		}

		public void setGoodsEntrystr5(String goodsEntrystr5) {
			this.goodsEntrystr5 = goodsEntrystr5;
		}

		public String getGoodsCodebill() {
			return this.goodsCodebill;
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
			return this.goodsCodebillold;
		}

		public void setGoodsCodebillold(String goodsCodebillold) {
			this.goodsCodebillold = goodsCodebillold;
		}

		public String getGoodsCodestr1() {
			return this.goodsCodestr1;
		}

		public void setGoodsCodestr1(String goodsCodestr1) {
			this.goodsCodestr1 = goodsCodestr1;
		}

		public String getGoodsCodestr2() {
			return this.goodsCodestr2;
		}

		public void setGoodsCodestr2(String goodsCodestr2) {
			this.goodsCodestr2 = goodsCodestr2;
		}

		public String getGoodsCodestr3() {
			return this.goodsCodestr3;
		}

		public void setGoodsCodestr3(String goodsCodestr3) {
			this.goodsCodestr3 = goodsCodestr3;
		}

		public String getGoodsCodestr4() {
			return this.goodsCodestr4;
		}

		public void setGoodsCodestr4(String goodsCodestr4) {
			this.goodsCodestr4 = goodsCodestr4;
		}

		public String getGoodsCodestr5() {
			return this.goodsCodestr5;
		}

		public void setGoodsCodestr5(String goodsCodestr5) {
			this.goodsCodestr5 = goodsCodestr5;
		}

		public String getGoodsCodestr6() {
			return this.goodsCodestr6;
		}

		public void setGoodsCodestr6(String goodsCodestr6) {
			this.goodsCodestr6 = goodsCodestr6;
		}

		public String getGoodsCodestr7() {
			return this.goodsCodestr7;
		}

		public void setGoodsCodestr7(String goodsCodestr7) {
			this.goodsCodestr7 = goodsCodestr7;
		}

		public String getGoodsCodestr8() {
			return this.goodsCodestr8;
		}

		public void setGoodsCodestr8(String goodsCodestr8) {
			this.goodsCodestr8 = goodsCodestr8;
		}

		public String getGoodsCodestr9() {
			return this.goodsCodestr9;
		}

		public void setGoodsCodestr9(String goodsCodestr9) {
			this.goodsCodestr9 = goodsCodestr9;
		}

		public String getGoodsCodestr10() {
			return this.goodsCodestr10;
		}

		public void setGoodsCodestr10(String goodsCodestr10) {
			this.goodsCodestr10 = goodsCodestr10;
		}

		public Double getGoodsCodenum1() {
			return this.goodsCodenum1;
		}

		public void setGoodsCodenum1(Double goodsCodenum1) {
			this.goodsCodenum1 = goodsCodenum1;
		}

		public Double getGoodsCodenum2() {
			return this.goodsCodenum2;
		}

		public void setGoodsCodenum2(Double goodsCodenum2) {
			this.goodsCodenum2 = goodsCodenum2;
		}

		public Double getGoodsCodenum3() {
			return this.goodsCodenum3;
		}

		public void setGoodsCodenum3(Double goodsCodenum3) {
			this.goodsCodenum3 = goodsCodenum3;
		}

		public Long getPartsnameSplit() {
			return this.partsnameSplit;
		}

		public void setPartsnameSplit(Long partsnameSplit) {
			this.partsnameSplit = partsnameSplit;
		}

		public String getGoodsProperty() {
			return this.goodsProperty;
		}

		public void setGoodsProperty(String goodsProperty) {
			this.goodsProperty = goodsProperty;
		}

		public Double getGoodsPartsbranch() {
			return this.goodsPartsbranch;
		}

		public void setGoodsPartsbranch(Double goodsPartsbranch) {
			this.goodsPartsbranch = goodsPartsbranch;
		}

		public Double getGoodsWetpercentage() {
			return this.goodsWetpercentage;
		}

		public void setGoodsWetpercentage(Double goodsWetpercentage) {
			this.goodsWetpercentage = goodsWetpercentage;
		}

		public String getGoodsOrg() {
			return this.goodsOrg;
		}

		public void setGoodsOrg(String goodsOrg) {
			this.goodsOrg = goodsOrg;
		}

		public String getGoodsDept() {
			return this.goodsDept;
		}

		public void setGoodsDept(String goodsDept) {
			this.goodsDept = goodsDept;
		}

		public String getGoodsCurrency() {
			return this.goodsCurrency;
		}

		public void setGoodsCurrency(String goodsCurrency) {
			this.goodsCurrency = goodsCurrency;
		}

		public Double getGoodsExrate() {
			return this.goodsExrate;
		}

		public void setGoodsExrate(Double goodsExrate) {
			this.goodsExrate = goodsExrate;
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

		public String getPartsnameNumunit() {
			return this.partsnameNumunit;
		}

		public void setPartsnameNumunit(String partsnameNumunit) {
			this.partsnameNumunit = partsnameNumunit;
		}

		public String getPartsnameWeightunit() {
			return this.partsnameWeightunit;
		}

		public void setPartsnameWeightunit(String partsnameWeightunit) {
			this.partsnameWeightunit = partsnameWeightunit;
		}

		public String getGoodsMetering() {
			return this.goodsMetering;
		}

		public void setGoodsMetering(String goodsMetering) {
			this.goodsMetering = goodsMetering;
		}

		public Long getGoodsPriceun() {
			return this.goodsPriceun;
		}

		public void setGoodsPriceun(Long goodsPriceun) {
			this.goodsPriceun = goodsPriceun;
		}

		public Long getGoodsPiecemode() {
			return this.goodsPiecemode;
		}

		public void setGoodsPiecemode(Long goodsPiecemode) {
			this.goodsPiecemode = goodsPiecemode;
		}

		public Long getGoodsWeightmode() {
			return this.goodsWeightmode;
		}

		public void setGoodsWeightmode(Long goodsWeightmode) {
			this.goodsWeightmode = goodsWeightmode;
		}

		public String getGoodsCustomscode() {
			return this.goodsCustomscode;
		}

		public void setGoodsCustomscode(String goodsCustomscode) {
			this.goodsCustomscode = goodsCustomscode;
		}

		public String getGoodsEnname() {
			return this.goodsEnname;
		}

		public void setGoodsEnname(String goodsEnname) {
			this.goodsEnname = goodsEnname;
		}

		public String getGoodsEndescribe() {
			return this.goodsEndescribe;
		}

		public void setGoodsEndescribe(String goodsEndescribe) {
			this.goodsEndescribe = goodsEndescribe;
		}

		public String getGoodsBatch() {
			return this.goodsBatch;
		}

		public void setGoodsBatch(String goodsBatch) {
			this.goodsBatch = goodsBatch;
		}

		public String getGoodsIndustry() {
			return this.goodsIndustry;
		}

		public void setGoodsIndustry(String goodsIndustry) {
			this.goodsIndustry = goodsIndustry;
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

		public Double getGoodsOnum() {
			return this.goodsOnum;
		}

		public void setGoodsOnum(Double goodsOnum) {
			this.goodsOnum = goodsOnum;
		}

		public Double getGoodsOweight() {
			return this.goodsOweight;
		}

		public void setGoodsOweight(Double goodsOweight) {
			this.goodsOweight = goodsOweight;
		}

		public Double getGoodsOassistweight() {
			return this.goodsOassistweight;
		}

		public void setGoodsOassistweight(Double goodsOassistweight) {
			this.goodsOassistweight = goodsOassistweight;
		}

		public Long getInterfaceWmsscmFlag() {
			return interfaceWmsscmFlag;
		}

		public void setInterfaceWmsscmFlag(Long interfaceWmsscmFlag) {
			this.interfaceWmsscmFlag = interfaceWmsscmFlag;
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

		public Long getPreviousDataVernum() {
			return previousDataVernum;
		}

		public void setPreviousDataVernum(Long previousDataVernum) {
			this.previousDataVernum = previousDataVernum;
		}

		public String getAdjustBillotherbatch() {
			return adjustBillotherbatch;
		}

		public void setAdjustBillotherbatch(String adjustBillotherbatch) {
			this.adjustBillotherbatch = adjustBillotherbatch;
		}

		public Double getHandNum() {
			return handNum;
		}

		public void setHandNum(Double handNum) {
			this.handNum = handNum;
		}

		public Double getHandWeight() {
			return handWeight;
		}

		public void setHandWeight(Double handWeight) {
			this.handWeight = handWeight;
		}

		public Double getHandAssistweight() {
			return handAssistweight;
		}

		public void setHandAssistweight(Double handAssistweight) {
			this.handAssistweight = handAssistweight;
		}

	
		public String getAdjustDetailFilterPd() {
			return adjustDetailFilterPd;
		}

		public void setAdjustDetailFilterPd(String adjustDetailFilterPd) {
			this.adjustDetailFilterPd = adjustDetailFilterPd;
		}

		public String getTempAdjustDetailFilter() {
			return tempAdjustDetailFilter;
		}

		public void setTempAdjustDetailFilter(String tempAdjustDetailFilter) {
			this.tempAdjustDetailFilter = tempAdjustDetailFilter;
		}

	
	
		
}
