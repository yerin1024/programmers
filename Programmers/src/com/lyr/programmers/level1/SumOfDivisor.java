package com.lyr.programmers.level1;

/*
 * 2022�� 2�� 13�� (�Ͽ���)
 * 16. ����� ��
 */
public class SumOfDivisor {
	public int solution(int n) {
		
		System.out.println(n);
		
        int answer = 0;

        for(int i=1; i<=n; i++) {
        	if(n%i == 0) {
        		answer += i;
        	}
        }
        System.out.println(answer);
        return answer;
    }
}
