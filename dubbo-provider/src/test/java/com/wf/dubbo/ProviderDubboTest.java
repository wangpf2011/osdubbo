package com.wf.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.dubbo.container.Main;

/**
 * @ClassName: DubboTest.java
 * @Description: 该类的功能描述
 *
 * @version: v1.0.0
 * @author: wangpf
 * @date: 2018年11月15日 下午6:33:52 
 *
 * Modification History:
 * Date         Author          Version            Description
 *---------------------------------------------------------*
 * 2018年11月15日     wang           v1.0.0               修改原因
 */
public class ProviderDubboTest {
	public static void main(String[] args) throws Exception {
        /*ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:/*.xml");
        context.start();
        System.in.read(); // 按任意键退出
*/        
		//缺省配置，启动提供者服务
		Main.main(args);
    }
}
