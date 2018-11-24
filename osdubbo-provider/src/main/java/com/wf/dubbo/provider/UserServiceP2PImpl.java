package com.wf.dubbo.provider;

import com.wf.dubbo.UserServiceP2P;

/**
 * @Description: 点对点直连，不配置注册中心
 *
 * @version: v1.0.0
 * @author: wangpf
 * @date: 2018年11月16日 上午9:50:26 
 *
 * Modification History:
 * Date         Author          Version            Description
 *---------------------------------------------------------*
 * 2018年11月16日     wang           v1.0.0               修改原因
 */
public class UserServiceP2PImpl implements UserServiceP2P {

	public String sayHello(String name) {
		return "直连接口调用：Hello " + name;
	}
}
