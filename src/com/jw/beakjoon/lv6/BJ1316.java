package com.jw.beakjoon.lv6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class BJ1316 {

	public static void main(String[] args) throws IOException {
		
		/*
		 * 인접해있는 문자가 같거나 달라야하고 같은문자의 경우 연속으로 나와야한다.
		 * 
		 * 1. 입력받은 문자열의 길이만큼 반복을 돌려서 체크해준다.
		 *		조건은 set에 넣은 문자는 재등장 하면 안된다 단 연속으로 나오는것은 상관없음.
		 * 2. 1번의 조건이 부합하면 count를 증가시킨다.
		 * 
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());

		int result = 0;
		
		for(int i=0; i<num; i++) {
			
			HashSet<Character> hs = new HashSet<>(); 
			String str = br.readLine();
			
			int count = 1;
			
			for(int j=0; j<str.length(); j++) {
				
				if(j != 0 && str.charAt(j-1) == str.charAt(j) || hs.add(str.charAt(j)) == true ) { 
					count *= 1;
				}else if(j == 0) {
					hs.add(str.charAt(j));
					count *= 1;
				}else { // 그룹단어가 아닐경우
					count *= 0;
				}
				
			}
			
			if(count > 0) { // 그룹 단어일 경우
				result++;
			}
			
		}
		
		br.close();
		
		System.out.println(result);
		
		
	}
	
}
