package com.lyr.programmers.level1;

import java.util.Scanner;

/*
 * 2022년 2월 5일 (토요일)
 * 2. 직사각형 별찍기
 */
public class CreateRectangleStar {
	public void solution() {
		
		Scanner sc = new Scanner(System.in);
		
        int a = sc.nextInt(); //가로
        int b = sc.nextInt(); //세로

        for(int i=0; i<b; i++) {
        	for(int j=0; j<a; j++) {
        		System.out.print("*");
        	}
        	System.out.println();
        }
	}
}
