package com.jw.beakjoon.lv5;

import java.util.Scanner;

public class BJ10809 {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		String result = "";
		
		int num = 97; // 아스키코드 소문자 a
		
		for(int i=0; i<26; i++) { // a ~ z 까지 총 26번
			
			// indexOf() => 특정 문자 위치 찾기
			
			result += str.indexOf(num) + " ";
			
			num++;
		}
		
		sc.close();
		
		System.out.println(result);
		
	}
	
}
