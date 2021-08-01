package Day13;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Day13_6 {

	public static void main(String[] args) {
		
	
	// 스택 [ Stack ] : LIFO [Last in First out ] : 후입선출
		// 마지막으로 입력된 데이터가 먼저 출력
		// 입출 방향이 동일
		// 예) 코인상자, 뒤로가기 등
		// 메소드 : Vector 클래스와 동일
				// 1. .push(객체) : 객체 추가
				// 2. .pop(객체) : 객체 삭제
		
	
	// 큐 [ Queue ] : FIFO [ First in First Out ] : 선입선출
		// 먼저 입력된 데이터 먼저 출력
		// 입구방향 출력 방향 따로
		// 예) 줄세우기, 지하철 등
	
	// 예1 ) 스택 [ 서브클래스 ] <------- Vector [ 슈퍼클래스 ]
	Stack< 동전 > 동전상자 = new Stack<>();
	
	동전상자.push(new 동전(100));
	동전상자.push(new 동전(200));
	동전상자.push(new 동전(300));
	
	System.out.println("stack 호출 : " + 동전상자);
	System.out.println("stack 객체 수 :" + 동전상자.size());
	
	for (동전 temp : 동전상자) {
		System.out.println(temp);
		System.out.println(temp.동전);
	}
	// 삭제
	동전상자.pop(); // 삭제 [ 마지막으로 들어온 데이터 순으로 삭제
	for (동전 temp : 동전상자) {
		System.out.println(temp);
		System.out.println(temp.동전);
	}

	// 2. Queue 인터페이스
	Queue<동전> 동전상자2 = new LinkedList<>();
	
	동전상자2.offer(new 동전(100));
	동전상자2.offer(new 동전(200));
	동전상자2.offer(new 동전(300));
	
	System.out.println("동전 상자 : " + 동전상자2);
	System.out.println("동전 상자의 동전수 : " + 동전상자2.size());
	
	// 출력
	for( 동전 temp : 동전상자2) {
		System.out.println(temp +"/"+ temp.동전);
	}
	
	// 삭제
	동전상자2.poll(); // 삭제 [ 먼저 들어온 데이터 순으로 삭제 ]
	
	for( 동전 temp : 동전상자2) {
		System.out.println(temp +"/"+ temp.동전);
	}
	while(!동전상자2.isEmpty()) {
		동전 삭제된동전 = 동전상자2.poll();
		System.out.println("꺼낸 동전 : " + 삭제된동전.동전 );
	}
	
	
	
	
	
	
	
	}
	
	
	
}
