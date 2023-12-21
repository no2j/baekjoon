package com.jw.beakjoon.lv13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Bj1427 {

	public static void main(String[] args) throws IOException {
		
		/* 
		// [ 배열을 사용해서 반복문이 총 두번 나오는 풀이 (메모리 : 11544kb, 시간 : 84ms) ] 
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		String n = br.readLine();
		
		int[] arr = new int[n.length()];
		
		for(int i=0; i<n.length(); i++) {
			
			arr[i] = Character.getNumericValue(n.charAt(i));
			
		}
		
		Arrays.sort(arr);
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=arr.length; i>0; i--) {
			sb.append(arr[i-1]);
		}
		
		System.out.println(sb);
		
		br.close();
		*/
		
		// [ list를 사용 + Collections의 sort(), reverse()사용 (메모리 : 11588kb, 시간 : 76ms) ] 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String n = br.readLine();
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0; i<n.length(); i++) {
			
			list.add(Character.getNumericValue(n.charAt(i)));
			
		}

		Collections.sort(list);
		
		Collections.reverse(list);
		
		StringBuilder sb = new StringBuilder();

		for(int i : list) {
			sb.append(i);
		}
		
		System.out.println(sb);
		
		br.close();
		
	}
	
}
