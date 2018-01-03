package com.mengdi.jdkProxy;
/*
 * JDK动态代理类
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
		 * loader 类加载器
		 * interfaces 实现接口
		 * hHandler InvocationHanderler 
		 */
		
		//生成代理类的实例
		Moveable moveable = (Moveable)Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), tHandler);
		moveable.move();
	}
	
	
}
