package com.lyr.programmers.level1;

import java.util.Arrays;
import java.util.List;

/*
 * 2022�� 2�� 13�� (�Ͽ���)
 * 20. ���￡�� �輭�� ã��
 */
public class FindingKimInSeoul {
	public String solution(String[] seoul) {
        String answer = "";
        List<String> list = Arrays.asList(seoul);
        int index = list.indexOf("Kim");
        
        answer = "�輭���� "+index+"�� �ִ�";
        System.out.println(answer);
        return answer;
    }
}
