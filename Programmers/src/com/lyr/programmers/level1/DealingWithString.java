package com.lyr.programmers.level1;

/*
 * 2022�� 2�� 13�� (�Ͽ���)
 * 21. ���ڿ� �ٷ�� �⺻
 */
public class DealingWithString { //deal with �ٷ��
	public boolean solution(String s) {
        boolean answer = true;
        if(s.length()!= 4 && s.length()!=6) {
        	answer = false;
        } else {
        	for(int i=0; i<s.length(); i++) {
            	if(!(s.charAt(i)>=48 && s.charAt(i)<=57)) { //���� 48~57
            		answer = false;
            	}
            }
        }
        
        System.out.println(answer);
        return answer;
    }
}
