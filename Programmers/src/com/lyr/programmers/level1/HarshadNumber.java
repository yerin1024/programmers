package com.lyr.programmers.level1;

/*
 * 2022�� 2�� 7�� (������)
 * 5. �ϻ��� ��
 */
public class HarshadNumber {
	public boolean solution(int x) {
		//x=18
		//1+8=9 -> 18�� 9�� ������ �������ϱ� �ϻ��� ��
		
		String xStr = String.valueOf(x);
		int xSum = 0;
		for(int i=0; i<xStr.length(); i++) {
			xSum += Integer.valueOf(String.valueOf(xStr.charAt(i))); //String.valueOf()�� ���ϰ� char������ Integer.valueOf�� �ϸ� ASCII�� ����
		}

        boolean answer = false;
		if(x%xSum == 0) { //����������� �ϻ��� ���� ����
			answer = true;
		}
		System.out.println(answer);
        return answer;
    }
}
