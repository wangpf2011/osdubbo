package com.wf.dubbo.provider;

import org.springframework.util.StringUtils;

import com.wf.dubbo.UserRequest;

/**
 * @Description: 校验登录信息
 *
 * @version: v1.0.0
 * @author: wangpf
 * @date: 2018年11月20日 下午9:11:09 
 *
 * Modification History:
 * Date         Author          Version            Description
 *---------------------------------------------------------*
 * 2018年11月20日     wang           v1.0.0               修改原因
 */
public class UserValidator {
	
    public static boolean checkUserLoginRequest(UserRequest request){
        if(StringUtils.isEmpty(request.getName())||StringUtils.isEmpty(request.getPassword())){
            return false;
        }
        return true;
    }
}
