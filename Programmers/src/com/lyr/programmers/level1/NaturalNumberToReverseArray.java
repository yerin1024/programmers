package com.lyr.programmers.level1;

/*
 * 2022�� 2�� 11�� (�ݿ���)
 * 13. �ڿ��� ������ �迭�� �����
 */
public class NaturalNumberToReverseArray { //Natural Number = �ڿ���
	public int[] solution(long n) {
		//���� Ǭ ���
		String longString = String.valueOf(n);
		System.out.println(longString);
		String[] arr = longString.split("");

		int[] answer = new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			answer[i] = Integer.parseInt(arr[arr.length-1-i]);
			System.out.println(answer[i]);
		}

        return answer;
		
		//�ٸ� ����� Ǯ�� �����Ͽ� Ǭ ���
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
