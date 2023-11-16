package com.jw.beakjoon.lv6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class BJ1157 {

	/*
	 * 2중 for문의 경우 성능이 좋지않지만 이를 보완하는 방식으로
	 * KMP 알고리즘이 있다. (문자열 매칭 알고리즘)
	 */
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine().toUpperCase(); // 대,소문자 구분을 하기 때문에  전부 대문자로 변환
		
		HashSet<Character> hs = new HashSet<>();
		
		String result = "";
		int[] arr = new int[str.length()];

		// baaa
		// b차례 : set에 b가 없으니까 b의 개수 적어놓고 b를 set에 담는다
		// a차례 : set에 a가 없으니까 a의 개수 적어놓고 a를 set에 담는다.
		// a차례 : set에 a가 있으니까 넘어간다.
		// 최종적으로 b의 개수와 a의 개수가 남는다.
		// ba
		// A (3개)
		
		for(int i=0; i<str.length(); i++) {
			
			int count = 0;
			if(hs.add(str.charAt(i))) { // 문자열의 i번째 문자가 set에 없다면 set에 담기.
				for(int j=0; j<str.length(); j++) {
					if(str.charAt(i) == str.charAt(j)) { // i번째 문자와 j번째 문자가 같다면 count 증가
						arr[i] += ++count; //최소 1
					}
				}
				
			}else { // 중복된 값이 있다면
				arr[i] = count; // 0
			}
			
		}
		
		int max = arr[0]; // 최댓값 변수
		int index = 0; // 최댓값의 인덱스
		int count = 0; // 여러개 존재하는 경우를 판단할 변수
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i] > max) {
				max = arr[i];
				index = i;
				count = 0;
			}else if(i != 0 && arr[i]==max) {
				count++;
			}
			
		}
		
		if(count > 0 ) {
			System.out.println("?");
		}else {
			System.out.println(str.charAt(index));
		}
		
		br.close();
	}
	
}
