package com.lyr.programmers.level1;

/*
 * 2022�� 2�� 7�� (������)
 * 7. ��� ���ϱ�
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
