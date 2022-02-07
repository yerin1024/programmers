package com.lyr.programmers.level1;

/*
 * 2022년 2월 7일 (
 * 6. 콜라츠 추측(Conjecture)
 */
public class CollatzConjecture {
	public int solution(int num) {
//		콜라츠 추측
//		1-1. 입력된 수가 짝수라면 2로 나눕니다. 
//		1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다.
//		2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복합니다.
//		위 작업을 몇 번이나 반복해야하는지 반환하는 함수, solution을 완성해 주세요. 단, 작업을 500번을 반복해도 1이 되지 않는다면 –1을 반환해 주세요.
		
		int answer = 0;
		long longNum =  (long)num; //int형으로 했더니 큰 수일 경우 21억 넘을때부터 이상한 결과나옴
		while(true) {
			if(longNum == 1) { //맨처음부터 체크하는 이유는 애초에 num = 1이 들어오는 경우 해결 위해서
				break;
			} else if(answer == 500) {
				answer = -1;
				break;
			}
			
			if(longNum%2 == 0) {//1-1. 짝수일 경우
				longNum = longNum/2;
			} else { //1-2. 홀수일 경우
				longNum = longNum * 3 + 1;
			}
			answer++; //횟수 증가
			System.out.println(answer + " ->"+longNum);
			
		}
		System.out.println(answer);
        return answer;
    }
}
