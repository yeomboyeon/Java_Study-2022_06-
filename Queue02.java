package day16;
import java.util.LinkedList;
import java.util.Queue;
/*
 * add, element, remove �޼��� ���� ����ڰ� �ڵ忡�� �Ǽ��� ���ҽ� ���ܸ� �߻���Ų��.
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
		//offer �� add : ������ ���� ����
		
		System.out.println("���� ���� ���� : " + lang.element());
		System.out.println("������ ���´�. : " + lang.remove());
		System.out.println("���� ���� ���� : " + lang.element());
		System.out.println("������ ���´�. : " + lang.remove());
		System.out.println("���� ���� ���� : " + lang.element());
		System.out.println("������ ���´�. : " + lang.remove());
		System.out.println("���� ���� ���� : " + lang.element());
		System.out.println("������ ���´�. : " + lang.remove());
		System.out.println("���� ���� ���� : " + lang.element());
		System.out.println("������ ���´�. : " + lang.remove());
		// peek �� element, poll �� remove : ������ ���� ����
		
		try { // ����ó�� ����
			System.out.println("���� ���� ���� : " + lang.element());
			System.out.println("������ ���´�. : " + lang.remove());	
		} catch (Exception e) {
			System.out.println("�����Դϴ�.!");
		}
		
		// �� �κ��� ���ܰ� �߻��ϴ� �κ����� ���� ó���� �ϵ��� ����
	}
}
