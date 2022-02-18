package com.lyr.programmers.level1;

import java.util.ArrayList;
import java.util.List;

/*
 * 2022�� 2�� 14�� (������)
 * 28. ���� ���ڴ� �Ⱦ�
 */
public class RemovingDuplication {
	public int[] solution(int []arr) {
        int[] answer = {};
        
        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
        System.out.println("Hello Java");

        List<Integer> arrToList = new ArrayList<>();
        arrToList.add(arr[0]);
        for(int i=1; i<arr.length; i++) {
        	if(arrToList.get(arrToList.size()-1) != arr[i]) {
        		arrToList.add(arr[i]);
        	}
        }
        
        for(int j=0; j<arrToList.size(); j++) {
        	System.out.println(arrToList.get(j));
        }
        answer = arrToList.stream().mapToInt(Integer::intValue).toArray();
        
        System.out.println(answer[0]);
        return answer;
    }
}

/*
Integer[] integerArr = set.toArray(new Integer[0]);
Set ��ü�� toArray() �޼ҵ带 �̿��ϸ�, Set ��ü�� �迭�� ��ȯ�� �� �ֽ��ϴ�.
�Ķ���ͷδ�, ��ȯ�� �迭 ��ü�� �Ѱ��ָ� �Ǵµ�,
�̶� �迭�� ũ�⸦ 0���� �����ϸ� �ڵ����� �迭�� ũ�Ⱑ �����˴ϴ�.
*/