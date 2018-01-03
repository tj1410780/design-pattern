package com.mengdi.proxy;
/*
 * 组合的方式实现代理
 */
public class CarLogProxy implements Moveable{
	private Moveable m;
	
	public CarLogProxy(Moveable m) {
		this.m = m;
	}

	public void move() {
		System.out.println("日志开始...");
		m.move();
		System.out.println("日志结束...");
	}

}
