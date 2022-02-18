package com.lyr.programmers.level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * 2022�� 2�� 14�� (������)
 * 34. 3���� ������
 */
public class ReverseTernary { //ternary 3����
	public int solution(int n) {
        //10���� n -> 3���� -> ������ 3���� -> 10���� answer
		//���� Ǭ ���
		int answer = 0;
//		
//        List<Integer> list = new ArrayList<>();
//		int quotient = n; //��
//		int remainder = 0; //������
//		
//		while(quotient != 0) {
//			System.out.println(quotient);
//			remainder = quotient%3;
//			quotient = quotient/3;
//			System.out.println(quotient+" && "+remainder);
//			list.add(remainder);
//		}
//		
//		int[] arr = list.stream().mapToInt(Integer::intValue).toArray();
//		for(int i=0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//			int num = (int)Math.pow(3, arr.length-1-i);
//			answer += num*arr[i];
//		}
//        System.out.println(answer);

		//�ٸ� ��� Ǯ�� ����
		String reminder = "";
		while(n > 0) {
			reminder = reminder + (n%3); //3���� �Ųٷ� <->(n%3)+reminder�� ������ 3����
			n = n/3;
		}
		System.out.println(reminder);
		answer = Integer.parseInt(reminder, 3); //reminder�� 3�������� ǥ������
		
		System.out.println(answer);
        return answer;
    }
}
/*
 Integer.parseInt(String s, int radix) -> ���ڿ� s�� ����(radix)�� Integer������ ��ȯ
 */
