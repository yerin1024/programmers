package com.lyr.programmers.level1;

/*
 * 2022�� 2�� 13�� (�Ͽ���)
 * 18. ���ڼ��ڼ��ڼ��ڼ��ڼ�?
 */
public class Watermelon {
	public String solution(int n) {
        String answer = "";
        
        int remainder = n%2; //remainder ������
    	int quotient = n/2; //quotient ��
    	
    	for(int i=0; i<quotient; i++) {
    		answer += "����";
    	}
    	if(remainder>0) {
    		answer += "��";
    	}
    	
    	System.out.println(answer);
        return answer;
    }
}
