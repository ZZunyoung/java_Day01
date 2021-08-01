package Day13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Day13_4 {

	public static void main(String[] args) {
		// 리스트 컬렉션 => map
		ArrayList<HashMap<String, Integer>> arrayList = new ArrayList<HashMap<String,Integer>>();
		
		HashMap<String, Integer> map1 = new HashMap<>();
		HashMap<String, Integer> map2 = new HashMap<>();
		
		arrayList.add(map1);
		arrayList.add(map2);
		
		System.out.println(arrayList);
		
		// map 컬렉션 => 리스트
		HashMap<String, ArrayList<String>> map3 = new HashMap<String, ArrayList<String>>();
		
		ArrayList<String> list = new ArrayList<>();
		
		map3.put("1", list);
		
		// set 컬렉션 => map
		
		HashSet<HashMap<String, Integer>> set = new HashSet<>();
		
		HashMap<String, Integer> map4 = new HashMap<String, Integer>();
		
		set.add(map4);
		
		System.out.println(set);
		
		
		// 예3) 제품 재고 관리
			
		HashMap<String, Integer> clothingmap = new HashMap<String, Integer>();
		clothingmap.put("나이키상의", 20);
		clothingmap.put("나이키하의", 10);
		HashMap<String, Integer> bagmap = new HashMap<String, Integer>();
		bagmap.put("나이키가방", 10);
		bagmap.put("아디다스가방", 20);
		
		ArrayList<HashMap<String, Integer>> productlist = new ArrayList<HashMap<String,Integer>>();
		
		productlist.add(clothingmap);
		productlist.add(bagmap);
		
		System.out.println("재고 현황 : " + productlist);
		System.out.println("의류 재고 현황 : " + productlist.get(0));
		System.out.println("가방 재고 현황 : " + productlist.get(1));
		System.out.println("의류 나이키 하의 재고 : " + productlist.get(0).get("나이키하의"));
		System.out.println("가방 아디다스가방 재고 : " + productlist.get(1).get("아디다스가방"));
		
		
		
		
		
	}
	
	
	
	
	
}
