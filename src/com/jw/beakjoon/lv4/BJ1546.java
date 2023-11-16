package com.jw.beakjoon.lv4;

import java.util.Scanner;
import java.util.StringTokenizer;

public class BJ1546 {

	public static void main(String[] args) {
		
		/*
		 * 1. 자신의 점수 중 최댓값 = M
		 * 2. 모든점수 /M*100
		 * 3. 과목 수 = N
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt(); // 과목수
		sc.nextLine(); // 개행문자 제거
		
		StringTokenizer st = new StringTokenizer(sc.nextLine());
		
		int[] arr = new int[num];
		
		int index = 0;
		
		while(st.hasMoreTokens()) {
			arr[index] = Integer.parseInt(st.nextToken());
			index++;
		}
		
		//가장 높은 점수 추출
		double maxScore = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > maxScore) {
				maxScore = arr[i];
			}
		}
		
		double[] arr2 = new double[arr.length];
		
		// 점수/최댓값*100
		for(int i=0; i<arr.length; i++) {
			arr2[i] = (arr[i]/maxScore)*100;
		}
		
		// 전부 합친 후 나누기
		double sum = 0;
		
		for(int i=0; i<arr2.length; i++) {
			sum += arr2[i];
		}
		
		double result = sum/arr2.length;
		
		System.out.println(result);
		
	}
	
}
