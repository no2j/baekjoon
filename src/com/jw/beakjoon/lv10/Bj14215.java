package com.jw.beakjoon.lv10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj14215 {

	public static void main(String[] args) throws IOException{
		
		// 최댓값을 구하고 나머지 값들을 더한다.
		// 최댓값이 더 크거나 같을 경우 나머지를 더한 값-1과 나머지 값들을 더하면 된다.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[3];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken()); 
		}
		
		// 최댓값을 구하고 나머지 값들을 더한다.
		int max = arr[0];
		int sum = arr[1] + arr[2];
		
		for(int i=1; i<arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
				sum = i==2 ? arr[0] + arr[1] : arr[0] + arr[2];
			}
		}
		
		// 최댓값이 더 크거나 같을 경우 나머지를 더한 값-1과 나머지 값들을 더하면 된다.
		if(max >= sum) {
			System.out.println((sum-1) + sum);
		}else {
			System.out.println(arr[0] + arr[1] + arr[2]);
		}
		
		br.close();
		
	}
	
}
