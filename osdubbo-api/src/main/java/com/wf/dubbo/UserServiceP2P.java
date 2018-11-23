package com.wf.dubbo;

/**
 * @Description: 点对点直连，不配置注册中心
 *
 * @version: v1.0.0
 * @author: wangpf
 * @date: 2018年11月16日 上午9:51:56 
 *
 * Modification History:
 * Date         Author          Version            Description
 *---------------------------------------------------------*
 * 2018年11月16日     wang           v1.0.0               修改原因
 */
public interface UserServiceP2P {
	String sayHello(String name);
}
