package day15;
/*
 *�� : ���п����� ���հ� ������ ������ ���� �ڷᱸ�� 
 *Ư¡ : ����� ������ �������� �ʰ� ���� 
 *���� ��Ұ� �� �� �̻� ����� �� ����. ��, �ߺ��ȵ� 
 *���� : ���� ��������, ���� ��� �߰���
 *�ؽü� : �ؽ��ڵ带 �̿��� �ߺ� ���� ���� ���� ��
 *Ʈ���� : ���� ��������, ���� ��ɸ� �߰�  
 */

import java.util.HashSet;

public class Set01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set = new HashSet<>();
		
		set.add("�տ���"); // ��� �߰� add() �޼���
		set.add("�տ���");
		set.add("�տ�õ");
		
		for(String s:set) { // for-each �� : ������ ������, �������� ����.
			System.out.println(s);
		}
	}

}
