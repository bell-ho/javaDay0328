package ex01;

public class Ex01 {
	public static void main(String[] args) {
		int i = 10;
//		int i; 변수 선언만함 : 선언부
//		i =10; 변수 초기화만함 : 초기화

		int j = 100; // 변수의 선언과 초기화를 같이함
		System.out.println("i+j=" + (i + j));
		System.out.println("i+j=" + (i + j));
		
		i = 10; // 변수는 변한다 재활용하기 위해 사용
		System.out.println("i=" + i);
		i = 100;
		System.out.println("i=" + i);

	}
}
