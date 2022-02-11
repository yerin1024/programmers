package com.lyr.programmers.level1;

import java.math.BigInteger;

/*
 * 2022년 2월 8일 (화요일)
 * 8. 최대공약수와 최소공배수
 */
public class GreatestCommonDivisorAndLeastCommonMultiple { 
	public int[] solution(int n, int m) {
		//최대공약수(GreatestCommonDivisor, GCD) & 최소공배수(LeastCommonMultiple, LCM)
		
		//1. 최대공약수 구하기
		//1-1. BigInteger 내장 함수 이용
		BigInteger b1 = BigInteger.valueOf(n);
		BigInteger b2 = BigInteger.valueOf(m);
		BigInteger gcd = b1.gcd(b2);
		int bigIntegerGcd = gcd.intValue();
		System.out.println("BingInteger 내장함수로 구한 최대공약수 = "+bigIntegerGcd);
		
		//1-2. 유클리드 호제법(Euclidean Algorithm)으로 직접구현
		int eucdGcd = eucd(n, m);
		System.out.println("유클리드 호제법으로 구한 최대공약수  = "+eucdGcd);
		
		//2. 최소공배수 = 두 자연수의 곱/최대공약수
		int lcm = n*m/eucdGcd;
		System.out.println("최소공배수 = "+lcm);
		
        int[] answer = {eucdGcd, lcm};
        return answer;
    }
	
	//유클리드 호제법
	public int eucd(int bigNum, int smallNum) {
		//bigNum이 진짜 더큰 숫자가 아닐경우를 위해
		System.out.println("big = "+bigNum+" && small = "+smallNum);
		if(bigNum < smallNum) {
			int tmp = bigNum; 
			bigNum = smallNum;  
			smallNum = tmp; 
		}
		
		//큰숫자를 작은숫자로 나눈 나머지를 계산
		if(bigNum % smallNum == 0) { //나머지가 0이면 작은숫자 리턴
			return smallNum;
		} else {
			return eucd(smallNum, bigNum%smallNum); //나머지가 0이 아니면 재귀호출(작은숫자, 큰숫자를 작은숫자로 나눈 나머지)
		}
		
	}

}

/*
유클리드 호제법
두수를 나누어서 나온 나머지를 이전 나머지에 다시 나눕니다. 
그렇게 0 이 나올 때 까지 반복한후 중지 합니다. 
바로 직전 나머지가 최대공약수가 되는 것
*/

//서로소(comprime) : 2(1,2)와 3(1,3) 처럼 공약수가 1밖에 없는 수