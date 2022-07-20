package day16;
/* 사용자가 입력한 아이디와 비번이 실제 아이디 비번과 동일한지 확인하기 */

import java.util.Scanner;

public class UserInput02 {

	public static void main(String[] args) {
		String originId = "yeomboyeon";
		String originPw = "0425rotc12!@";

		Scanner scan = new Scanner(System.in);
		// 시스템으로부터 입력을 받는 input 객체

		while (true) {
			System.out.print("아이디를 입력해주세요. : "); // 입력할 내용을 적어주는게 관례
			String scanId = scan.nextLine();
			
			if (originId.equals(scanId)) {
				System.out.print("비밀번호를 입력해주세요. : ");
				String scanPw = scan.nextLine();
				if (originPw.equals(scanPw)) {
					System.out.println("로그인 성공!");
					break;
				} else {
					System.out.println("비밀번호가 틀렸습니다.");
					break;
				}
			} else {
				System.out.println("아이디가 존재하지 않습니다.");
				continue;
			}
		}
		scan.close();
	}

}
