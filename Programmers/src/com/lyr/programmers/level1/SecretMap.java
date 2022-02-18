package com.lyr.programmers.level1;

import java.util.Arrays;

/*
 * 2022�� 2�� 16�� (������)
 * 46. �������
 */
public class SecretMap {
	public String[] solution(int n, int[] arr1, int[] arr2) {
		//n = ���� �� ���� ũ��
        String[] answer = new String[n];
        
        //2������ ��ȯ
        for(int i=0; i<n; i++) {
        	StringBuilder tmpBinary1 = new StringBuilder();
        	StringBuilder tmpBinary2 = new StringBuilder();
        	
        	String binary1 = "";
        	String binary2 = "";
        	
        	int number1 = arr1[i];
        	if(number1==0) {
        		tmpBinary1.append("00000");
        	}
        	while(number1>0) { //2���� ��ȯ(Integer.toBinaryString���ε� ����)
            	int reminder = number1 % 2;
//            	tmpBinary1 = reminder + tmpBinary1;
            	tmpBinary1.insert(0, reminder);
            	number1 = number1/2;
        	}
        	binary1 = String.format("%0"+n+"d", Long.parseLong(tmpBinary1.toString())); //Integer.pareseInt�� �ϸ� int ���� �Ѿ�� ��Ÿ�� ���� ��
        	System.out.println(arr1[i] + " -> " + binary1);
        	
        	int number2 = arr2[i];
        	if(number2==0) {
        		tmpBinary2.append("00000");
        	}
        	while(number2>0) {
            	int reminder = number2 % 2;
//            	tmpBinary2 = reminder + tmpBinary2;
            	tmpBinary2.insert(0, reminder);
            	number2 = number2/2;
        	}
        	binary2 = String.format("%0"+n+"d", Long.parseLong(tmpBinary2.toString())); //Integer.pareseInt�� �ϸ� int ���� �Ѿ�� ��Ÿ�� ���� ��
        	System.out.println(arr2[i] + " -> " + binary2);
        	
        	
    		String resultBinary = "";
        	for(int j=0; j<n; j++) {
        		String tmpString = "";
//        		System.out.println(binary1[i].charAt(j) +"&&"+binary2[i].charAt(j));
        		if(binary1.charAt(j)=='0' && binary2.charAt(j)=='0') {
        			tmpString = " ";
        		}else {
        			tmpString = "#";
        		}
        		resultBinary = resultBinary+tmpString;
        	}
        	System.out.println(resultBinary);
        	
        	answer[i] = resultBinary; 
        }

        return answer;
    }
}
