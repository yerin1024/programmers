package com.lyr.programmers.level1;

import java.util.Arrays;

/*
 * 2022년 2월 13일 (일요일)
 * 19. 소수 찾기
 */
public class FindingPrimeNumber { //Prime Number 소수
	public int solution(int n) {
        int answer = 0;
        
        //내가 푼 방식 -> 효율성 문제생김
//        for(int i=1; i<=n; i++) {
//        	int divisorCnt = 0;
//        	for(int j=1; j<=Math.sqrt(n); j++) {
//        		if(i%j == 0) {
//        			divisorCnt++;
//        		}
//        	}
//
//    		if(divisorCnt == 2) {
//    			answer++;
//    		}
//        }
//        
//        System.out.println(answer);
        
        //에라토스테네스의 체 알고리즘
        boolean[] arr = new boolean[n+1];
        Arrays.fill(arr, true); //true만 소수임
        arr[0] = arr[1] = false;
        int notPrimeNumberCnt = 1; //1은 무조건 소수가 아니니까 한개 추가하고 시작
        for(int i=2; i<arr.length; i++) { 
        	for(int j=2; j*i<=n; j++) {
        		System.out.println("i = "+i+" && j = "+j);
        		if(arr[i*j] == true) {
            		arr[i*j] = false;
            		notPrimeNumberCnt++;
        		}
        	}
        }
        System.out.println("n = "+n+" && notPrimeNumberCnt = "+notPrimeNumberCnt);
        answer = n-notPrimeNumberCnt;
        System.out.println(answer);
        
        return answer;
    }
}
