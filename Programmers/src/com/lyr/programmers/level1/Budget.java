package com.lyr.programmers.level1;

import java.util.Arrays;

/*
 * 2022�� 2�� 15�� (ȭ����)
 * 41. ����
 */
public class Budget {
	public int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;
        
        Arrays.sort(d);
        for(int i=0; i<d.length; i++) {
        	sum += d[i];
        	
        	if(sum <= budget) {
        		answer++;
        	} else {
        		break;
        	}
        	System.out.println("d[i] = "+d[i]+" sum = "+sum+" && answer = "+answer);
        }
        System.out.println(answer);
        
        
        return answer;
    }
}
