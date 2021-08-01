package Day13;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Day13_1 {

	
	
	
	
	
	public static void main(String[] args) {
		
		// 1. LinkedList
		ArrayList<String> arrayList = new ArrayList<>();
		// arraylist 클래스에 String 클래스를 제네릭으로 선언하여 리스트 객체 선언
		LinkedList<String> linkedList = new LinkedList<>();
		
		Long start;
		Long end;
		
		start = System.nanoTime(); // 현재 시간[나노] 메소드
		for(int i = 0 ; i< 10000 ; i++) {
			arrayList.add(0, String.valueOf(i));
		}
		end = System.nanoTime();
		System.out.println("arraylist 만개를 add하는데 걸리는 시간 : " + (end - start));
		
		start = System.nanoTime(); // 현재 시간[나노] 메소드
		for(int i = 0 ; i< 10000 ; i++) {
			linkedList.add(0, String.valueOf(i));
		}
		end = System.nanoTime();
		System.out.println("linkedlist 만개를 add하는데 걸리는 시간 : " + (end - start));
		
		
		// 문제 1 : 대기줄 프로그램 [ Linkedlist 클래스 사용 ]
			// 메뉴 [무한루프]
				// 대기명단 출력
				// 1. 대기 추가 [ 인원수 입력받아 => 대기번호 [리스트순서] 부여]
				// 2. 대기 입장 [ 가장 앞 대기번호 삭제 ]
				// 3. 대기 취소 [ 대기 번호를 입력받아 취소 ]
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		Scanner scanner = new Scanner(System.in);
		while(true) {
			
			System.out.println("---- 대기 명단 ----");
			System.out.println("번호 \t 인원수");
			for(int i = 0; i<list.size() ; i++) {
				System.out.println((i+1)+"\t"+list.get(i));
			}
			System.out.println("1.대기추가 2.대기취소 3.대기입장");
			System.out.print("선택 : ");
			int ch = scanner.nextInt();
			if(ch == 1) {
				System.out.print("인원수 : ");
				int count = scanner.nextInt();
				list.add(count);
				System.out.println("대기번호 : " + list.size());
			}
			if(ch == 2) {
				System.out.print("취소번호 :");
				int count = scanner.nextInt();
				list.remove(count-1);
			}
			if(ch == 3 ) {
				System.out.println("대기 입장");
				list.remove(0);
			}
		}
		
		
		
		
		
	}
	
	
}
