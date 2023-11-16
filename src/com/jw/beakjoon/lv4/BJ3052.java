package com.jw.beakjoon.lv4;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BJ3052 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] nArr = new int[10];
		
		//A를 B로 나눈 나머지 값 담아주기
		for(int i=0; i<nArr.length; i++) {
			nArr[i] = sc.nextInt()%42;
		}
		
		Set<Integer> intSet = new HashSet<>();
		
		for(int i : nArr) {
			intSet.add(i);
		}
		
		System.out.println(intSet.size());
	}
}
