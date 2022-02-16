package com.lyr.programmers.level1;

import java.util.HashMap;
import java.util.Map;

/*
 * 2022년 2월 16일 (수요일)
 * 45. 키패드 누르기
 */
public class Keypad {
	public String solution(int[] numbers, String hand) {
        //numbers : 눌러야할 번호 담긴 배열, hand : 왼손잡이 & 오른손잡이  여부
		String answer = "";
		
		//번호 위치들
		Map<Integer, int[]> location = new HashMap<>();
		location.put(1, new int[]{0, 0});
		location.put(2, new int[]{0, 1});
		location.put(3, new int[]{0, 2});
		location.put(4, new int[]{1, 0});
		location.put(5, new int[]{1, 1});
		location.put(6, new int[]{1, 2});
		location.put(7, new int[]{2, 0});
		location.put(8, new int[]{2, 1});
		location.put(9, new int[]{2, 2});
//		location.put("*", new int[]{3, 0});
		location.put(0, new int[]{3, 1});
//		location.put("#", new int[]{3, 2});
		
		int[] lLocation = new int[]{3,0}; //왼손 현재위치
		int[] rLocation = new int[]{3,2}; //오른손 현재위치
		
		for(int i=0; i<numbers.length; i++) {
			if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) { //left
				answer += "L";
				lLocation[0] = location.get(numbers[i])[0];
				lLocation[1] = location.get(numbers[i])[1];
			} else if(numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) { //right
				answer += "R";
				rLocation[0] = location.get(numbers[i])[0];
				rLocation[1] = location.get(numbers[i])[1];
			} else {
				//가운데라인 2,5,8,0은 왼손, 오른손 중 가까운 손이 누름
				int numberX = location.get(numbers[i])[0]; //눌러야되는 번호의 x축 위치
				int numberY = location.get(numbers[i])[1]; //눌러야되는 번호의 y축 위치
				
				int totalLeftMoving = Math.abs(lLocation[0]-numberX)+Math.abs(lLocation[1]-numberY); //왼손의 x축위치-눌러야되는번호의 x축 위치
				int totalRightMoving = Math.abs(rLocation[0]-numberX)+Math.abs(rLocation[1]-numberY); //왼손의 x축위치-눌러야되는번호의 x축 위치
			
				if(totalLeftMoving < totalRightMoving) {
					lLocation[0] = numberX;
					lLocation[1] = numberY;
					
					answer += "L";
				} else if (totalLeftMoving > totalRightMoving) {
					rLocation[0] = numberX;
					rLocation[1] = numberY;
					
					answer += "R";
				} else if (totalLeftMoving == totalRightMoving) {
					if(hand.contentEquals("left")) { //왼손잡이라면
						lLocation[0] = numberX;
						lLocation[1] = numberY;
						
						answer += "L";
					} else {
						rLocation[0] = numberX;
						rLocation[1] = numberY;
						
						answer += "R";
					}
					
				}
			}
			System.out.println("number = "+numbers[i]+" -> "+answer);
		}
        
        
        return answer;
    }
}
