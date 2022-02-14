package com.lyr.programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * 2022년 2월 14일 (월요일)
 * 33. 두 개 뽑아서 더하기
 */
public class AllCasesOfSum {
	public int[] solution(int[] numbers) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        
        Arrays.sort(numbers);
        for(int i=0; i<numbers.length; i++) {
        	System.out.println(numbers[i]);
        	for(int j=i+1; j<numbers.length; j++) {
        		int sum = numbers[i]+numbers[j];
        		if(!list.contains(sum)) {
        			list.add(sum);
        		}
        	}
        }
        
        answer = list.stream().sorted().mapToInt(Integer::intValue).toArray();
        for(int z=0; z<answer.length; z++) {
        	System.out.println(answer[z]);
        }
        return answer;
    }
}
