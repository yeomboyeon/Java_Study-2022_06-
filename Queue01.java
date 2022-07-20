package day16;
import java.util.*;
/* ť : ���ڷ� �� �ڷᱸ��, ���Լ��� ����
 * Ư¡ : 
 * - ���� �� ���� �ݵ�� ���� ���´�.
 * - LinkedList Ŭ������ Queue�� ���߻�� ����(List, Queue�� �����ϸ鼭 ���� ����� ���´�.) 
 *   ** ex) class LinkedList implements List, Queue {} �̷������� Ȱ���� �ȴ�. */
public class Queue01 {
	public static void main(String[] args) {
		Queue<String> lang = new LinkedList<>();  
		// ť�� ������ �ڽ�Ŭ����(LinkedList�� new �ؾ� �Ѵ�. 
		
		lang.offer("C language");
		lang.offer("C++");
		lang.offer("python");
		lang.offer("Java");
		lang.offer("JavaScript");
		// ť�� ������ ������ ���� offer()
		
		System.out.println("���� ���� ���� : " + lang.peek());
		System.out.println("������ ���´�. : " + lang.poll());
		System.out.println("���� ���� ���� : " + lang.peek());
		System.out.println("������ ���´�. : " + lang.poll());
		System.out.println("���� ���� ���� : " + lang.peek());
		System.out.println("������ ���´�. : " + lang.poll());
		System.out.println("���� ���� ���� : " + lang.peek());
		System.out.println("������ ���´�. : " + lang.poll());
		System.out.println("���� ���� ���� : " + lang.peek());
		System.out.println("������ ���´�. : " + lang.poll());
		// ���Լ��� ���� �� ���� �޼ҵ� : peek & poll
		// peek() : ���� ���� �� �ִ� ���� Ȯ��
		// poll() : �װ��� ������ ������.		
		
		System.out.println("���� ���� ���� : " + lang.peek());
		System.out.println("������ ���´�. : " + lang.poll());
		// ��Ұ� ������, null ��ȯ : �Ǽ��� ���˵��� �ʴ´�.
	}
}
