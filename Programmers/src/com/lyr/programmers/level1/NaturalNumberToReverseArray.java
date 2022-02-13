package com.lyr.programmers.level1;

/*
 * 2022년 2월 11일 (금요일)
 * 13. 자연수 뒤집어 배열로 만들기
 */
public class NaturalNumberToReverseArray { //Natural Number = 자연수
	public int[] solution(long n) {
		//내가 푼 방식
		String longString = String.valueOf(n);
		System.out.println(longString);
		String[] arr = longString.split("");

		int[] answer = new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			answer[i] = Integer.parseInt(arr[arr.length-1-i]);
			System.out.println(answer[i]);
		}

        return answer;
		
		//다른 사람의 풀이 참고하여 푼 방식
//		System.out.println(n);
//		String str = String.valueOf(n);
//		StringBuilder sb = new StringBuilder(str);
//		sb = sb.reverse();
//		str = sb.toString();
//		
//		int[] answer = new int[str.length()];
//		String[] strArray = str.split("");
//		for(int i=0; i<answer.length; i++) {
//			answer[i] = Integer.parseInt(strArray[i]);
//			System.out.println(answer[i]);
//		}
//		
//		return answer;
    }
}
