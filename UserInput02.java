package day16;
/* ����ڰ� �Է��� ���̵�� ����� ���� ���̵� ����� �������� Ȯ���ϱ� */

import java.util.Scanner;

public class UserInput02 {

	public static void main(String[] args) {
		String originId = "yeomboyeon";
		String originPw = "0425rotc12!@";

		Scanner scan = new Scanner(System.in);
		// �ý������κ��� �Է��� �޴� input ��ü

		while (true) {
			System.out.print("���̵� �Է����ּ���. : "); // �Է��� ������ �����ִ°� ����
			String scanId = scan.nextLine();
			
			if (originId.equals(scanId)) {
				System.out.print("��й�ȣ�� �Է����ּ���. : ");
				String scanPw = scan.nextLine();
				if (originPw.equals(scanPw)) {
					System.out.println("�α��� ����!");
					break;
				} else {
					System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
					break;
				}
			} else {
				System.out.println("���̵� �������� �ʽ��ϴ�.");
				continue;
			}
		}
		scan.close();
	}

}
