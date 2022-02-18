package com.lyr.programmers.level1;


/*
 * 2022�� 2�� 15�� (ȭ����)
 * 42. �ű� ���̵� ��õ
 */
public class RecommendingNewId {
	public String solution(String newId) {
		String answer = "";

		/*
		 * 3���� �̻� 15�� ���� �ҹ���, ����, -, _, . �� ��� ���� .�� ó���� ������ ����� �� ���� ���ӺҰ���
		 */

//		String pattern = "^([a-z]|[0-9]|[-_])([a-z]|[0-9]|[-_.]){1,13}([a-z]|[0-9]|[-_])$";
		System.out.println("���� = " + newId);

		System.out.println("=================================");
		// 1. �빮��->�ҹ���
		System.out.println("1�ܰ� before = " + newId);
		newId = newId.toLowerCase();
		System.out.println("1�ܰ� after = " + newId);

		// 2. !, @, #, * ->����
		System.out.println("2�ܰ� before = " + newId);
		newId = newId.replaceAll("[^a-z0-9-_.]", "");
		System.out.println("2�ܰ� after = " + newId);

		// 3. ..., .. ->.
		System.out.println("3�ܰ� before = " + newId);
		newId = newId.replaceAll("[.]{2,}", ".");
		System.out.println("3�ܰ� after = " + newId);

		// 4. ù��°, ������ ��ħǥ ����
		System.out.println("4�ܰ� before = " + newId);

		while (newId.length() > 0) { //�̰� �����༭ �̰� �Ʒ��� newId.length()-1������ 2, 22, 23���� ��Ÿ�� ���� ������
			if (newId.charAt(0) == '.' || newId.charAt(newId.length() - 1) == '.') {
				newId = newId.replaceAll("^[.]|[.]$", "");
				System.out.println("4�ܰ� after = " + newId);
			}
		}

		// 5. ���ڿ� �̸� a
		System.out.println("5�ܰ� before = " + newId);
		if (newId.isEmpty()) {
			newId = "a";
		}
		System.out.println("5�ܰ� after = " + newId);

		// 6. 16�� �̻��� ��� 15�� ������ ������ ���� ����
		System.out.println("6�ܰ� before = " + newId);
		if (newId.length() > 15) {
			newId = newId.substring(0, 15);
			newId = newId.replaceAll("[.]$", "");
		}
		System.out.println("6�ܰ� after = " + newId);

		// 7. ���̰� 2�� �����̸� ������ ���ڸ� 3���ڵɶ����� �߰�
		System.out.println("7�ܰ� before = " + newId);
		while (newId.length() < 3) {
			newId += newId.charAt(newId.length() - 1);
		}
		System.out.println("7�ܰ� after = " + newId);
		System.out.println();

		System.out.println("��� = " + newId);
		answer = newId;
		return answer;
	}
}
