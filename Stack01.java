package day16;
import java.util.ArrayDeque;
import java.util.Deque;
/*
 * ���� : ���������� �Ǿ� �ִ� �ڷᱸ��, ���Լ���(Last In - First out)
 * 
 * Ư¡ : 
 * - �ֽ� �ڹٿ��� Stack Ŭ������ ����Ǿ���.(������ ����)
 * - ��� �װ��� ��ü�ϴ� ��(Deque)�� ����.
 * 
 */
public class Stack01 {

	public static void main(String[] args) {
		Deque<String> myStack = new ArrayDeque<>();

//		myStack.offerLast("1¥���");
//		myStack.offerLast("2������");
//		myStack.offerLast("3«��");
//		myStack.offerLast("4������");
//		myStack.offerLast("5������");
		myStack.offerFirst("1¥���");
		myStack.offerFirst("2������");
		myStack.offerFirst("3«��");
		myStack.offerFirst("4������");
		myStack.offerFirst("5������");
		// offerFirst �Ǵ� offerLast �� �� �ϳ��θ� ��� ���� 
		
		System.out.println(myStack.peekFirst());
		System.out.println(myStack.peekLast());
		System.out.println(myStack.peekFirst());
		System.out.println(myStack.peekLast());
		System.out.println(myStack.peekFirst());
		System.out.println(myStack.peekLast());
		
	}

}
