package com.yztc.niu.service;

import javax.jws.WebService;

/**
 * webService项目接口
 * 创建一个服务接口，并添加方法，此时接口所在的包名，接口名，定义的方法必须与服务端提供的接口完全一致，
 * @author Administrator
 */
@WebService
public interface IHelloService {

	public String sayHello(String name);
}
