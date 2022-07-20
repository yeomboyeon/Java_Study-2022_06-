package day16;

import java.util.Random;
import java.util.Scanner;

/*
 * 알파벳 맞추기
 * 힌트 : 대문자 A 는 유니코드 65번.
 */
public class Quiz02 {

	public static void main(String[] args) {
		Random r = new Random();
		char alpha = (char) (65 + r.nextInt(26)); // 강제형변환 활용, 65부터 26은 알파벳 갯수
		// char : 유니코드(문자표현을 위해 문자에 번호를 부여)를 호환한다.

		String alpha_s = String.valueOf(alpha); // 주어진 값을 문자열로 변환(비교 수월 하게)

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.print("알파벳을 입력해주세요. : ");
			String scanStr = scan.nextLine();

			if (scanStr.equals(alpha_s)) { // 비교하기
				System.out.println("정답입니다.");
				break;
			} else {
				System.out.println("오답입니다.");
			}
		}
		scan.close();
	}
}
