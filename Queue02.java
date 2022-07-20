package day16;
import java.util.LinkedList;
import java.util.Queue;
/*
 * add, element, remove 메서드 사용시 사용자가 코드에서 실수를 범할시 예외를 발생시킨다.
 * 
 */
public class Queue02 {
	public static void main(String[] args) {
		Queue<String> lang = new LinkedList<>();  
		
		lang.add("C language");
		lang.add("C++");
		lang.add("python");
		lang.add("Java");
		lang.add("JavaScript");
		//offer → add : 동일한 역할 수행
		
		System.out.println("다음 꺼낼 것은 : " + lang.element());
		System.out.println("실제로 꺼냈다. : " + lang.remove());
		System.out.println("다음 꺼낼 것은 : " + lang.element());
		System.out.println("실제로 꺼냈다. : " + lang.remove());
		System.out.println("다음 꺼낼 것은 : " + lang.element());
		System.out.println("실제로 꺼냈다. : " + lang.remove());
		System.out.println("다음 꺼낼 것은 : " + lang.element());
		System.out.println("실제로 꺼냈다. : " + lang.remove());
		System.out.println("다음 꺼낼 것은 : " + lang.element());
		System.out.println("실제로 꺼냈다. : " + lang.remove());
		// peek → element, poll → remove : 동일한 역할 수행
		
		try { // 예외처리 구현
			System.out.println("다음 꺼낼 것은 : " + lang.element());
			System.out.println("실제로 꺼냈다. : " + lang.remove());	
		} catch (Exception e) {
			System.out.println("예외입니다.!");
		}
		
		// 이 부분은 예외가 발생하는 부분으로 예외 처리를 하도록 구현
	}
}
