/**
 * 智恒达钢盟网络科技有限公司
 */
package com.xyscm.framework.common.api;

import java.io.Serializable;

/**
 * 功能描述：
 * 
 * 对外服务返回值对象
 * 
 * @author xielf
 * @CreateDate 2017-4-22 上午9:57:15
 * @Version: 1.0
 */
public class ResultDTO implements Serializable {

	private static final long serialVersionUID = 949557481722249807L;
	
	/** 处理状态 */
    private int status;
    /** 业务异常码 */
    private int code;
    /** 业务异常描述 */
    private String message;
    /** 业务数据 -可以为空 */
    private Object data;
	
    public ResultDTO()
    {
        status = MessageStatus.SUCCESS.getStatus();
        code = MessageCode.SUCCESS.getCode();
        message = MessageCode.SUCCESS.getMessage();
    }

    public int getStatus()
    {
        return status;
    }

    public void setStatus(int status)
    {
        this.status = status;
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

    public Object getData()
    {
        return data;
    }

    public void setData(Object data)
    {
        this.data = data;
    }

    public String toString()
    {
        return (new StringBuilder()).append("ResultDTO [status=").append(status).append(", code=").append(code).append(", message=").append(message).append(", data=").append(data).append("]").toString();
    }



}
