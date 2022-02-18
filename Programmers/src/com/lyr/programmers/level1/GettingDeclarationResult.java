package com.lyr.programmers.level1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * 2022�� 2�� 18�� (�ݿ���)
 * 51. �Ű� ��� �ޱ�
 */
public class GettingDeclarationResult { //�Ű� declaration
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        
        //ȸ����, ȸ���� �Ű��ѻ�����
        Map<String, Set<String>> declarations = new HashMap<>();
        //ȸ����, ȸ���� �Ű����Ƚ��
        Map<String, Integer> declarationCnt = new HashMap<>();
        
        for(int i=0; i<id_list.length; i++) {
        	declarations.put(id_list[i], new HashSet<String>());
        	declarationCnt.put(id_list[i], 0);
        }
        
        for(int j=0; j<report.length; j++) {
        	System.out.println("�Ű��� "+report[j]);
        	
        	String from = report[j].split(" ")[0]; //�Ű��ϴ� ���
        	String to = report[j].split(" ")[1]; //�Ű���� ���
        	
//        	System.out.println(from+" -> "+to);
        	
        	if(!declarations.get(from).contains(to)) {
        		declarations.get(from).add(to); //���� �Ű��� ��� ��Ͽ� �߰�
        		declarationCnt.put(to, declarationCnt.get(to)+1); //�Ű���� ����� �Ű�Ƚ�� ����
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
