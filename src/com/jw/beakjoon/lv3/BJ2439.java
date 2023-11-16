package com.jw.beakjoon.lv3;

import java.util.Scanner;

public class BJ2439 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		String result = "";

		int num2 = 1;
		
		for(int i=0; i<num; i++) {
			for(int j=0; j<num-num2; j++) {
				result+=" ";
			}
			for(int l=0; l<num2; l++) {
				result+="*";
			}
			num2++;
			System.out.println(result);
			result ="";
		}
	
		sc.close();
		
	}
	
}
