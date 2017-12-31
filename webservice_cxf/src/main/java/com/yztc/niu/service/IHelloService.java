package com.yztc.niu.service;

import javax.jws.WebService;

/**
 * webService项目接口
 * @author Administrator
 */
@WebService
public interface IHelloService {

	public String sayHello(String name);
}
