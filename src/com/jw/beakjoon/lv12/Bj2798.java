package com.jw.beakjoon.lv12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Bj2798 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// N과 M추출
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		// N의 개수만큼 카드추출 
		ArrayList<Integer> list = new ArrayList<>();
		st = new StringTokenizer(br.readLine());
		
		while(st.hasMoreTokens()) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		
		// 전체카드 세 개의 카드의 합 추출
		ArrayList<Integer> resultList = new ArrayList<>();
		for(int i=0; i<list.size(); i++) {
			
			for(int j=0; j<list.size(); j++) {
				if(i == j) {
					continue;
				}
				
				for(int k=j+1; k<list.size(); k++) {
					if(k==i || k==j || list.get(i)+list.get(j)+list.get(k) > M) {
						continue;
					}
					resultList.add(list.get(i)+list.get(j)+list.get(k)); 
				}
			}
		}
		
		// 가장 가까운 3장의 합 추출
		int max = 0;
		
		for(int i=0; i<resultList.size(); i++) {
			if(resultList.get(i)<=M && max<resultList.get(i)) {
				max = resultList.get(i);
			}
		}
		
		System.out.println(max);
		
		br.close();
	}
	
}
