package day15;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* List : ���������� �����͸� ���� �� �����ϴ� �ڷᱸ��
 * �迭���� ������ : ũ�⸦ �̸� ������ �ʰ�, �ʿ��� ������ ���� ����
 * �ڹ� ����Ʈ�� �ΰ��� ����(���� �����ϳ�, ������ �����͸� �����ϴ� ��� ����)
 * - ArrayList
 * - LinkedList
 */

public class List01 {

	public static void main(String[] args) {

		int[] arr = new int[5]; // 5ĭ �迭�� ����.
		
		List<String> list = new LinkedList<>(); // List�� �������̽�, �� �ڽ����� ��ü ����.
		
		list.add("�ȳ�");
		list.add("�ϼ���");
		
		// �迭�� ���� ������ length �Ӽ�, ����Ʈ�� ���� ������ size() �޼ҵ� ����
		for(int i = 0; i < list.size(); i++)
		System.out.print(list.get(i));
		}
	
}





