package com.mengdi.proxy;
/*
 * ��ϵķ�ʽʵ�ִ���
 */
public class CarLogProxy implements Moveable{
	private Moveable m;
	
	public CarLogProxy(Moveable m) {
		this.m = m;
	}

	public void move() {
		System.out.println("��־��ʼ...");
		m.move();
		System.out.println("��־����...");
	}

}
