package com.lyr.programmers.level1;

/*
 * 2022�� 2�� 14�� (�Ͽ���)
 * 14. �̻��� ���� �����
 */
public class StrangeString {
	public String solution(String s) {
		//�� �ܾ��� ¦����° ���ĺ��� �빮�ڷ�, Ȧ����° ���ĺ��� �ҹ��ڷ� �ٲ� ���ڿ��� �����ϴ� �Լ�
		//try hello world
		System.out.println(s);
		String answer = "";
		
		String[] arr = s.split(" ", -1); //-1�� ���ָ� ���������� �̷��� ������ ���� ��� �� �����ڷ� �����-> ������� �޶��� 
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
			String[] tmpArr = arr[i].split("");
			String tmp = "";
			
			for(int j=0; j<tmpArr.length; j++) {
				if(j%2 == 0) { //¦����°�� �빮��
					tmpArr[j] = tmpArr[j].toUpperCase();
				}else { //Ȧ����°�� �ҹ���
					tmpArr[j] = tmpArr[j].toLowerCase();
				}

				tmp += tmpArr[j];
			}
			System.out.println(tmp);
			answer += tmp;
			if(i != arr.length-1) {
				answer += " ";
			}
		}
		System.out.println(answer);
        return answer;
    }
}
//split() �޼����� �ι�° �Ķ���Ϳ� limit ���� ������(0���� ���� ����) �ָ� ��� ���а��� ������ �迭�� ��ȯ�Ѵ�.
// String str = t1
// str.split("1") -> [t]
// str.split("1", -1) -> [t], [����]
