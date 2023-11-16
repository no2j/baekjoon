package com.jw.beakjoon.lv4;

import java.util.Scanner;
import java.util.StringTokenizer;

public class BJ10810 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		StringTokenizer st = new StringTokenizer(sc.nextLine()," ");
		int num1 = Integer.parseInt(st.nextToken()); // N
		int num2 = Integer.parseInt(st.nextToken()); // M
		
		int[] nArr = new int[num1]; //메인 바구니
		
		for(int i=0; i<num2; i++) {
			st = new StringTokenizer(sc.nextLine()," ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());

			for(int j=a-1; j<b; j++) {
				nArr[j] = c;
			}
		}
		
		sc.close();
		
		String result = "";
		
		for(int i=0; i<nArr.length; i++) {
			if(i != nArr.length) {
				result += nArr[i]+" ";
			}else {
				result += nArr[i]+"";
			}
		}
		System.out.println(result);
	}
	
}
