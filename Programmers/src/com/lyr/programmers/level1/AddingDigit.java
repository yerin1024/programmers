package com.lyr.programmers.level1;

/*
 * 2022�� 2�� 13�� (�Ͽ���)
 * 15. �ڸ��� ���ϱ�
 */
public class AddingDigit { //Digit �ڸ���
	public int solution(int n) {
        int answer = 0;

        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
        System.out.println("Hello Java");
        
        System.out.println(n);
        
//        String str = String.valueOf(n);
//        String[] arr = str.split("");
//        for(int i=0; i<arr.length; i++) {
//        	answer += Integer.parseInt(arr[i]);
//        }
//        System.out.println(answer);
        
        while(true) { 
        	int remainder = n%10; //remainder ������
        	int quotient = n/10; //quotient ��
        	
        	System.out.println("reaminder = "+remainder+" && quotient = "+quotient);
        	answer += remainder;
        	n = quotient;
        	
        	if(n<10) {
        		answer+=n;
        		break;
        	}
        }
        System.out.println(answer);
        return answer;
    }
}
