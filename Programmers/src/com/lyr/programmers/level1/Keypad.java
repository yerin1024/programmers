package com.lyr.programmers.level1;

import java.util.HashMap;
import java.util.Map;

/*
 * 2022�� 2�� 16�� (������)
 * 45. Ű�е� ������
 */
public class Keypad {
	public String solution(int[] numbers, String hand) {
        //numbers : �������� ��ȣ ��� �迭, hand : �޼����� & ����������  ����
		String answer = "";
		
		//��ȣ ��ġ��
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
		
		int[] lLocation = new int[]{3,0}; //�޼� ������ġ
		int[] rLocation = new int[]{3,2}; //������ ������ġ
		
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
				//������� 2,5,8,0�� �޼�, ������ �� ����� ���� ����
				int numberX = location.get(numbers[i])[0]; //�����ߵǴ� ��ȣ�� x�� ��ġ
				int numberY = location.get(numbers[i])[1]; //�����ߵǴ� ��ȣ�� y�� ��ġ
				
				int totalLeftMoving = Math.abs(lLocation[0]-numberX)+Math.abs(lLocation[1]-numberY); //�޼��� x����ġ-�����ߵǴ¹�ȣ�� x�� ��ġ
				int totalRightMoving = Math.abs(rLocation[0]-numberX)+Math.abs(rLocation[1]-numberY); //�޼��� x����ġ-�����ߵǴ¹�ȣ�� x�� ��ġ
			
				if(totalLeftMoving < totalRightMoving) {
					lLocation[0] = numberX;
					lLocation[1] = numberY;
					
					answer += "L";
				} else if (totalLeftMoving > totalRightMoving) {
					rLocation[0] = numberX;
					rLocation[1] = numberY;
					
					answer += "R";
				} else if (totalLeftMoving == totalRightMoving) {
					if(hand.contentEquals("left")) { //�޼����̶��
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
