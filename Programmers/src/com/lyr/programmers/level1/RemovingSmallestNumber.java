package com.lyr.programmers.level1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * 2022�� 2�� 11�� (�ݿ���)
 * 10. ���� ���� �� �����ϱ�
 */
public class RemovingSmallestNumber {
	public int[] solution(int[] arr) {
		System.out.println("���� = "+Arrays.toString(arr));
		
		int[] answer = new int[arr.length-1];
		
		if(arr.length==1 && arr[0] == 10) {
			return answer = new int[] {-1};
		}
		
		//�迭 -> List 
		//Arrays.asList() ����ϸ� ������ int���� ��� �Ұ���
		List<Integer> arrToList = Arrays.stream(arr).boxed().collect(Collectors.toList());
		
		//������� ����
		for(int i=0; i<arr.length-1; i++) {
			for(int j=1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					int tmp = arr[j];
					arr[j] = arr[i];
					arr[i] = tmp;
				}
			}
		}
		
		//���� ���� �� ����
		arrToList.remove(arrToList.indexOf(arr[0]));
		
		//List -> �迭
		//����Ʈ.toArray(�迭) ����ϸ� ������ int���� ��� �Ұ���
		answer = arrToList.stream().mapToInt(Integer::intValue).toArray();
//		answer = arrToList.stream().mapToInt(i->i).toArray();
		
		System.out.println("���� = "+Arrays.toString(answer));
		
		
        return answer;
    }
}

/*
Stream 
: �÷���, �迭 � ���� ����Ǿ��ִ� ��ҵ��� �ϳ��� �����ϸ� �ݺ����� ó���� �������ϴ� ���
-> ���ʿ��� for���� �׾ȿ��� �̷����� if�� ���� �б�ó���� �����ʰ� ����ϰ� �������� �ڵ�� ���� ����

Ư¡
1. ���������͸� �б⸸ �� �� ���������� ��ü�� �������� �ʴ´�.
2. �� �� ����ϸ� ������ ������ �Ұ����ϱ� ������ �ʿ��ϴٸ� ���ĵ� ����� �÷����̳� �迭�� ��� ��ȯ
3. �۾��� ���� �ݺ����� ó���ϱ� ������ ������ �ڵ� ����

����  = ���̾�ҽ���ü����.Stream����().�߰�����().��������();
(�߰������� Stream���� ���޹޾� Stream���� ��ȯ�ϹǷ� �߰������� ���ӻ���� �����ϴ�)

String[] array = {"abc", "bcd", "cde", "def"};
List<String> list = Arrays.asList(array) //�迭�� List�� �����ϰ�
					.stream() //1. Stram ����
					.filter(e -> e.startsWith("e")) //2. �߰�����
					.collect(Collectors.toList()); //3. ���� ���� : �߰� ������ ���� ������ stream�� ����ش�.

*/

/*
Set�� List�� ����
List�� ������ �ִ� Collection�̱� ������ �����͸� �ִ� ������ ����Ǹ� ���� index�� Ư�� �������� ������ �� ����, �ߺ� ���
Set�� ������ �������� �ʴ� Collection�̱� ������ index�� Ư�� �������� ������ �� ����, �ߺ��� ������� ����
-> contains�� �ӵ��� Set�� ������ ������ Ž���� ��ٸ� Set�� �̿��ؾ���
*/

/*
:: (�����ݷ�, ����з�) �� ���� ��Ī�� �޼ҵ� ���� ǥ����
-> ���ٽĿ��� �Ķ���͸� �ߺ��ؼ� ���� ������ ���
������� [�ν��Ͻ�]::�޼ҵ��
	answer = arrToList.stream().mapToInt(Integer::intValue).toArray();
*/
