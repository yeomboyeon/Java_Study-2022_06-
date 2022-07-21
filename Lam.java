/* 람다식 : 코드를 간결하게 작성하기 위해 사용하는 일종의 표현식
 * 이점 : 객체지향언어인 자바에서 함수 기반 프로그래밍을 기능하게 해준다.
 * 람다식을 사용하는 경우는 인스턴스보다 그저 단 하나의 기능이 필요한 상황 */
interface Printable {
	void print(String s);
}
interface Calculate {
	int cal(int a, int b);
}
public class Lam {
	public static void main(String[] args) {
		Printable p; // 그저 기능 하나를 위해 사용하는 참조 변수
		Calculate c;

		// 참조 변수가 기능 하나만을 처리하게 만들자
		p = (String s) -> {
			System.out.println(s);
		}; // (매개변수) -> {처리할 기능};
		p.print("람다식 이용한 첫 번째 케이스");

		// 메소드의 바디가 한 문장으로 이루어진 경우, 중괄호 생략 가능
		p = (String s) -> System.out.println(s); // (매개변수) -> {처리할 기능};
		p.print("람다식 이용한 두 번째 케이스");

		// 메소드가 처리할 자료형도 생략 가능
		p = (s) -> System.out.println(s); // (매개변수) -> {처리할 기능};
		p.print("람다식 이용한 세 번째 케이스");

		// 매개변수가 하나인 경우에만, 소괄호도 생략 가능
		p = s -> System.out.println(s); // (매개변수) -> {처리할 기능};
		p.print("람다식 이용한 네 번째 케이스");

		c = (a, b) -> {
			return a + b;
		};
		System.out.println(c.cal(3, 5));

		// return 있는 메소드 바디는 한 문장만 있을 때 return까지도 생략 가능
		c = (a, b) -> a - b;
		System.out.println(c.cal(8, 5));
	}
}
