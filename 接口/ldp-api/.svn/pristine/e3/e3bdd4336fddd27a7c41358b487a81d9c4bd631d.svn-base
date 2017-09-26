/**
 * 智恒达钢盟网络科技有限公司
 */
package com.xyscm.ldp.api.oconsign.dto;

import java.io.Serializable;
import java.util.List;


/**
 * 功能描述：
 * 
 * 销售出库通知DTO
 * 
 * @author xielf
 * @CreateDate 2017-5-3 下午7:34:55
 * @Version: 1.0
 */
public class OconsignDto implements Serializable {

	private static final long serialVersionUID = -515163159068199775L;

	/** 出库主表 */
	private StorageOconsignDto mainMod;
	
	/** 出库明细List */
	private List<StorageOconsignDetailDto> detailList;
	
    private List<StorageOconsignCodeDto> codeList;
    
	private String billtypeCode;//单据类型代码
    
    

	public List<StorageOconsignCodeDto> getCodeList() {
		return codeList;
	}

	public void setCodeList(List<StorageOconsignCodeDto> codeList) {
		this.codeList = codeList;
	}

	/**
	 * @return the mainMod
	 */
	public StorageOconsignDto getMainMod() {
		return mainMod;
	}

	/**
	 * @param mainMod the mainMod to set
	 */
	public void setMainMod(StorageOconsignDto mainMod) {
		this.mainMod = mainMod;
	}

	/**
	 * @return the detailList
	 */
	public List<StorageOconsignDetailDto> getDetailList() {
		return detailList;
	}

	/**
	 * @param detailList the detailList to set
	 */
	public void setDetailList(List<StorageOconsignDetailDto> detailList) {
		this.detailList = detailList;
	}

	public String getBilltypeCode() {
		return billtypeCode;
	}

	public void setBilltypeCode(String billtypeCode) {
		this.billtypeCode = billtypeCode;
	}

	@Override
	public String toString() {
		return "OconsignDto [mainMod=" + mainMod + ", detailList=" + detailList
				+ ", codeList=" + codeList + ", billtypeCode=" + billtypeCode
				+ "]";
	}

	
	

}
