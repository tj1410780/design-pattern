package com.mengdi.singleton;
/**
 * 单例模式Singleton
 * @author qidi
 * @date 2018年1月3日 @time 下午1:49:48
 * 应用场景：有些对象只需要一个就够了，如线程池，缓存，对话框，日志对象
 * 作用：保证整个应用程序中某个实例有且只有一个
 * 类型：饿汉模式、懒汉模式
 */

/*
 * 饿汉模式
 */
public class Singleton1 {
	//1.将构造方法私有化，不允许外部直接创建对象
	private Singleton1() {}
	//2.创建类的唯一实例，使用public static修饰
	private static Singleton1 instance = new Singleton1();
	//3.提供一个用于获取实例的方法，使用public static修饰
	public static Singleton1 getInstance() {
		return instance;
	}
}
