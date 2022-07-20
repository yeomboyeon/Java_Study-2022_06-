package day16;
import java.util.ArrayDeque;
import java.util.Deque;
/*
 * 스택 : 일직선으로 되어 있는 자료구조, 후입선출(Last In - First out)
 * 
 * 특징 : 
 * - 최신 자바에서 Stack 클래스가 사장되었다.(오류가 많음)
 * - 대신 그것을 대체하는 덱(Deque)를 쓴다.
 * 
 */
public class Stack01 {

	public static void main(String[] args) {
		Deque<String> myStack = new ArrayDeque<>();

//		myStack.offerLast("1짜장면");
//		myStack.offerLast("2탕수육");
//		myStack.offerLast("3짬뽕");
//		myStack.offerLast("4육개장");
//		myStack.offerLast("5볶음밥");
		myStack.offerFirst("1짜장면");
		myStack.offerFirst("2탕수육");
		myStack.offerFirst("3짬뽕");
		myStack.offerFirst("4육개장");
		myStack.offerFirst("5볶음밥");
		// offerFirst 또는 offerLast 둘 중 하나로만 사용 가능 
		
		System.out.println(myStack.peekFirst());
		System.out.println(myStack.peekLast());
		System.out.println(myStack.peekFirst());
		System.out.println(myStack.peekLast());
		System.out.println(myStack.peekFirst());
		System.out.println(myStack.peekLast());
		
	}

}
