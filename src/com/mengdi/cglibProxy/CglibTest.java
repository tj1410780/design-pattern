package com.mengdi.cglibProxy;

public class CglibTest {
	public static void main(String[] args) {
		CglibProxy proxy = new CglibProxy();
		Train train = (Train)proxy.getProxy(Train.class);
		train.move();
		
	}
}
