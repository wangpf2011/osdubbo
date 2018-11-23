package com.wf.dubbo;

/**
 * @Description: 异步调用，只支持dubbo协议
 *
 * @version: v1.0.0
 * @author: wangpf
 * @date: 2018年11月15日 下午4:58:54 
 *
 * Modification History:
 * Date         Author          Version            Description
 *---------------------------------------------------------*
 * 2018年11月15日     wang           v1.0.0               修改原因
 */
public interface UserServiceFuture {
	UserResponse sayHello(UserRequest req);
}
