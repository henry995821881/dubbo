package com.xyscm.ldp.api;

import com.xyscm.framework.common.api.ResultDTO;
import com.xyscm.ldp.api.dto.StorageEnterDto;

public interface LdpEnterService {
	
	/**
	 * 入库登记新增
	 * ERP系统生成入库登记后，通知仓储系统
	 * @param sysId
	 * @param contents
	 * @return
	 */
	public ResultDTO insertEnter(String sysId,StorageEnterDto contents);
	
	/**
	 * 入库登记修改
	 * @param sysId
	 * @param contents
	 * @return
	 *
	 * ResultDTO
	 */
	public ResultDTO updateEnter(String sysId,StorageEnterDto contents);
	
	/**
	 * 收货变更删除
	 * @param sysId
	 * @param dto
	 * @return
	 *
	 * ResultDTO
	 */
	public ResultDTO deleteEnter(String sysId, StorageEnterDto dto);
	
	
}
