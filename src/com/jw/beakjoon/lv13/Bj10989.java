package com.jw.beakjoon.lv13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Bj10989 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n]; // 메모리 제한을 맞추기 위해서 List대신 배열 사용
		
		for(int i=0; i<n; i++) {
			
			arr[i] = Integer.parseInt(br.readLine());
			
		}
		
		Arrays.sort(arr);
		
		StringBuilder sb = new StringBuilder();

		for(int i : arr) {
			sb.append(i).append("\n");
			// sb.append(i + "\n"); 으로 설정 할 경우 String+String과 같기 때문에 메모리 초과가 뜬다.
			// 즉, StringBuilder 또는 StringBuffer의 경우 append()를 사용하는 것이 효율적
		}
		
		System.out.println(sb);
		
		br.close();
		
	}
	
}