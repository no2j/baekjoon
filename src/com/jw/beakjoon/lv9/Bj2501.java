package com.jw.beakjoon.lv9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Bj2501 {

	// 브루트 포스 알고리즘 - 전체 탐색
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=1; i<=N; i++) {
			if(N % i == 0) { // 약수 찾기
				list.add(i);
			}
		}
		
		if(list.size() < K) {
			System.out.println(0);
		}else {
			System.out.println(list.get(K-1));
		}
		
		br.close();
	}
}
