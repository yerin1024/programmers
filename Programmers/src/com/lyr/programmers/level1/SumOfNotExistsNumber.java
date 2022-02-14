package com.lyr.programmers.level1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * 2022년 2월 14일 (월요일)
 * 39. 없는 숫자 더하기
 */
public class SumOfNotExistsNumber {
	public int solution(int[] numbers) {
        int answer = 0;
        List<Integer> list = Arrays.stream(numbers).boxed().collect(Collectors.toList());
        
        Arrays.sort(numbers);
        for(int i=0; i<10; i++) {
        	if(!list.contains(i)) {
        		answer += i;
        	}
        }
        
        System.out.println(answer);
        return answer;
    }
}
