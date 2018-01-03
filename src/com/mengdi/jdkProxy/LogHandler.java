package com.mengdi.jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LogHandler implements InvocationHandler {
	
	private Object target;
	
	
	public LogHandler(Object target) {
		super();
		this.target = target;
	}


	@Override
	public Object invoke(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("��־��ʼ...");
		method.invoke(target);
		System.out.println("��־����...");
		return null;
	}

}
