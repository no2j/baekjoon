package com.jw.beakjoon.lv8;

import java.util.Scanner;
import java.util.StringTokenizer;

public class BJ11005 {

	public static void main(String[] args) {
		
		/*
		 * 10진수 -> n진수 변환방법
		 * 
		 *  int 타입으로 받은  n진수 값을
		 *  Integer.toString(int i, int radix) 함수에서 'i'변수에 넣고
		 *	몇 진수 값인지 radix에 넣어주면 된다.
		 *  
		 */
		
		Scanner sc = new Scanner(System.in);
		StringTokenizer st = new StringTokenizer(sc.nextLine());
		
		int num1 = Integer.parseInt(st.nextToken());
		int num2 = Integer.parseInt(st.nextToken());

		// toUpperCase() 함수를 사용하여 대문자로 변경.
		String result = Integer.toString(num1, num2).toUpperCase();
		
		sc.close();
		System.out.println(result);
		
	}
	
}
