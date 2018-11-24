package com.wf.dubbo.provider;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.wf.dubbo.utils.JwtInfo;
import com.wf.dubbo.utils.JwtTokenUtils;

/**
 * @Description: JWT单点登录Session跨域--JwtTokenService
 *
 * @version: v1.0.0
 * @author: wangpf
 * @date: 2018年11月24日 下午8:53:21 
 *
 * Modification History:
 * Date         Author          Version            Description
 *---------------------------------------------------------*
 * 2018年11月24日     wang           v1.0.0               修改原因
 */
@Component
public class JwtTokenService {

	@Value("${jwt.expire}")
	private int expire;
	
	public String generatorToken(JwtInfo jwtInfo) {
		return JwtTokenUtils.generatorToken(jwtInfo, expire);
	}
	
	public JwtInfo getInfoFromToken(String token) {
		return JwtTokenUtils.getJwtInfo(token);
	}
}