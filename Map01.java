package day15;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;
// 트리맵
class ICom1 implements Comparator<Integer> {
	// compare가 0이나 음수면 순서 유지, 양수면 순서를 바꾼다.
	public int compare(Integer n1, Integer n2) {
		return n2.intValue() - n1.intValue(); // 값 꺼내기 // 내림차순
	}
}
public class Map01 {
	public static void main(String[] args) {
		TreeMap<Integer, String> player = new TreeMap<>(new ICom1());

		// 넣을 때는 put(), 읽을 때는 get()
		player.put(7, "손흥민");
		player.put(11, "황희찬");
		player.put(11, "조영욱");
		player.put(10, "이재성");
		player.put(13, "이재성");
		player.put(1, "김승규");
		
//		System.out.println(player); // {1=김승규, 7=손흥민, 10=이재성, 11=조영욱, 13=이재성}
		// 맵은 키셋을 제공. 키셋은 키만 모여있는 셋.
		Set<Integer> ks = player.keySet(); // keySet() : Integer 값이 모여있는 장소

		for (Integer k : ks) {
//			System.out.print(k + " "); // 1 7 10 11 13
			System.out.print(k+"번 " + player.get(k) + " ");
		}
	}
}
