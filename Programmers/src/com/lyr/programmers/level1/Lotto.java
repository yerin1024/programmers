package com.lyr.programmers.level1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * 2022년 2월 15일 (화)
 * 43. 로또 최고 순위와 최저 순위
 */
public class Lotto {
    public int[] solution(int[] lottos, int[] winNums) {

//      int[] lottos1 = {44, 1, 0, 0, 31, 25};
//		int[] winNums1 = {31, 10, 45, 1, 6, 19};
//		int[] lottos2 = {0, 0, 0, 0, 0, 0};
//		int[] winNums2 = {38, 19, 20, 40, 15, 25};
        
        int maxCnt = 0;
        int minCnt = 0;
        int zeroCnt = 0;
        
        for(int i=0; i<lottos.length; i++) {
        	if(lottos[i] == 0) {
        		zeroCnt++;
        	}else {
        		for(int j=0; j<winNums.length; j++) {
        			if(lottos[i] == winNums[j]) {
        				minCnt++;
        			}
        		}
        	}
        }
        maxCnt = minCnt + zeroCnt;
        
        int maxRank = 6;
        int minRank = 6;
        if(maxCnt > 1) {
        	maxRank = 7-maxCnt;
        }
        if(minCnt > 1) {
        	minRank = 7-minCnt;
        }
        System.out.println("maxRank = "+maxRank+" && minRank = "+minRank);
        int[] answer = {maxRank, minRank};
        return answer;
    }
}
