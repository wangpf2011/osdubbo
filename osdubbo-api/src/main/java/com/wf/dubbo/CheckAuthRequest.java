package com.wf.dubbo;

import java.io.Serializable;

/**
 * @Description: JWT单点登录Session跨域--CheckAuthRequest
 *
 * @version: v1.0.0
 * @author: wangpf
 * @date: 2018年11月24日 下午8:51:22 
 *
 * Modification History:
 * Date         Author          Version            Description
 *---------------------------------------------------------*
 * 2018年11月24日     wang           v1.0.0               修改原因
 */
public class CheckAuthRequest extends UserRequest implements Serializable {

	private static final long serialVersionUID = 4308644536450682576L;
	
	private String token;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	@Override
	public String toString() {
		return "CheckAuthRequest [token=" + token + "]";
	}
}
