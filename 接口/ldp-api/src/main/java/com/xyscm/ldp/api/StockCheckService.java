package com.xyscm.ldp.api;

import java.util.List;

import com.xyscm.framework.common.api.ResultDTO;
import com.xyscm.ldp.api.dto.GoodsCheckDto;
import com.xyscm.ldp.api.dto.StorageGoodsDto;

public interface StockCheckService {
	
	/**查询物资对应的库存数*/
	public ResultDTO getGoodsNum(StorageGoodsDto storageSumGoodsDto);
	
	/**盘点超过三次数量不对的记录上传接口*/
	public ResultDTO uploadGoodsCheck(GoodsCheckDto goodsCheckDto);
	
	/**按 checkDate,仓库 查询 库存汇总物资 区分 品名 规格 已盘点  */
	public ResultDTO queryStorageCheck(GoodsCheckDto goodsCheckDto,Integer pageNo,Integer pageSize);
	
	/**按 checkDate,仓库 查询 库存汇总物资 区分 品名 规格 未盘点  */
	public ResultDTO queryStorageNotCheck(GoodsCheckDto goodsCheckDto,Integer pageNo,Integer pageSize);
	
	/**库存盘点接口*/
	public ResultDTO insertGoodsCheckList(List<GoodsCheckDto> goodsCheckDtoList);
	
	
}
