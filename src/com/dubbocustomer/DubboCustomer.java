package com.dubbocustomer;

import java.io.IOException;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dubboserver.DubboServer;

public class DubboCustomer {
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		context.start();
		DubboServer dubboServer = (DubboServer)context.getBean("dubboServer"); // 获取远程服务代理
	    String hello = dubboServer.sayHello("world"); // 执行远程方法
	    List list = dubboServer.getUsers();
	    System.out.println(list);
	}
}
