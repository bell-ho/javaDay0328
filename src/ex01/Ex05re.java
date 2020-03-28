package ex01;

import java.util.Scanner;

public class Ex05re {
	public static void main(String[] args) {
		System.out.println("학사정보시스템");
		Scanner sc = new Scanner(System.in);
		
//		String []name = new String[5]; 
//		name[0]="박찬호";
//		name[1]="박찬호";
//		name[2]="박찬호";
//		name[3]="박찬호";
//		name[4]="박찬호";
		 
		String []name= {"박찬호","박찬1","박찬2","박찬3","박찬4"};
		
		System.out.printf("%s 의 점수를입력하세요",name[0]);
		int a = sc.nextInt();
		System.out.printf("%s 의 점수를입력하세요",name[1]);
		int b = sc.nextInt();
		System.out.printf("%s 의 점수를입력하세요",name[2]);
		int c = sc.nextInt();
		System.out.printf("%s 의 점수를입력하세요",name[3]);
		int d = sc.nextInt();
		System.out.printf("%s 의 점수를입력하세요",name[4]);
		int e = sc.nextInt();
		
		System.out.printf("%s의 점수는"+a+"입니다",name[0]);
		System.out.println();
		System.out.printf("%s의 점수는"+b+"입니다",name[1]);
		System.out.println();
		System.out.printf("%s의 점수는"+c+"입니다",name[2]);
		System.out.println();
		System.out.printf("%s의 점수는"+d+"입니다",name[3]);
		System.out.println();
		System.out.printf("%s의 점수는"+e+"입니다",name[4]);
	}
}
