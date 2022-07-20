package day15;
/*
 *셋 : 수학에서의 집합관 동일한 구조를 지닌 자료구조 
 *특징 : 요소의 순서를 지정하지 않고 관리 
 *같은 요소가 두 번 이상 저장될 수 없다. 즉, 중복안됨 
 *종류 : 같은 셋임지만, 정렬 기능 추가죔
 *해시셋 : 해시코드를 이용해 중복 예방 내부 로직 셋
 *트리셋 : 같은 셋이지만, 정렬 기능만 추가  
 */

import java.util.HashSet;

public class Set01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set = new HashSet<>();
		
		set.add("손오공"); // 요소 추가 add() 메서드
		set.add("손오반");
		set.add("손오천");
		
		for(String s:set) { // for-each 문 : 순서는 없지만, 순차접근 가능.
			System.out.println(s);
		}
	}

}
