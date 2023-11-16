package com.jw.beakjoon.lv8;

import java.util.Scanner;
import java.util.StringTokenizer;

public class BJ2745 {

	public static void main(String[] args) {
		
		/* n진수 -> 10진수 변환방법
		 * 
		 * String타입으로 받은  n진수 값을
		 * Integer.parseInt(String s,int radix) 함수에서 's' 변수에 넣고
		 * 몇 진수 값인지 raidx에 넣어주면 된다.
		 *  
		 */
		
		Scanner sc = new Scanner(System.in);
		
		StringTokenizer st = new StringTokenizer(sc.nextLine());
		
		
		String str = st.nextToken();
		int num = Integer.parseInt(st.nextToken());
		
		sc.close();
		
		System.out.println(Integer.parseInt(str, num));
		
	}
	
}
