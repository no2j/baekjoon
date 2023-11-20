package com.jw.beakjoon.lv9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Bj9506 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		ArrayList<Integer> list = new ArrayList<>();
		
		while(true) {
			
			int n = Integer.parseInt(br.readLine());
			int result = 0; // 약수의 합을 담아놓을 변수
			
			if(n == -1) {
				break;
			}
			
			// 완전수 판별
			for(int i=1; i<=n; i++) { // 약수를 구한다. (브루트 포스 알고리즘 사용)
				if(n%i == 0 && i != n) { // 약수
					list.add(i);
					result += i;
				}
			}
			
			// n이 아닌 약수를 합한다.
			
			sb.append(n);
			
			if(result == n) { // 완전수일 경우

				for (Integer i : list) {
					if(i != 1) {
						sb.append(" + " + i);
					}else {
						sb.append(" = " + i);
					}
				}
				sb.append("\n");
			}else {
				sb.append(" is NOT perfect.\n");
			}
			list.clear();
		}
		
		System.out.println(sb.toString());
		br.close();
	}
	
}
