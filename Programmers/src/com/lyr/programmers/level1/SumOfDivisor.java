package com.lyr.programmers.level1;

/*
 * 2022년 2월 13일 (일요일)
 * 16. 약수의 합
 */
public class SumOfDivisor {
	public int solution(int n) {
		
		System.out.println(n);
		
        int answer = 0;

        for(int i=1; i<=n; i++) {
        	if(n%i == 0) {
        		answer += i;
        	}
        }
        System.out.println(answer);
        return answer;
    }
}
