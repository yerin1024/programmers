package com.lyr.programmers.level1;

import java.util.Arrays;
import java.util.List;

/*
 * 2022년 2월 13일 (일요일)
 * 20. 서울에서 김서방 찾기
 */
public class FindingKimInSeoul {
	public String solution(String[] seoul) {
        String answer = "";
        List<String> list = Arrays.asList(seoul);
        int index = list.indexOf("Kim");
        
        answer = "김서방은 "+index+"에 있다";
        System.out.println(answer);
        return answer;
    }
}
