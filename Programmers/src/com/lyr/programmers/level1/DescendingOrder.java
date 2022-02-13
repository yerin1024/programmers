package com.lyr.programmers.level1;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

/*
 * 2022년 2월 11일 (금요일)
 * 12. 정수 내림차순으로 배치하기 
 */
public class DescendingOrder {
	public long solution(long n) {
		//내가 푼 방식
//		String str = Long.toString(n);
//		System.out.println(str);
//		if(str.length()<=1) {
//			return n;
//		}
//		
//		int[] arr = new int[str.length()];
//		for(int i=0; i<str.length(); i++) {
//			arr[i] = Integer.valueOf(String.valueOf(str.charAt(i))); //String.valueOf()를 안하고 char형으로 Integer.valueOf를 하면 ASCII값 나옴
//		}
//
//		for(int j=0; j<arr.length-1; j++) {
//			System.out.println(arr[j]);
//			for(int k=j+1; k<arr.length; k++) {
//				if(arr[j] < arr[k]) {
//					int tmp = arr[j];
//					arr[j] = arr[k];
//					arr[k] = tmp;
//				}
//			}
//		}
//		String answerString = "";
//		for(int l=0; l<arr.length; l++) {
//			answerString+=String.valueOf(arr[l]);
//		}
//		long answer = Long.valueOf(answerString);
//		System.out.println(answer);
//		return answer;
		
		//다른 사람의 풀이 참고하여 푼 방식
		String[] arr = String.valueOf(n).split("");
		Arrays.sort(arr, Collections.reverseOrder()); //primitive는 Collection.reverseOrder가 안되기 때문에 미리 String[]로 바꿔서 이용
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		String strAnswer = Arrays.stream(arr).collect(Collectors.joining());
		long answer = Long.parseLong(strAnswer);
		System.out.println(answer);
		
		return answer;
    }
}
