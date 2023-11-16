package com.jw.beakjoon.lv4;

import java.util.Scanner;

public class BJ10871 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		str.split(" ");
		String[] a = str.split(" ");
		
		int num1 = Integer.parseInt(a[0]); //N
		int num2 = Integer.parseInt(a[1]); //X
		
		int[] nArr = new int[num1];
		
		for(int i=0; i<num1; i++) {
			nArr[i] = sc.nextInt();
		}
		
		String result = "";
		
		for(int i =0; i<nArr.length; i++) {
			if(nArr[i] < num2) {
				result += nArr[i]+" ";
			}
		}
		System.out.println(result);
	}
	
}
