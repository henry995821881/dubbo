package com.xyscm.ldp.api;

import com.xyscm.framework.common.api.ResultDTO;
import com.xyscm.ldp.api.Adjust.dto.AdjustDto;


/**
 * 功能描述：提供给erp1.0调用，同步库存接口
 * 
 * @author lenovo
 * @CreateDate 2017-7-27 上午10:58:10
 * @Version: 1.0
 */
public interface LdpAdjustService {
		
	
	/**
	 * 
	 * 添加库存调整/损溢新增登记
	 * @param sysId
	 * @param dto
	 * @return
	 *
	 * ResultDTO
	 */
	public ResultDTO adjustEnroll(AdjustDto dto,int flag);
	
	
	/**
	 * 
	 * 添加库存调整/损溢删除登记
	 * @param sysId
	 * @param dto
	 * @return
	 *
	 * ResultDTO
	 */
	public ResultDTO delAdjustEnroll(String billCode,String billtypeCode);
	
	
	/**
	 * 
	 * 添加库存损溢审核登记
	 * @param sysId
	 * @param dto
	 * @return
	 *
	 * ResultDTO
	 */
	public ResultDTO auditEnroll(String billCode,boolean aditReturnFlag,String auditremak,int status);
	
}
