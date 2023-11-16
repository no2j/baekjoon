package com.jw.beakjoon.lv6;

import java.util.Scanner;
import java.util.StringTokenizer;

public class BJ3003 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		StringTokenizer st = new StringTokenizer(sc.nextLine());
		
		// 1, 1, 2, 2, 2, 8
		
		int[] arr = new int[6];
		arr[0] = 1;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 2;
		arr[4] = 2;
		arr[5] = 8;
				
		int[] arr2 = new int[6];
		int index = 0;
		
		while(st.hasMoreTokens()) {
			arr2[index] = Integer.parseInt(st.nextToken());
			index++;
		}
		
		String result = "";
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i] == arr2[i]) {
				result += 0 + " ";
			}else {
				result += arr[i] - arr2[i] + " ";
			}
		}
		
		sc.close();
		
		System.out.println(result);
	}
	
}
