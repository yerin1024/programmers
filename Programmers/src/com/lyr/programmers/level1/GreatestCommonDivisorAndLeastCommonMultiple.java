package com.lyr.programmers.level1;

import java.math.BigInteger;

/*
 * 2022�� 2�� 8�� (ȭ����)
 * 7. �ִ������� �ּҰ����
 */
public class GreatestCommonDivisorAndLeastCommonMultiple { 
	public int[] solution(int n, int m) {
		//�ִ�����(GreatestCommonDivisor, GCD) & �ּҰ����(LeastCommonMultiple, LCM)
		//�ּҰ���� = �� �ڿ����� ��/�ִ�����
		
		//�ִ����� ���ϱ�
		//1. BigInteger ���� �Լ� �̿�
		BigInteger b1 = BigInteger.valueOf(n);
		BigInteger b2 = BigInteger.valueOf(m);
		BigInteger gcd = b1.gcd(b2);
		int lcm = gcd.intValue();
		System.out.println("BingInteger �����Լ��� ���� �ִ����� = "+lcm);
		
		//2. ��Ŭ���� ȣ����(Euclidean Algorithm)���� ��������
		System.out.println("��Ŭ��Ʈ ȣ�������� ���� �ִ�����  = "+eucd(n, m));
        int[] answer = {};
        return answer;
    }
	
	//��Ŭ���� ȣ����
	public int eucd(int bigNum, int smallNum) {
		//bigNum�� ��¥ ��ū ���ڰ� �ƴҰ�츦 ����
		if(bigNum < smallNum) {
			int tmp = bigNum; 
			bigNum = smallNum;  
			smallNum = bigNum; 
		}
		System.out.println("big");
		//ū���ڸ� �������ڷ� ���� �������� ���
		if(bigNum % smallNum == 0) { //�������� 0�̸� �������� ����
			return smallNum;
		} else {
			return eucd(smallNum, bigNum%smallNum); //�������� 0�� �ƴϸ� ���ȣ��(��������, ū���ڸ� �������ڷ� ���� ������)
		}
		
		
	}

}

/*
��Ŭ���� ȣ����
�μ��� ����� ���� �������� ���� �������� �ٽ� �����ϴ�. 
�׷��� 0 �� ���� �� ���� �ݺ����� ���� �մϴ�. 
�ٷ� ���� �������� �ִ������� �Ǵ� ��
*/

//���μ�(comprime) : 2(1,2)�� 3(1,3) ó�� ������� 1�ۿ� ���� ��