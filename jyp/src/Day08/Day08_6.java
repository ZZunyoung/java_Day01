package Day08;

public class Day08_6 {
	

	public static void main(String[] args) {
		
		회원 유저1 = new 회원 ("qwe" , "qwe");
		vip 유저2 = new vip ("asd", "asd","골드");
		관리자 유저3 = new 관리자("zxc","zxc","관리자");
		
		유저1.정보();
		System.out.println("-------------------");
		유저2.정보();
		System.out.println("-------------------");
		유저3.정보();
	}
}
