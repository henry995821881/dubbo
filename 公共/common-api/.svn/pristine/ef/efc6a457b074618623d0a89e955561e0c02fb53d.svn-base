/**
 * 智恒达钢盟网络科技有限公司
 */
package com.xyscm.framework.common.api;

import java.io.Serializable;

/**
 * 功能描述：
 * 
 * 分页查询结果对象
 * 
 * @author xielf
 * @CreateDate 2017-8-4 上午11:23:39
 * @Version: 1.0
 */
public class PageDto implements Serializable {
	
	/** 默认每页记录数 */
	private static final int DEFAULT_PAGE_SIZE = 50;// 默认当前页显示多少条记录

	/** 每页记录数 */
	private int pageSize=DEFAULT_PAGE_SIZE;
	/** 总记录数 */
	private int recordCount;
	/** 当前页 */
	private int pageNo =1;
	/** 总页数 */
	private int pageCount;
	/** 开始记录 */
	private int startRow;
	/** 是否最后一页 */
	private boolean isLast;
	/** 上一页 */
	private int prePageNo;
	/** 下一页 */
	private int nextPageNo;
	/** 当前页记录 */
	private Object data;
	
	/**
	 * 每页记录数
	 * @return the pageSize
	 */
	public int getPageSize() {
		return pageSize;
	}
	/**
	 * 每页记录数
	 * @param pageSize the pageSize to set
	 */
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	/**
	 * 总记录数
	 * @return the recordCount
	 */
	public int getRecordCount() {
		return recordCount;
	}
	/**
	 * 总记录数
	 * @param recordCount the recordCount to set
	 */
	public void setRecordCount(int recordCount) {
		this.recordCount = recordCount;
	}
	/**
	 * 当前页
	 * @return the pageNo
	 */
	public int getPageNo() {
		return pageNo;
	}
	/**
	 * 当前页
	 * @param pageNo the pageNo to set
	 */
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	/**
	 * 总页数
	 * @return the pageCount
	 */
	public int getPageCount() {
		return pageCount;
	}
	/**
	 * 总页数
	 * @param pageCount the pageCount to set
	 */
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	/**
	 * 开始记录
	 * @return the startRow
	 */
	public int getStartRow() {
		return startRow;
	}
	/**
	 * 开始记录
	 * @param startRow the startRow to set
	 */
	public void setStartRow(int startRow) {
		this.startRow = startRow;
	}
	/**
	 * @return the data
	 */
	public Object getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(Object data) {
		this.data = data;
	}
	/**
	 * 是否最后一页
	 * @return the isLast
	 */
	public boolean isLast() {
		if(pageNo==pageCount){
			isLast = true;
		}
		return isLast;
	}
	/**
	 * 上一页
	 * @return the prePageNo
	 */
	public int getPrePageNo() {
		if(pageNo>1){
			prePageNo = pageNo-1;
		}
		return prePageNo;
	}
	/**
	 * 下一页
	 * @return the nextPageNo
	 */
	public int getNextPageNo() {
		if(pageNo<pageCount){
			nextPageNo = pageNo+1;
		}
		return nextPageNo;
	}
	
	public String toString()
    {
		return (new StringBuilder()).append("PageDto [pageSize=")
				.append(pageSize).append(", recordCount=").append(recordCount)
				.append(", pageNo=").append(pageNo).append(", pageCount=")
				.append(pageCount).append(", startRow=").append(startRow)
				.append(", isLast=").append(isLast).append(", prePageNo=")
				.append(prePageNo).append(", nextPageNo=").append(nextPageNo)
				.append(", data=").append(data).append("]").toString();
	}
	
}
