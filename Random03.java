package day16;

import java.util.Random;

/* �ֻ��� Ŭ���� ��� Ȱ��(�� ���� �ֻ����� ���� ������ ���� ������ ������) */
class Dice01 {

	int rool() {
		Random ranNum = new Random(); // �������� ���� ���ܾ� �ϳ�? �ֻ����� ���� �� ���ܾ� �Ѵ�.
		int value = ranNum.nextInt(6); // �ֻ����� 6ĭ�ε� �ε��� ���� 0~5
		return value + 1; // �ε��� ������ 1�� ���ؼ� 6���� �������� �ϱ�
	}
}

public class Random03 {

	public static void main(String[] args) {
		Dice01 mine = new Dice01();
		int count = 0;

		while (true) { // �� ���� ����(int) �� ������ first, second�� �����Ͽ� ������ rool�� ����
			int first = mine.rool();
			int second = mine.rool();

			System.out.println(first + " / " + second); // �ֻ��� ���� ǥ��

			count++; // ��� �� ���� Ƚ�� 1�� ����

			if (first == second) { // first, second�� ���ٸ� �����ϵ��� 
				System.out.println("����!");
				break; // if�� ������
			}
		}
		System.out.println("���� Ƚ���� ? " + count);
	}
}
