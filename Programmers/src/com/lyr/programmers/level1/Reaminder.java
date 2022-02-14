package com.lyr.programmers.level1;

/*
 * 2022년 2월 14일 (월요일)
 * 30. 나머지가 1이 되는 수 찾기
 */
public class Reaminder {
	public int solution(int n) {
		//n을 x로 나눈 나머지가 1이 되도록하는 가장 작은 자연수 x
        int answer = 0;
        
        System.out.println(n);
        
        for(int i=1; i<n; i++) {
        	if(n%i == 1) {
        		answer = i;
        		break;
        	}
        }
        
        System.out.println(answer);
        return answer;
    }
}
