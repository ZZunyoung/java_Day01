package Day02;

public class Day02_1 {// c s 
	public static void main(String[] args) {
		
		
		// ctrl+�����̽��� => �ڵ��ϼ� 
		//������ 
		
		//1. ���������[ ���� x ]
			// ���� + ���� : ���� ������ 
		System.out.println("���ϱ�" + (3+5));
		System.out.println("����" + (5-3));
		System.out.println("���ϱ�" + (5*3));
		System.out.println("������" + (5/3));
		System.out.println("������" + (5%3));
		
		// 2. �񱳿����� [ ��� : true/false ]
			// > : �ʰ� 	< : �̸�		== : ���� [ = ���� ]
			// >= (ũ�ų� ���ٸ� ���� ���ų� ũ�ٴ� ���� ): �̻� 		<= :���� 
		System.out.println("�ʰ�:" + (5>3));
		System.out.println("�̻�:" + (5>=3));
		System.out.println("�̸�:" + (5<3));
		System.out.println("����:"+(5<=3));
		System.out.println("����:" + (5==3));
		System.out.println("�����ʴ�:"
		+(5!=3));
		
		/* ����1
		  3 �� Ȧ������ ¦������ ��� ( Ȧ��/¦�� �Ǵ� ) 
		  Ȧ���̸� [true] ¦���̸� [false
		 */
		/* ����2
		  36�� ���� 3�� ����̸� [true] �ƴϸ� [false] ���
		 */
		System.out.println("3�� Ȧ��:" + ((3%2)==1));
		// Ȧ��/¦�� �Ǵ� 
			// �� % 2  == 0: �������� 0�̸� ���� ¦�� �ƴϸ� Ȧ�� 
		
		
		System.out.println("36�� 3�� ��� :" + ((36%3)==0));
		// ��� �Ǵ� 
			// �� % �� == 0 : �������� 0 �̸� �ش� ���� �� ���� ��� 
		
		//3.  [ �񱳿����� 2�� �̻��� ��� ] ==> ���� ������
			//and: && :�̸鼭 �鼭 �̰� ��� �׸��� [ �񱳿����� ��� T => T ]
			// or: || :�̰ų� �ų� �Ǵ� �ϳ��� [ �񱳿����� �ϳ��� T=>T ]
			// ����: ! : true => false , false => true
		System.out.println("and: "+(1<3 && 3<5));
		System.out.println("or :" +(1<3 || 3<2)); //T , �Ѱ��� T���� T�� ���´�.
		System.out.println("���� : " + !(1<3));
		
		//4. ���Կ�����
			// = ���� [ �����ʰ� => �������� ���� ]
			// += [ �����ʰ��� ���ʿ� �����Ŀ� ���ʿ� ���� ]
			// -=	*=	/=	%=
		int a = 10;
		a += 10;	// a = a + 10
		
		//5. ����������
			// ++ : 1����
			// -- : 1����
		System.out.println(++a);	//����� ����	21
		System.out.println(a++);	//����� ����	21
		System.out.println(a);		//			22
		
		System.out.println(--a);	//����� ����	21
		System.out.println(a--);	//����� ����	21
		System.out.println(a);		//			20
		
		// ����3 : 365,420���� ����� ����
		
		// ���� : �޸� [ ������ ����� ]
		int b = 365420;
		System.out.println("�ʸ����� : " + (b/100000) + "��");
		System.out.println("������  : " + ((b-(b/100000)*100000)/10000)+"��");
		System.out.println("õ����  : " + ((b-(b/10000)*10000)/1000)+"��");
		System.out.println("��� ���� : " + ((b-(b/1000)*1000)/100)+"��");
		
		
		System.out.println("�ʸ����� : " + (b/100000) +"��");
		b-=(b/100000)*100000;
		System.out.println("������ : " + (b/10000)+"��");
		b-=(b/10000)*10000;
		System.out.println("õ���� : " + (b/1000)+"��");
		b-=(b/1000)*1000;
		System.out.println("��� : " + (b/100)+"��");
		
	}
}// c e 
