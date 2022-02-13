package com.lyr.programmers.level1;

import java.util.Arrays;

/*
 * 2022년 2월 13일 (일요일)
 * 22. 문자열 내림차순으로 배치하기
 */
public class StringDescendingOrder {
	public String solution(String s) {
        String answer = "";
        
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        
        StringBuilder sb = new StringBuilder(String.valueOf(arr));
        System.out.println(sb);
        sb.reverse();
        answer = sb.toString();
        
        System.out.println(answer);
        return answer;
    }
}
