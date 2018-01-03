package com.mengdi.jdkProxy;
/*
 * JDK��̬������
 */

import java.lang.reflect.Proxy;

import com.mengdi.proxy.Car;
import com.mengdi.proxy.Moveable;

public class Test {
	public static void main(String[] args) {
		Car car = new Car();
		TimeHandler tHandler = new TimeHandler(car);
		Class<?> cls = car.getClass();
		/*
		 * loader �������
		 * interfaces ʵ�ֽӿ�
		 * hHandler InvocationHanderler 
		 */
		
		//���ɴ������ʵ��
		Moveable moveable = (Moveable)Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), tHandler);
		moveable.move();
	}
	
	
}
