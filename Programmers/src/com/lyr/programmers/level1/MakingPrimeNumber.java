package com.lyr.programmers.level1;

import java.util.ArrayList;
import java.util.List;

/*
 * 2022년 2월 16일 (수요일)
 * 47. 소수 만들기
 */
public class MakingPrimeNumber { //prime number 소수(1과 자기 자신만으로 나누어 떨어지는 1보다 큰 양의 정수)
	public int solution(int[] nums) {
        int answer = 0;
        
        List<Integer> sums = new ArrayList<>();
        
        for(int i=0; i<nums.length-2; i++) {
        	for(int j=i+1; j<nums.length-1; j++) {
        		for(int k=j+1; k<nums.length; k++) {
        			System.out.println(nums[i]+"+"+nums[j]+"+"+nums[k]+" = "+(nums[i]+nums[j]+nums[k]));
        			sums.add((nums[i]+nums[j]+nums[k]));
        		}
        	}
        }
        


        int[] sumsArr = sums.stream().mapToInt(Integer::intValue).toArray();
        for(int i=0; i<sumsArr.length; i++) {
        	System.out.println(sumsArr[i]);
        	
        	int sqrt = (int)Math.floor(Math.sqrt(sumsArr[i]));
        	System.out.println("제곱근 = "+sqrt);
        	int cnt = 0;
        	
        	for(int j=2; j<=sqrt; j++) { //제곱근까지의 수까지만 나눠봐도 소수인지를 알 수 있음
        		if(sumsArr[i]%j == 0) { //나눠떨어지는 수가 있으면 cnt증가하고 그러면 소수가 아님
        			cnt++;
        		}
        	}
        	if(cnt == 0) { //소수
        		System.out.println(sumsArr[i]+"는 소수입니다.");
        		answer++;
        	}
        	
        }
        
        System.out.println(answer);
        return answer;
    }
}

/*
set출력하는법
Iterator<Integer> iter = sums.iterator();
while(iter.hasNext()) {
	System.out.println(iter.next());
}
*/
