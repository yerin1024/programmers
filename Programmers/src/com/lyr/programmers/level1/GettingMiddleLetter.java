package com.lyr.programmers.level1;

/*
 * 2022�� 2�� 11�� (�ݿ���)
 * 27. ��� ���� ��������
 */
public class GettingMiddleLetter {
	public String solution(String s) {
		//�ܾ��� ���̰� Ȧ���� ��� ����
		//�ܾ��� ���̰� ¦���� �α���
        String answer = "";

    	int n = s.length()/2;
        if(s.length()%2 == 0) { //¦��
        	answer+= s.substring(n-1, n+1); //2����
        } else { //Ȧ��
        	answer += s.substring(n, n+1); //1���� ù��°���ں��� �ι�°����������
        }
        
        System.out.println(answer);
        return answer;
    }
}
