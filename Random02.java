package day16;

import java.util.Random;

/* �ֻ��� Ŭ���� ����� ������ ��� Ȱ�� */
class Dice {

	int rool() {
		Random ranNum = new Random(); // �������� ���� ���ܾ� �ϳ�? �ֻ����� ���� �� ���ܾ� �Ѵ�.
		int value = ranNum.nextInt(6); // �ֻ����� 6ĭ�ε� �ε��� ���� 0~5
		return value + 1; // �ε��� ������ 1�� ���ؼ� 6���� �������� �ϱ�
	}
}
public class Random02 {

	public static void main(String[] args) {
		Dice mine = new Dice();
		int count = 0; // ����� �������� ����.(�߰��� �����غ� ��, �ֻ��� Ŭ�������� ���ص� ��)
		
//		mine.rool(); count++; // rool(�ֻ��� ������) �� ������ ī���Ϳ� 1�� ���ϱ�.
		System.out.println(mine.rool()); count++;
		System.out.println(mine.rool()); count++;
		System.out.println(mine.rool()); count++;
		System.out.println(mine.rool()); count++;
		System.out.println(mine.rool()); count++;
		System.out.println(mine.rool()); count++;
		
		System.out.println("���� Ƚ���� ? " + count);
	}
}
