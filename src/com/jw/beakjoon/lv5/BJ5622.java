package com.jw.beakjoon.lv5;

import java.util.Scanner;

public class BJ5622 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] arr = new String[10];
		
		arr[1] = "ABC"; // 2
		arr[2] = "DEF";
		arr[3] = "GHI";
		arr[4] = "JKL";
		arr[5] = "MNO";
		arr[6] = "PQRS";
		arr[7] = "TUV";
		arr[8] = "WXYZ"; // 9
		
		String str = sc.nextLine();
		
		String[] strArr = new String[str.length()];
		
		for(int i=0; i<strArr.length; i++) {
			strArr[i] = str.charAt(i)+""; 
		}
		
		int result = 0;
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=0; j<strArr.length; j++) {
				
				if(arr[i] != null && arr[i].contains(strArr[j])) {
					result += i+2;
				}
				
			}
			
		}
		System.out.println(result);
		
		sc.close();
	}
	
}
