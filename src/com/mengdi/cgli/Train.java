package com.mengdi.cgli;

public class Train {
	public void move() {
		System.out.println("火车正在行驶中...");
	}
	
	public static void main(String[] args) {
		Train train = new Train();
		train.move();
	}
}
