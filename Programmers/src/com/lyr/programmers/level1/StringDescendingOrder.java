package com.lyr.programmers.level1;

import java.util.Arrays;

/*
 * 2022�� 2�� 13�� (�Ͽ���)
 * 22. ���ڿ� ������������ ��ġ�ϱ�
 */
public class StringDescendingOrder {
	public String solution(String s) {
        String answer = "";
        
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        
        StringBuilder sb = new StringBuilder(String.valueOf(arr));
        System.out.println(sb);
        sb.reverse();
        answer = sb.toString();
        
        System.out.println(answer);
        return answer;
    }
}
