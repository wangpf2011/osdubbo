package com.wf.dubbo;

import java.io.Serializable;

/**
 * @Description: 返回类型UserResponse
 *
 * @version: v1.0.0
 * @author: wangpf
 * @date: 2018年11月18日 上午10:39:44 
 *
 * Modification History:
 * Date         Author          Version            Description
 *---------------------------------------------------------*
 * 2018年11月18日     wang           v1.0.0               修改原因
 */
public class UserResponse implements Serializable{

    private static final long serialVersionUID = 3938659532219361525L;
    private Object data;

    private String code;

    private String msg;
    
    private String token;

    public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
    public String toString() {
        return "DoOrderResponse{" +
                "data=" + data +
                ", code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                '}';
    }
}
