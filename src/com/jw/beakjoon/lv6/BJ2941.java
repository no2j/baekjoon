package com.jw.beakjoon.lv6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ2941 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String a = br.readLine();
		
		br.close();
		
		/*
		 * 1. 크로아티아 알파벳을 담아둬야한다. (비교하기 위해)
		 * 2. 반복문을 통해 입력한 문자열에 크로아티아 알파벳이 포함되어있는지 체크해야한다.
		 * 3. 동일 문자가 있을 수 있기때문에 while문을 사용하고
		 * 		true가 나오면 replace를 사용하여 " "로 바꾼다.
		 * 		count를 증가시켜 몇개의 크로아티아 알파벳이 있는지 체크한다.
		 * 4. 나머지는 length()만큼 사이즈를 체크하고 count와 length()를 합친다.
		 */
		
		//1단계
		String[] arr = new String[8];
		arr[0] = "c=";
		arr[1] = "c-";
		arr[2] = "dz=";
		arr[3] = "d-";
		arr[4] = "lj";
		arr[5] = "nj";
		arr[6] = "s=";
		arr[7] = "z=";
		
		//2단계
		int count = 0;
		
		for(int i=0; i< arr.length; i++) { //8번 반복
			
			//3단계
			while(a.contains(arr[i])) {
				// 포함하는 문자중 처음으로 만나는 문자만 제거하기 위해 replaceFirst()사용 
				// replace()를 사용할 경우 전부 다 제거됨
				// 새롭게 합쳐진 문자가 해당될 수 있으므로 공백을 추가
				a = a.replaceFirst(arr[i], " "); 
				count++;
			}
		}
		
		//공백 제거
		a = a.replace(" ", "");
		
		//4단계
		System.out.println(count + a.length());
		
	}
	
}
