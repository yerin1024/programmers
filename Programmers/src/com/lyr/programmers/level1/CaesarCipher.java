package com.lyr.programmers.level1;

/*
 * 2022년 2월 13일 (일요일)
 * 17. 시저 암호(=카이사르 암호)
 */
public class CaesarCipher {
	public String solution(String s, int n) {
        String answer = "";
        
        System.out.println(s);
        char[] arr = new char[s.length()];
        
        for(int i=0; i<s.length(); i++) {
        	char tmp = s.charAt(i);
        	System.out.println(tmp);
        	
        	//아스키코드 대문자(65~90) & 소문자(97~122)
        	if(tmp >= 65 && tmp <= 90) { //대문자
        		tmp = (char) (tmp+n);
        		if(tmp > 90) { //91-> 65
        			tmp = (char) (tmp-26);
        		}
        	} else if(tmp >= 97 && tmp <= 122) {
        		tmp = (char) (tmp+n);
        		if(tmp > 122) { //123-> 97
        			tmp = (char) (tmp-26);
        		}
        	}
        	answer += tmp;
        }
        
        System.out.println(answer);
        return answer;
    }
}
