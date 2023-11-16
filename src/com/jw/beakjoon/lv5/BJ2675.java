package com.jw.beakjoon.lv5;

import java.util.Scanner;
import java.util.StringTokenizer;

public class BJ2675 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt(); // 테스트 케이스의 개수
		sc.nextLine();

		for(int i=0; i<num; i++) {
			
			StringTokenizer st = new StringTokenizer(sc.nextLine());
			
			int num2 = Integer.parseInt(st.nextToken()); // 각 문자 반복횟수
			
			String str = st.nextToken(); // 입력 문자열
			
			String result = "";
			
			for(int j=0; j<str.length(); j++) {
				
				char ch = str.charAt(j);
				
				for(int k=0; k<num2; k++) {
					
					result += ch;
							
				}
			}
			
			System.out.println(result);
			
		}
		
		sc.close();
	}
	
}
