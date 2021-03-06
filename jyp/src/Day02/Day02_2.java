package Day02;

public class Day02_2 {
	public static void main(String[] args) {
		
		//변수
			// 1. 변하는 수 <--> 상수 : 고정된수
			// 2. 메모리 : 자원 [ 데이터 저장소 ]
				// 변수 형태 : 
					// 사람 : 문자		int 변수명;
					// 컴퓨터 : 숫자	메모리크기 주소값;

			// 3. 자료형 : 미리 정의된 메모리 크기 [ 메모리 효율적 => 속도 빠름 ]
				// 1비트 : 0, 1
				// 1byte : 8비트 => 0혹은1이 8자리
				// 1kb => 1025byte	1024kb => mb => gb
				// boolean : 1비트 [ 0[false], 1[true] ]
				// char : 2byte [ 아스키코드 ? ]
					// 문자열 => String 클래스
				// byte : 1byte : 정수 [ +-128 ]
				// short : 2byte : 정수 [ +-3만정도 ]
				// int : 4byte : 정수 [ +-20억 정도 ]
				// long : 8byte : 정수 [ +-20억 이상 정도 ]
				// float : 4byte : 실수 
				// double : 8byte : 실수

		// 예제1
			// 1. 변수선언
				// 자료형 변수명;	// 쓰레기값 [ 임의의 값 ]
				// 자료형 변수명 = 값;
		
		boolean 논리변수 = true;	//True 혹은 false 만 저장할 수 있는 저장소
		System.out.println("boolean 변수 : " + 논리변수);
		
		char 문자변수 = 'a';
		System.out.println("char 변수 : "+ 문자변수);
			//char : 아스키코드 [ 문자 <--> 기계어 번역표 ] 사용
		char 문자변수2 = 97;
		System.out.println("char 변수 : " + 문자변수2);
		byte 바이트변수 = 100;
		System.out.println("byte 변수 : " + 바이트변수);
		byte 바이트변수2 = 'a';
		System.out.println("byte 변수 : " + 바이트변수2);
		
		short 쇼트변수 = 300;
		System.out.println("short 변수 : " + 쇼트변수);
		short 쇼트변수2 = 'a';
		System.out.println("short 변수 : " + 쇼트변수2);
		
		int 인트변수 = 30000;
		System.out.println("int 변수 : " + 인트변수);
		int 인트변수2 = 'a';
		System.out.println("int 변수 : " + 인트변수2);
			// 정수의 기본 자료형 : int
		
		long 롱변수 = 999999999999999L;
			// long은 숫자뒤에 L
		System.out.println("long 변수 : " + 롱변수);
		float 실수변수 = 1.511111111111f;
			//float은 숫자뒤에 f
		System.out.println("float 변수 : " + 실수변수);
		double 실수변수2 = 1.5111111111111111;
		System.out.println("double 변수 : " + 실수변수2);
			// 실수의 기본 자료형 : double
		
		String 문자열객체 = "배고파";
		System.out.println("String 객체 : " + 문자열객체);
		
	}
}
