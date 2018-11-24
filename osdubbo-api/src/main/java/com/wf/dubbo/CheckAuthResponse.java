package com.wf.dubbo;

import java.io.Serializable;

/**
 * @Description: JWT单点登录Session跨域--CheckAuthResponse
 *
 * @version: v1.0.0
 * @author: wangpf
 * @date: 2018年11月24日 下午8:51:39 
 *
 * Modification History:
 * Date         Author          Version            Description
 *---------------------------------------------------------*
 * 2018年11月24日     wang           v1.0.0               修改原因
 */
public class CheckAuthResponse extends UserResponse implements Serializable {
	
	private static final long serialVersionUID = -1609831244684155259L;
	
	private String uid;

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	@Override
	public String toString() {
		return "CheckAuthResponse [uid=" + uid + "]";
	}

}
