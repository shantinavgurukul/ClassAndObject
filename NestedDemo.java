package com.startingjava;

public class NestedDemo {

	public static void main(String[] args) {
		int num = 10;
		if (num < 0) {
			if (num < 20) {
				if (num % 2 == 0) {
					System.out.println("num is between 0to20 & is even");
				}
			}
		}

	}

}
