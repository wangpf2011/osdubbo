package com.wf.dubbo.provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.dubbo.common.utils.StringUtils;
import com.wf.dubbo.CheckAuthRequest;
import com.wf.dubbo.CheckAuthResponse;
import com.wf.dubbo.UserRequest;
import com.wf.dubbo.UserResponse;
import com.wf.dubbo.UserService;
import com.wf.dubbo.exception.ValidateException;
import com.wf.dubbo.utils.JwtInfo;

import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.SignatureException;

/**
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
	
	@Autowired
	private JwtTokenService jwtTokenService;

	public UserResponse sayHello(UserRequest req) {
		UserResponse res = new UserResponse();
		res.setCode("0");
		res.setData("userService----Hello " + req.getName());
		res.setMsg("userService");
        return res;
    }

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
            //生成Token
            String uid = "11111111111";
            String token = jwtTokenService.generatorToken(new JwtInfo(uid));
            response.setToken(token);
            
            return response;
        }
        response.setCode("100002");
        response.setMsg("登录失败,帐号或密码错误");
        return response;
	}

	
	/** 
	* @Description: JWT单点登录Session跨域--验证授权
	*
	* @param: CheckAuthRequest
	* @return：CheckAuthResponse
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: wangpf
	* @date: 2018年11月24日 下午9:02:16
	*/
	public CheckAuthResponse checkAuth(CheckAuthRequest request) {
		CheckAuthResponse response = new CheckAuthResponse();
		try {
			beforeCheckAuthValidate(request);
			JwtInfo jwtInfo = jwtTokenService.getInfoFromToken(request.getToken());
			response.setUid(jwtInfo.getUid());
			response.setCode("000000");
			response.setMsg("登录成功");
		} catch(ExpiredJwtException e) {
			e.printStackTrace();
			response.setCode("100001");
	        response.setMsg("token失效");
		} catch (SignatureException e) {
			e.printStackTrace();
			response.setCode("100001");
	        response.setMsg("签名错误");
		} catch (Exception e) {
			e.printStackTrace();
			response.setCode("100001");
	        response.setMsg("请求参数校验失败");
		}
		return response;
	}
	
	private void beforeCheckAuthValidate(CheckAuthRequest request) throws ValidateException {
		if(request == null) {
			throw new ValidateException("请求对象为空");
		}
		if(StringUtils.isEmpty(request.getToken())) {
			throw new ValidateException("token信息为空");
		}
	}
}
