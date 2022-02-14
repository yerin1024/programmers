package com.lyr.programmers.level1;

/*
 * 2022년 2월 13일 (일요일)
 * 23. 문자열 내 p와 y의 개수
 */
public class PAndYCount {
	public boolean solution(String s) {
        boolean answer = true;
        System.out.println(s);
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");
        
        //내가 푼 방식
//        int pCnt = 0;
//        int yCnt = 0;
        //다른사람 풀이 참고
        int totalCnt = 0;
        
        s = s.toLowerCase();
        char[] arr = s.toCharArray();
        for(int i=0; i<arr.length; i++) {
        	if(arr[i] == 'p') {
//        		pCnt++;
        		totalCnt++;
        	}else if(arr[i] == 'y') {
//        		yCnt++;
        		totalCnt--;
        	}
        }

//        if(pCnt != yCnt) {
//        	answer = false;
//        }
//        System.out.println("pCnt = "+pCnt+" && yCnt = "+yCnt);
       
        if(totalCnt != 0) {
        	answer = false;
        }
        
        System.out.println(answer);
        
        return answer;
    }
}
