package com.mengdi.jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TimeHandler implements InvocationHandler {
	
	private Object target;
	
	public TimeHandler(Object target) {
		this.target = target;
	}
	/*
	 * ������
	 * proxy ���������
	 * method ���������ķ���
	 * args �����Ĳ���
	 * 
	 * ����ֵ��
	 * Object �����ķ���ֵ
	 */

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		long startTime = System.currentTimeMillis();
		System.out.println("������ʼ��ʻ...");
		method.invoke(target);
		long endTime = System.currentTimeMillis();
		System.out.println("����������ʻ...��ʻʱ��" + (endTime - startTime) + "����");
		return null;
	}

}
