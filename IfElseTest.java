package com.startingjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;

public class IfElseTest {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader jd = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number");
		int a = Integer.parseInt(jd.readLine());
		if (a == 5)
//			If the user gives a number less than 5, then (x is 5 yoy print hoga.)
			System.out.println("x is 5.yoy");
		else
//			If is greater than 5 then (mate is yoy)
			System.out.println("mate is 5.yoy");
		System.out.println("please enter 5");
	}

}
