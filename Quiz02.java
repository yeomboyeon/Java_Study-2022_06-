package day16;

import java.util.Random;
import java.util.Scanner;

/*
 * ���ĺ� ���߱�
 * ��Ʈ : �빮�� A �� �����ڵ� 65��.
 */
public class Quiz02 {

	public static void main(String[] args) {
		Random r = new Random();
		char alpha = (char) (65 + r.nextInt(26)); // ��������ȯ Ȱ��, 65���� 26�� ���ĺ� ����
		// char : �����ڵ�(����ǥ���� ���� ���ڿ� ��ȣ�� �ο�)�� ȣȯ�Ѵ�.

		String alpha_s = String.valueOf(alpha); // �־��� ���� ���ڿ��� ��ȯ(�� ���� �ϰ�)

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.print("���ĺ��� �Է����ּ���. : ");
			String scanStr = scan.nextLine();

			if (scanStr.equals(alpha_s)) { // ���ϱ�
				System.out.println("�����Դϴ�.");
				break;
			} else {
				System.out.println("�����Դϴ�.");
			}
		}
		scan.close();
	}
}
