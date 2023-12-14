package com.jw.beakjoon.lv13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Bj2751 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		
		Collections.sort(list);
		
		StringBuilder sb = new StringBuilder();
		
		for(int i : list) {
			sb.append(i + "\n");
		}
		
		System.out.println(sb);
		br.close();
		
	}
	
	/*
	  	[Arrays.sort()와 Collections.sort()의 차이점]
	  	
	  	Arrays.sort()의 경우 기본 타입과 참조 타입에 따라 정렬 알고리즘이 달라진다.
	  	기본타입 : DualPivotQuicksort -- 최선 : O(NlogN), 최악 : O(N2) 
	  	참조타입 : TimeSort -- 최선 : O(N), 최악 : O(NlogN)
	  	
	  	Collections.sort()의 경우 TimSort를 사용한다.
	  	
	  	해당 문제를 기본타입의 Arrays.sort()를 사용하게 되면 시간초과가 나는 이유이다.
	  	
	 */
	
	/*
		[BufferedWriter 방식]
		[StringBuilder 보다 속도는 조금 느리지만 메모리를 더 절약 가능하다.]
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		
		Collections.sort(list);
		
		for(int i : list) {
			bw.write(i + "\n");
		}
		
		bw.flush();
		br.close(); 
	 */
}
