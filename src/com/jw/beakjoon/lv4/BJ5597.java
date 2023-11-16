package com.jw.beakjoon.lv4;

import java.util.Scanner;
import java.util.StringTokenizer;

public class BJ5597 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//출석부(30명)
		int[] nArr = new int[30];
		
		//출석부 번호 부여
		for(int i=0; i<30; i++) {
			nArr[i] = i+1;
		}
		
		int[] chkArr = new int[30];
		
		for(int i=0; i<28; i++) {
				
			int num = sc.nextInt();
			
			
			for(int j=0; j<30; j++) {
				
				if(num == nArr[j]) {
					chkArr[j] = 1;
				}
			}
		}
		
		String chkResult = "";
		
		for(int i=0; i<chkArr.length; i++) {
			if(chkArr[i] == 0) {
				chkResult += (i+1)+" ";
			}
		}
		
		StringTokenizer st = new StringTokenizer(chkResult," ");
		
		int[] resultArr = new int[2];
		
		for(int i=0; i<2; i++) {
			resultArr[i] = Integer.parseInt(st.nextToken());
		}
		
		int min = resultArr[0];
		int max = resultArr[0];
		
		for(int i=0; i<resultArr.length; i++) {
			
			if(resultArr[i] > min) {
				max = resultArr[i];
			}
		}
		
		sc.close();
		System.out.println(min + "\n" + max);
	}
}
