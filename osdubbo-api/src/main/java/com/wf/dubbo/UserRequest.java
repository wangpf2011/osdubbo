package com.wf.dubbo;

import java.io.Serializable;

/**
 * @ClassName: UserRequest.java
 * @Description: 请求参数UserRequest
 *
 * @version: v1.0.0
 * @author: wangpf
 * @date: 2018年11月18日 上午10:40:11 
 *
 * Modification History:
 * Date         Author          Version            Description
 *---------------------------------------------------------*
 * 2018年11月18日     wang           v1.0.0               修改原因
 */
public class UserRequest implements Serializable{

    private static final long serialVersionUID = 4632876501724851634L;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "DoOrderRequest{" +
                "name='" + name + '\'' +
                '}';
    }
}
