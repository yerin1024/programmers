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
 * 2022�� 2�� 15�� (ȭ����)
 * 44. ������
 */
public class FailureRate {
	public int[] solution(int stageCnt, int[] stages) {
        int[] answer = {};
//      stageCnt = 5; 
//		stages = {2, 1, 2, 6, 2, 4, 3, 3};
        
        int[] arrivalCnt = new int[stageCnt]; //���� = ����+�̼���
        int[] failCnt = new int[stageCnt]; //�̼���


        for(int i=0; i<stages.length; i++) {
        	System.out.println((i+1)+"��° ����� ��ġ = "+stages[i]);
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
        		System.out.println("0.0 ->arrivalCnt�� 0");
        		resultMap.put(i+1, 0.0);
        	} else {
        		if(failCnt[i] != 0) {
    	        	System.out.println((double)failCnt[i]/arrivalCnt[i]);
    	        	resultMap.put(i+1, (double)failCnt[i]/arrivalCnt[i]);
        		} else {
        			System.out.println("0.0 ->failCnt�� 0");
            		resultMap.put(i+1, 0.0);
        		}
        	}
        }
        
        List<Integer> keySet = new ArrayList<>(resultMap.keySet());
        Collections.sort(keySet, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) { //return���� �����̸� �ڸ��ٲ��� ���� �ʰ�, ����̸� �ڸ��ٲ��� ����
				if(resultMap.get(o1) > resultMap.get(o2)) { //��������� �������� ����
					return -1;
				} else if (resultMap.get(o1) < resultMap.get(o2)) {
					return 1;
				} else { //���� ��쿣 Ű������ �������� ����
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
