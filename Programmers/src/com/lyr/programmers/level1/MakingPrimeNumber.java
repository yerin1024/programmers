package com.lyr.programmers.level1;

import java.util.ArrayList;
import java.util.List;

/*
 * 2022�� 2�� 16�� (������)
 * 47. �Ҽ� �����
 */
public class MakingPrimeNumber { //prime number �Ҽ�(1�� �ڱ� �ڽŸ����� ������ �������� 1���� ū ���� ����)
	public int solution(int[] nums) {
        int answer = 0;
        
        List<Integer> sums = new ArrayList<>();
        
        for(int i=0; i<nums.length-2; i++) {
        	for(int j=i+1; j<nums.length-1; j++) {
        		for(int k=j+1; k<nums.length; k++) {
        			System.out.println(nums[i]+"+"+nums[j]+"+"+nums[k]+" = "+(nums[i]+nums[j]+nums[k]));
        			sums.add((nums[i]+nums[j]+nums[k]));
        		}
        	}
        }
        


        int[] sumsArr = sums.stream().mapToInt(Integer::intValue).toArray();
        for(int i=0; i<sumsArr.length; i++) {
        	System.out.println(sumsArr[i]);
        	
        	int sqrt = (int)Math.floor(Math.sqrt(sumsArr[i]));
        	System.out.println("������ = "+sqrt);
        	int cnt = 0;
        	
        	for(int j=2; j<=sqrt; j++) { //�����ٱ����� �������� �������� �Ҽ������� �� �� ����
        		if(sumsArr[i]%j == 0) { //������������ ���� ������ cnt�����ϰ� �׷��� �Ҽ��� �ƴ�
        			cnt++;
        		}
        	}
        	if(cnt == 0) { //�Ҽ�
        		System.out.println(sumsArr[i]+"�� �Ҽ��Դϴ�.");
        		answer++;
        	}
        	
        }
        
        System.out.println(answer);
        return answer;
    }
}

/*
set����ϴ¹�
Iterator<Integer> iter = sums.iterator();
while(iter.hasNext()) {
	System.out.println(iter.next());
}
*/
