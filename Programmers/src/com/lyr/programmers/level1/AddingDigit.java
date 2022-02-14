package com.lyr.programmers.level1;

/*
 * 2022년 2월 13일 (일요일)
 * 15. 자릿수 더하기
 */
public class AddingDigit { //Digit 자릿수
	public int solution(int n) {
        int answer = 0;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");
        
        System.out.println(n);
        
//        String str = String.valueOf(n);
//        String[] arr = str.split("");
//        for(int i=0; i<arr.length; i++) {
//        	answer += Integer.parseInt(arr[i]);
//        }
//        System.out.println(answer);
        
        while(true) { 
        	int remainder = n%10; //remainder 나머지
        	int quotient = n/10; //quotient 몫
        	
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
