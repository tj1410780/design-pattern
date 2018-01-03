package com.mengdi.jdkProxy;

import java.lang.reflect.Proxy;

import com.mengdi.proxy.Car;
import com.mengdi.proxy.Moveable;

public class LogTest {
	public static void main(String[] args) {
		Car car = new Car();
		TimeHandler h = new TimeHandler(car);	
		Class<?> cls = car.getClass();
		Moveable moveable = (Moveable)Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), h);
		LogHandler l = new LogHandler(moveable);
		moveable = (Moveable)Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), l);
		moveable.move();
		
	}
}