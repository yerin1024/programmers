package com.lyr.programmers.level1;

/*
 * 2022�� 2�� 13�� (�Ͽ���)
 * 17. ���� ��ȣ(=ī�̻縣 ��ȣ)
 */
public class CaesarCipher {
	public String solution(String s, int n) {
        String answer = "";
        
        System.out.println(s);
        char[] arr = new char[s.length()];
        
        for(int i=0; i<s.length(); i++) {
        	char tmp = s.charAt(i);
        	System.out.println(tmp);
        	
        	//�ƽ�Ű�ڵ� �빮��(65~90) & �ҹ���(97~122)
        	if(tmp >= 65 && tmp <= 90) { //�빮��
        		tmp = (char) (tmp+n);
        		if(tmp > 90) { //91-> 65
        			tmp = (char) (tmp-26);
        		}
        	} else if(tmp >= 97 && tmp <= 122) {
        		tmp = (char) (tmp+n);
        		if(tmp > 122) { //123-> 97
        			tmp = (char) (tmp-26);
        		}
        	}
        	answer += tmp;
        }
        
        System.out.println(answer);
        return answer;
    }
}
