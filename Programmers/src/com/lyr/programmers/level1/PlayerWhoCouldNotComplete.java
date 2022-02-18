package com.lyr.programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * 2022�� 2�� 14�� (������)
 * 37. �������� ���� ����
 */
public class PlayerWhoCouldNotComplete {
	public String solution(String[] participant, String[] completion) {
        String answer = "";
        //Arrays.asList �� ������ ����Ʈ�� �����Ǿ� �־� ���Ҹ� ������ �� ����
        //���� remove()�� ������ new ArrayList<>()�� ���μ� ����Ʈ�� �����ؾ� �Ѵ�.
        //���� Ǭ ��� -> ȿ���� Ż��
//        List<String> participantList = new ArrayList<>(Arrays.asList(participant));
//
//        for(int i=0; i<completion.length; i++) {
//        	System.out.println("before = "+participantList.toString());
//        	
//        	int index = participantList.indexOf(completion[i]); 
//        	System.out.println(completion[i]+" && "+index);
//        	participantList.remove(index); 
//
//        	System.out.println("after = "+participantList.toString());
//        }
//        
//        answer = participantList.get(0);
//        System.out.println(answer);
//        return answer;
        
        //�ٸ� ��� Ǯ�� ����1
//        Arrays.sort(participant);
//        Arrays.sort(completion);
//        
//        for(int i=0; i<completion.length; i++) {
//        	if(!participant[i].contentEquals(completion[i])) {
//        		System.out.println("for = "+participant[i]);
//        		return participant[i];
//        	}
//        }
//
//		System.out.println("last = "+participant[participant.length-1]);
//        return participant[participant.length-1];
        
        //�ٸ� ��� Ǯ�� ����2
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<participant.length; i++) {
        	map.put(participant[i], map.getOrDefault(participant[i], 0)+1);
        }
        
        for(int j=0; j<completion.length; j++) {
        	map.put(completion[j], map.get(completion[j])-1);
        }
        
        for(String key : map.keySet()) {
        	if(map.get(key) != 0) {
        		answer = key;
        		break;
        	}
        }
        System.out.println(answer);
        return answer;
    }
	
}

/*
����Ʈ ���߿� ��Ҹ� �߰�/������ ��� ���������� �迭�� copy�� ��������.
���� ����� ���� ������ ���� ���� copy�ϴ� ����� ���� ������ �ӵ��� ������

getOrDefault() -> ã�� Ű�� �����ϸ� �ش� Ű�� ���� ��ȯ�ϰ�, ������ �⺻���� ��ȯ��.
hash.getOrDefault(arg��� Ű, argŰ�� �����ϸ� �ش� ��/������ 0)

*/
