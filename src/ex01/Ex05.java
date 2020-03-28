package ex01;

import java.util.Scanner;

public class Ex05 {
	//배열을 이용한 학사관리
	public static void main(String[] args) {
		String []name = {"박찬호","박찬호2","박찬호3","박찬호4"};
		int []score = new int[4];
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("%s의 점수를 입력하세요",name[0]);
		score[0] = sc.nextInt();
		System.out.printf("%s의 점수를 입력하세요",name[1]);
		score[1] = sc.nextInt();
		System.out.printf("%s의 점수를 입력하세요",name[2]);
		score[2] = sc.nextInt();
		System.out.printf("%s의 점수를 입력하세요",name[3]);
		score[3] = sc.nextInt();
		
		System.out.printf("%s 의점수는 \t%.2f\n", name[0],(double)score[0]);
//		System.out.printf("%s 의점수는 %f\n", name[1],(int)score[1]);
//		System.out.printf("%s 의점수는 %f\n", name[2],(int)score[2]);
//		System.out.printf("%s 의점수는 %f\n", name[3],(int)score[3]);
		sc.close();
	}
}
