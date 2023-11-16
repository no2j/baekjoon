package com.jw.beakjoon.lv4;

import java.util.Scanner;
import java.util.StringTokenizer;

public class BJ10811 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		StringTokenizer st = new StringTokenizer(sc.nextLine()," ");
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n];
		
		//바구니 순서 부여
		for(int i=0; i<n; i++) {
			arr[i] = i+1;
		}
		
		//총 m번 돌린다.
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(sc.nextLine()," ");
			int firstNum = Integer.parseInt(st.nextToken());
			int secondNum = Integer.parseInt(st.nextToken());
			
			int count = 1;
			if(firstNum != secondNum) {
				for(int j=firstNum,k=secondNum; j<=k; j++, k--) {
					int num = arr[secondNum-count]; // 가장 마지막 인덱스
					int num2 = arr[j-1];
					arr[j-1] = num; // 0번인덱스에 마지막 인덱스를 넣는다.
					arr[secondNum - count] = num2;
					count++;
				}
			}
		}
		
		String result = "";
		
		for(int i=0; i<arr.length; i++) {
			if(i != arr.length) {
				result += arr[i]+" ";
			}else {
				result += arr[i];
			}
		}
		
		sc.close();
		System.out.println(result);
		
	}
}
