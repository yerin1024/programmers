package com.lyr.programmers.level1;

/*
 * 2022�� 2�� 11�� (�ݿ���)
 * 25. �� ���� ������ ��
 */
public class SumBetweenTwoIntegers { //integer ����: ������ 0�� �ڿ����� ��������� �������� ����
	public long solution(int a, int b) {
        long answer = 0;
        
        System.out.println(a+" && "+b);
        if(a>b) {
        	int tmp = a;
        	a = b;
        	b = tmp;
        }
        System.out.println(a+" && "+b);
        
        for(int i=a; i<=b; i++) {
        	answer+=i;
        }
        System.out.println(answer);
        return answer;
    }
}
