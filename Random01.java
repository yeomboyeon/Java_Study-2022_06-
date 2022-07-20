package day16;

import java.util.Random;
/* 
 * 랜덤 클래스(Random class) : 무작위로 값을 생성해내는 내부 알고리즘을 지닌 클래스
 * 
 * 
 * 
 */

public class Random01 {

	public static void main(String[] args) {

		Random ranNum = new Random();

		for (int i = 0; i < 5; i++) { // 5번 실행
			System.out.println(ranNum.nextInt(100)); // 종자값(seed), 인자 사이의 값으로 랜덤
		}
	}
}
