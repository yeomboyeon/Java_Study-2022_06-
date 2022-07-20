package day16;

import java.util.Random;

/* 주사위 클래스 만들어 던지기 기능 활용 */
class Dice {

	int rool() {
		Random ranNum = new Random(); // 랜덤값이 언제 생겨야 하나? 주사위를 던질 때 생겨야 한다.
		int value = ranNum.nextInt(6); // 주사위는 6칸인데 인덱스 값은 0~5
		return value + 1; // 인덱스 값에서 1을 더해서 6까지 나오도록 하기
	}
}
public class Random02 {

	public static void main(String[] args) {
		Dice mine = new Dice();
		int count = 0; // 몇번을 던졌는지 세기.(추가로 구현해본 것, 주사위 클래스에는 안해도 됨)
		
//		mine.rool(); count++; // rool(주사위 던지기) 할 때마다 카운터에 1씩 더하기.
		System.out.println(mine.rool()); count++;
		System.out.println(mine.rool()); count++;
		System.out.println(mine.rool()); count++;
		System.out.println(mine.rool()); count++;
		System.out.println(mine.rool()); count++;
		System.out.println(mine.rool()); count++;
		
		System.out.println("던진 횟수는 ? " + count);
	}
}
