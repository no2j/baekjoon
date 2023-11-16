package com.jw.beakjoon.lv5;

import java.util.Scanner;
import java.util.StringTokenizer;

public class BJ1152 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		StringTokenizer st = new StringTokenizer(sc.nextLine());
		
		int result = 0;
		
		while(st.hasMoreTokens()) {
			st.nextToken();
			result++;
		}
		
		System.out.println(result);
		
		sc.close();
	}
	
}
