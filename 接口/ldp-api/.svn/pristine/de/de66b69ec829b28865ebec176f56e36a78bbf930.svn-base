package com.xyscm.ldp.api;

import com.xyscm.framework.common.api.ResultDTO;

import com.xyscm.ldp.api.oconsign.dto.VStorageOconsignReportDto;
import com.xyscm.ldp.api.ownerout.dto.StorageOwneroutDto;
import com.xyscm.ldp.api.ownerout.dto.VStorageOwneroutReportDto;

/**
 * 
 * 功能描述：
 * 
 * @author henry
 * @CreateDate 2017-7-27 下午3:45:01
 * @Version: 1.0
 * @see 仓储提供个手机端的   实提出库 接口
 */
public interface LdpDeliveryForAppService {

	
	
	/**
	 * 待出库物资查询 
	 * 
	 * @param  page 页     limit 页大小       dto 查询条件  such as dto.warehouseCode 仓库, dto.companyCode 货主
	 * @return  
	 *
	 * ResultDTO  ResultDTO.data=List<`VStorageOconsignReportDto>
	 */
	public ResultDTO queryOconsignDetail(VStorageOconsignReportDto dto,Integer page,Integer limit);
	
	
	/**
	 * 物资出库
	 * @param oconsignBillcode 发货登记单据号
	 * @param oconsignBillbatch 发货明细批号
	 * @param goodsNum  数量
	 * @param goodsWeight 重量
	 * @return
	 *
	 * ResultDTO
	 */
	public ResultDTO addDeliveryOut(String oconsignBillcode,String oconsignBillbatch,Integer goodsNum,Double goodsWeight ,String userId);
		
	
	
	
	/**
	 * 已出库单列表查询
	 * @param dto
	 * @param page
	 * @param limit
	 * @return
	 *
	 * ResultDTO
	 */
	public ResultDTO queryDeliveryOut(VStorageOwneroutReportDto dto,Integer page,Integer limit);
	
	
	/**
	 * 锁定该提单 不能修改发货单
	 * @param sbillBillcode
	 * @return
	 *
	 * ResultDTO
	 */
	public ResultDTO lockSbillBillcode(String sbillBillcode);
}
