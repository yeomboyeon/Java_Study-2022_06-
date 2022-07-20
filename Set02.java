package day15;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;
/* 트리셋은 정렬 기능이 추가된 셋
 * 정렬(sorting) 일정한 규칙에 따라 나열된 것(오름, 내림차순)
 * 트리셋에 정렬 방법을 결정하는 '정렬 규칙' 객체를 전달할 수도 있다.
 * Comparator<> 인터페이스를 사용하면, 정렬 규칙을 정의할 수 있다. 
 */
class ICom implements Comparator<Integer> {
	// compare가 0이나 음수면 순서 유지, 양수면 순서를 바꾼다.
	public int compare(Integer n1, Integer n2) {
		return n2.intValue() - n1.intValue(); // 값 꺼내기 // 내림차순
//		return n1.intValue() - n2.intValue(); // 값 꺼내기 // 오름차순
	}
}
public class Set02 {
	public static void main(String[] args) {
		// new ICom() 넣고 빼고 따라 오름, 내림차순으로 적용
		TreeSet<Integer> ts = new TreeSet<>(new ICom());

		ts.add(3);
		ts.add(1);
		ts.add(4);
		ts.add(2);

		// 셋으로부터 '순차' 객체를 반환받아 읽을 수 있다.
		// 순차 객체는 가지고 있는 요소를 읽는 기능을 포함한다.
		Iterator it = ts.iterator();

		while (it.hasNext()) { // 읽을게 있으면 true, 없으면 false
			System.out.println(it.next() + " "); // 실제 그 값을 읽고 다음으로 넘어감
		}
	}
}
