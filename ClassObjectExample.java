package com.startingjava;

public class ClassObjectExample {

	public static void main(String[] args) {

		Main r = new Main();
		r.x = 10;
		r.y = 20;
		r.sum = r.x + r.y;
		r.sub = r.x - r.y;
		r.div = r.x / r.y;
		r.mul = r.x * r.y;

		System.out.println(r.sum);
		System.out.println(r.sub);
		System.out.println(r.div);
		System.out.println(r.mul);

		// System.out.println(r.y);

	}

}
