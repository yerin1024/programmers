package com.lyr.programmers.level1;

/*
 * 2022�� 2�� 18�� (�ݿ���)
 * 51. ����� ������ ����
 */
public class Divisor { //��� divisor
    public int solution(int left, int right) {
        System.out.println(left+" && "+right);
    	int answer = 0;
        
        for(int i=left; i<=right; i++) {
        	System.out.println("======="+i);
        	int divisorCnt = 0; //���� i�� ��� ����
        	
        	for(int j=1; j<=i; j++) {
        		if(i%j == 0) { //���� i�� ���
        			divisorCnt++;
        		}
        	}
        	
        	if(divisorCnt%2 == 0) { //����� ������ ¦�����
        		answer += i;
        	} else if (divisorCnt%2 == 1) { //����� ������ Ȧ�����
        		answer -= i;
        	}
        }
        
        System.out.println(answer);
        return answer;
    }
}
