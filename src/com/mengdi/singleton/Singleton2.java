package com.mengdi.singleton;
/*
 * ����ģʽ
 */
public class Singleton2 {
	//1.�����췽��˽�л����������ⲿֱ�Ӵ�������
	
	private Singleton2() {}
	
	//2.�������Ψһʵ����ʹ��private static����
	private static Singleton2 instance;
	
	//3.�ṩһ�����ڻ�ȡʵ���ķ�����ʹ��public static����
	public static Singleton2 getInstance() {
		if (instance == null) {
			instance = new Singleton2();
		} 
		return instance;
	}
}
