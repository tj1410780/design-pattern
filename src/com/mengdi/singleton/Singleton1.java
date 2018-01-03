package com.mengdi.singleton;
/**
 * ����ģʽSingleton
 * @author qidi
 * @date 2018��1��3�� @time ����1:49:48
 * Ӧ�ó�������Щ����ֻ��Ҫһ���͹��ˣ����̳߳أ����棬�Ի������Ӷ���
 * ���ã���֤����Ӧ�ó�����ĳ��ʵ������ֻ��һ��
 * ���ͣ�����ģʽ������ģʽ
 */

/*
 * ����ģʽ
 */
public class Singleton1 {
	//1.�����췽��˽�л����������ⲿֱ�Ӵ�������
	private Singleton1() {}
	//2.�������Ψһʵ����ʹ��public static����
	private static Singleton1 instance = new Singleton1();
	//3.�ṩһ�����ڻ�ȡʵ���ķ�����ʹ��public static����
	public static Singleton1 getInstance() {
		return instance;
	}
}
