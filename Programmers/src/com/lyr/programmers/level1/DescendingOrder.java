package com.lyr.programmers.level1;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

/*
 * 2022�� 2�� 11�� (�ݿ���)
 * 12. ���� ������������ ��ġ�ϱ� 
 */
public class DescendingOrder {
	public long solution(long n) {
		//���� Ǭ ���
//		String str = Long.toString(n);
//		System.out.println(str);
//		if(str.length()<=1) {
//			return n;
//		}
//		
//		int[] arr = new int[str.length()];
//		for(int i=0; i<str.length(); i++) {
//			arr[i] = Integer.valueOf(String.valueOf(str.charAt(i))); //String.valueOf()�� ���ϰ� char������ Integer.valueOf�� �ϸ� ASCII�� ����
//		}
//
//		for(int j=0; j<arr.length-1; j++) {
//			System.out.println(arr[j]);
//			for(int k=j+1; k<arr.length; k++) {
//				if(arr[j] < arr[k]) {
//					int tmp = arr[j];
//					arr[j] = arr[k];
//					arr[k] = tmp;
//				}
//			}
//		}
//		String answerString = "";
//		for(int l=0; l<arr.length; l++) {
//			answerString+=String.valueOf(arr[l]);
//		}
//		long answer = Long.valueOf(answerString);
//		System.out.println(answer);
//		return answer;
		
		//�ٸ� ����� Ǯ�� �����Ͽ� Ǭ ���
		String[] arr = String.valueOf(n).split("");
		Arrays.sort(arr, Collections.reverseOrder()); //primitive�� Collection.reverseOrder�� �ȵǱ� ������ �̸� String[]�� �ٲ㼭 �̿�
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		String strAnswer = Arrays.stream(arr).collect(Collectors.joining());
		long answer = Long.parseLong(strAnswer);
		System.out.println(answer);
		
		return answer;
    }
}
