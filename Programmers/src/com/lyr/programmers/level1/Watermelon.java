package com.lyr.programmers.level1;

/*
 * 2022년 2월 13일 (일요일)
 * 18. 수박수박수박수박수박수?
 */
public class Watermelon {
	public String solution(int n) {
        String answer = "";
        
        int remainder = n%2; //remainder 나머지
    	int quotient = n/2; //quotient 몫
    	
    	for(int i=0; i<quotient; i++) {
    		answer += "수박";
    	}
    	if(remainder>0) {
    		answer += "수";
    	}
    	
    	System.out.println(answer);
        return answer;
    }
}
