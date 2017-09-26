/**
 * 智恒达钢盟网络科技有限公司
 */
package com.xyscm.framework.common.api;


/**
 * 功能描述：
 * api服务器端返回状态定义
 * 
 * @author xielf
 * @CreateDate 2017-4-22 上午10:00:07
 * @Version: 1.0
 */
public enum MessageCode {
	
	SUCCESS(0,"处理成功"),
	NO_DATA(1001,"数据不存在"),
	NET_ERROR(1002,"网络无法访问"),
	SYS_ERROR(1003,"系统异常"),
	UNAUTHORIZED_ERROR(1004,"未经授权的访问");
	
    private int code;
    private String message;

    private MessageCode(int code, String message)
    {
        this.code = code;
        this.message = message;
    }

    public int getCode()
    {
        return code;
    }

    public void setCode(int code)
    {
        this.code = code;
    }

    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }

}
