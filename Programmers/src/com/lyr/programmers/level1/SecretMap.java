package com.lyr.programmers.level1;

import java.util.Arrays;

/*
 * 2022년 2월 16일 (수요일)
 * 46. 비밀지도
 */
public class SecretMap {
	public String[] solution(int n, int[] arr1, int[] arr2) {
		//n = 지도 한 변의 크기
        String[] answer = new String[n];
        
        //2진수로 변환
        for(int i=0; i<n; i++) {
        	StringBuilder tmpBinary1 = new StringBuilder();
        	StringBuilder tmpBinary2 = new StringBuilder();
        	
        	String binary1 = "";
        	String binary2 = "";
        	
        	int number1 = arr1[i];
        	if(number1==0) {
        		tmpBinary1.append("00000");
        	}
        	while(number1>0) { //2진수 변환(Integer.toBinaryString으로도 가능)
            	int reminder = number1 % 2;
//            	tmpBinary1 = reminder + tmpBinary1;
            	tmpBinary1.insert(0, reminder);
            	number1 = number1/2;
        	}
        	binary1 = String.format("%0"+n+"d", Long.parseLong(tmpBinary1.toString())); //Integer.pareseInt로 하면 int 범위 넘어가서 런타임 에러 남
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
        	binary2 = String.format("%0"+n+"d", Long.parseLong(tmpBinary2.toString())); //Integer.pareseInt로 하면 int 범위 넘어가서 런타임 에러 남
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
