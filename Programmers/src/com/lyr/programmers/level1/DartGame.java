package com.lyr.programmers.level1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 2022년 2월 18일 (금요일)
 * 50. 다트 게임
 */
public class DartGame {
	public int solution(String dartResult) {
        int answer = 0;
        Pattern p = Pattern.compile("[0-9]{0,2}[SDT]{1}[*#]{0,1}");
        Matcher m = p.matcher(dartResult);        
        
        
        String[][] scores = new String[3][3];
        int j = 0;
        while(m.find()) {
        	String[] score = new String[3];
        	String tmpScore = m.group();
        	System.out.println(tmpScore);
        	
        	Pattern tmpP = Pattern.compile("^[0-9]{0,2}");
        	Matcher tmpM = tmpP.matcher(tmpScore);
        	while(tmpM.find()) { //숫자
        		score[0] = tmpM.group();
        	}
//        	if(score[0].isEmpty()) {
//        		score[0] = "1";
//        	}
        	
        	tmpP = Pattern.compile("[SDT]{1}");
        	tmpM = tmpP.matcher(tmpScore);
        	while(tmpM.find()) { //글자
        		score[1] = tmpM.group();
        	}
        	
        	tmpP = Pattern.compile("[*#]");
        	tmpM = tmpP.matcher(tmpScore);
        	while(tmpM.find()) { //옵션
        		score[2] = tmpM.group();
        	}
        		
        	scores[j] = score;
        	j++;
        }
        
        for(int i=0; i<scores.length; i++) {
        	String[] s = scores[i];
        	int result = Integer.parseInt(s[0]);
        	
        	if(s[1].contentEquals("S")) {
        	} else if(s[1].contentEquals("D")) {
        		result = (int)Math.pow(result, 2);
        	} else if(s[1].contentEquals("T")){
        		result = (int)Math.pow(result, 3);
        	}
        	
        	if(s[2] != null) {
        		if(s[2].contentEquals("*")) {
        			result *= 2;
        		} else if (s[2].contentEquals("#")) {
        			result *= -1;
        		}
        	}
        	if(i<2) {
    			if(scores[i+1][2]!=null) {
        			if(scores[i+1][2].contentEquals("*")) {
        				result *= 2;
        			}
    			}
    		}
        	
        	answer += result;
        	System.out.println("result = "+result);
        	System.out.println("answer = "+answer);
        }
        
        return answer;
    }
}
