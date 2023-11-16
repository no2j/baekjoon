package com.jw.beakjoon.lv5;

import java.util.Scanner;

public class BJ11720 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		sc.nextLine();
		
		String num2 = sc.nextLine();
		
		int result = 0;
		
		for(int i=0; i<num; i++) {
			result += Character.getNumericValue(num2.charAt(i));
		}
		
		sc.close();
		
		System.out.println(result);
		
	}
	
}
