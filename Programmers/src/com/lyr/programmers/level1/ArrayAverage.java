package com.lyr.programmers.level1;

/*
 * 2022년 2월 7일 (월요일)
 * 7. 평균 구하기
 */
public class ArrayAverage {
	public double solution(int[] arr) {

        double answer = 0;
        int sum = 0;
        
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		answer += (double)sum/arr.length;

		System.out.println(answer);
        return answer;
    }
}
