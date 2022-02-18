package com.lyr.programmers.level1;

/*
 * 2022년 2월 18일 (금요일)
 * 51. 약수의 개수와 덧셈
 */
public class Divisor { //약수 divisor
    public int solution(int left, int right) {
        System.out.println(left+" && "+right);
    	int answer = 0;
        
        for(int i=left; i<=right; i++) {
        	System.out.println("======="+i);
        	int divisorCnt = 0; //숫자 i의 약수 개수
        	
        	for(int j=1; j<=i; j++) {
        		if(i%j == 0) { //숫자 i의 약수
        			divisorCnt++;
        		}
        	}
        	
        	if(divisorCnt%2 == 0) { //약수의 개수가 짝수라면
        		answer += i;
        	} else if (divisorCnt%2 == 1) { //약수의 개수가 홀수라면
        		answer -= i;
        	}
        }
        
        System.out.println(answer);
        return answer;
    }
}
