package com.wf.dubbo.provider;

import org.springframework.stereotype.Service;

import com.wf.dubbo.CheckAuthRequest;
import com.wf.dubbo.CheckAuthResponse;
import com.wf.dubbo.UserRequest;
import com.wf.dubbo.UserResponse;
import com.wf.dubbo.UserService;

/**
 * @Description: 多版本，基于同一个接口的多个实现
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
@Service(value = "userService2")
public class UserServiceImpl2 implements UserService {

	public UserResponse sayHello(UserRequest req) {
		UserResponse res = new UserResponse();
		res.setCode("0");
		res.setData("userService2----Hello " + req.getName());
		res.setMsg("userService2");
        return res;
    }
	
	public UserResponse login(UserRequest request) {
		return null;
	}
	
	public CheckAuthResponse checkAuth(CheckAuthRequest request) {
		return null;
	}
}
