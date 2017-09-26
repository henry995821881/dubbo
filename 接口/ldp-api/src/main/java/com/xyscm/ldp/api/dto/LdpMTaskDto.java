/**
 * 智恒达钢盟网络科技有限公司
 */
package com.xyscm.ldp.api.dto;

import java.io.Serializable;
import java.util.List;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 * 功能描述：仓储加工任务DTO对象
 * 
 * @author xielf
 * @CreateDate 2017-7-19 下午2:58:50
 * @Version: 1.0
 */
public class LdpMTaskDto implements Serializable {
	
	private static final long serialVersionUID = 8892762521738170799L;
	
	/** 仓储加工任务登记主表 */
	private StorageMtaskDto mtaskMod;
	/** 仓储加工任务登记明细List */
	private List<StorageMtaskDetailsDto> detailList;
	
	/** 费用list */
	private List<StorageFeeDto> feeList;
	
	/**
	 * @return the mtaskMod
	 */
	public StorageMtaskDto getMtaskMod() {
		return mtaskMod;
	}

	/**
	 * @param mtaskMod the mtaskMod to set
	 */
	public void setMtaskMod(StorageMtaskDto mtaskMod) {
		this.mtaskMod = mtaskMod;
	}

	/**
	 * @return the detailList
	 */
	public List<StorageMtaskDetailsDto> getDetailList() {
		return detailList;
	}

	/**
	 * @param detailList the detailList to set
	 */
	public void setDetailList(List<StorageMtaskDetailsDto> detailList) {
		this.detailList = detailList;
	}

	/**
	 * @return the feeList
	 */
	public List<StorageFeeDto> getFeeList() {
		return feeList;
	}

	/**
	 * @param feeList the feeList to set
	 */
	public void setFeeList(List<StorageFeeDto> feeList) {
		this.feeList = feeList;
	}
	
	
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}
}
