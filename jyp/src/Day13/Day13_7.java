package Day13;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Day13_7 {

	public static void main(String[] args) {
		
		Queue<String> 종점역 = new LinkedList<>();
		Queue<String> 용산역 = new LinkedList<>();
		Queue<String> 서울역 = new LinkedList<>();
		Queue<String> 구로역 = new LinkedList<>();
		
		ArrayList<Queue<String>> 전철현황 = new ArrayList<>();
		
		전철현황.add(종점역);
		전철현황.add(용산역);
		전철현황.add(서울역);
		전철현황.add(구로역);
		
		전철현황.get(0).offer("전철1"); 전철현황.get(0).offer("전철2"); 전철현황.get(0).offer("전철3"); 
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("------ 현재 전철역 상황 ------");
			
			System.out.println("전철 출발 신호 : 1. 종점 2. 용산 3. 서울 4. 구로 ");
			int ch = scanner.nextInt();
			if(ch==1) {
			
			}
			if(ch==2) {
				
			}
			if(ch==3) {
	
			}
			if(ch==4) {
	
			}
			
		}
	
	}
	
	public static 
		// static : main 메소드가 가장 먼저 실행 되기 때문에 
	
	
	
}
