package com.lyr.programmers.level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * 2022년 2월 14일 (월요일)
 * 34. 3진법 뒤집기
 */
public class ReverseTernary { //ternary 3진법
	public int solution(int n) {
        //10진수 n -> 3진수 -> 뒤집은 3진수 -> 10진수 answer
		//내가 푼 방식
		int answer = 0;
//		
//        List<Integer> list = new ArrayList<>();
//		int quotient = n; //몫
//		int remainder = 0; //나머지
//		
//		while(quotient != 0) {
//			System.out.println(quotient);
//			remainder = quotient%3;
//			quotient = quotient/3;
//			System.out.println(quotient+" && "+remainder);
//			list.add(remainder);
//		}
//		
//		int[] arr = list.stream().mapToInt(Integer::intValue).toArray();
//		for(int i=0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//			int num = (int)Math.pow(3, arr.length-1-i);
//			answer += num*arr[i];
//		}
//        System.out.println(answer);

		//다른 사람 풀이 참고
		String reminder = "";
		while(n > 0) {
			reminder = reminder + (n%3); //3진수 거꾸로 <->(n%3)+reminder는 정상적 3진수
			n = n/3;
		}
		System.out.println(reminder);
		answer = Integer.parseInt(reminder, 3); //reminder를 3진법으로 표현해줌
		
		System.out.println(answer);
        return answer;
    }
}
/*
 Integer.parseInt(String s, int radix) -> 문자열 s를 진수(radix)의 Integer형으로 변환
 */
