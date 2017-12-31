package com.yztc.niu.service;

import javax.jws.WebService;
/**
 * 把自己的经过调试代码通过web服务中介着公布，并在UDDI注册。
 * web服务请求者向中介着请求特定服务，中介着把符合要求的web服务描述信息使用WSDL返回。
 * 把WSDL描述的信息生成相应的SOAP消息，发送给提供者，实现调用。
 * 提供者按照SOAP消息执行相应服务，返回结果
 * @author Administrator
 */
@WebService(endpointInterface="com.yztc.niu.service.IHelloService",serviceName="hs")
public class HelloServiceImpl implements IHelloService {

	public String sayHello(String name) {
		System.out.println("接收到参数："+name+",执行了sayHello");
		String str="hello,"+name;
		return str;
	}

}
