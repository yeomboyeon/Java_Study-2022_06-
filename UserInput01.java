package day16;
import java.util.Scanner;

/* Scanner : �Է�(Ű����, ����, ���� ��)�� ó���� �� �ִ� Ŭ���� 
 * �� ����(a, b)�� �Է¹޾� a�� b�� ������ 1��, ���� ������ 0�� ����ϴ� ���α׷� �ۼ� */

public class UserInput01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// �ý������κ��� �Է��� �޴� input ��ü
		
		System.out.print("�� ������ �Է����ּ���.(0 0) : "); // �Է��� ������ �����ִ°� ����
		int a = scan.nextInt();
		int b = scan.nextInt();

		scan.close();

		int c = a == b ? 1 : 0;
		
		System.out.println("����� ? : " + c);
		
		
	}
}
