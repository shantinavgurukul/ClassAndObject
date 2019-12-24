package com.startingjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mennu {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter any Day");
		String user = br.readLine();
       
		if (user.equals("mon")) {
//			Put it in the option because if someone does not like Kheer, then they can choose the option
			BufferedReader tr = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("food options");
			String cute = tr.readLine();
			System.out.println(cute);
//      If the user gives Tuesday then Kheer will be print.
		} else if (user.equals("tue")) {
			System.out.println("kheer");
//			If the user gives wed then chhola will be print.
		} else if (user.equals("wed")) {
			System.out.println("chhola");
//			If the user gives thu then pha will be print.
		} else if (user.equals("thu")) {
			System.out.println("poha");
//			If the user gives friday then daliya will be print.
		} else if (user.equals("fri")) {
			System.out.println("daliya");
//			If the user gives sat then pastha will be print.
		} else if (user.equals("sat")) {
			System.out.println("pastha");
//			If the user gives sun then egg milk will be print.
		} else if (user.equals("sun")) {
			System.out.println("egg milk");
		}

	}

}
