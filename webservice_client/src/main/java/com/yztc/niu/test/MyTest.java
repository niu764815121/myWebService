package com.yztc.niu.test;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.yztc.niu.service.IHelloService;
/**
 * 服务请求者测试
 * @author Administrator
 *
 */
public class MyTest {
	public static void main(String[] args) {
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(IHelloService.class);
		factory.setAddress("http://localhost:8080/webservice_cxf/myservices/hs?wsdl");
		IHelloService hs = (IHelloService) factory.create();
		String str = hs.sayHello("zhangsan");
		System.out.println("执行接口："+str);
	}
}
