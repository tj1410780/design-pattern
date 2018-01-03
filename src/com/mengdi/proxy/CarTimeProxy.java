package com.mengdi.proxy;
/*
 * 组合的方式实现代理
 */
public class CarTimeProxy implements Moveable{
	private Moveable m;
	
	public CarTimeProxy(Moveable m) {
		this.m = m;
	}

	public void move() {
		long startTime = System.currentTimeMillis();
		System.out.println("汽车开始行驶...");
		m.move();
		long endTime = System.currentTimeMillis();
		System.out.println("汽车结束行驶...行驶时间" + (endTime - startTime) + "毫秒");

	}

}
