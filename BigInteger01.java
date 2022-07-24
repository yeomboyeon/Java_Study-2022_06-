import java.math.BigInteger;

public class BigInteger01 {
/* BigIntegerClass : 기본 자료형으로 표현할 수 있는 정수보다 더 큰 값을 표현하고자 할 때 사용. */
	public static void main(String[] args) {
		System.out.println(Long.MAX_VALUE); // 가장 큰 값 출력
		System.out.println(Long.MIN_VALUE); // 가장 작은 값 출력
		
		long num1 = 9223372036854775807L; // 뒤에 L 붙여야 long로 인식
		
		// BigInteger에 수를 문자열에 써서 전달해야 한다. / 알아서 숫자로 해석
		BigInteger bignum1 = new BigInteger("9223372036854775808");
		// long 보다 큰 숫자를 문자열로 입력
		
		System.out.println(bignum1);

	}

}
