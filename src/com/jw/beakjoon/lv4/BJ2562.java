package com.jw.beakjoon.lv4;

import java.util.Scanner;

public class BJ2562 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] nArr = new int[9];
		
		for(int i=0; i<9; i++) {
			nArr[i] = sc.nextInt();
		}
		
		int num = nArr[0];
		int index = 1;
		
		for(int i=0; i<nArr.length; i++) {
			if(nArr[i] > num) {
				num = nArr[i];
				index = i+1;
			}
		}
		
		System.out.println(num);
		System.out.println(index);
		
	}
	
}
