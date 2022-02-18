package com.lyr.programmers.level1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * 2022년 2월 18일 (금요일)
 * 51. 신고 결과 받기
 */
public class GettingDeclarationResult { //신고 declaration
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        
        //회원명, 회원이 신고한사람목록
        Map<String, Set<String>> declarations = new HashMap<>();
        //회원명, 회원이 신고당한횟수
        Map<String, Integer> declarationCnt = new HashMap<>();
        
        for(int i=0; i<id_list.length; i++) {
        	declarations.put(id_list[i], new HashSet<String>());
        	declarationCnt.put(id_list[i], 0);
        }
        
        for(int j=0; j<report.length; j++) {
        	System.out.println("신고내역 "+report[j]);
        	
        	String from = report[j].split(" ")[0]; //신고하는 사람
        	String to = report[j].split(" ")[1]; //신고당한 사람
        	
//        	System.out.println(from+" -> "+to);
        	
        	if(!declarations.get(from).contains(to)) {
        		declarations.get(from).add(to); //내가 신고한 사람 목록에 추가
        		declarationCnt.put(to, declarationCnt.get(to)+1); //신고당한 사람의 신고횟수 증가
        	}
        	        	
        }
        
        for(int l=0; l<id_list.length; l++) {
        	String id = id_list[l];
        	int resultCnt = 0;
        	System.out.println("id = "+id);
        	
        	for(String to : declarations.get(id)) {
        		if(declarationCnt.get(to)>=k) {
        			resultCnt++;
        		}
        	}
        	
        	answer[l] = resultCnt;
        	System.out.println("answer = "+resultCnt);
        }
        
        
        return answer;
    }
}
