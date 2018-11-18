package com.wf.dubbo.provider;

import org.springframework.stereotype.Service;

import com.wf.dubbo.UserRequest;
import com.wf.dubbo.UserResponse;
import com.wf.dubbo.UserService;

/**
 * @ClassName: UserServiceImpl.java
 * @Description: 该类的功能描述
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
@Service(value = "userService")
public class UserServiceImpl implements UserService {

	public UserResponse sayHello(UserRequest req) {
		UserResponse res = new UserResponse();
		res.setCode("0");
		res.setData("userService----Hello " + req.getName());
		res.setMsg("userService");
        return res;
    }
}
