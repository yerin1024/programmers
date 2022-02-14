package com.lyr.programmers.level1;

/*
 * 2022년 2월 14일 (월요일)
 * 38. 음양 더하기
 */
public class SumOfNegativeAndPositive {
	public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        
        for(int i=0; i<absolutes.length; i++) {
        	int num = absolutes[i];
        	if(!signs[i]) {
        		num = num*-1;
        	}
        	answer += num;
        }
        System.out.println(answer);
        return answer;
    }
}
