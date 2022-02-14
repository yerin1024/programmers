package com.lyr.programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * 2022년 2월 14일 (월요일)
 * 37. 완주하지 못한 선수
 */
public class PlayerWhoCouldNotComplete {
	public String solution(String[] participant, String[] completion) {
        String answer = "";
        //Arrays.asList 로 생성한 리스트는 고정되어 있어 원소를 제거할 수 없다
        //따라서 remove()를 쓰려면 new ArrayList<>()로 감싸서 리스트를 생성해야 한다.
        //내가 푼 방식 -> 효율성 탈락
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
        
        //다른 사람 풀이 참고1
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
        
        //다른 사람 풀이 참고2
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
리스트 도중에 요소를 추가/삭제할 경우 내부적으로 배열의 copy가 행해진다.
따라서 요소의 수가 많으면 많을 수록 copy하는 요소의 수도 많아져 속도가 느려짐

getOrDefault() -> 찾는 키가 존재하면 해당 키의 값을 반환하고, 없으면 기본값을 반환함.
hash.getOrDefault(arg라는 키, arg키가 존재하면 해당 값/없으면 0)

*/
