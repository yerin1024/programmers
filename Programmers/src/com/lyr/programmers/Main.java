package com.lyr.programmers;

import com.lyr.programmers.level1.LoggingRectangleStar;
import com.lyr.programmers.level1.HidingPhoneNumber;
import com.lyr.programmers.level1.MatrixAddition;
import com.lyr.programmers.level1.Multiplication;

/*
 * 패키지명 규칙 : com.[회사명].[프로젝트명].~
 */
public class Main {
	
	public static void main(String[] args) {
//		HidePhoneNumber s = new HidePhoneNumber();
//		s.solution("02777888");
		
//		CreateRectangleStar s = new CreateRectangleStar();
//		s.solution();

//		PrintMultiplication s = new PrintMultiplication();
//		s.solution(-10000000, 5);
		
		MatrixAddition s = new MatrixAddition();
		int[][] a = {{1,2}, {2,3}};
		int[][] b = {{3,4}, {5,6}};
		
		s.solution(a,b);
	}

}
