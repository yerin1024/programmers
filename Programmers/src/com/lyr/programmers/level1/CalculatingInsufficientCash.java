package com.lyr.programmers.level1;

/*
 * 2022�� 2�� 14�� (������)
 * 29. ������ �ݾ� ����ϱ�
 */
public class CalculatingInsufficientCash { //insufficient ������ <-> sufficient �����
	public long solution(int price, int money, int count) {
        long answer = -1;
        //price : ���� �̿��
        //money : ó�� �������ִ� �ݾ�
        //count : ���̱ⱸ �̿�Ƚ��
        
        long totalCost = 0;
        for(int i=1; i<=count; i++) {
        	totalCost += price*i;
        }
        System.out.println(totalCost);
        if(money > totalCost) { //���� �������� �ʴٸ� 0 ����
        	answer = 0;
        } else {
        	answer = totalCost - money;
        }
        
        System.out.println(answer);
        return answer;
    }
}
