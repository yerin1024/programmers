package com.lyr.programmers.level1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collectors;

/*
 * 2022�� 2�� 16�� (������)
 * 49. ���ϸ�
 */
public class PhoneKemon { //��Ÿ�ƴϰ� ���ϸ��� ����� pokemon
	public int solution(int[] nums) {
		//���ϸ� ������ �� return
        int answer = 0;
        int max = nums.length/2;
        
        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        
//        Iterator<Integer> iter = set.iterator();
//        while(iter.hasNext()) {
//        	System.out.println(iter.next());
//        }
        if(set.size()>max) {
        	answer = max;
        } else {
        	answer = set.size();
        }
        System.out.println(answer);
        
        return answer;
    }
}
