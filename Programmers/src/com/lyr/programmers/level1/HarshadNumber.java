package com.lyr.programmers.level1;

/*
 * 2022년 2월 7일 (월요일)
 * 5. 하샤드 수
 */
public class HarshadNumber {
	public boolean solution(int x) {
		//x=18
		//1+8=9 -> 18은 9로 나누어 떨어지니까 하샤드 수
		
		String xStr = String.valueOf(x);
		int xSum = 0;
		for(int i=0; i<xStr.length(); i++) {
			xSum += Integer.valueOf(String.valueOf(xStr.charAt(i))); //String.valueOf()를 안하고 char형으로 Integer.valueOf를 하면 ASCII값 나옴
		}

        boolean answer = false;
		if(x%xSum == 0) { //나누어떨어지면 하샤드 수가 맞음
			answer = true;
		}
		System.out.println(answer);
        return answer;
    }
}
