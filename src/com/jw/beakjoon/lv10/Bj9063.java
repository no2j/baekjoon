package com.jw.beakjoon.lv10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Bj9063 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 점의 개수
		int N = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> x = new ArrayList<>();
		ArrayList<Integer> y = new ArrayList<>();
		
		StringTokenizer st;
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			
			x.add(Integer.parseInt(st.nextToken()));
			y.add(Integer.parseInt(st.nextToken()));
		}
		
		Collections.sort(x);
		Collections.sort(y);
		
		int maxX = x.get(x.size()-1); // x축 최댓값
		int minX = x.get(0); // x축 최솟값
		int maxY = y.get(y.size()-1); // y축 최댓값
		int minY = y.get(0); // y축 최솟값
		
		System.out.println((maxX-minX) * (maxY-minY));
		
		br.close();
		
	}
	
}
