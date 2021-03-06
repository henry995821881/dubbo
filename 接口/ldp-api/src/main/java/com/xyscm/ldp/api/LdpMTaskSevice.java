/**
 * 智恒达钢盟网络科技有限公司
 */
package com.xyscm.ldp.api;

import com.xyscm.framework.common.api.ResultDTO;
import com.xyscm.ldp.api.dto.LdpMTaskDto;

/**
 * 功能描述：
 * 加工任务登记对外service,供ERP1.0调用，当ERP1.0上进行加工任务登记后，调用此接口同步到仓储系统
 * 
 * @author xielf
 * @CreateDate 2017-7-19 下午2:49:35
 * @Version: 1.0
 */
public interface LdpMTaskSevice {
	
	/**
	 * 新增商贸加工任务
	 * @return
	 *
	 * ResultDTO
	 */
	public ResultDTO addMTask(String sysId,LdpMTaskDto dto);
	
	/**
	 * 更新商贸加工任务
	 * @return
	 *
	 * ResultDTO
	 */
	public ResultDTO updateMTask(String sysId,LdpMTaskDto dto);
	
	/**
	 * 删除商贸加工任务
	 * 
	 * @return
	 *
	 * ResultDTO
	 */
	public ResultDTO delMTask(String sysId,String mtaskId);
	
	/**
	 * 加工任务审核、弃审修改状态
	 * @param sysId
	 * @param dto
	 * @return
	 *
	 * ResultDTO
	 */
	public ResultDTO updateAudit(String sysId,LdpMTaskDto dto);
	
}
