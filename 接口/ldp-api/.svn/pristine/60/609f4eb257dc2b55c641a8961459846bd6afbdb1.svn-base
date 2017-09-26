package com.xyscm.ldp.api;

import com.xyscm.framework.common.api.ResultDTO;
import com.xyscm.ldp.api.dto.StorageEnterDto;
import com.xyscm.ldp.api.dto.StorageReceivingDetailDto;

public interface LdpMobWarehouseInService {

	//待入库物资查询 （分页） 收货表
	public ResultDTO queryStorageReceiving(StorageReceivingDetailDto storageReceivingDetailDto,Integer page,Integer limit);
	//已入库单列表查询  入库表
	public ResultDTO queryStorageEnter(StorageEnterDto storageEnterDto,Integer page,Integer limit);
	
	//物资入库
	public ResultDTO insertStorageEnter(StorageEnterDto storageEnterDto);
	
}
