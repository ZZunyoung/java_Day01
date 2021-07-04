package Day06;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Day06_1 {

	// 변수 : 메모리 할당
	// 배열 : 동일한 자료형의 변수 여러개 선언 / 관리
		// 자료형 배열명 = new 자료형 [개수]
			// new : 메모리 할당 연산자
		// [인덱스] : 배열에 저장되는 순서 번호
		// 다양한 메소드 [미리 작성된 코드 ] => Array 클래스 사용
	public static void main(String[] args) {
		
		// 학생수를 입력받아 학생수만큼 배열의 메모리할당
		
		Scanner scan = new Scanner(System.in);
		Integer[] 학생점수 = null; // 현재 메모리가 null 인 배열 선언
			//int		: 정수 자료형 [ new X ] => 변수
			//integer	: 정수 클래스 [ new ] => 객체
		
		while(true) {	// 무한루프
			
			System.out.println("--- 학생 관리 프로그램 ---");
			System.out.println("1. 학생수 2. 점수입력 3. 통계 4. 종료");
			int 선택 = scan.nextInt();
			if (선택 == 1) {
				System.out.print("----> 학생수 : "); int 인원수 = scan.nextInt();
				학생점수 = new Integer [인원수];
				System.out.println(인원수 + "만큼 학생 점수를 입력할 수 있습니다.");
			}
			if (선택 == 2) {
				for(int i = 0 ; i<학생점수.length ; i++) {
					System.out.print((i+1)+"번째 학생 점수 입력 : ");
					학생점수[i] = scan.nextInt();
				}
			}
			if (선택 == 3) {
				// 정렬 = sort()
				Arrays.sort(학생점수);
				// 출력
				System.out.println("--------- 오름차순 ---------");
				for (int i = 0; i < 학생점수.length ; i++) {
					System.out.println((i+1)+"번째 학생의 점수 : " + 학생점수[i]);
				}
				
				// 내림차순 : 오름차순 반대로 [ 기본 자료형 X ]
				Arrays.sort(학생점수, Collections.reverseOrder());
						// 컬렉션 : 배열, 리스트
				System.out.println("--------- 내림차순 ---------");
				for (int i = 0; i < 학생점수.length ; i++) {
					System.out.println((i+1)+"번째 학생의 점수 : " + 학생점수[i]);
				}
				
				// 가장 높은 점수 출력
				int max = 0;
				int sum = 0;
				for ( int i = 0 ; i < 학생점수.length ; i++) {
					// 최댓값
					if (max < 학생점수[i])max = 학생점수 [i];
					// 누적합계
					sum += 학생점수[i];
				}
				// 최댓값 / 평균 출력
				
				System.out.println("평균 : " + sum/학생점수.length);
			}
			if (선택 == 4) {
				break;
			}
			else {
				System.out.println("다시 입력해 주세요.");
			}
			
			
		} // while end
		
	} // main end
}
