package com.lyr.programmers.level1;

import java.util.ArrayList;
import java.util.List;

/*
 * 2022년 2월 14일 (월요일)
 * 35. 모의고사
 */
public class MockTest { //mock test 모의고사, mock 모의의
	public int[] solution(int[] answers) {
        int[] answer = {};
        //1번수포자 : 1,2,3,4,5 (5)
        //2번수포자 : 2,1,2,3,2,4,2,5 (8)
        //3번수포자 : 3,3,1,1,2,2,4,4,5,5 (10)
        //answers = {1, 2, 3, 4, 5}
        
        int[] st1 = {1, 2, 3, 4, 5};
        int[] st2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] st3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int score1 = 0;
        int score2 = 0;
        int score3 = 0;
        
        for(int i=0; i<answers.length; i++) {
        	if(answers[i] == st1[i%5]) {
        		score1++;
        	}
        	if(answers[i] == st2[i%8]) {
        		score2++;
        	}
        	if(answers[i] == st3[i%10]) {
        		score3++;
        	}
        }
        System.out.println(score1+" && "+score2+" && "+score3);
        
        List<Integer> list = new ArrayList<>();
        int max = Math.max(score1, Math.max(score2, score3));
        if(max == score1) {
        	list.add(1);
        }
        if(max == score2) {
        	list.add(2);
        }
        if(max == score3) {
        	list.add(3);
        }
        answer = list.stream().mapToInt(Integer::intValue).toArray();

        for(int i=0; i<answer.length; i++) {
        	System.out.println(answer[i]);
        }
        
        return answer;
    }
}