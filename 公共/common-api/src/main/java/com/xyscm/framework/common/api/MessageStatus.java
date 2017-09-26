/**
 * 智恒达钢盟网络科技有限公司
 */
package com.xyscm.framework.common.api;


/**
 * 功能描述：
 * 状态码
 * 
 * @author xielf
 * @CreateDate 2017-4-22 上午10:32:23
 * @Version: 1.0
 */
public enum MessageStatus {
	
	SUCCESS(0,"成功"),
    FAIL(1,"失败"),
    IN_PROGRESS(2,"处理中");
	
	private int status;
	private String val;
	
	private MessageStatus(int status,String val)
    {
        this.status = status;
        this.val = val;
    }

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getVal() {
		return val;
	}

	public void setVal(String val) {
		this.val = val;
	}

}
