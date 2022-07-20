package day16;
import java.util.*;
/* 큐 : 일자로 된 자료구조, 선입선출 구조
 * 특징 : 
 * - 먼저 들어간 것이 반드시 먼저 나온다.
 * - LinkedList 클래스는 Queue를 다중상속 가능(List, Queue을 참조하면서 그의 기능을 갖는다.) 
 *   ** ex) class LinkedList implements List, Queue {} 이런식으로 활용이 된다. */
public class Queue01 {
	public static void main(String[] args) {
		Queue<String> lang = new LinkedList<>();  
		// 큐로 구현된 자식클래스(LinkedList로 new 해야 한다. 
		
		lang.offer("C language");
		lang.offer("C++");
		lang.offer("python");
		lang.offer("Java");
		lang.offer("JavaScript");
		// 큐에 데이터 삽입할 때는 offer()
		
		System.out.println("다음 꺼낼 것은 : " + lang.peek());
		System.out.println("실제로 꺼냈다. : " + lang.poll());
		System.out.println("다음 꺼낼 것은 : " + lang.peek());
		System.out.println("실제로 꺼냈다. : " + lang.poll());
		System.out.println("다음 꺼낼 것은 : " + lang.peek());
		System.out.println("실제로 꺼냈다. : " + lang.poll());
		System.out.println("다음 꺼낼 것은 : " + lang.peek());
		System.out.println("실제로 꺼냈다. : " + lang.poll());
		System.out.println("다음 꺼낼 것은 : " + lang.peek());
		System.out.println("실제로 꺼냈다. : " + lang.poll());
		// 선입선출 관련 두 개의 메소드 : peek & poll
		// peek() : 당장 꺼낼 수 있는 것을 확인
		// poll() : 그것을 실제로 꺼낸다.		
		
		System.out.println("다음 꺼낼 것은 : " + lang.peek());
		System.out.println("실제로 꺼냈다. : " + lang.poll());
		// 요소가 없으면, null 반환 : 실수가 점검되지 않는다.
	}
}
