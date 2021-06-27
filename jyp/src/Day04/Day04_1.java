package Day04;

public class Day04_1 {
	
	// 제어문 = if
	
	// 반복문 = for, while, do~while
		// 어디서부터 어디까지 반복
	// for 형태
		// for( 초기값 ; 조건문 ; 증감식 ) { 실행문; }
		// for( 어디서부터 ; 어디까지 ; 이동단위 ) { 실행코드 ; }
			// 초기값 : 반복의 시작값 [ for 시작할때 1번 검사 ]
			// 조건문 : 반복실행의 조건 [ 비교연산자 , 실행코드 실행전 검사 ]
			// 증감식 : 실행코드 실행후 초기값 증감단위
		
	
	public static void main(String[] args) {
		// 예1
		for( int 변수 = 0; 변수 < 10 ; 변수++) {
			// 변수는 0부터 10미만까지 1씩 증가하면서 반복
			System.out.print(변수 + "\t");
				// 반복문 실행순서
				// 변수 = 0 => 변수 <10 =. T => 코드실행
				// 변수 ++ => 변수 = 1 => 변수 < 10 => T => 코드실행
				// 변수 ++ => 변수 = 2 => 변수 < 10 => T => 코드실행
				// 변수 ++ => 변수 = 3 => 변수 < 10 => T => 코드실행
				// ~
				// 변수 ++ => 변수 = 10 => 변수 < 10 => F => 반복문 종료
			}
		System.out.println("\n -------------------");
		
		// 예2 : 1부터 50까지의 합계
		for (int i = 1 ; i < 51 ; i ++) {System.out.print(i + "\t");}
		System.out.println("\n -------------------");
		
		// 예3 : 1~50까지의 3배수 출력
		for(int i = 3 ; i <=50 ; i+=3) {System.out.print(i);}
			// i 는 3부터 50까지 i+3씩 증가하면서 반복
		System.out.println("\n -------------------");
		
		for ( int i = 1; i<=50; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}
		
		System.out.println(" -------------------");
		
			// 예 4 : 1~50까지 누적 합계
		int sum = 0;
		for (int i = 1 ; i <= 50; i ++) {
			sum += i;
		}
		System.out.println("1~50까지의 누적합계 : " + sum);
		
		System.out.println(" -------------------");
		
		// 예 5 : 1~50까지 3배수들의 누적 합계
		sum = 0;
		for (int i = 3 ; i < 51 ; i += 3) {
			sum += i;
		}
		System.out.println("1~50까지 3배수들의 누적 합계 : " + sum);
		
		System.out.println(" -------------------");
		
		// 예6 : 2단 구구단 출력
		for (int i = 1; i < 10; i++) {
			System.out.println("2 X "+ i + " = " + 2*i);
		}
		
		System.out.println(" -------------------");
		// 예7 : 구구단 출력 [ 단 : 2~9(변수) 곱 : 1~9(변수) ]
							// 8번실행		// 72번 실행
			// for중첩
				// for1(){	for2(){	for3()	}	}
					// for1 1번 실행시 for 2 모두 실행
						// for2 1번 실행시 for 3 모두 실행
							// for3  실행횟수 : for1 * for2 * for3
		for ( int i = 2 ; i <10 ; i++) {
			System.out.println("--------- " + i + "단 ---------");
			for ( int j = 1 ; j <10 ; j++)
				System.out.println(i+" X "+j + " = " + i*j);
		}
		
	}
}