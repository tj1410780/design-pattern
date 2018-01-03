package com.mengdi.proxy;
/*
 * ��ϵķ�ʽʵ�ִ���
 */
public class CarTimeProxy implements Moveable{
	private Moveable m;
	
	public CarTimeProxy(Moveable m) {
		this.m = m;
	}

	public void move() {
		long startTime = System.currentTimeMillis();
		System.out.println("������ʼ��ʻ...");
		m.move();
		long endTime = System.currentTimeMillis();
		System.out.println("����������ʻ...��ʻʱ��" + (endTime - startTime) + "����");

	}

}
