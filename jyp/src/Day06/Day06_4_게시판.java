package Day06;

import java.util.ArrayList;
import java.util.Scanner;


public class Day06_4_게시판 {

	//main 밖에 선언하는 이유 : 다른 클래스에서 해당 메모리[ 변수나 객체 ] 접근하기 위해
		// 단점 : main부터 실행되기 때문에 main메소드가 해당 메모리 인식X
			// static : main 메소드보다 메모리 우선할당
				// 프로그램 종료시까지 메모리 할당
				// 전반적인 모든 코드에 사용되는 메모리 할당시
	static Scanner scan = new Scanner(System.in);
	// 리스트
	static ArrayList<게시물> 게시물목록 = new ArrayList<>();
		// ArrayList<리스트에 담을 클래스> 객체명 = new ArrayList<>();
		// <> : 제네릭
		// 리스트명.add(객체명) : 리스트에 객체 추가
		// 리스트명.get(인덱스번호) : 해당 인덱스번호 위치에 객체 호출
	// 게시판 프로그램
	public static void main(String[] args) {		
		
		while(true) {
		System.out.println("------- 커뮤니티 게시판 -------");
		System.out.println("번호\t제목\t\t\t작성자\t내용\t조회수");
			// 모든 게시물 출력
		for(int i = 0 ; i <게시물목록.size();i++) {
			System.out.println(i+"\t"+게시물목록.get(i).제목+"\t\t\t"+ 
					게시물목록.get(i).내용 +"\t"+게시물목록.get(i).작성자 + "\t"
					+게시물목록.get(i).조회수);
		}
		System.out.println("1. 글쓰기 2. 게시물 보기 3. 게시물 삭제");
		int 선택 = scan.nextInt();
		if (선택 == 1) {
			게시물.게시물등록();
		}
		if (선택 == 2) {
			System.out.println("------- 게시물 번호 선택 : ");
			int 번호 = scan.nextInt();
			게시물.게시물상세보기(번호);
		}
		if (선택 == 3) {}
		
		
		
		}
	}
}
