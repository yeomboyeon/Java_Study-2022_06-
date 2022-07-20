package day15;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;
// Ʈ����
class ICom1 implements Comparator<Integer> {
	// compare�� 0�̳� ������ ���� ����, ����� ������ �ٲ۴�.
	public int compare(Integer n1, Integer n2) {
		return n2.intValue() - n1.intValue(); // �� ������ // ��������
	}
}
public class Map01 {
	public static void main(String[] args) {
		TreeMap<Integer, String> player = new TreeMap<>(new ICom1());

		// ���� ���� put(), ���� ���� get()
		player.put(7, "�����");
		player.put(11, "Ȳ����");
		player.put(11, "������");
		player.put(10, "���缺");
		player.put(13, "���缺");
		player.put(1, "��±�");
		
//		System.out.println(player); // {1=��±�, 7=�����, 10=���缺, 11=������, 13=���缺}
		// ���� Ű���� ����. Ű���� Ű�� ���ִ� ��.
		Set<Integer> ks = player.keySet(); // keySet() : Integer ���� ���ִ� ���

		for (Integer k : ks) {
//			System.out.print(k + " "); // 1 7 10 11 13
			System.out.print(k+"�� " + player.get(k) + " ");
		}
	}
}
