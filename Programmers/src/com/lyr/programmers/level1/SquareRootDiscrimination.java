package com.lyr.programmers.level1;

/*
 * 2022년 2월 11일 (금요일)
 * 11. 정수 제곱근 판별 
 */
public class SquareRootDiscrimination {//제곱근 Square Root, 판별 Discrimination
	public long solution(long n) {
		//n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴
		double num = Math.sqrt(n);
		System.out.println(num);
		
		if(num%1 > 0) {
	        System.out.println(-1);
			return -1;
		}
		
        long answer = (long)((num+1)*(num+1));
        System.out.println(answer);
        return answer;
    }
}
