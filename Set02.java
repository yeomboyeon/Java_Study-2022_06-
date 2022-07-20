package day15;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;
/* Ʈ������ ���� ����� �߰��� ��
 * ����(sorting) ������ ��Ģ�� ���� ������ ��(����, ��������)
 * Ʈ���¿� ���� ����� �����ϴ� '���� ��Ģ' ��ü�� ������ ���� �ִ�.
 * Comparator<> �������̽��� ����ϸ�, ���� ��Ģ�� ������ �� �ִ�. 
 */
class ICom implements Comparator<Integer> {
	// compare�� 0�̳� ������ ���� ����, ����� ������ �ٲ۴�.
	public int compare(Integer n1, Integer n2) {
		return n2.intValue() - n1.intValue(); // �� ������ // ��������
//		return n1.intValue() - n2.intValue(); // �� ������ // ��������
	}
}
public class Set02 {
	public static void main(String[] args) {
		// new ICom() �ְ� ���� ���� ����, ������������ ����
		TreeSet<Integer> ts = new TreeSet<>(new ICom());

		ts.add(3);
		ts.add(1);
		ts.add(4);
		ts.add(2);

		// �����κ��� '����' ��ü�� ��ȯ�޾� ���� �� �ִ�.
		// ���� ��ü�� ������ �ִ� ��Ҹ� �д� ����� �����Ѵ�.
		Iterator it = ts.iterator();

		while (it.hasNext()) { // ������ ������ true, ������ false
			System.out.println(it.next() + " "); // ���� �� ���� �а� �������� �Ѿ
		}
	}
}
