package com.lyr.programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * 2022년 2월 11일 (금요일)
 * 26. 나누어 떨어지는 숫자 배열
 */
public class Multiple {
	public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
//        // 내가 푼 방식
//        Arrays.sort(arr);
//        
//        List<Integer> list = new ArrayList<>();
//        for(int i=0; i<arr.length; i++) {
//        	if(arr[i]%divisor == 0) {
//        		list.add(arr[i]);
//        		System.out.println(arr[i]);
//        	}
//        }
//        if(list.size() == 0) {
//        	list.add(-1);
//        }
//
//        answer = list.stream().mapToInt(Integer::intValue).toArray();
        
        //다른 사람 풀이 참고
        answer = Arrays.stream(arr).filter(e -> e%divisor == 0).toArray();
        if(answer.length == 0) {
        	answer = new int[] {-1};
        }
        for(int i=0; i<answer.length; i++) {
        	System.out.println(answer[i]);
        }

        return answer;
    }
}
