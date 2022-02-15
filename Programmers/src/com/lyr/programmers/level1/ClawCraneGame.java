package com.lyr.programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

/*
 * 2022년 2월 15일 (화요일)
 * 40. 크레인 인형뽑기 게임
 */
public class ClawCraneGame { //claw crane game 인형뽑기 게임
	public int solution(int[][] board, int[] moves) {
        int answer = 0; //인형 터진 갯수
        //내가 푼 방식
//        List<Integer> basket = new ArrayList<>(); //인형 옮겨서 담는 바구니
//        List<List<Integer>> lists = new ArrayList<>(); //인형 들어있는 정사각형
//        
//        //board -> list로 변환
//        for(int i=0; i<board.length; i++) {
//        	int[] tmp = board[i];
//        	List<Integer> list = Arrays.stream(tmp).boxed().collect(Collectors.toList());
//        	System.out.println(list.toString());
//        	lists.add(list);
//        }
//        System.out.println();
//        
//        //moves에 따라서 하나씩 basket으로 옮겨담고 하나 옮길때마다 이전꺼랑 같은 숫자인지 체크
//        for(int j=0; j<moves.length; j++) {
//        	int move = moves[j]; //꺼낼값
//        	System.out.println("move = "+move);
//        	
//        	for(int k=0; k<lists.size(); k++) {
//        		int pickVal = lists.get(k).get(move-1); //꺼낸값
//				
//        		if(pickVal == 0) {
//        			continue;
//        		} else {
//        			System.out.println("0이 아닌 정상적으로 꺼낸 값 = "+pickVal);
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
        
        //다른 사람 풀이 참고
        Stack<Integer> basket = new Stack<>();
        for(int move : moves) {
        	for(int i=0; i<board.length; i++) {
        		if(board[i][move-1] !=0 ) {
        			if(basket.empty()) { //바구니가 비어있다면
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
1. peek() Stack의 top에 있는 item을 삭제하지않고 해당 item을 반환
2. pop()  Stack의 top에 있는 item을 삭제하고 해당 item을 반환
*/