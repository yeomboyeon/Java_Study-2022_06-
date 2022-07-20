package day15;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* List : 순차적으로 데이터를 저장 및 관리하는 자료구조
 * 배열과의 차이점 : 크기를 미리 정하지 않고, 필요할 때마다 조절 가능
 * 자바 리스트의 두가지 유형(사용법 동일하나, 내부적 데이터를 생성하는 방식 상이)
 * - ArrayList
 * - LinkedList
 */

public class List01 {

	public static void main(String[] args) {

		int[] arr = new int[5]; // 5칸 배열로 고정.
		
		List<String> list = new LinkedList<>(); // List는 인터페이스, 그 자식으로 객체 생성.
		
		list.add("안녕");
		list.add("하세요");
		
		// 배열의 길이 정보는 length 속성, 리스트의 길이 정보는 size() 메소드 적용
		for(int i = 0; i < list.size(); i++)
		System.out.print(list.get(i));
		}
	
}





