package com.lyr.programmers.level1;

/*
 * 2022�� 2�� 14�� (������)
 * 36. ����(=��Į�� ��, ���� ��->��)
 */
public class ScalarProduct {
	public int solution(int[] a, int[] b) {
        int answer = 0;
        
        for(int i=0; i<a.length; i++) {
        	answer += a[i]*b[i];
        }
        
        System.out.println(answer);
        return answer;
    }
}
