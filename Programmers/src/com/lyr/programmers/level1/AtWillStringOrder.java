package com.lyr.programmers.level1;

import java.util.Arrays;
import java.util.Comparator;

/*
 * 2022�� 2�� 13�� (�Ͽ���)
 * 24. ���ڿ� �� ������� �����ϱ�
 */
public class AtWillStringOrder { //At Will �������
	public String[] solution(String[] strings, int n) {
		//�ٸ� ����� Ǯ�� ����1
//        String[] answer = new String[strings.length];
//
//        for(int i=0; i<strings.length; i++) {
//        	strings[i] = strings[i].charAt(n) + strings[i]; 
//        }
//        
//        Arrays.sort(strings);
//        for(int i=0; i<strings.length; i++) {
//        	System.out.println(strings[i]);
//        	answer[i] = strings[i].substring(1, strings[i].length());
//        	System.out.println(answer[i]);
//        }
		
		//�ٸ� ����� Ǯ�� ����2
		Arrays.sort(strings, new Comparator<String>() { 
			@Override
			public int compare(String o1, String o2) {//return���� �����̸� �ڸ��ٲ��� ���� �ʰ�, ����̸� �ڸ��ٲ��� ����
				if(o1.charAt(n) > o2.charAt(n)) {
					return 1;
				} else if(o1.charAt(n) == o2.charAt(n)){
					return o1.compareTo(o2); //�������� ��������
				} else {
					return -1;
				}
			}
		});
		
		for(int i=0; i<strings.length; i++) {
        	System.out.println(strings[i]);
        }
		
        return strings;
    }
}