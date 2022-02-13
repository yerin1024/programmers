package com.lyr.programmers.level1;

/*
 * 2022년 2월 11일 (금요일)
 * 25. 두 정수 사이의 합
 */
public class SumBetweenTwoIntegers { //integer 정수: 정수는 0과 자연수와 비슷하지만 음수까지 포함
	public long solution(int a, int b) {
        long answer = 0;
        
        System.out.println(a+" && "+b);
        if(a>b) {
        	int tmp = a;
        	a = b;
        	b = tmp;
        }
        System.out.println(a+" && "+b);
        
        for(int i=a; i<=b; i++) {
        	answer+=i;
        }
        System.out.println(answer);
        return answer;
    }
}
