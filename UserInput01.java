package day16;
import java.util.Scanner;

/* Scanner : 입력(키보드, 파일, 음성 등)을 처리할 수 있는 클래스 
 * 두 정수(a, b)를 입력받아 a와 b가 같으면 1을, 같지 않으면 0을 출력하는 프로그램 작성 */

public class UserInput01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// 시스템으로부터 입력을 받는 input 객체
		
		System.out.print("두 정수를 입력해주세요.(0 0) : "); // 입력할 내용을 적어주는게 관례
		int a = scan.nextInt();
		int b = scan.nextInt();

		scan.close();

		int c = a == b ? 1 : 0;
		
		System.out.println("결과는 ? : " + c);
		
		
	}
}
