package com.lyr.programmers.level1;

/*
 * 2022년 2월 14일 (월요일)
 * 29. 부족한 금액 계산하기
 */
public class CalculatingInsufficientCash { //insufficient 부족한 <-> sufficient 충분한
	public long solution(int price, int money, int count) {
        long answer = -1;
        //price : 원래 이용료
        //money : 처음 가지고있던 금액
        //count : 놀이기구 이용횟수
        
        long totalCost = 0;
        for(int i=1; i<=count; i++) {
        	totalCost += price*i;
        }
        System.out.println(totalCost);
        if(money > totalCost) { //돈이 부족하지 않다면 0 리턴
        	answer = 0;
        } else {
        	answer = totalCost - money;
        }
        
        System.out.println(answer);
        return answer;
    }
}
