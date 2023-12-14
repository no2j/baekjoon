package com.jw.beakjoon.lv13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Bj2587 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[5];
		
		int sum = 0;
		for(int i=0; i<5; i++) {
			
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
		}
		
		Arrays.sort(arr);
		
		System.out.println(sum/5 + "\n" + arr[2]);
		
		br.close();
		
	}
	
}
