package Day13;

import java.util.HashMap;

public class Day13_3 {

	public static void main(String[] args) {
	
		// Map : < 키, 값 > 으로 이루어진 한쌍 = 엔트리
			// 인덱스 없음
			// 1. HashMap 2. HashTable
			// 메소드
				// 1. .put(키,값) : 엔트리 추가
		
		// 1. HashMap 선언
		HashMap<String, Integer> hashMap = new HashMap<>();
			// 멀티제네릭 : String, Integer 클래스를 HashMap 객체 선언
		
		// 메소드
		hashMap.put("유재석", 80);
		hashMap.put("강호동", 70);
		hashMap.put("신동엽", 60);
		
		System.out.println("hashMap 출력 : " + hashMap);
		System.out.println("hashMap 객체[엔트리] 수 : " + hashMap.size());
		System.out.println("hashMap 호출 : " + hashMap.get("강호동"));
		System.out.println("hashMap 삭제");
		hashMap.remove("강호동");
		System.out.println("hashMap 출력 : " + hashMap);
		
		System.out.println("hashMap의 모든 키 : " + hashMap.keySet());
		System.out.println("hashMap의 모든 값 : " + hashMap.values());
		
		for (String key : hashMap.keySet()) {
			System.out.println(hashMap.get(key));
		}
		hashMap.clear();
		System.out.println("hashMap 출력 : " + hashMap);
		

	}
}
