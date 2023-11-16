package com.jw.beakjoon.lv4;

import java.util.Scanner;

public class BJ10818 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int[] nArr = new int[num];
				
		for(int i=0; i<num; i++) {
			nArr[i] = sc.nextInt();
		}
		
		int min = nArr[0];
		int max = nArr[0];
		
		for(int i=0; i<nArr.length; i++) {
			
			if(nArr[i] < min) {
				min = nArr[i];
			}
			if(nArr[i] > max) {
				max = nArr[i];
			}
		}
		
		System.out.println(min + " " + max);
	}
	
}
