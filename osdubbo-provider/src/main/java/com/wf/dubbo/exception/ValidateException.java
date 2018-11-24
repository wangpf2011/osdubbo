package com.wf.dubbo.exception;

/**
 * @Description: JWT单点登录Session跨域--自定义异常
 *
 * @version: v1.0.0
 * @author: wangpf
 * @date: 2018年11月24日 下午9:16:52 
 *
 * Modification History:
 * Date         Author          Version            Description
 *---------------------------------------------------------*
 * 2018年11月24日     wang           v1.0.0               修改原因
 */
public class ValidateException extends Exception {
	private static final long serialVersionUID = -3003170947252001698L;

	//无参构造方法
    public ValidateException(){
        super();
    }

    //有参的构造方法
    public ValidateException(String message){
        super(message);

    }

    // 用指定的详细信息和原因构造一个新的异常
    public ValidateException(String message, Throwable cause){
        super(message,cause);
    }

    //用指定原因构造一个新的异常
     public ValidateException(Throwable cause) {
         super(cause);
     }
}
