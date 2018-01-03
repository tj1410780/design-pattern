package com.mengdi.cgli;
import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CglibProxy implements MethodInterceptor {
	private Enhancer enhancer = new Enhancer();
	
	//���ô����������
	public Object getProxy(Class<?> clazz) {
		enhancer.setSuperclass(clazz);
		enhancer.setCallback(this);
		return enhancer.create();
	}	
	
	/*
	 * ��������Ŀ���෽���ĵ���
	 * obj Ŀ�����ʵ��
	 * method Ŀ�귽���ķ���
	 * args �����Ĳ���
	 * proxy �������ʵ��
	 */
	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		
		System.out.println("��־��ʼ...");
		proxy.invokeSuper(obj, args);
		System.out.println("��־����...");		
		return null;
	}

}
