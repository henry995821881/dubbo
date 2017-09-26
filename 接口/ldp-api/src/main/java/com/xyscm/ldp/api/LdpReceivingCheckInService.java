/**
 * 
 */
package com.xyscm.ldp.api;

import com.xyscm.framework.common.api.ResultDTO;
import com.xyscm.ldp.api.dto.ReceivingDto;

/**
 * 
 * 收货登记对外服务接口 
 * @author xielf
 *
 */
public interface LdpReceivingCheckInService {
	
	/**
	 * 收货登记
	 * 
	 * ERP系统集港生成入库登记后，通知仓储系统
	 * 
	 * @param sysId
	 * @param contents
	 * @return
	 */
	public ResultDTO receivingCheckIn(String sysId,ReceivingDto contents);
	
	/**
	 * 收货变更通知
	 * @param sysId
	 * @param contents
	 * @return
	 *
	 * ResultDTO
	 */
	public ResultDTO updateReceiving(String sysId,ReceivingDto contents);
	
	/**
	 * 查询收货登记单状态
	 * @param sysId
	 * @param entryinfBillcode
	 * @return
	 */
	public ResultDTO getReceivingStatus(String sysId,String receivingOthercode);
	
	/**
	 * 收货变更删除
	 * @param sysId
	 * @param dto
	 * @return
	 *
	 * ResultDTO
	 */
	public ResultDTO deleteReceiving(String sysId, ReceivingDto dto);

}
