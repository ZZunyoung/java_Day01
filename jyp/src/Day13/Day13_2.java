package Day13;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Day13_2 {

	
	
	public static void main(String[] args) {
		
		// 2. set 컬렉션 : 1. HashSet 2. TreeSet
			// List : 순서가 있는 저장 [ 중복 허용 ]
			// Set : 순서가 없는 저장 [ 중복 불가 ]
		
		// 1. HashSet 클래스
		HashSet<String> hashSet = new HashSet<>();
			// HashSet 클래스에 String 클래스를 제네릭으로 선언하여 객체 선언
			// 2. 메소드
		hashSet.add("java");
		hashSet.add("python");
		hashSet.add("database");
		hashSet.add("c++"); // 객체 중복 불가능
		//저장 순서 없음
		System.out.println("hashset내 객체 : " + hashSet);
		System.out.println("hashset내 객체수 : " + hashSet.size());
		System.out.println("hashset내 객체 삭제");
		hashSet.remove("java");	// 인덱스 없기 때문에 객체 이름
		System.out.println("hashset내 객체 : " + hashSet);
		
		// 1. 모두 불러오기
		for( String string : hashSet) {
			System.out.println("객체 : " + string);
		}
		// 2. Iterator 인터페이스 활용
			// Iterator : 순서가 없는 항목들에 하나씩 순회 인터페이스
		Iterator<String> iterator = hashSet.iterator();
		
		while(iterator.hasNext()) {
						// hasNext() : 다음 요소 존재 유무 [ true / false ]
			String string = iterator.next();
						// next : 다음 요소 호출
			System.out.println("객체 : " + string);
		}
		
		// 문제 1
		
		Scanner scanner = new Scanner(System.in);
		
		HashSet<Integer> set = new HashSet<>();
		
		for ( int i = 0 ; i<6 ; i++) {
			int num = scanner.nextInt();
					if (set.contains(num)) {
						System.out.println("중복값");
						i--;
					}
			set.add(num);
		}
		System.out.println(set);
		
		
		
		
		
	}
}
