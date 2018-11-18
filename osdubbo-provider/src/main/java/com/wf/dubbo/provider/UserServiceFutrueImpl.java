package com.wf.dubbo.provider;

import org.springframework.stereotype.Service;

import com.wf.dubbo.UserRequest;
import com.wf.dubbo.UserResponse;
import com.wf.dubbo.UserServiceFuture;

/**
 * @ClassName: UserServiceImpl.java
 * @Description: 异步调用，只支持dubbo协议
 *
 * @version: v1.0.0
 * @author: wangpf
 * @date: 2018年11月15日 下午4:56:57 
 *
 * Modification History:
 * Date         Author          Version            Description
 *---------------------------------------------------------*
 * 2018年11月15日     wang           v1.0.0               修改原因
 */
@Service(value = "userServiceFutrue")
public class UserServiceFutrueImpl implements UserServiceFuture {

	public UserResponse sayHello(UserRequest req) {
		UserResponse res = new UserResponse();
		res.setCode("0");
		res.setData("userServiceFutrue----Hello " + req.getName());
		res.setMsg("userService");
        return res;
    }
}
