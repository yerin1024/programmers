package com.lyr.programmers.level1;

/*
 * 2022년 2월 11일 (금요일)
 * 27. 가운데 글자 가져오기
 */
public class GettingMiddleLetter {
	public String solution(String s) {
		//단어의 길이가 홀수면 가운데 글자
		//단어의 길이가 짝수면 두글자
        String answer = "";

    	int n = s.length()/2;
        if(s.length()%2 == 0) { //짝수
        	answer+= s.substring(n-1, n+1); //2글자
        } else { //홀수
        	answer += s.substring(n, n+1); //1글자 첫번째인자부터 두번째인자전까지
        }
        
        System.out.println(answer);
        return answer;
    }
}
