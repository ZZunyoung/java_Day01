package Day02;

import java.util.Scanner;

public class Day02_과제 {
	public static void main(String[] args) {
		
		/* 문제1 :  1명의 회원가입 표 만들기 
		  변수) 아이디[S] , 비밀번호[short] , 성명[S] , 이메일[S]  입력받아 출력하기
				
		  출력) 
				//  >>>>>>>>>> 회원가입 완료 아래 정보를 확인해주세요 >>>>>>>>>
				// 아이디		비밀번호		성명		이메일		
				//	qwe		1234		유재석	itdanja@kakao.com
		 */
		
		/* 문제2 : 급여 명세서 
		 * [ 조건 ] 입력받기 : 기본급 , 수당 
		 * [ 출력 ] 실수령액 = 기본급 + 수당 - 세금[ 기본급10% ]
		 */
	
		//문제3 : 하나의 정수를 입력받아 7의 배수인지 확인 => T 혹은 F 출력  
		//문제4 : 하나의 정수를 입력받아 홀수 인지 확인 
		//문제5 : 하나의 정수를 입력받아 7의 배수 이면서 짝수 인지 확인 
		//문제6 : 두개의 정수를 입력받아 더 큰수 확인 
		//문제7 : 반지름을 입력받아 원 넓이 출력하기
			// 원 넓이 공식 => 반지름 * 반지름 * 원주율[3.14]
		//문제8 : 두 실수를 입력받아 앞실수의 값이 뒤의 값의 몇% 인지 출력하기
			// 예) 54.5   84.3 이면    64.285714%
		//문제9 : 사다리꼴 넓이 구하기[윗변과 밑변 높이를 입력받아 출력하기	
			// 사다리꼴 계산식 = > (윗변 * 밑변) * 높이 / 2
		//문제10 : 키를 정수를 입력받아 표준체중 출력하기
			// 표준체중 계산식 = > (키 - 100) * 0.9
		
		//문제11 :  키와 몸무게를 입력받아 BMI 출력하기
		//	//BMI 계산식 = > 몸무게 / ((키 / 100) * (키 / 100))

		//문제11 : inch 를 입력받아 cm 로 변환하기
		
		//문제12 : 중간고사, 기말고사, 수행평가를 입력받아 반영비율별 계산하여
			// 소수 둘째 자리 까지 점수 출력하기
			// 중간고사 반영비율 => 30 %
			// 기말고사 반영비율 => 30 %
			// 수행평가 반영비율 => 40 %
		
		//예제13: 연산 순서 나열 하고 x와 y값 예측하기
			// int x = 10;
			// int y = x-- + 5 + --x;
			// printf(" x의 값 : %d , y의값 :  %d ", x, y)
		
		
		//문제1
		Scanner scan = new Scanner(System.in);
//		System.out.print("아이디 : ");
//		String id = scan.next();
//		System.out.print("비밀번호 : ");
//		short pass = scan.nextShort();
//		System.out.print("성명 : ");
//		String name = scan.next();
//		System.out.print("이메일 : ");
//		String email = scan.next();
//		
//		System.out.println(">>>>>>>>>회원가입 완료 아래 정보를 확인해주세요>>>>>>>>>");
//		System.out.println("아이디\t비밀번호\t성명\t이메일");
//		System.out.println(id + "\t"+pass+"\t"+name+"\t"+email+"\n\n");
		
		//문제2
//		System.out.print("기본급 : ");
//		int nomal = scan.nextInt();
//		System.out.print("수당 : ");
//		int bonus = scan.nextInt();
//		System.out.println("실수령액 : " +((nomal*0.9)+bonus) +"원\n\n");
		
		//문제3
//		System.out.print("정수 입력 : ");
//		int a = scan.nextInt();
//		System.out.println(a+"는 7의 배수 : "+(a%7==0));
		
		//문제4
//		System.out.print("정수 입력 : ");
//		int b = scan.nextInt();
//		System.out.println(b+"는 홀수 : "+(b%2==1));
		
		//문제5
//		System.out.print("정수 입력 : ");
//		int c = scan.nextInt();
//		System.out.println(c+"는 7의 배수이면서 짝수 : "+((c%7==0)&&(c%2==0)));
		
		//문제6
//		System.out.print("정수1 입력 : ");
//		int d = scan.nextInt();
//		System.out.print("정수2 입력 : ");
//		int e = scan.nextInt();
//		System.out.println("정수1 > 정수2 : " + (d>e));
		
		//문제7
//		System.out.print("반지름 입력 : ");
//		float r = scan.nextFloat();
//		System.out.println("원 넓이 : " + (r*r*3.14));
		
		//문제8
//		System.out.print("실수1 입력 : ");
//		float f = scan.nextFloat();
//		System.out.print("실수2 입력 : ");
//		float g = scan.nextFloat();
//		System.out.println(f/g*100+"%");
		
		//문제9
//		System.out.print("윗변 입력 : ");
//		float top = scan.nextFloat();
//		System.out.print("밑변 입력 : ");
//		float base = scan.nextFloat();
//		System.out.print("높이 입력 : ");
//		float hight = scan.nextFloat();
//		System.out.println("사다리꼴 넓이 : "+((top+base)*hight/2));
		
		//문제10
//		System.out.print("키 : ");
//		int high = scan.nextInt();
//		System.out.println("표준체중 : " + ((high-100)*0.9));
		
		//문제11
//		System.out.print("인치 입력 : ");
//		float cm = scan.nextFloat();
//		System.out.println(cm + "inch는 " + cm*2.54 +"cm");
		
		//문제12
//		System.out.print("중간고사 점수 : ");
//		float ce = scan.nextFloat();
//		System.out.print("기말고사 점수 : ");
//		float fe = scan.nextFloat();
//		System.out.print("수행평가 점수 : ");
//		float se = scan.nextFloat();
//		System.out.printf("총 점수 : %.2f" , ((ce*0.3)+(fe*0.3)+(se*0.4)));
		
		//문제13
//		int x = 10;
//		int y = x-- + 5 + --x;
//		System.out.printf("x의 값 : %d , y의 값 : %d", x,y);
				

		
		
		
	}
}
