package com.jw.beakjoon.lv5;

import java.util.Scanner;

public class BJ9086 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		sc.nextLine();
		
		String[] result = new String[num];
		
		for(int i=0; i<result.length; i++) {
			String str = sc.nextLine();
			result[i] = str.charAt(0) + str.charAt(str.length()-1) + "";
		}
		
		for(int i=0; i<result.length; i++) {
			System.out.println(result[i]);
		}
		
	}
}
