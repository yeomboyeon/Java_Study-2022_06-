package day16;

import java.util.Random;
/* 
 * ���� Ŭ����(Random class) : �������� ���� �����س��� ���� �˰����� ���� Ŭ����
 * 
 * 
 * 
 */

public class Random01 {

	public static void main(String[] args) {

		Random ranNum = new Random();

		for (int i = 0; i < 5; i++) { // 5�� ����
			System.out.println(ranNum.nextInt(100)); // ���ڰ�(seed), ���� ������ ������ ����
		}
	}
}
