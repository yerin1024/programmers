package com.lyr.programmers.level1;

import java.util.Arrays;
/*
 * 2022�� 2�� 3�� (�����)
 * �ڵ��� ��ȣ ������
 */
public class HidePhoneNumber {
	public String solution(String phone_number) {
		
		String[] arr = new String[phone_number.length()];
		
		for(int i=0; i<phone_number.length(); i++) {
			if(i<phone_number.length()-4) {
				arr[i] = "*";
			}else {
				arr[i] = Character.toString(phone_number.charAt(i)); 
				//���ڿ�.charAt(i) : ���ڿ��� �ѱ��ھ� Character������ ��ȯ
				//Character.toString(character�ѱ���) : character�� �ѱ��ڸ� String���� �ٲ���
			}
		}
		
		String answer = String.join("", arr); //String.join(������, �迭) : �迭�� ��Ҹ� �����ڿ� �Բ� �ٿ���
		System.out.println(answer);
		
        return answer;
    }
}
