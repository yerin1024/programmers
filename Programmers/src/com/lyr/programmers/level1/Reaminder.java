package com.lyr.programmers.level1;

/*
 * 2022�� 2�� 14�� (������)
 * 30. �������� 1�� �Ǵ� �� ã��
 */
public class Reaminder {
	public int solution(int n) {
		//n�� x�� ���� �������� 1�� �ǵ����ϴ� ���� ���� �ڿ��� x
        int answer = 0;
        
        System.out.println(n);
        
        for(int i=1; i<n; i++) {
        	if(n%i == 1) {
        		answer = i;
        		break;
        	}
        }
        
        System.out.println(answer);
        return answer;
    }
}
