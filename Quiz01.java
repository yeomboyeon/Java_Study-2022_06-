package day16;

import java.util.Random;
import java.util.Scanner;

/*
 * �������� ������ ���ڸ� ����ڰ� ���� ���纸��.
 * + ���� ������ 1~50���� Ȯ���ϴ� ���, ����� �Է� Ƚ���� 10ȸ�� ����.
 */
public class Quiz01 {

	public static void main(String[] args) {

		Random ranNum = new Random();

		int number = ranNum.nextInt(50) + 1; // 1~10 (�ε������̱⿡ +1 �߰�)

		Scanner scan = new Scanner(System.in);

		for (int i = 1; i < 11; i++) {
			System.out.println(i + "��° �õ��Դϴ�.");
			System.out.print("1~50 �� �ϳ��� �������ּ���. : ");

			int scannumber = scan.nextInt();

			if (scannumber == number) {
				System.out.println("�����Դϴ�.");
				break;
			} else {
				System.out.println("�����Դϴ�.");
			}
		}
		scan.close();
	}
}
