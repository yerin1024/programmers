package com.lyr.programmers.level1;

import java.math.BigInteger;

/*
 * 2022�� 2�� 8�� (ȭ����)
 * 8. �ִ������� �ּҰ����
 */
public class GreatestCommonDivisorAndLeastCommonMultiple { 
	public int[] solution(int n, int m) {
		//�ִ�����(GreatestCommonDivisor, GCD) & �ּҰ����(LeastCommonMultiple, LCM)
		
		//1. �ִ����� ���ϱ�
		//1-1. BigInteger ���� �Լ� �̿�
		BigInteger b1 = BigInteger.valueOf(n);
		BigInteger b2 = BigInteger.valueOf(m);
		BigInteger gcd = b1.gcd(b2);
		int bigIntegerGcd = gcd.intValue();
		System.out.println("BingInteger �����Լ��� ���� �ִ����� = "+bigIntegerGcd);
		
		//1-2. ��Ŭ���� ȣ����(Euclidean Algorithm)���� ��������
		int eucdGcd = eucd(n, m);
		System.out.println("��Ŭ���� ȣ�������� ���� �ִ�����  = "+eucdGcd);
		
		//2. �ּҰ���� = �� �ڿ����� ��/�ִ�����
		int lcm = n*m/eucdGcd;
		System.out.println("�ּҰ���� = "+lcm);
		
        int[] answer = {eucdGcd, lcm};
        return answer;
    }
	
	//��Ŭ���� ȣ����
	public int eucd(int bigNum, int smallNum) {
		//bigNum�� ��¥ ��ū ���ڰ� �ƴҰ�츦 ����
		System.out.println("big = "+bigNum+" && small = "+smallNum);
		if(bigNum < smallNum) {
			int tmp = bigNum; 
			bigNum = smallNum;  
			smallNum = tmp; 
		}
		
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