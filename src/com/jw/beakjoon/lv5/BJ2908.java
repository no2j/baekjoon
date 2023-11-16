package com.jw.beakjoon.lv5;

import java.util.Scanner;
import java.util.StringTokenizer;

public class BJ2908 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		StringTokenizer st = new StringTokenizer(sc.nextLine());
		
		StringBuffer sb = new StringBuffer(st.nextToken());
		StringBuffer sb2 = new StringBuffer(st.nextToken());
		
		// StringBuffer의 reverse()를 사용하여 역순으로 재배치
		int num = Integer.parseInt(sb.reverse().toString());
		int num2 = Integer.parseInt(sb2.reverse().toString());
		
		if(num > num2) {
			System.out.println(num);
		}else {
			System.out.println(num2);
		}
		
		sc.close();
	}
	
}
