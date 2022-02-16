package com.lyr.programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
 * 2022년 2월 15일 (화요일)
 * 44. 실패율
 */
public class FailureRate {
	public int[] solution(int stageCnt, int[] stages) {
        int[] answer = {};
//      stageCnt = 5; 
//		stages = {2, 1, 2, 6, 2, 4, 3, 3};
        
        int[] arrivalCnt = new int[stageCnt]; //도달 = 성공+미성공
        int[] failCnt = new int[stageCnt]; //미성공


        for(int i=0; i<stages.length; i++) {
        	System.out.println((i+1)+"번째 사람의 위치 = "+stages[i]);
        	int stage = stages[i];
	        for(int j=0; j<stage; j++) {
	        	if(j<stageCnt) {
	        		arrivalCnt[j] = arrivalCnt[j]+1;
	        	}
	        }
	        if(stage<=stageCnt) {
	            failCnt[stage-1] = failCnt[stage-1]+1;
	        }
        }
        
        System.out.println(Arrays.stream(arrivalCnt).boxed().collect(Collectors.toList()).toString());
        System.out.println(Arrays.stream(failCnt).boxed().collect(Collectors.toList()).toString());
        
        
        Map<Integer, Double> resultMap = new HashMap<>();
        for(int i=0; i<arrivalCnt.length; i++) {
        	System.out.println("failCnt = "+failCnt[i]+" && arrivalCnt = "+arrivalCnt[i]);
        	if(arrivalCnt[i] == 0 || failCnt[i] == 0) {
        		System.out.println("0.0 ->arrivalCnt가 0");
        		resultMap.put(i+1, 0.0);
        	} else {
        		if(failCnt[i] != 0) {
    	        	System.out.println((double)failCnt[i]/arrivalCnt[i]);
    	        	resultMap.put(i+1, (double)failCnt[i]/arrivalCnt[i]);
        		} else {
        			System.out.println("0.0 ->failCnt가 0");
            		resultMap.put(i+1, 0.0);
        		}
        	}
        }
        
        List<Integer> keySet = new ArrayList<>(resultMap.keySet());
        Collections.sort(keySet, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) { //return값이 음수이면 자리바꿈을 하지 않고, 양수이면 자리바꿈을 수행
				if(resultMap.get(o1) > resultMap.get(o2)) { //밸류값으로 내림차순 정렬
					return -1;
				} else if (resultMap.get(o1) < resultMap.get(o2)) {
					return 1;
				} else { //같을 경우엔 키값으로 오름차순 정렬
					if(o1 > o2) {
						return 1;
					}else {
						return -1;
					}
				}
			}
		});
        
        System.out.println(keySet.toString());
        answer = keySet.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}
