package day16;

import java.util.Random;

/* 주사위 클래스 기능 활용(두 개의 주사위를 던져 더블이 나올 때까지 던지기) */
class Dice01 {

	int rool() {
		Random ranNum = new Random(); // 랜덤값이 언제 생겨야 하나? 주사위를 던질 때 생겨야 한다.
		int value = ranNum.nextInt(6); // 주사위는 6칸인데 인덱스 값은 0~5
		return value + 1; // 인덱스 값에서 1을 더해서 6까지 나오도록 하기
	}
}

public class Random03 {

	public static void main(String[] args) {
		Dice01 mine = new Dice01();
		int count = 0;

		while (true) { // 두 개의 정수(int) 를 던져서 first, second로 구분하여 던지고 rool에 저장
			int first = mine.rool();
			int second = mine.rool();

			System.out.println(first + " / " + second); // 주사위 구분 표시

			count++; // 출력 후 던진 횟수 1씩 증가

			if (first == second) { // first, second가 같다면 실행하도록 
				System.out.println("더블!");
				break; // if문 나가기
			}
		}
		System.out.println("던진 횟수는 ? " + count);
	}
}
