package com.jw.beakjoon.lv4;

import java.util.Scanner;
import java.util.StringTokenizer;

public class BJ10813 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		StringTokenizer st = new StringTokenizer(sc.nextLine()," ");
		
		int bucket = Integer.parseInt(st.nextToken()); // 총 바구니 개수
		int bucketNum = Integer.parseInt(st.nextToken()); // 1번부터 bNum번 까지의 바구니 번호
		
		int[] nArr = new int[bucket];
		
		// 처음에는 바구니에 적혀있는 번호와 같은 번호가 적힌 공이 들어있다.
		for(int i=0; i<bucket; i++) {
			nArr[i] = i+1;
		}
		
		for(int i=0; i<bucketNum; i++) {
			st = new StringTokenizer(sc.nextLine()," ");
			
			int num1 = Integer.parseInt(st.nextToken())-1;
			int num2 = Integer.parseInt(st.nextToken())-1;
			
			int num3 = nArr[num1];
			
			nArr[num1] = nArr[num2];
			nArr[num2] = num3;
			
		}
		
		sc.close();
		
		String result = "";
		
		for(int i=0; i<nArr.length; i++) {
			if(i == (nArr.length-1)) {
				result += nArr[i];
			}else {
				result += nArr[i] + " ";
			}
		}
		System.out.println(result);
	}
	
}
