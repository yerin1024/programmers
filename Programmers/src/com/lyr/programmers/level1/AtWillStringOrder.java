package com.lyr.programmers.level1;

import java.util.Arrays;
import java.util.Comparator;

/*
 * 2022년 2월 13일 (일요일)
 * 24. 문자열 내 마음대로 정렬하기
 */
public class AtWillStringOrder { //At Will 마음대로
	public String[] solution(String[] strings, int n) {
		//다른 사람의 풀이 참고1
//        String[] answer = new String[strings.length];
//
//        for(int i=0; i<strings.length; i++) {
//        	strings[i] = strings[i].charAt(n) + strings[i]; 
//        }
//        
//        Arrays.sort(strings);
//        for(int i=0; i<strings.length; i++) {
//        	System.out.println(strings[i]);
//        	answer[i] = strings[i].substring(1, strings[i].length());
//        	System.out.println(answer[i]);
//        }
		
		//다른 사람의 풀이 참고2
		Arrays.sort(strings, new Comparator<String>() { 
			@Override
			public int compare(String o1, String o2) {//return값이 음수이면 자리바꿈을 하지 않고, 양수이면 자리바꿈을 수행
				if(o1.charAt(n) > o2.charAt(n)) {
					return 1;
				} else if(o1.charAt(n) == o2.charAt(n)){
					return o1.compareTo(o2); //오름차순 정렬해줌
				} else {
					return -1;
				}
			}
		});
		
		for(int i=0; i<strings.length; i++) {
        	System.out.println(strings[i]);
        }
		
        return strings;
    }
}