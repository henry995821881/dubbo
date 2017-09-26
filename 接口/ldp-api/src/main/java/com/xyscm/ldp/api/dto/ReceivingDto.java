/**
 * 
 */
package com.xyscm.ldp.api.dto;

import java.io.Serializable;
import java.util.List;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 * �ջ�֪ͨDTO
 * 
 * @author xielf
 *
 */
public class ReceivingDto implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2358323778937180584L;
	
	private StorageReceivingDto receivingMod;
	private List<StorageReceivingDetailDto> detailList;
	
	
	public StorageReceivingDto getReceivingMod() {
		return receivingMod;
	}
	public void setReceivingMod(StorageReceivingDto receivingMod) {
		this.receivingMod = receivingMod;
	}
	public List<StorageReceivingDetailDto> getDetailList() {
		return detailList;
	}
	public void setDetailList(List<StorageReceivingDetailDto> detailList) {
		this.detailList = detailList;
	}
	
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}

}
