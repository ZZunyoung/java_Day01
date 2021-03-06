package Day09;

public class Day09_1 {

	// 인터페이스 : 
		// 목적 : 동일한 목적하에 동일한 기능 수행
		// 추상메소드 : 선언만 하고 정의[실행]코드 X
		// 디폴트메소드 : 선언과 정의 O
		// 형태 : 클래스명 implements 인터페이스
			// extends : 상속
				// 하나의 클래스에게 연결 가능
				// 메모리 할당
			// implements : 인터페이스
				// 여러개의 인터페이스에게 연결 가능
				// 메모리 할당 x -> 클래스로부터 메모리 할당 [연결]
				// 생성자 x -> 객체생성불가 [익명객체만 가능]
		
	public static void main(String[] args) {
		
		// 1. 인터페이스 객체 선언
		리모컨 리모컨;
		// 2. 리모컨에 메모리 할당 [ 클래스 연결 ]
		리모컨 = new 텔레비전();
		// 3. 리모컨 실행
		리모컨.실행();
		리모컨.소음설정(5);
		리모컨.채널변경();
		리모컨.종료();
		
		System.out.println("----- 리모컨 사용 변경");
		// 4. 리모컨의 메모리 변경
		리모컨 = new 오디오();
		// 5. 리모컨 실행
		리모컨.실행();
		리모컨.소음설정(5);
		리모컨.채널변경();
		리모컨.종료();
		
		System.out.println("----- 리모컨 사용 변경");
		// 스마트텔레비전 클래스
		리모컨 = new 스마트텔레비전();
		
		리모컨.실행();
		리모컨.소음설정(5);
		리모컨.채널변경();
		리모컨.종료();
		
	}
}
