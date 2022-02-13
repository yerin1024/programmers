package com.lyr.programmers.level1;

/*
 * 2022년 2월 13일 (일요일)
 * 21. 문자열 다루기 기본
 */
public class DealingWithString { //deal with 다루다
	public boolean solution(String s) {
        boolean answer = true;
        if(s.length()!= 4 && s.length()!=6) {
        	answer = false;
        } else {
        	for(int i=0; i<s.length(); i++) {
            	if(!(s.charAt(i)>=48 && s.charAt(i)<=57)) { //숫자 48~57
            		answer = false;
            	}
            }
        }
        
        System.out.println(answer);
        return answer;
    }
}
