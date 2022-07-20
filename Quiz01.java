package day16;

import java.util.Random;
import java.util.Scanner;

/*
 * 랜덤으로 생성된 숫자를 사용자가 직접 맞춰보자.
 * + 숫자 범위를 1~50으로 확장하는 대신, 사용자 입력 횟수를 10회로 제한.
 */
public class Quiz01 {

	public static void main(String[] args) {

		Random ranNum = new Random();

		int number = ranNum.nextInt(50) + 1; // 1~10 (인덱스값이기에 +1 추가)

		Scanner scan = new Scanner(System.in);

		for (int i = 1; i < 11; i++) {
			System.out.println(i + "번째 시도입니다.");
			System.out.print("1~50 중 하나를 선택해주세요. : ");

			int scannumber = scan.nextInt();

			if (scannumber == number) {
				System.out.println("정답입니다.");
				break;
			} else {
				System.out.println("오답입니다.");
			}
		}
		scan.close();
	}
}
