package ex01;

public class Ex02 {
	public static void main(String[] args) {
		System.out.printf("오늘의 기온은 %d도입니다\n",10);
		//printf는 출력만해주고 서식 문자에 맞게 대입을 해줌
		
		//서식문자를 이용하여 출력 문자의 정렬 및 소수점 제한 기능을 사용
		System.out.printf("%f\n",1.23);
		System.out.printf("%.0f\n",1.23);
		System.out.printf("%.1f\n",1.23);
		System.out.printf("%.2f\n",1.23);
		System.out.printf("%.3f\n",1.23);
	}
}
