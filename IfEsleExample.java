package com.startingjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IfEsleExample {
	public static void main(String[] args) throws NumberFormatException, IOException {
//		int age = 10;
//		if (age > 8) {
//			
//			System.out.println("Age is greater than 8");
//		}
//	}
//
//}

//		int num = 15;
//		if (num % 2 == 0) {
//			System.out.println("even number");
//		} else {
//			System.out.println("odd number");
//		}
//	}
//}

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter any Number");
		double a = Double.parseDouble(br.readLine());

		if (a % 2 == 0) {
//			If the number that the user gives is even, it will be even print. 
//			If Odd number is given, then Odd will be print.
			System.out.println("even number");
		} else {
			System.out.println("odd number");
		}

	}
}
