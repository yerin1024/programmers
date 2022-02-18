package com.lyr.programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

/*
 * 2022�� 2�� 15�� (ȭ����)
 * 40. ũ���� �����̱� ����
 */
public class ClawCraneGame { //claw crane game �����̱� ����
	public int solution(int[][] board, int[] moves) {
        int answer = 0; //���� ���� ����
        //���� Ǭ ���
//        List<Integer> basket = new ArrayList<>(); //���� �Űܼ� ��� �ٱ���
//        List<List<Integer>> lists = new ArrayList<>(); //���� ����ִ� ���簢��
//        
//        //board -> list�� ��ȯ
//        for(int i=0; i<board.length; i++) {
//        	int[] tmp = board[i];
//        	List<Integer> list = Arrays.stream(tmp).boxed().collect(Collectors.toList());
//        	System.out.println(list.toString());
//        	lists.add(list);
//        }
//        System.out.println();
//        
//        //moves�� ���� �ϳ��� basket���� �Űܴ�� �ϳ� �ű涧���� �������� ���� �������� üũ
//        for(int j=0; j<moves.length; j++) {
//        	int move = moves[j]; //������
//        	System.out.println("move = "+move);
//        	
//        	for(int k=0; k<lists.size(); k++) {
//        		int pickVal = lists.get(k).get(move-1); //������
//				
//        		if(pickVal == 0) {
//        			continue;
//        		} else {
//        			System.out.println("0�� �ƴ� ���������� ���� �� = "+pickVal);
//					lists.get(k).set(move-1, 0);
//        			if(basket.size() == 0) {
//        				basket.add(pickVal);
//        			} else {
//        				if(basket.get(basket.size()-1) == pickVal) {
//        					answer+=2;
//        					basket.remove(basket.size()-1);
//        				} else {
//        					basket.add(pickVal);
//        				}
//        			}
//        			break;
//        		}
//        	}
//
//    		System.out.println("basket = "+basket.toString());
//    		System.out.println("answer = "+answer);
//    		System.out.println();
//        }
//        
//        System.out.println(answer);
        
        //�ٸ� ��� Ǯ�� ����
        Stack<Integer> basket = new Stack<>();
        for(int move : moves) {
        	for(int i=0; i<board.length; i++) {
        		if(board[i][move-1] !=0 ) {
        			if(basket.empty()) { //�ٱ��ϰ� ����ִٸ�
        				basket.push(board[i][move-1]);
        				board[i][move-1] = 0;
        				break;
        			} else {
        				if(board[i][move-1] == basket.peek()) {
        					basket.pop();
        					answer += 2;
        				} else {
        					basket.push(board[i][move-1]);
        				}
        				board[i][move-1] = 0;
        				break;
        			}
        		}
        	}
        }
        System.out.println(answer);
        return answer;
    }
}
/*
Stack
1. peek() Stack�� top�� �ִ� item�� ���������ʰ� �ش� item�� ��ȯ
2. pop()  Stack�� top�� �ִ� item�� �����ϰ� �ش� item�� ��ȯ
*/