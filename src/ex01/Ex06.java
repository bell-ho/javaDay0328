package ex01;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		System.out.println("구구단프로그램");
		Scanner sc =new Scanner(System.in);
		System.out.println("몇단을 외울까요");
		int a = sc.nextInt();
		for(int i = 1 ;i<10 ;i++ ) {
			System.out.println(a+"*"+i+"="+(i*a));
		}
	}
	class Tv{
		Tv tv = new Tv();
	}
}
