package com.lyr.programmers.level1;

import java.util.Scanner;

/*
 * 2022�� 2�� 5�� (�����)
 * 2. ���簢�� �����
 */
public class CreateRectangleStar {
	public void solution() {
		
		Scanner sc = new Scanner(System.in);
		
        int a = sc.nextInt(); //����
        int b = sc.nextInt(); //����

        for(int i=0; i<b; i++) {
        	for(int j=0; j<a; j++) {
        		System.out.print("*");
        	}
        	System.out.println();
        }
	}
}
