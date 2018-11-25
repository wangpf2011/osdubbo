package com.wf.dubbo.utils;

import java.security.Key;

import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;

import org.joda.time.DateTime;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

/**
 * @Description: JWT单点登录Session跨域--Jwt工具类
 *
 * @version: v1.0.0
 * @author: wangpf
 * @date: 2018年11月23日 下午6:48:50 
 *
 * Modification History:
 * Date         Author          Version            Description
 *---------------------------------------------------------*
 * 2018年11月23日     wang           v1.0.0               修改原因
 */
public class JwtTokenUtils {
	
	private static Key getKeyInstance() {
		SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;
		byte[] dc = DatatypeConverter.parseBase64Binary("wangpf");
		return new SecretKeySpec(dc, signatureAlgorithm.getJcaName());
	}
	
	//生成Token
	public static String generatorToken(JwtInfo jwtInfo, int expire) {
		return Jwts.builder().claim(JwtContants.JWT_KWY_USER_ID, jwtInfo.getUid())
			.setExpiration(DateTime.now().plusSeconds(expire).toDate())
			.signWith(SignatureAlgorithm.HS256, getKeyInstance()).compact();
	}
	
	//根据Token获取Token中信息
	public static JwtInfo getJwtInfo(String token) {
		Jws<Claims> claimsJws = Jwts.parser().setSigningKey(getKeyInstance()).parseClaimsJws(token);
		Claims claims = claimsJws.getBody();
		return new JwtInfo(claims.get(JwtContants.JWT_KWY_USER_ID).toString());
	}
}
