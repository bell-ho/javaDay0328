package ex01;

public class Ex03 {
	public static void main(String[] args) {
		int x = 10;
		System.out.println(x+=10);
		System.out.println(x-=10);
		System.out.println(x*=10);
		System.out.println(x/=10);
		System.out.println(x%=10);
		
		int y=20;
		System.out.println(x>y); //논리연산자
		System.out.println(x<y);
		System.out.println(x==y); //논리연산을 구할땐 ==사용
		System.out.println(x!=y);
		
		
//		int x = 1; 오류나는이유 중복된 로컬변수임
		x= 1;
		
//		<<증감연산자>>
		System.out.println(++x); //여기서 2인이유 전위연산자
		
		System.out.println(x++); //여기서 2인이유 후위연산자 값 그대로x를 먼저찍고, 
//									메모리상에서만 계산함 위에서 x가 2가되므로 이것도 x가 찍힌것임
		
		System.out.println(x); //나중에 계산 되기때문에 여기서만 3이 나옴
	}
}
