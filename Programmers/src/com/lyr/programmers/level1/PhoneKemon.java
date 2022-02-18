package com.lyr.programmers.level1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collectors;

/*
 * 2022년 2월 16일 (수요일)
 * 49. 폰켓몬
 */
public class PhoneKemon { //오타아니고 포켓몬이 영어로 pokemon
	public int solution(int[] nums) {
		//포켓몬 종류의 수 return
        int answer = 0;
        int max = nums.length/2;
        
        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        
//        Iterator<Integer> iter = set.iterator();
//        while(iter.hasNext()) {
//        	System.out.println(iter.next());
//        }
        if(set.size()>max) {
        	answer = max;
        } else {
        	answer = set.size();
        }
        System.out.println(answer);
        
        return answer;
    }
}
