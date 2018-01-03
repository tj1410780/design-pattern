package com.mengdi.proxy;

public class Test {
	public static void main(String[] args) {
//		Moveable m = new Car();
//		CarTimeProxy car = new CarTimeProxy(m);
//		car.move();
		
//		Car car = new Car();
//		Moveable m = new CarTimeProxy(car);
//		CarLogProxy logProxy = new CarLogProxy(m);
//		logProxy.move();
		
		Car car = new Car();
		CarLogProxy carLogProxy = new CarLogProxy(car);
		CarTimeProxy carTimeProxy = new CarTimeProxy(carLogProxy);
		carTimeProxy.move();
	}
}
