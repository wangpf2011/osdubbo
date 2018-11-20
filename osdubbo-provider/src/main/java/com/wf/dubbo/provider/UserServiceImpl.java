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

	@Override
	public UserResponse login(UserRequest request) {
		UserResponse response = new UserResponse();
		//参数校验
        if(!UserValidator.checkUserLoginRequest(request)) {
           response.setCode("100001");
           response.setMsg("请求参数校验失败");
            return response;
        }
        if("root".equals(request.getName()) 
        		&& "root".equals(request.getPassword())) {
            response.setCode("000000");
            return response;
        }
        response.setCode("100002");
        response.setMsg("登录失败,帐号或密码错误");
        return response;
	}
}
