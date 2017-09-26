package com.xyscm.ldp.api;

import com.xyscm.framework.common.api.ResultDTO;

/**
 * 
 * 功能描述：
 * 基础类数据查询
 * @author henry
 * @CreateDate 2017-7-28 上午10:17:03
 * @Version: 1.0
 */
public interface BaseDataService {

	/**
	 * 仓库查询
	 *  
	 * @param memberCode
	 * @param warehouseName
	 * @param qType   0：模糊查询；1：精确查询
	 * @return ResultDTO  ResultDTO.data=list<`WarehouseDto>
	 */
	public ResultDTO queryWarehouse(String memberCode,String warehouseName,String qType,int page,int limit);
	
	
	/**
	 * 
	 * @param userId
	 * @param memberCode
	 * @param page
	 * @param limit
	 * @return
	 *
	 * ResultDTO
	 */
	public ResultDTO queryWarehouseWithPermission(String userId,String memberCode,int page,int limit);
	
	
	/**
	 * 
	 * 货主查询
	 * @param memeberCode
	 * @param companyName
	 * @param qType 0：模糊查询；1：精确查询
	 * @return ResultDTO  ResultDTO.data=list<`CompanyDto>
	 *  
	 * 
	 */
	public ResultDTO queryCompany(String memberCode,String companyName,String qType,int page,int limit);
	
	/**
	 * 品名查询
	 * @param memberCode
	 * @param partsTree
	 * @return
	 *
	 * ResultDTO
	 * @see ResultDTO.data=List<`String>
	 */
	public ResultDTO queryPartsName(String memberCode,String partsTree,String partsName,String qType,int page,int limit);
	
	/**
	 * 材质查询
	 * 
	 * @param memberCode
	 * @param partsTree
	 * @param partsName
	 * @return
	 *
	 * ResultDTO  ResultDTO.data = List<`String>
	 *  
	 * 
	 */
	public ResultDTO queryGoodsMaterial(String memberCode,String partsTree,String partsName,String goodsMaterial,String qType,int page,int limit);
	
	/**
	 * 规格查询
	 * @param memberCode
	 * @param partsTree
	 * @param partsName
	 * @param goodsMaterial
	 * @param productareaName
	 * @return
	 *
	 * ResultDTO
	 */
	public ResultDTO queryGoodsSpec(String memberCode,String partsTree,String partsName,String goodsMaterial,String productareaName,String goodsSpec,String qType,int page,int limit);
	
	/**
	 * 产地查询
	 * @param memberCode
	 * @param partsTree
	 * @param partsName
	 * @param goodsMaterial
	 * @return
	 *
	 * ResultDTO
	 */
	public ResultDTO queryProductareaName(String memberCode,String partsTree,String partsName,String goodsMaterial,String productareaName,String qType,int page,int limit);
	
}
