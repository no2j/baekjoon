package com.jw.beakjoon.lv8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ1193 {
	
	public static void main(String[] args) throws IOException {
		
		/*
		 * 표를 대각선(/)을 기준으로 분자+분모를 하면 동일한 값이 나온다.
		 * 
		 * ex) 
		 * 분자+분모 =T라고 할 때
		 * 1/1 					-> T=1
		 * 1/2, 2/1 			-> T=2
		 * 3/1, 2/2, 1/3 		-> T=3
		 * 1/4, 2/3, 3/2, 4/1	-> T=4
		 * 
		 * 대각선 칸의 개수는 T
		 * 
		 * T%2 != 0이라면 아래에서 위로 향하는 방향이 된다.
		 * 반대로 T % 2 = 0이라면 위에서 아래로 향하는 방향이 된다.
		 * 
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine()); 		// 입력받은 숫자
		int t = 1;			// 행
		int count = 1; 		// 현재 행까지의 칸 개수
		int prevCount = 1; 	// 이전 행의 칸 개수
		
		while(count < num) { // 칸의 개수가  입력받은 숫자보다 더 작을 경우
			prevCount++; 
			count = count+prevCount; 
			t++;
		}
		
		if(t%2 == 0) { 
			System.out.println(t-(count-num) + "/" + (t+(((count-t)-num)+1)));
		}else {
			System.out.println((t+(((count-t)-num)+1)) + "/" + (t-(count-num)));
		}
		
		/*
		 * 	t%2 == 0 이라면 분모가 큰 분수가 먼저 시작된다.
		 * 	이 분모는 t값을 의미하며 1/t가 먼저 시작
		 * 
		 * 	t%2 != 0 이라면 분자가 큰 분수가 먼저 시작된다.
		 * 	이 분자는 t값을 의미하며 t/1이 먼저 시작
		 * 
		 * 	예로, num=5라고 하면 t는 3이 되고 결과 값은 2/2가 나와야한다.
		 * 	3/1이 먼저 시작이 된다.
		 * 
		 * 	count==6, prevCount==3, t==3
		 * 	t-(count-num) => 분모가 되고 ==> 3-(6-5) == 2
		 * 	t+(((count-t)-num)+1) => 분자가 된다. ==> 3+(((6-3)-5)+1) == 2
		 * 
		 */
		
	}
}
