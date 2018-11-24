package com.wf.dubbo.utils;

/**
 * @Description: JWT单点登录Session跨域--用户信息
 *
 * @version: v1.0.0
 * @author: wangpf
 * @date: 2018年11月24日 下午8:52:40 
 *
 * Modification History:
 * Date         Author          Version            Description
 *---------------------------------------------------------*
 * 2018年11月24日     wang           v1.0.0               修改原因
 */
public class JwtInfo {
	
	private String uid;
	
	public JwtInfo(String uid) {
		super();
		this.uid = uid;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}
}
