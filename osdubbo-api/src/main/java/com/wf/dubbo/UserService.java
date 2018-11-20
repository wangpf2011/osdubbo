package com.wf.dubbo;

/**
 * @ClassName: UserService.java
 * @Description: 该类的功能描述
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
public interface UserService {
	UserResponse sayHello(UserRequest req);
	
	/**
     * 登录
     * @param request
     * @return
     */
	UserResponse login(UserRequest request);
}
